//package com.lqiong.claim.actor
//
//import akka.actor.typed.{ActorRef, Behavior}
//import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
//import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, EntityRef, EntityTypeKey}
//import akka.event.LoggingAdapter
//import com.lqiong.claim.actor.BundledJqActor.BundleJqCommand
//import com.lqiong.claim.actor.ShardedJepQueryActor.SharedJepQueryCommand
//import com.lqiong.model.StockSymbol
//
//import scala.concurrent.duration.DurationInt
//
//object BundledJqActor {
//  trait BundleJqCommand
//
//  case object BundleJqTimeOut extends BundleJqCommand
//  case class ProxyJepCommand(jepCommand: SharedJepQueryCommand) extends BundleJqCommand
//
//  trait SingleToJqResult
//
//  case object JqResult extends SingleToJqResult
//
//  def apply(
//    sharding: ClusterSharding,
//    entityRef: EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand],
//    logger: LoggingAdapter
//  ): Behavior[BundleJqCommand] = {
//    Behaviors.setup[BundleJqCommand] { context =>
//      Behaviors.withTimers(timers => {
//        new BundledJqActor().become(sharding, entityRef)
//      })
//    }
//
//  }
//}
//
//class BundledJqActor {
//
//  def become(
//    sharding: ClusterSharding,
//    entityRef: EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand]
//  ): Behavior[BundleJqCommand] = {
//    Behaviors.receiveMessage[BundleJqCommand] {
//      case BundledJqActor.BundleJqTimeOut =>
//        Behaviors.stopped
//      case BundledJqActor.ProxyJepCommand(x) =>
//        val counterShardRef: EntityRef[ShardedJepQueryActor.SharedJepQueryCommand] = {
//          sharding.entityRefFor(entityRef, "fixed")
//        }
//        counterShardRef ! x
//        Behaviors.same
//    }
//  }
//}
