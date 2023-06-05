package com.lqiong.claim.actor

import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
import akka.actor.typed.{ActorRef, Behavior}
import akka.event.LoggingAdapter
import akka.util.Timeout
import com.lqiong.jep.option.{ClaimDataSource, CodeName}
import scala.concurrent.duration._

import scala.util.{Failure, Success}

object CodeNameActor {

  sealed trait CodenameCommand

  case class GetCodeName(code: String, sender: ActorRef[CodeNameResponse]) extends CodenameCommand

  case object CodeNameFetchTick extends CodenameCommand

  case object CodeNameFailure extends CodenameCommand

  case class CodeNamesWrapper(list: List[CodeName]) extends CodenameCommand

  case object CodeNameTimeKey extends CodenameCommand

  sealed trait CodenameResult

  case class CodeNameResponse(name: String) extends CodenameResult

  def apply(
    dataSource: ClaimDataSource,
    logger: LoggingAdapter
  ): Behavior[CodenameCommand] = {

    Behaviors.withTimers(timers => {
      Behaviors.setup[CodenameCommand] { context =>
//        context.self ! CodeNameFetchTick
        startting(timers, dataSource, logger)
      }
    })

  }

  def startting(
    timers: TimerScheduler[CodenameCommand],
    dataSource: ClaimDataSource,
    logger: LoggingAdapter
  ): Behavior[CodenameCommand] = {
    Behaviors.setup[CodenameCommand] { context =>
      Behaviors.receiveMessage[CodenameCommand] {
        case CodeNameFetchTick =>
          implicit val timeout: Timeout = 200.seconds
          logger.info("fetching code names {}", CodeNameFetchTick)
          context.pipeToSelf(dataSource.getCodeNamesAsync()) {
            case Success(data) => CodeNamesWrapper(data)
            case Failure(x) =>
              logger.info(s"code name {}", x)
              CodeNameFailure
          }
          Behaviors.same
        case CodeNamesWrapper(l) =>
          logger.info("fetching CodeNamesWrapper {}", l.length)
          timers.cancelAll()
          timers.startSingleTimer(CodeNameTimeKey, CodeNameFetchTick, 20.hours)
          become(timers, dataSource, logger, list = l)
        case a @ _ =>
          logger.info("CodeNamesWrapper {}", a)
          Behaviors.same
      }
    }
  }

  def become(
    timers: TimerScheduler[CodenameCommand],
    dataSource: ClaimDataSource,
    logger: LoggingAdapter,
    list: List[CodeName] = List.empty[CodeName]
  ): Behavior[CodenameCommand] = {
    Behaviors.setup[CodenameCommand] { context =>
      Behaviors.receiveMessage[CodenameCommand] {
        case CodeNameFailure =>
          logger.info("CodeNameFailure   {}", CodeNameFailure)
          Behaviors.same
        case CodeNamesWrapper(l) =>
          logger.info("fetching CodeNamesWrapper {}", l.length)
          timers.cancelAll()
          timers.startSingleTimer(CodeNameTimeKey, CodeNameFetchTick, 20.hours)
          become(timers, dataSource, logger, list = l)
        case CodeNameFetchTick =>
          implicit val timeout: Timeout = 200.seconds
          logger.info("fetching code names {}", CodeNameFetchTick)
          context.pipeToSelf(dataSource.getCodeNamesAsync()) {
            case Success(data) => CodeNamesWrapper(data)
            case Failure(x) =>
              logger.info(s"code name {}", x)
              CodeNameFailure
          }
          Behaviors.same
        case GetCodeName(code, sender) =>
          {
            logger.info("getting result list.length {}", code)
            val result =
              list.find(r => r.code == code).map(r => r.name).getOrElse("")
            logger.info("getting result {} {}", code, result)
            sender ! CodeNameResponse(result)
          }
          Behaviors.same
        case _ =>
          Behaviors.same
      }
    }
  }
}
