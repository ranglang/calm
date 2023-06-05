package com.lqiong.jep.entry
//
//import akka.actor.ActorSystem
//import com.github.takezoe.retry.{FixedBackOff, RetryPolicy}
//
//import scala.concurrent.duration.DurationInt
//
//object Download extends App {
//
//  val retryProxy = RetryPolicy(
//    maxAttempts = 10,
//    retryDuration = 5.second,
//    backOff = FixedBackOff, // default is FixedBackOff
//    jitter = 5.second // default is no jitter
//  )
//  val a = ActorSystem("AA")
//  val r = new Polyty()(retryProxy, a.log)
//  new PlotChart(r).run()
//}
