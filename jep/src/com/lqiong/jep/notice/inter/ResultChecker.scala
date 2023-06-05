package com.lqiong.jep.notice.inter

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.lqiong.jep.checker.model.CheckResult
import com.lqiong.model.order.NoticeMe

trait ResultChecker {

  val logger: LoggingAdapter
  implicit val retryPolicy: RetryPolicy

  def run(notice: NoticeMe): Option[CheckResult]

  def accept(notice: NoticeMe): Boolean
}
