package com.lqiong.jep.option.akka

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.scaladsl.adapter.ClassicActorSystemOps
import akka.actor.typed.{ActorRef, ActorSystem, Behavior}
import akka.stream.CompletionStrategy
import akka.stream.scaladsl.Sink
import akka.stream.typed.scaladsl.ActorSource
import akka.testkit.{ImplicitSender, TestKit}
import akka.{actor => classic}
import com.lqiong.jep.option.akka.StreamFeeder.Start1
import org.scalatest.BeforeAndAfterAll
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike


object StreamFeeder {

  /** Signals that the latest element is emitted into the stream */
  sealed trait A1

  case object Emitted extends A1
  case object Start1 extends A1

  sealed trait Event
  case class Element(content: String) extends Event
  case object ReachedEnd extends Event
  case class FailureOccured(ex: Exception) extends Event

  def apply(): Behavior[A1] =
    Behaviors.setup { context =>
      val streamActor = runStream(context.self)(context.system)
//      streamActor ! Element("first")
      sender(streamActor, 0)
    }

  private def runStream(ackReceiver: ActorRef[Emitted.type])(implicit system: ActorSystem[_]): ActorRef[Event] = {
    val source =
      ActorSource.actorRefWithBackpressure[Event, Emitted.type](
        // get demand signalled to this actor receiving Ack
        ackTo = ackReceiver,
        ackMessage = Emitted,
        // complete when we send ReachedEnd
        completionMatcher = {
          case ReachedEnd => CompletionStrategy.draining
        },
        failureMatcher = {
          case FailureOccured(ex) => ex
        }
      )

    val streamActor: ActorRef[Event] = source
      .collect {
        case Element(msg) => {
          msg
        }
      }
      .to(Sink.foreach(println))
      .run()
    streamActor
  }

  private def sender(streamSource: ActorRef[Event], counter: Int): Behavior[A1] =
    Behaviors.receiveMessage {
      case Emitted if counter < 5 =>
        streamSource ! Element(counter.toString)
        sender(streamSource, counter + 1)
      case Start1 => {
        streamSource ! Element("first")
        sender(streamSource, counter + 1)
      }
      case m@_ =>
        // Emiited
        println("lllllllllllllllllll")
        print(s"mmmmmmmmmm${m}\n")
        streamSource ! ReachedEnd
        Behaviors.stopped
    }
}


class StreamSpec()
  extends TestKit(classic.ActorSystem("MySpec"))
    with ImplicitSender
    with AnyWordSpecLike
    with Matchers
    with BeforeAndAfterAll {

  override def afterAll(): Unit = {
    system.terminate()
    TestKit.shutdownActorSystem(system)
  }

  "An Echo actor" must {

    "send back messages unchanged" in {
      val systemItem = system.toTyped
     val r =  systemItem.systemActorOf(
        StreamFeeder(), "ddd"
      )
      r ! Start1

      1 shouldEqual 1
    }

  }
}

