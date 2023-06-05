package com.lqiong.claim.spot

import akka.actor.typed.scaladsl.{Behaviors, TimerScheduler}
import akka.actor.typed.{ActorRef, Behavior}
import akka.event.LoggingAdapter
import com.lqiong.claim.SingletonRunScheduler

import scala.concurrent.duration.DurationInt

object SchedulerBuncherWithTimer {

  sealed trait SinglegleTotonCommand
  final case class ExcitingMessage(message: String) extends SinglegleTotonCommand
  private case object TimeKey extends SinglegleTotonCommand
  private case object TimeId extends SinglegleTotonCommand

  def apply(
    logger: LoggingAdapter,
    proxyBackOff: ActorRef[SingletonRunScheduler.SingletonCommand]
  ): Behavior[SinglegleTotonCommand] = {
    Behaviors.withTimers(timers => new SchedulerBuncherWithTimer(timers, logger).idle(proxyBackOff))
  }
}

class SchedulerBuncherWithTimer(
  timers: TimerScheduler[SchedulerBuncherWithTimer.SinglegleTotonCommand],
  logger: LoggingAdapter
) {
  import SchedulerBuncherWithTimer._

  private def idle(
    proxyBackOff: ActorRef[SingletonRunScheduler.SingletonCommand]
  ): Behavior[SinglegleTotonCommand] = {
    Behaviors.setup[SinglegleTotonCommand] { _ =>
      logger.info("idle single timer ")
      timers.startSingleTimer(TimeId, TimeKey, 1.minutes)
      active(proxyBackOff)
    }
  }

  def active(
    proxyBackOff: ActorRef[SingletonRunScheduler.SingletonCommand]
  ): Behavior[SinglegleTotonCommand] = {
    Behaviors.receiveMessage[SinglegleTotonCommand] {
      case TimeKey =>
        timers.cancel(TimeId)
        logger.info("scheduler start")
        proxyBackOff ! SingletonRunScheduler.StartStart
        Behaviors.same
      case m @ _ =>
        logger.info("mmmmmmm{}", m)
        Behaviors.same
    }
  }
}
