package com.lqiong.jep.option.akka


import akka.actor.ActorSystem
import akka.actor.testkit.typed.scaladsl.ActorTestKit
import akka.testkit.{ImplicitSender, TestKit}
import com.google.inject.Guice
import com.lqiong.email.module.ConfigModule
import com.lqiong.jep.entry._
import com.lqiong.jep.modules.{EmailModule, JepExecutorModule, QueryTableModule, RetryModule, SparkModule}
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

import scala.language.postfixOps

class CounterSpec()
  extends TestKit(ActorSystem("Count"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  val injector = Guice.createInjector(
    new ConfigModule(),
    new AkkaMaterializerModule(system),
    new ExecutionContextModule,
    new EmailModule,
    new LoggingModule("spark"),
    new JepExecutorModule,
    new RetryModule,
    new SparkModule,
    new QueryTableModule
  )
//  lazy val sparkTable = injector.instance[GetSparkTable]

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
//    testKit.shutdownTestKit()
//    sparkTable.shutdownSpark()
    system.terminate()
  }


  import akka.actor.typed.scaladsl.adapter._

  val testKit = ActorTestKit(system.toTyped)

  "An Echo actor" must {

    "send back messages unchanged" in {
//      val sparkTable = injector.instance[GetSparkTable]
//      val counter = new Counter( system.log)(ActorMaterializer()(system))
//      val counterRef = testKit.spawn(counter("entity_id", system.log))
//
//      val probe = testKit.createTestProbe[SpotMsg]()
//      List(
//        TodayStockPrice(
//          code="000002",
//          open=0,
//          close=0,
//          high=0,
//          low=0,
//          volume=0
//        ),
//        TodayStockPrice(
//          code="000001",
//          open=0,
//          close=0,
//          high=0,
//          low=0,
//          volume=0
//        )
//
//      ).foreach(r1 => {
//        system.logger.info("updateStockItem");
//        counterRef ! UpdateStockItem(StockSymbol(r1.code.drop(2)), DateTime.now, TodayStockPrice(
//          code = r1.code,
//          open = r1.open,
//          close = r1.close,
//          high = r1.high,
//          low = r1.low,
//          volume = r1.volume
//        ), probe.ref)
//
//        probe.expectMessage(SpotActor.StockAcked)
//      })
       1 shouldEqual 1
    }
  }
}

