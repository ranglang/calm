package com.lqiong.jep.modules

//class JoinquantModule {

import com.google.inject.AbstractModule
//import com.lqiong.claim.actor.BundledJqActor
import net.codingwell.scalaguice.ScalaModule

class JoinquantModule extends AbstractModule with ScalaModule {

  override def configure(): Unit = {}

//  @Provides
//  @Singleton
//  def bundleBundledJqActor(
//    sharding: ClusterSharding,
//    injector: Injector,
//    logger: LoggingAdapter
//  ): ActorRef[BundledJqActor.BundleJqCommand] = {
//    val actorSystemTyped = injector.getInstance(
//      Key.get(scalaguice.typeLiteral[typed.ActorSystem[Nothing]])
//    )
//    val joinQuantActor: ActorRef[BundledJqActor.BundleJqCommand] =
//      actorSystemTyped.systemActorOf(
//        BundledJqActor(
//          sharding,
//          ShardedJepQueryActor.JepShardedTypeKey,
//          logger
//        ),
//        "bundledJoinquant"
//      )
//    joinQuantActor
//  }
}
