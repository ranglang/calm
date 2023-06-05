package com.lqiong.jep.entry

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import plotly.Trace
import plotly.layout.Layout

import java.io.File

class Polyty @Inject() (implicit
  val retryPolicy: RetryPolicy,
  val logger: LoggingAdapter
) {

  def print(
    path: File,
    traces: Seq[Trace],
    layout1: Layout,
    save: Boolean = true
  ): Unit = {}

}
