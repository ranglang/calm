package com.lqiong.jep.option.akka


import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.actor.typed.ActorRef
import akka.actor.typed.scaladsl.AskPattern.Askable
import akka.util.Timeout
import com.github.takezoe.retry.{LinerBackOff, RetryPolicy, retry}
import com.lqiong.claim.actor.a.{ConfirmationContractState, ContractStateActor1}
import com.typesafe.config.ConfigFactory
import org.scalatest.wordspec.AnyWordSpecLike

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}
import scala.language.postfixOps

class TestPStateClass1 ()
  extends ScalaTestWithActorTestKit(
    ConfigFactory.load()
  ) with AnyWordSpecLike {

  lazy val config = ConfigFactory.load()
  system.log.info(s"en {}", config.getString("akka.persistence.journal.plugin"))
  system.log.info(config.getString("akka.persistence.journal.plugin"))

  override implicit val timeout = Timeout(50.seconds)

//  curl 'http://175.24.206.163:3012/api/app/get_schedule/v1?api_key=24968471deabe3326fec499a057bc9f8'
// {"code":0,"rows":[{"enabled":1,"params":{"script":"#!/bin/sh\n\nls -l \npwd","annotate":0,"json":0},"timing":false,"max_children":1,"timeout":3600,"catch_up":0,"queue_max":1000,"timezone":"Asia/Shanghai","plugin":"shellplug","title":"test","category":"general","target":"maingrp","algo":"random","multiplex":0,"stagger":0,"retries":0,"retry_delay":0,"detached":0,"queue":0,"chain":"","chain_error":"","notify_success":"","notify_fail":"","web_hook":"","cpu_limit":0,"cpu_sustain":0,"memory_limit":0,"memory_sustain":0,"log_max_size":0,"notes":"","id":"el49oaes701","modified":1654939603,"created":1654939567,"username":"caedman"}],"list":{"page_size":50,"first_page":0,"last_page":0,"length":1,"type":"list"}}


//  system.log.info(config.getString("akka.persistence.r2dbc.journal.class"))
//  val stockCodeNameRef = spawn(Behaviors.receiveMessage[CodeNameActor.CodenameCommand] {
//
//
//    case GetCodeName(code, replyTo) =>
//      replyTo ! CodeNameResponse(s"OKKk2222_${code}")
//      Behaviors.same
//    case _ =>
//      Behaviors.same
//  })

  lazy val aRef = spawn(
    ContractStateActor1(),
    s"stockSymbol000001"
  )


  import scala.concurrent.duration._
  implicit  val l = RetryPolicy(
    maxAttempts = 3,
    retryDuration = 30.second,
    backOff = LinerBackOff, // default is FixedBackOff
    jitter = 20.second // default is no jitter
  )
  def  fetch (): ConfirmationContractState =  {
      implicit val timeout: Timeout = 20.seconds
      val a1: Future[ConfirmationContractState] =  {
        aRef.ask((ref: ActorRef[ConfirmationContractState]) =>
          ContractStateActor1.GetContractState(ref)
        )(
          timeout,
          system.scheduler
        )
      }

    Await.result(
      retry (
        a1
      ),
      200.seconds
    )
    }

  "An Test A actor BBBBBBBBBBBBBBBBBBBBBBBBBBB" must {
    " test p state dddddddddd" in {
      val f = fetch()
      f shouldEqual 2
//    val probe = testKit.createTestProbe[ConfirmationContractState]()
//     aRef ! ContractStateActor1.GetContractState(probe.ref)
//      val r = probe.expectMessageType[ConfirmationContractState](70.seconds)
////      r shouldEqual  1
//      aRef ! ContractStateActor1.UpdateContractInfo(List(ContractDetailStockList(",", ",", List.empty[ContractOrderInfo])))
//      val r1 = probe.expectMessageType[ConfirmationContractState](70.seconds)
//      r1 shouldEqual  1
      //
      //      val probe1 = testKit.createTestProbe[StockSymbolPActor.Accepted]()
      //      aRef ! StockSymbolPActor.UpdateStockStatePrice(7.0, probe1.ref)
      //      val r3 = probe1.expectMessage(30.seconds, StockSymbolPActor.Accepted)
      //      system.log.info("rrrrrrrrrrr3 {}", r3)
      //
      //      val probeUpdateName = testKit.createTestProbe[StockSymbolPActor.Accepted]()
      //      aRef ! StockSymbolPActor.UpdateStockStateName("xxx", probeUpdateName.ref)
      //      val rUpdateName = probeUpdateName.expectMessage(30.seconds, StockSymbolPActor.Accepted)
      //      system.log.info("rUpdateName {}", rUpdateName)
      //
      //
      //      val probe4 = testKit.createTestProbe[StockPState]()
      //      aRef ! StockSymbolPActor.GetPActorState(probe4.ref)
      //      val r4 = probe4.expectMessageType[StockPState](30.seconds)
      //      system.log.info("rrrrrrrrrrr4 {}", r4)
      //      r3 shouldEqual 1
//      1 shouldEqual 1
    }
  }
}
