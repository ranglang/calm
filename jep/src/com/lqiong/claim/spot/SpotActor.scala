package com.lqiong.claim.spot

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, EntityRef, EntityTypeKey}
import akka.event.LoggingAdapter
import com.lqiong.claim.actor.ShardedActorCounter
import com.lqiong.jep.entry.Category.value
import com.lqiong.jep.entry.LastStockPrice
import com.lqiong.model.StockSymbol

import scala.concurrent.duration.DurationInt

object SpotActor {
  trait SpotMsg

  case class SaveLastStockPrice(item: LastStockPrice) extends SpotMsg
  case object StockAcked extends SpotMsg

  case object SpotTimeout extends SpotMsg

  def apply(
    sharding: ClusterSharding,
    TypeKey: EntityTypeKey[ShardedActorCounter.ShardedHotPriceCommand],
    logger: LoggingAdapter
  ): Behavior[SpotMsg] = {
//    sender(0, sharding, TypeKey, logger)

    Behaviors.withTimers(timers => {
      idle(timers, sharding, TypeKey, logger)
    })
  }

  def idle(
    timers: TimerScheduler[SpotActor.SpotMsg],
    sharding: ClusterSharding,
    TypeKey: EntityTypeKey[ShardedActorCounter.ShardedHotPriceCommand],
    logger: LoggingAdapter
  ): Behavior[SpotMsg] = {
    Behaviors.setup[SpotMsg] { context =>
      {
        Behaviors.receiveMessage[SpotMsg] {
          case SaveLastStockPrice(item) =>
            logger.info("SaveLastStockPrice {}", value)
            item.stick.foreach(r => {
              val counterShardRef: EntityRef[ShardedActorCounter.ShardedHotPriceCommand] =
                sharding.entityRefFor(TypeKey, r.code)
              val stockSymbol = StockSymbol(r.code.drop(2))
              counterShardRef ! ShardedActorCounter.UpdateStockItem(
                stockSymbol,
                item.date,
                r,
                context.self
              )
            })
            timers.startSingleTimer(SpotTimeout, 20.minutes)
            sender(timers, item.stick.length, sharding, TypeKey, logger)
          case _ => {
            Behaviors.same
          }
        }
      }
    }
  }

  def sender(
    timers: TimerScheduler[SpotActor.SpotMsg],
    rest: Int,
    sharding: ClusterSharding,
    TypeKey: EntityTypeKey[ShardedActorCounter.ShardedHotPriceCommand],
    logger: LoggingAdapter
  ): Behavior[SpotMsg] = {
    Behaviors.setup[SpotMsg] { context =>
      {
        Behaviors.receiveMessage[SpotMsg] {
          case StockAcked =>
            logger.info("acked {}", rest)
            if (rest <= 1) {
              logger.info("saved spot all saved ")
              Behaviors.same
              idle(timers, sharding, TypeKey, logger)
            } else {
              // stop info items
              sender(timers, rest - 1, sharding, TypeKey, logger)
            }
          case SpotTimeout => {
            idle(timers, sharding, TypeKey, logger)
          }
          case msg @ _ =>
            logger.info("receive msg  spot actor {}", msg)
            Behaviors.same
        }
      }
    }
  }
}
