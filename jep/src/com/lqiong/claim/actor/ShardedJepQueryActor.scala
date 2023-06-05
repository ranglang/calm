package com.lqiong.claim.actor

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.cluster.sharding.typed.scaladsl.EntityTypeKey
import akka.event.LoggingAdapter
import akka.stream.CompletionStrategy
import akka.stream.scaladsl.Sink
import akka.stream.typed.scaladsl.ActorSource
import com.lqiong.claim.actor.RunJepRet.JepQueryAct
import com.lqiong.claim.actor.ShardedJepQueryActor._
import com.lqiong.jep.claim.model.VolumeIndicator
import com.lqiong.jep.option.{ClaimDataSource, JoinQuantName}
import com.lqiong.model.{LSymbol, StockSymbol}

import java.net.InetAddress
import scala.util.control.NonFatal

object RunJepRet {

  trait RunJepRetMsg
  case object JepQueryAct extends RunJepRetMsg
  case class JepQueryError(x: Throwable) extends RunJepRetMsg
}

object ShardedJepQueryActor {

  val JepShardedTypeKey: EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand] =
    EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand]("ShardedJep")

  trait SharedJepQueryCommand

  case class IgnoreWapper(replayTo: RunJepRet.RunJepRetMsg) extends SharedJepQueryCommand

  case class RunJepResult(replayTo: ActorRef[RunJepRet.RunJepRetMsg])
//  case class SharedUpdateJepUpdateSymbol(
//      price: LSymbol,
//      replyTo: ActorRef[RunJepRet.RunJepRetMsg]
//  ) extends SharedJepQueryCommand
  case class SharedUpdateJepUpdateSymbolNoResponse(price: LSymbol) extends SharedJepQueryCommand

  trait JepStreamCommand extends SharedJepQueryCommand
  case object JepStreamCommandEnd extends JepStreamCommand

  case class HandleSaveContinueData(
    symbol: LSymbol,
    replayTo: ActorRef[RunJepRet.RunJepRetMsg]
  ) extends JepStreamCommand

  case class HandleSaveVolumeIndicator(
    symbol: LSymbol,
    replayTo: ActorRef[RunJepRet.RunJepRetMsg]
  ) extends JepStreamCommand

  case class UpdateChaodieInfo(
    symbol: LSymbol,
    replayTo: ActorRef[RunJepRet.RunJepRetMsg]
  ) extends JepStreamCommand

  case class UpdateCommandPrice(
    symbol: LSymbol,
    replayTo: ActorRef[RunJepRet.RunJepRetMsg]
  ) extends JepStreamCommand

  case class JepStreamCommandError(x: Exception) extends JepStreamCommand

  trait JepStreamResult extends SharedJepQueryCommand

  case object JepStreamSaved extends JepStreamResult

  def apply(
    entityId: String,
    logger: LoggingAdapter,
    dataFrameDao: ClaimDataSource
  ): Behavior[SharedJepQueryCommand] =
    Behaviors.setup { context =>
      {

        val ip = InetAddress.getLocalHost();
        val hostname = ip.getHostName();

        val replyAdapter: ActorRef[RunJepRet.RunJepRetMsg] =
          context.messageAdapter[RunJepRet.RunJepRetMsg](
            IgnoreWapper
          )

        val a = new ShardedJepQueryActor()
        val streamActor =
          a.runJepStream(dataFrameDao, logger, context.self)(context.system)
        a.become(entityId, streamActor, logger, replyAdapter, hostname)
      }
    }
}

class ShardedJepQueryActor {

