package com.lqiong.claim

import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.{ActorRef, Behavior}
import akka.event.LoggingAdapter
import com.lqiong.jep.option.ClaimDataSource

import scala.util.{Failure, Success}

object JqSingleActor {
  sealed trait JqSingletonCommand

  case class SaveVix(replyTo: ActorRef[Either[Throwable, String]]) extends JqSingletonCommand

  case class SaveVix1(replyTo: ActorRef[Either[Throwable, String]]) extends JqSingletonCommand

  case class VixResponseWrapper(
    dateframe: String,
    ref: ActorRef[Either[Throwable, String]]
  ) extends JqSingletonCommand
  case class UFailure(
    eror: Throwable,
    replyTo: ActorRef[Either[Throwable, String]]
  ) extends JqSingletonCommand

  def apply(
    dataSource: ClaimDataSource,
    logger: LoggingAdapter
  ): Behavior[JqSingletonCommand] = {

    def updated(isRunning: Boolean): Behavior[JqSingletonCommand] = {
      Behaviors.receive { (context, command) =>
        command match {
          case UFailure(error, replyTo) =>
            logger.info("recevie msg failse llll{}", error)
            replyTo ! Left(new Error(error))
            Behaviors.same

          case VixResponseWrapper(df, replyTo) =>
            logger.info("recevie msg{}", df)
            replyTo ! Right(df)
            Behaviors.same
          case SaveVix1(ref) =>
            logger.info("SaveVix111111111111111111111")

//            context.pipeToSelf(dataSource.test()) {
//              // map the Future value to a message, handled by this actor
//              case Success(data) => VixResponseWrapper(data, ref)
//              case Failure(x)    => UFailure(x, ref)
//            }
            Behaviors.same

          case SaveVix(ref) =>
            logger.info("SaveVix")

//            context.pipeToSelf(dataSource.test()) {
//              // map the Future value to a message, handled by this actor
//              case Success(data) => VixResponseWrapper(data, ref)
//              case Failure(x)    => UFailure(x, ref)
//            }

//          logger.info("vixDataset {}", vixDataSet)
            updated(isRunning = false)
          case a @ _ =>
            logger.info("is Running ignored,  state {}", isRunning)
            Behaviors.same
        }
      }
    }

    updated(false)
  }
}
