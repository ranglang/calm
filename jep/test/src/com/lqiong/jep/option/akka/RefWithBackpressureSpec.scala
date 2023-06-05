package com.lqiong.jep.option.akka

import akka.actor.ActorSystem
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import akka.testkit.{ImplicitSender, TestKit, TestProbe}
import org.scalatest.BeforeAndAfterAll
import org.scalatest.wordspec.AnyWordSpecLike

class RefWithBackpressureSpec()
  extends TestKit(ActorSystem("A12"))
    with ImplicitSender
    with AnyWordSpecLike  with Matchers with BeforeAndAfterAll {

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "An Echo actor" must {
    "send get a12" in {
      import akka.actor.Status.Success
      import akka.actor.ActorRef
      import akka.stream.CompletionStrategy
      import akka.stream.scaladsl._

      val probe = TestProbe()

      val source: Source[String, ActorRef] = Source.actorRefWithBackpressure[String](
        ackMessage = "ack",
        // complete when we send akka.actor.status.Success
        completionMatcher = {
          case _: Success => CompletionStrategy.immediately
        },
        // do not fail on any message
        failureMatcher = PartialFunction.empty)
      val actorRef: ActorRef = source.to(Sink.foreach(println)).run()

      probe.send(actorRef, "hello")
      probe.expectMsg("ack")
      probe.send(actorRef, "hello")
      probe.expectMsg("ack")

      1 shouldEqual 1
      // The stream completes successfully with the following message
    }
  }
}
