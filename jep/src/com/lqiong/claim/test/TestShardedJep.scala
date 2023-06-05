//package com.lqiong.claim.test
//
//import akka.actor.ActorSystem
//import akka.actor.testkit.typed.scaladsl.ActorTestKit
//import akka.actor.typed.ActorRef
//import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
//import akka.cluster.sharding.typed.ShardingEnvelope
//import akka.cluster.sharding.typed.scaladsl.{ClusterSharding, Entity, EntityTypeKey}
//import akka.event.LoggingAdapter
//import com.google.inject.Guice
//import com.lqiong.claim.actor.{RunJepRet, ShardedJepQueryActor}
//import com.lqiong.email.module.ConfigModule
//import com.lqiong.jep.entry._
//import com.lqiong.jep.modules._
//import com.lqiong.jep.option.QuantEngine
//import com.lqiong.model.StockSymbol
//
//import scala.concurrent.Await
//import scala.concurrent.duration.DurationInt
//
//object TestShardedJep extends App {
//
//  implicit val system = ActorSystem("test")
//  implicit val systemTyped = system.toTyped
//
//  val injector = Guice.createInjector(
//    new ConfigModule(),
//    new AkkaMaterializerModule(system),
//    new AkkaSharedClusterModule(),
//    new ExecutionContextModule,
//    new EmailModule,
//    new LoggingModule("spark"),
//    new JepExecutorModule,
//    new RetryModule,
//    new SparkModule,
//    new QueryTableModule
//  )
//  import net.codingwell.scalaguice.InjectorExtensions._
//  lazy val quantEngine = injector.instance[QuantEngine]
//
//  val logger = injector.instance[LoggingAdapter]
//  lazy val clusterSharding = injector.instance[ClusterSharding]
//
//  implicit val timeout = 120.seconds
//
////    val shardedJepActor =
//
//  val testKit = ActorTestKit(system.toTyped)
//
//  def testJqAtor() = {
//    val probe = testKit.createTestProbe[RunJepRet.RunJepRetMsg]()
//    val probe1 = testKit.createTestProbe[RunJepRet.RunJepRetMsg]()
//
//    val counterRef = testKit.spawn(
//      ShardedJepQueryActor("", logger, quantEngine.dataSource)
//    )
//
////    counterRef ! ShardedJepQueryActor.SharedUpdateJepUpdateSymbolNoResponse(
////      StockSymbol("000001")
////    )
//    counterRef ! ShardedJepQueryActor.HandleSaveContinueData(
//      StockSymbol("000002"),
//      probe.ref
//    )
//
//    val a = probe.expectNoMessage(3.minutes)
//  }
//
//  def testBundleed() = {
//    val JepShardedTypeKey: EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand] =
//      EntityTypeKey[ShardedJepQueryActor.SharedJepQueryCommand]("ShardedJep")
//
//    val shardRegion1: ActorRef[
//      ShardingEnvelope[ShardedJepQueryActor.SharedJepQueryCommand]
//    ] =
//      clusterSharding.init(
//        Entity(JepShardedTypeKey)(createBehavior =
//          entityContext =>
//            ShardedJepQueryActor(
//              entityContext.entityId,
//              system.log,
//              quantEngine.dataSource
//            )
//        )
//      )
//
////    val an: ActorRef[BunbledSyncActor.BunbledSyncActorCommand] =
////      system.spawnAnonymous(
////        BunbledSyncActor(
////          system.log,
////          clusterSharding,
////          JepShardedTypeKey
////        )
////      )
//
////    implicit val timeout: Timeout = 300.seconds
//
////    val a1: Future[BunbledSyncActor.ResultItem] = an.ask(ref =>
////      BunbledSyncActor.BacthSyncSymbols(
////        List(StockSymbol("000001"), StockSymbol("000002")),
////        ref
////      )
////    )
////    val a = Await.result(a1, 5.minutes)
//
////    logger.info("aa {}", a)
//  }
//
//  def runTest() = {
//    testJqAtor();
////    testBundleed()
//    Await.result(
//      system.terminate(),
//      30.seconds
//    )
//    sys.exit(0);
//  }
//
//  runTest()
//
//}
