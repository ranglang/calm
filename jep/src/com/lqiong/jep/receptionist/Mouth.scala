package com.lqiong.jep.receptionist

import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}
import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
import com.lqiong.jep.receptionist.Brain.MessageToBrain

object Mouth {

  sealed trait MessageToMouth
  case class SpeakText(msg: String, repltyTo: ActorRef[MessageToBrain]) extends MessageToMouth
  private case class ListingResponse(listing: Receptionist.Listing) extends MessageToMouth

  // this line of code is long, so i wrapped it onto two lines
  def apply(name: String): Behavior[MessageToMouth] = Behaviors.setup {
    val MouthKey: ServiceKey[MessageToMouth] = ServiceKey(s"Mouth${name}")
    context: ActorContext[MessageToMouth] =>
      // (1) a ServiceKey is a unique identifier for this actor
      // (2) every actor that wants to be discoverable must register itself
      // with the Receptionist by sending the Receptionist as Receptionist
      // message, including your ServiceKey
      context.system.receptionist !
        Receptionist.Register(MouthKey, context.self)

      Behaviors.receiveMessage { message =>
        message match {
          case SpeakText(msg, replyTo) =>
            println(s"Mouth${name}: got a msg: $msg")
            replyTo ! Brain.OKDonw()
            Behaviors.same
        }
      }
  }

}
