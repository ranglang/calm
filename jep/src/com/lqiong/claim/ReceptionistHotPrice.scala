//package com.lqiong.claim
//
////class A1 {
//
////  package com.lqiong.jep.receptionist
//
//import akka.actor.typed.{ActorRef, ActorSystem}
//import akka.actor.typed.scaladsl.AskPattern.Askable
//import com.lqiong.claim.lighting.LightningStcokActor.LightningStockName
//import com.lqiong.claim.lighting.{
//  SymbolHotCreator,
//  LightningStcokActor,
//  LookupLightningActor,
//  SupervisorA
//}
//import com.lqiong.model.StockSymbol
//
//import scala.concurrent.Await
//import scala.concurrent.duration.DurationInt
//
//object ReceptionistHotPrice extends App {
//
//  // create the ActorSystem
//  implicit val supervisor1 = ActorSystem(
//    SupervisorA(),
//    "Supervisor"
//  )
//
//  supervisor1 ! SupervisorA.Start
//  Thread.sleep(10000)
//  supervisor1 ! SupervisorA.Test
//  Thread.sleep(10000)
////  val d = supervisor1.systemActorOf(FixInputHandler(supervisor1), "A")
////
////  d ! FixInputHandler.CreateA(StockSymbol("000001"))
////  d ! FixInputHandler.CreateA(StockSymbol("000003"))
////  d ! FixInputHandler.CreateA(StockSymbol("000002"))
//
////  Thread.sleep(40)
////  implicit val t = 2.seconds
////  val f = supervisor1.ask((r: ActorRef[LightningStockName]) =>
////    LookupLightningActor.LookupProcyCmd(
////      StockSymbol("000001"),
////      LightningStcokActor.GetSymbolName(r)
////    )
////  )(t, supervisor1.scheduler)
////
////  val f1 = Await.result(f, 3.minutes)
////  println(s"f............. ${f1}")
////  Thread.sleep(3000)
////
////  val f2 = supervisor1.ask((r: ActorRef[LightningStockName]) =>
////    LookupLightningActor.LookupProcyCmd(
////      StockSymbol("000002"),
////      LightningStcokActor.GetSymbolName(r)
////    )
////  )(t, supervisor1.scheduler)
////
////  println(s"Await.result(f2, 3.minutes) ${Await.result(f2, 3.minutes)}")
////
////  supervisor1.terminate()
//  supervisor1.terminate();
//}
