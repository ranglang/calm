//package com.lqiong.claim.spot
//
//import akka.actor.ActorSystem
//import akka.actor.testkit.typed.scaladsl.ActorTestKit
//import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
//import akka.event.LoggingAdapter
//import com.google.inject.Guice
//import com.lqiong.claim.JqSingleActor.{SaveVix, SaveVix1}
//import com.lqiong.claim.{JqSingleActor, JqSingleActor2}
//import com.lqiong.email.module.ConfigModule
//import com.lqiong.jep.claim.model.{DynamicAStockPrice, TradeDayLists}
//import com.lqiong.jep.entry._
//import com.lqiong.jep.modules.{
//  EmailModule,
//  JepExecutorModule,
//  QueryTableModule,
//  RetryModule,
//  SparkModule
//}
//import com.lqiong.jep.option.{ClaimDataSource, QuantEngine}
//
//import scala.concurrent.Await
//import scala.concurrent.duration.DurationInt
//
//object TestJep extends App {
//
//  val system = ActorSystem("test")
//
//  val injector = Guice.createInjector(
//    new ConfigModule(),
//    new AkkaMaterializerModule(system),
//    new ExecutionContextModule,
//    new EmailModule,
//    new LoggingModule("spark"),
//    new JepExecutorModule,
//    new RetryModule,
//    new SparkModule,
//    new AkkaSharedClusterModule,
//    new QueryTableModule
//  )
//  import net.codingwell.scalaguice.InjectorExtensions._
//  lazy val dataSource = injector.instance[QuantEngine]
//
//  val logger = injector.instance[LoggingAdapter]
//
//  implicit val timeout = 120.seconds
//
//  val testKit = ActorTestKit(system.toTyped)
//
//  def testCurrentPrice() = {
//    logger.info("testCurrentPrice")
//    val price = injector.instance[DynamicAStockPrice]
//
//    val l = Await.result(price.getList("000001"), 300.seconds)
//    if (l.isEmpty) {
//      throw new Error(s"trade day error ${l}")
//    }
//    logger.info(s"l {}", l.lastOption)
//  }
//
//  def testTradeDay() = {
//    val tradeDay = injector.instance[TradeDayLists]
//    tradeDay.fetchData
//    val l = Await.result(tradeDay.getList, 120.seconds)
//    logger.info(s"trade days {}", l.length)
//    logger.info(s"trade head {}", l.head)
//    logger.info(s"trade last {}", l.last)
//    val l2 =
//      Await.result(dataSource.dataSource.getCurrentTradeDays(), 200.seconds)
//    logger.info("llllllll {}", l2.last)
//    if (l.isEmpty) {
//      throw new Error(s"trade day error ${l}")
//    }
//  }
//
//  def testJqAtor() = {
//    val probe = testKit.createTestProbe[Either[Throwable, String]]()
//
//    val counterRef = testKit.spawn(
//      JqSingleActor(dataSource.dataSource, logger)
//      //  "BlockingDispatcher", DispatcherSelector.blocking()
//    )
//
//    val counterRef1 = testKit.spawn(
//      JqSingleActor2(dataSource.dataSource, logger)
//      //      "BlockingDispatcher22", DispatcherSelector.blocking()
//    )
//
//    counterRef ! SaveVix1(probe.ref)
//    counterRef ! SaveVix(probe.ref)
//    counterRef ! SaveVix(probe.ref)
//
//    counterRef1 ! JqSingleActor2.SaveVix1(probe.ref)
//    counterRef1 ! JqSingleActor2.SaveVix(probe.ref)
//    counterRef1 ! JqSingleActor2.SaveVix(probe.ref)
//
//    probe.expectNoMessage(10.seconds)
//  }
//
//  def runTest() = {
//    testCurrentPrice();
//    testTradeDay();
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
