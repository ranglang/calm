package com.lqiong.jep.receptionist

import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.actor.typed.scaladsl.{AbstractBehavior, ActorContext, Behaviors}
import akka.actor.typed.receptionist.{Receptionist, ServiceKey}
import com.lqiong.jep.receptionist.Mouth.MessageToMouth

object Supervisor {

  // the messages this actor can handle
  sealed trait SupervisorMessage
  final case object Start extends SupervisorMessage

  // the usual factory method.
  // this line of code is very long, so i wrapped it onto three lines here.
  def apply(): Behavior[SupervisorMessage] =
    Behaviors.setup[SupervisorMessage] { actorContext: ActorContext[SupervisorMessage] =>
      // create our two child actors. in this case i could have passed the
      // Mouth ActorRef to the Brain constructor, but the purpose of this
      // recipe is to learn how to discover actors, so i didn’t do that.
      // in some situations you won’t be able to pass an actor an ActorRef
      // during the construction process.
      val mouth: ActorRef[Mouth.MessageToMouth] = actorContext.spawn(
        Mouth("a"),
        "a"
      )
      val mouth1: ActorRef[Mouth.MessageToMouth] = actorContext.spawn(
        Mouth("b"),
        "b"
      )

      val brain: ActorRef[Brain.MessageToBrain] =
        actorContext.spawnAnonymous(
          Brain()
        )

      // when we receive a Start message, send the FindTheMouth message
      // to the Brain
      Behaviors.receiveMessage { consoleMessage =>
        consoleMessage match {
          case Start =>
//              "Brain"
            println(s"Supervisor got a Start message")
            brain ! Brain.FindTheMouthItem("a", "open the door")
            brain ! Brain.FindTheMouthItem("a", "open the door 1")
            Behaviors.same
        }
      }
    }
}
