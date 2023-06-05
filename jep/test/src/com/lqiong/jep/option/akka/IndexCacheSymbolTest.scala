package com.lqiong.jep.option.akka

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.actor.typed.scaladsl.Behaviors
import akka.util.Timeout
import com.google.inject.Guice
import com.lqiong.claim.actor.CodeNameActor.{CodeNameResponse, GetCodeName}
import com.lqiong.claim.actor.StockHistoryCacheActor.RetCacheHistory
import com.lqiong.claim.actor.{CodeNameActor, StockHistoryCacheActor}
import com.lqiong.email.module.ConfigModule
import com.lqiong.jep.entry.{ExecutionContextModule, QueryTable}
import com.lqiong.jep.modules.RetryModule
import com.lqiong.model.IndexSymbol
import com.typesafe.config.ConfigFactory
import org.scalatest.wordspec.AnyWordSpecLike
import org.slf4j.LoggerFactory

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class IndexCacheSymbolTest ()
    extends ScalaTestWithActorTestKit(
      ConfigFactory.load()
    ) with AnyWordSpecLike {

    lazy val config = ConfigFactory.load()
    system.log.info(s"en {}", config.getString("akka.persistence.journal.plugin"))
    system.log.info(config.getString("akka.persistence.journal.plugin"))

    override implicit val timeout = Timeout(50.seconds)
    system.log.info(config.getString("akka.persistence.r2dbc.journal.class"))
    val stockCodeNameRef = spawn(Behaviors.receiveMessage[CodeNameActor.CodenameCommand] {


      case GetCodeName(code, replyTo) =>
        replyTo ! CodeNameResponse(s"OKKk2222_${code}")
        Behaviors.same
      case _ =>
        Behaviors.same
    })

  val injector = Guice.createInjector(
    new ConfigModule(),
    new RetryModule,
//    new AkkaMaterializerModule(ActorSystem("claim")),
//    new AkkaSharedClusterModule(),
    new ExecutionContextModule,
//    new EmailModule,
//    new JepExecutorModule,
//    new SparkModule,
//    new QueryTableModule,
//    new QuantEngineModule,
//    new JoinquantModule
  )
  import net.codingwell.scalaguice.InjectorExtensions._
  val queryTable = injector.instance[QueryTable]

  val logger = LoggerFactory.getLogger("")
//  val  config = ConfigFactory.load()
  val aRef = spawn(
    StockHistoryCacheActor(
      queryTable,
      config,

      ),
      s"stockSymbol000001"
    )

    "An Test A actor" must {
      " test p state jijijij   jiji " in {
        val probe1 = testKit.createTestProbe[RetCacheHistory]()
        val probe = testKit.createTestProbe[RetCacheHistory]()
        aRef ! StockHistoryCacheActor.FetchStockHistoryCommand(IndexSymbol("000300"), probe.ref)

        Thread.sleep(1000)
//        aRef ! StockHistoryCacheActor.UpdateCacheActor
//        Thread.sleep(2000)

        aRef ! StockHistoryCacheActor.FetchStockHistoryCommand(IndexSymbol("000300"), probe1.ref)
        val r2 = probe1.expectMessageType[StockHistoryCacheActor.RetCacheHistory](5.seconds)

        logger.info("rrrrrr {}", r2)
        r2 shouldNot equal(1)
//        r shouldNot equal(1)
      }
    }
  }
