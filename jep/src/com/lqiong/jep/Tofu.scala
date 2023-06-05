package com.lqiong.jep

//object Tofu extends App {
//
//  import cats.Monad
//  import cats.effect.Timer
//  import monix.eval.Task
//  import monix.execution.Scheduler.Implicits.global
//
//  import tofu.{Timeout, Raise}
//  import tofu.syntax.monadic._
//
//  import scala.concurrent.duration._
//
//  def computeValue[F[_]: Monad](implicit timer: Timer[F]): F[String] =
//    timer.sleep(3.seconds) >> "value".pure[F]
//
//  def program[F[_]: Monad: Timeout: Timer]: F[String] =
//    Timeout[F].timeoutTo(computeValue, 1.seconds, "fallback".pure[F])
//
//  val v = program[Task].runSyncUnsafe(Duration.Inf)
//  println(s"v ${v}")
//
////  program3[Task].onErrorHandle(_ => "fallback").runSyncUnsafe(Duration.Inf)
//}