  def runJepStream(
    dataSource: ClaimDataSource,
    logger: LoggingAdapter,
    ackReceiver: ActorRef[JepStreamResult]
  )(implicit system: ActorSystem[_]): ActorRef[JepStreamCommand] = {
    ActorSource
      .actorRefWithBackpressure[JepStreamCommand, JepStreamResult](
        ackTo = ackReceiver,
        ackMessage = JepStreamSaved,
        completionMatcher = { case JepStreamCommandEnd =>
          CompletionStrategy.draining
        },
        failureMatcher = { case JepStreamCommandError(ex) =>
          logger.error("JepStreamCommandError{}", ex)
          ex
        }
      )
      .to(Sink.foreach {
        case HandleSaveContinueData(symbol, replyTo) => {
          logger.info("HandleSaveContinueData {}", symbol)
          dataSource.fetchContinue(symbol)
          replyTo ! JepQueryAct
        }
        case HandleSaveVolumeIndicator(symbol, replyTo) =>
          logger.info("HandleSaveVolumeIndicator {}", symbol);
          try {
            symbol match {
              case a: StockSymbol =>
                val a1 = dataSource.getVolueIndicatorDataFrame(
                  JoinQuantName.getJq(symbol.code)
                )
                dataSource.dataFrameDao.saveDynamicTable(
                  a1,
                  VolumeIndicator.get_table_name(symbol.code)
                )
                logger.info("replyTo ack getVolueIndicatorDataFrame {}", a)
              case _ => ()
            }
          } catch {
            case NonFatal(x) =>
              logger.error("save volume indicator {}", x)
          }
          replyTo ! JepQueryAct
        case UpdateChaodieInfo(symbol, replyTo) =>
          logger.info("v2 save chaodie {}", symbol)
          try {
            dataSource.v2SaveChaodie(symbol)
          } catch {
            case NonFatal(x) =>
              logger.error("v2 save chaodie error {}", x)
          }
          replyTo ! JepQueryAct
        case UpdateCommandPrice(symbol, replyTo) =>
//          logger
//            .info("replyTo UpdateCommandPrice {} symbol {}", replyTo, symbol)
//          try {
//            dataSource.updateAllSymbolPrice(symbol)
//          } catch {
//            case NonFatal(x) =>
//              logger.error("dataSource.updateAllSymbolPrice {}", x)
//          }
//          logger.info("replyTo ack UpdateCommandPrice {}", symbol)
          replyTo ! JepQueryAct
        case s @ _ =>
          logger.error("ShardJepQuery Actor  xxxxxxxx {}", s);
      })
      .run()
  }

  def become(
    entityId: String,
    streamActor: ActorRef[JepStreamCommand],
    logger: LoggingAdapter,
    adapterMessage: ActorRef[RunJepRet.RunJepRetMsg],
    hostname: String
  ): Behavior[SharedJepQueryCommand] = {

    Behaviors.receive { (context, command) =>
      command match {
        case SharedUpdateJepUpdateSymbolNoResponse(symbol) =>
//          logger.info("SharedUpdateJepUpdateSymbolNoResponse {} {}", entityId)
//          try {
//            logger.info("error ERROR saving symbol {}", symbol)
//            streamActor ! UpdateCommandPrice(symbol, adapterMessage)
//          } catch {
//            case NonFatal(x) =>
//              logger.error("SharedUpdateJepUpdateSymbolNoResponse {}", x)
//          }
          Behaviors.same
        case a: IgnoreWapper =>
          logger.info("result ignore {}", a)
          Behaviors.same
//        case SharedUpdateJepUpdateSymbol(symbol, replyTo) =>
//          logger.info(
//            "SharedUpdateJepUpdateSymbol hostname {} {}",
//            hostname,
//            entityId
//          )
//          logger.info("SharedUpdateJepUpdateSymbol {}", entityId)
//          logger.info("entityId {}, saving symbol {}", entityId, symbol)
//          streamActor ! UpdateCommandPrice(symbol, replyTo)
//          Behaviors.same
        case r: JepStreamCommand =>
          streamActor ! r
          logger.info(
            "JepStreamCommand JepStreamCommand hostname {} {} , {} ",
            hostname,
            entityId,
            r
          )
          Behaviors.same
        case r @ _ =>
          logger.info("ShardedJepQueryActor receive {}", r)
          Behaviors.same
      }
    }
  }
}
