package com.lqiong.claim.actor

import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
import akka.actor.typed.{ActorRef, Behavior}
import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, EntityTypeKey}
import akka.event.LoggingAdapter
import com.lqiong.claim.actor.BunbledSyncActor._
import com.lqiong.claim.actor.RunJepRet.RunJepRetMsg
import com.lqiong.model.LSymbol

import scala.concurrent.duration.DurationInt

object BunbledSyncActor {

  sealed trait BunbledSyncActorCommand
  case class BacthSyncSymbols(
    list: List[LSymbol],
    ActorRef: ActorRef[ResultItem]
  ) extends BunbledSyncActorCommand

  case object BacthSyncEnd extends BunbledSyncActorCommand
  case class BunbledSyncResult(resp: RunJepRetMsg) extends BunbledSyncActorCommand

  trait ResultItem
  case object OKBatch extends ResultItem

  def apply(
    logger: LoggingAdapter,
    sharding: ClusterSharding,
    entityRef: EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand]
  ): Behavior[BunbledSyncActorCommand] = {
    Behaviors.setup[BunbledSyncActorCommand] { context =>
      Behaviors.withTimers(timers => {
        timers.startSingleTimer(BacthSyncEnd, 3.hours)
        val messageAdapter =
          context.messageAdapter[RunJepRet.RunJepRetMsg](BunbledSyncResult)
        (new BunbledSyncActor())
          .initial(timers, logger, sharding, entityRef, messageAdapter)
      })
    }

  }
}
class BunbledSyncActor {

  def initial(
    timers: TimerScheduler[BunbledSyncActorCommand],
    logger: LoggingAdapter,
    sharding: ClusterSharding,
    entityRef: EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand],
    messageAdapterRef: ActorRef[RunJepRet.RunJepRetMsg]
  ): Behavior[BunbledSyncActorCommand] = {

    Behaviors.receiveMessage[BunbledSyncActorCommand] { case BacthSyncSymbols(l, replyTo) =>
      logger.info("BacthSyncSymbols reply To size {}", l.length)
//      l.foreach(r => {
//        val counterShardRef: EntityRef[ShardedJepQueryActor.SharedJepQueryCommand] = {
//          sharding.entityRefFor(entityRef, r.code)
//        }
//        counterShardRef ! ShardedJepQueryActor
//          .UpdateCommandPrice(r, messageAdapterRef)
//      })
      become(l.length, timers, logger, replyTo)
    }
  }

  def become(
    rest: Int,
    timers: TimerScheduler[BunbledSyncActorCommand],
    logger: LoggingAdapter,
    replyTo: ActorRef[ResultItem]
  ): Behavior[BunbledSyncActorCommand] = {
    Behaviors.receiveMessage[BunbledSyncActorCommand] {
      case BunbledSyncResult(x) =>
        logger.info("BunbledSyncResult {} rest {}", x, rest)
        if (rest == 1) {
          replyTo ! BunbledSyncActor.OKBatch
          Behaviors.stopped
        } else {
          become(rest - 1, timers, logger, replyTo)
        }
      case BacthSyncEnd =>
        Behaviors.stopped
      case a @ _ =>
        Behaviors.same
    }
  }

}
