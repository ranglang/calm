package com.lqiong.claim.actor

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.event.LoggingAdapter
import akka.stream.CompletionStrategy
import akka.stream.scaladsl.Sink
import akka.stream.typed.scaladsl.ActorSource
import com.lqiong.claim.actor.ShardedActorCounter.{
  ShardedHotPriceCommand,
  StreamSaved,
  UpdateStockItem
}
import com.lqiong.claim.spot.SpotActor
import com.lqiong.claim.spot.SpotActor.SpotMsg
import com.lqiong.jep.entry._
import com.lqiong.jep.option.cassandra.GetSparkTable
import com.lqiong.model.StockSymbol
import org.joda.time.DateTime

object ShardedActorCounter {
  case object SaveEmitted

  sealed trait ShardedHotPriceCommand

  case object SendEnd extends ShardedHotPriceCommand
  case object StreamSaved extends ShardedHotPriceCommand

  final case class UpdateStock(stock: StockSymbol, replyTo: ActorRef[Int])
      extends ShardedHotPriceCommand

  final case class UpdateStockItem(
    stock: StockSymbol,
    date: DateTime,
    item: TodayStockPrice,
    replyTo: ActorRef[SpotMsg]
  ) extends ShardedHotPriceCommand

  def apply(
    entityId: String,
    logger: LoggingAdapter,
    getSparkTable: GetSparkTable
  ): Behavior[ShardedHotPriceCommand] =
    Behaviors.setup { context =>
      val a = new ShardedActorCounter(getSparkTable, logger)
      val streamActor = a.runStream(context.self)(context.system)
      a.sender(entityId, streamActor, logger, List.empty[ActorRef[SpotMsg]])
    }
}

class ShardedActorCounter(
  getSparkTable: GetSparkTable,
  logger: LoggingAdapter
) {

  private def runStream(
    ackReceiver: ActorRef[ShardedActorCounter.ShardedHotPriceCommand]
  )(implicit system: ActorSystem[_]): ActorRef[HotPriceCommand] = {
    val streamRef: ActorRef[HotPriceCommand] =
      ActorSource
        .actorRefWithBackpressure[
          HotPriceCommand,
          ShardedActorCounter.ShardedHotPriceCommand
        ](
          ackTo = ackReceiver,
          ackMessage = StreamSaved,
          completionMatcher = { case StreamEnd =>
            CompletionStrategy.draining
          },
          failureMatcher = { case RichFailureOccured(ex) =>
            ex
          }
        )
        .mapAsync(4) { case item: LastStockPriceSingle =>
          logger.info("item saved {}", item)
          getSparkTable.insertDateFuture(item.stock, item.date, item.stick)
        }
        .to(Sink.ignore)
        .run()
    streamRef
  }

  def sender(
    entityId: String,
    streamActor: ActorRef[HotPriceCommand],
    logger: LoggingAdapter,
    senderList: List[ActorRef[SpotMsg]]
  ): Behavior[ShardedHotPriceCommand] = {
    Behaviors.receiveMessage[ShardedHotPriceCommand] {
      case UpdateStockItem(stock, date, item, replyTo) =>
        logger.info("update stock item  entity {} stock {}", entityId, stock)
        streamActor ! LastStockPriceSingle(stock, date, item)
        sender(entityId, streamActor, logger, senderList.::(replyTo))

      case StreamSaved =>
        logger.info("sender List {}", senderList.length)
        if (senderList.nonEmpty) {
          val head = senderList.head
          head ! SpotActor.StockAcked
          // TODO  report value
          logger.info("StreamSaved stream saved")
          sender(entityId, streamActor, logger, senderList.drop(1))
        } else {
          Behaviors.same
        }
      case m @ _ =>
        logger.info("mmmmmmmmmmmm {}", m)
        Behaviors.same
    }

  }
}
