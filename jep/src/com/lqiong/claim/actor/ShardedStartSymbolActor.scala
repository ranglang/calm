//package com.lqiong.claim.actor
//
//import akka.actor.typed._
//import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
//import akka.event.LoggingAdapter
//import com.lqiong.claim.actor.ShardedStartSymbolActor.StartShardSymbol
//import com.lqiong.model.LSymbol
//import org.slf4j.LoggerFactory
//
//object ShardedStartSymbolActor {
//
//  trait ShardStartSymbolTrait
//
//  case class StartShardSymbol(
//    stockSymbol: LSymbol,
//    lookupActorRef: ActorRef[LookupSymbolActor.LookupSymbolCommand]
//  ) extends ShardStartSymbolTrait
//
//  def apply(
//    entityId: String,
//    logger: LoggingAdapter,
//    stockCodeNameRef: ActorRef[CodeNameActor.CodenameCommand]
//  ): Behavior[ShardedStartSymbolActor.ShardStartSymbolTrait] =
//    Behaviors.setup[ShardedStartSymbolActor.ShardStartSymbolTrait] { context =>
//      context.log.info(
//        "ShardedStartSymbolActor setup host {} entityid {}",
//        NetUtils.getHostName,
//        entityId
//      )
//      Behaviors
//        .supervise(
//          new ShardedStartSymbolActor().behaviour(
//            entityId,
//            context,
//            logger,
//            stockCodeNameRef
//          )
//        )
//        .onFailure(SupervisorStrategy.restart)
//    // .withStopChildren(false))
//    }
//}
//
//class ShardedStartSymbolActor {
//
//  val logger1 = LoggerFactory.getLogger(getClass.getName)
//  def behaviour(
//    entityId: String,
//    context: ActorContext[ShardedStartSymbolActor.ShardStartSymbolTrait],
//    logger: LoggingAdapter,
//    stockCodeNameRef: ActorRef[CodeNameActor.CodenameCommand]
//  ): Behavior[ShardedStartSymbolActor.ShardStartSymbolTrait] = {
//    Behaviors
//      .receiveMessage[ShardedStartSymbolActor.ShardStartSymbolTrait] {
//        case StartShardSymbol(stockSymbol, lookupActorRef) =>
//          logger.info(
//            "logger StartShardSymbol {} {} {}",
//            NetUtils.getHostName,
//            stockSymbol,
//            entityId
//          )
//          val aRef = context.spawn(
//            StockSymbolPActor(
//              stockSymbol,
//              logger1,
//              stockCodeNameRef
//            ),
//            s"stockSymbol${stockSymbol.code}"
//          )
//          context.watch(aRef)
//          lookupActorRef ! LookupSymbolActor.SubscribeSymbol(stockSymbol)
//          Behaviors.same
//      }
//      .receiveSignal {
//        case (context, a: ChildFailed) =>
//          context.log.info(
//            "ShardedStartSymbolActor Job ChildFailed: {} {} {} {}",
//            NetUtils.getHostName,
//            a.ref,
//            a.cause,
//            a.toString()
//          )
//          Behaviors.same
//        case (context, Terminated(ref)) =>
//          context.log.info(
//            "ShardedStartSymbolActor Job stopped: {}",
//            ref.path.name
//          )
//          Behaviors.same
//        case (_, signal) if signal == PreRestart =>
//          logger.info(
//            "ShardedStartSymbolActor restart PreRestart {}",
//            NetUtils.getHostName
//          )
//          Behaviors.same
//        case (_, signal) if signal == PostStop =>
//          logger.info(
//            "ShardedStartSymbolActor restart PostStop {}",
//            NetUtils.getHostName
//          )
//          Behaviors.same
//      }
//  }
//
//}
