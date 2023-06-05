package com.lqiong.claim.lighting

//import akka.actor.typed.scaladsl.AskPattern.Askable
//import akka.actor.typed.scaladsl.{ActorContext, Behaviors}
//import akka.actor.typed.{ActorRef, Behavior}
//import com.lqiong.claim.lighting.LightningStcokActor.LightningStockName
//import com.lqiong.jep.receptionist.Brain
//import com.lqiong.model.StockSymbol
//import doobie.util.log
//
//import scala.concurrent.Await
//import scala.concurrent.duration.DurationInt
//
//object SupervisorA {
//
//  // the messages this actor can handle
//  sealed trait SupervisorMessage
//  final case object Start extends SupervisorMessage
//  final case object Test extends SupervisorMessage
//  case class A2(data: LightningStockName) extends SupervisorMessage
//
//  // the usual factory method.
//  // this line of code is very long, so i wrapped it onto three lines here.
//  def apply(): Behavior[SupervisorMessage] =
//    Behaviors.setup[SupervisorMessage] {
//      actorContext: ActorContext[SupervisorMessage] =>
//        // create the ActorSystem
//        implicit val supervisor1 = actorContext.spawnAnonymous(
//          LookupLightningActor()
//        )
//        // create our two child actors. in this case i could have passed the
//        // Mouth ActorRef to the Brain constructor, but the purpose of this
//        // recipe is to learn how to discover actors, so i didn’t do that.
//        // in some situations you won’t be able to pass an actor an ActorRef
//        // during the construction process.
//        val d = actorContext.spawnAnonymous(SymbolHotCreator(supervisor1))
//
//        val a: ActorRef[LightningStockName] = actorContext.messageAdapter(A2)
//        // when we receive a Start message, send the FindTheMouth message
//        // to the Brain
//        Behaviors.receiveMessage { consoleMessage =>
//          consoleMessage match {
//            case SupervisorA.Test =>
//              println("SupervisorA.TestSupervisorA.TestSupervisorA.Test")
//              actorContext.log.info("SupervisorA.Test")
//              supervisor1 ! LookupLightningActor.LookupProcyCmd(
//                StockSymbol("000001"),
//                LightningStcokActor.GetSymbolName(a)
//              )
//              Thread.sleep(5);
//              supervisor1 ! LookupLightningActor.LookupProcyCmd(
//                StockSymbol("000002"),
//                LightningStcokActor.GetSymbolName(a)
//              )
//              //                supervisor1 ! LookupLightningActor.LookupProcyCmd(
////                  StockSymbol("000002"),
////                  LightningStcokActor.GetSymbolName(a)
////                )
//              Behaviors.same
//
//            case Start =>
//              //              "Brain"
//
//              d ! SymbolHotCreator.CreateA(StockSymbol("000001"))
//              d ! SymbolHotCreator.CreateA(StockSymbol("000003"))
//              d ! SymbolHotCreator.CreateA(StockSymbol("000002"))
//              println(s"Supervisor got a Start message")
////                brain ! Brain.FindTheMouthItem("a", "open the door")
////                brain ! Brain.FindTheMouthItem("a", "open the door 1")
//              Behaviors.same
//            case a: SupervisorA.A2 =>
//              actorContext.log.info("A2A2A2A2 {}", a)
//              Behaviors.same
//          }
//        }
//    }
//}
