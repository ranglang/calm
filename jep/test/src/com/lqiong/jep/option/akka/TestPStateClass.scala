package com.lqiong.jep.option.akka

import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.actor.typed.scaladsl.Behaviors
import akka.util.Timeout
import com.lqiong.claim.actor.CodeNameActor.{CodeNameResponse, GetCodeName}
import com.lqiong.claim.actor.{CodeNameActor, StockPState, StockSymbolPActor}
import com.lqiong.model.StockSymbol
import com.typesafe.config.ConfigFactory
import org.scalatest.wordspec.AnyWordSpecLike

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

class TestPStateClass ()
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

  lazy val aRef = spawn(
    StockSymbolPActor(
      StockSymbol("000001"),
      system.log,
      stockCodeNameRef
    ),
    s"stockSymbol000001"
  )

  "An Test A actor" must {
    " test p state" in {
      val probe = testKit.createTestProbe[StockPState]()
      aRef ! StockSymbolPActor.GetPActorState(probe.ref)
      val r = probe.expectMessageType[StockPState](120.seconds)
      system.log.info("rrrrrrrrrrr1 {}", r)
//      val probe1 = testKit.createTestProbe[StockSymbolPActor.Accepted]()
//      aRef ! StockSymbolPActor.UpdateStockStatePrice(7.0, DateTime.now, probe1.ref)
//      val r3 = probe1.expectMessage(120.seconds, StockSymbolPActor.Accepted)
//      system.log.info("rrrrrrrrrrr3 {}", r3)

      r.currentPrice.getOrElse(0) shouldEqual 7
    }
  }
}
