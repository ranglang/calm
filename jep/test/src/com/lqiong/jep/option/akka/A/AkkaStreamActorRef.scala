package com.lqiong.jep.option.akka.A


//
import akka.actor.testkit.typed.scaladsl.ScalaTestWithActorTestKit
import akka.actor.typed.ActorRef
import akka.actor.typed.scaladsl.Behaviors
import akka.stream.scaladsl.{Sink, Source}
import akka.stream.typed.scaladsl.ActorFlow
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.must.Matchers
import scala.concurrent.duration._
import org.scalatest.wordspec.AnyWordSpecLike

import scala.collection.immutable
import scala.concurrent.{Await, Future}


case class Reply(name: String)

case class Asking(replyTo:  ActorRef[Reply], xx: String)

class AkkaStreamActorRef1()
  extends ScalaTestWithActorTestKit
  with AnyWordSpecLike {


  val ref = spawn(Behaviors.receiveMessage[Asking] { asking =>
    println(s"start ${asking.xx}")
    Thread.sleep(1000)
    asking.replyTo ! Reply(asking.xx + "!!!")
    Behaviors.same
  })

  val in: Future[immutable.Seq[Reply]] =
    Source(1 to 3)
      .map(_.toString)
      .via(ActorFlow.ask(ref)((el, replyTo: ActorRef[Reply]) => Asking(replyTo, el)))
      .runWith(Sink.seq)

  "An Echo actor" must {
    "send back messages unchanged" in {
      Await.result(in, 40.seconds) shouldNot equal(1)
    }
  }
}
