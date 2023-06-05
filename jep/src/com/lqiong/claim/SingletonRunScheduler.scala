package com.lqiong.claim

import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
import akka.actor.typed.{ActorRef, Behavior}
import akka.event.LoggingAdapter
import com.lqiong.claim.spot.SpotActor
import com.lqiong.jep.entry.LqScheduler

import scala.concurrent.duration.DurationInt
import scala.util.{Failure, Success}

object SingletonRunScheduler {
  sealed trait SingletonCommand
  case object StartStart extends SingletonCommand
  case object UpdateNote extends SingletonCommand

  sealed trait SingletonCommandUpdateNote extends SingletonCommand

  case object UpdateNoteOk extends SingletonCommandUpdateNote
  case object UpdateNoteFail extends SingletonCommandUpdateNote

  def apply(
    logger: LoggingAdapter,
    scheduler: LqScheduler,
    spotMsg: ActorRef[SpotActor.SpotMsg]
  ): Behavior[SingletonCommand] = {
    def updated(
      isRunning: Boolean,
      timers: TimerScheduler[SingletonCommand]
    ): Behavior[SingletonCommand] = {
      Behaviors.setup[SingletonCommand] { context =>
        {

          Behaviors.receiveMessage[SingletonCommand] {
            case StartStart =>
              logger.info("startStart")
              if (!isRunning) {
                logger.info("run_scheduler")
                scheduler.runScheduleMessage(spotMsg)
                timers.startSingleTimer(
                  SingletonRunScheduler.UpdateNote,
                  4.minutes
                )
              }
              updated(isRunning = true, timers)
            case SingletonRunScheduler.UpdateNote =>
              context.pipeToSelf(scheduler.orderConfig.updateNotes()) {
                case Success(data) => UpdateNoteOk
                case Failure(x) =>
                  logger.info("update Note fail")
                  UpdateNoteFail
              }
              Behaviors.same
            case a @ _ =>
              logger.info("is Running ignored,  state {}", isRunning)
              Behaviors.same
          }
        }
      }
    }

    Behaviors.withTimers(timers => {
      updated(false, timers)
    })
  }
}
