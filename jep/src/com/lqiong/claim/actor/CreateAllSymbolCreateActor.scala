//package com.lqiong.claim.actor
//
//import akka.Done
//import akka.actor.ActorSystem
//import akka.actor.typed.scaladsl.Behaviors
//import akka.actor.typed.{ActorRef, Behavior}
//import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, EntityTypeKey}
//import akka.event.LoggingAdapter
//import akka.stream.OverflowStrategy
//import akka.stream.scaladsl.{Sink, Source}
//import com.lqiong.claim.actor.CreateAllSymbolCreateActor.{
//  CreateAllSymbolWrapperCodeNamesFail,
//  CreateAllSymbolWrapperCodeNamesWrapper,
//  CreateStockSymobol
//}
//import com.lqiong.jep.option.{ClaimDataSource, CodeName}
//import com.lqiong.model.StockSymbol
//
//import scala.concurrent.Future
//import scala.concurrent.duration.DurationInt
//import scala.util.{Failure, Success}
//
//object CreateAllSymbolCreateActor {
//
//  trait CreateAllSymbolCreateActorCommand
//  case object InitailStep extends CreateAllSymbolCreateActorCommand
//
//  case class CreateAllSymbolWrapperCodeNamesWrapper(list: List[CodeName])
//      extends CreateAllSymbolCreateActorCommand
//  case class CreateAllSymbolWrapperCodeNamesFail(x: Throwable)
//      extends CreateAllSymbolCreateActorCommand
//
//  case class CreateStockSymobol(symbol: StockSymbol) extends CreateAllSymbolCreateActorCommand
//
//  trait AA extends CreateAllSymbolCreateActorCommand
//  case object Accepted extends AA
//  case object Fail extends AA
//
//  def apply(
//    dataSource: ClaimDataSource,
//    logger: LoggingAdapter,
//    lookupActorRef: ActorRef[LookupSymbolActor.LookupSymbolCommand],
////      shardStartSymbolRegionRef: ActorRef[
////        ShardingEnvelope[ShardedStartSymbolActor.ShardStartSymbolTrait]
////      ],
//    sharding: ClusterSharding,
//    shardStartSymbolRegionRef: EntityTypeKey[
//      ShardedStartSymbolActor.ShardStartSymbolTrait
//    ],
//    system: ActorSystem
//  ): Behavior[CreateAllSymbolCreateActorCommand] = Behaviors.setup { ctx =>
//    Behaviors.withTimers(timers => {
//      timers.startSingleTimer(
//        CreateAllSymbolCreateActor.InitailStep,
//        50.seconds
//      )
//      new CreateAllSymbolCreateActor(
//        sharding,
//        shardStartSymbolRegionRef,
//        dataSource,
//        lookupActorRef,
//        system
//      )
//        .behaviour()
//    })
//  }
//}
//
//class CreateAllSymbolCreateActor(
//  sharding: ClusterSharding,
//  shardStartSymbolRegionRef: EntityTypeKey[
//    ShardedStartSymbolActor.ShardStartSymbolTrait
//  ],
//  dataSource: ClaimDataSource,
//  lookupActorRef: ActorRef[LookupSymbolActor.LookupSymbolCommand],
//  implicit val system: ActorSystem
//) {
//  def behaviour(): Behavior[CreateAllSymbolCreateActor.CreateAllSymbolCreateActorCommand] =
//    Behaviors.setup { ctx =>
//      {
//        Behaviors.receiveMessage[
//          CreateAllSymbolCreateActor.CreateAllSymbolCreateActorCommand
//        ] {
//          case CreateAllSymbolCreateActor.CreateStockSymobol(x) =>
//            ctx.log.info(
//              "CreateAllSymbolCreateActor CreateStockSymobol {}",
//              x.code
//            )
//
//            val jepSharedActor =
//              sharding.entityRefFor(shardStartSymbolRegionRef, x.code)
//            jepSharedActor ! ShardedStartSymbolActor.StartShardSymbol(
//              x,
//              lookupActorRef
//            )
//            Behaviors.same
//          case CreateAllSymbolWrapperCodeNamesWrapper(x) => {
//
//            val codeList: List[CodeName] = x
//              .filter(r => !r.code.startsWith("68"))
//              .filter(r => !r.code.startsWith("83"))
//              .filter(r => !r.code.startsWith("43"))
//              .filter(r => !r.code.startsWith("87"))
//              .filter(r => !r.code.startsWith("20"))
//
//            val f: Future[Done] = Source(
//              codeList
//            ).throttle(3, 1.second)
//              .buffer(4000, OverflowStrategy.backpressure)
//              .runWith(Sink.foreach(r1 => {
//                ctx.self ! CreateStockSymobol(StockSymbol(r1.code))
//              }))
//
//            ctx.pipeToSelf(f) {
//              case Success(x) => {
//                CreateAllSymbolCreateActor.Accepted
//              }
//              case _ => {
//                CreateAllSymbolCreateActor.Fail
//              }
//            }
//
////            ctx.log.info("CreateAllSymbolWrapperCodeNamesWrapper {}", x.size)
//////              : CreateAllSymbolCreateActor codeList 3266
////            //  4550
////            ctx.log.info(
////              "CreateAllSymbolCreateActor codeList {}",
////              codeList.length
////            )
////
////            codeList.foreach(code => {
////              ctx.self ! CreateStockSymobol(StockSymbol(code.code))
////            })
//            Behaviors.same
//          }
//          case CreateAllSymbolWrapperCodeNamesFail(x) =>
//            Behaviors.same
//          case CreateAllSymbolCreateActor.InitailStep =>
//            ctx.pipeToSelf(dataSource.getCodeNamesAsync()) {
//              case Success(data) =>
//                CreateAllSymbolCreateActor
//                  .CreateAllSymbolWrapperCodeNamesWrapper(
//                    data
//                  )
//              case Failure(x) =>
//                ctx.log.error(s"code name {}", x)
//                CreateAllSymbolWrapperCodeNamesFail(x)
//            }
//
//            Behaviors.same
//          case _ => Behaviors.same
//        }
//      }
//    }
//}
