package com.lqiong.jep.notice.checker

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.checker.model
import com.lqiong.jep.checker.model.CheckResult
import com.lqiong.jep.entry.{DateFormat, QueryTable}
import com.lqiong.jep.notice.inter.ResultChecker
import com.lqiong.model.StockTrait
import com.lqiong.model.order.NoticeMe
import org.joda.time.DateTime

import java.util.Date

class TimeChecker @Inject() (
  val logger: LoggingAdapter,
  implicit val retryPolicy: RetryPolicy,
  implicit val stockImpl: StockTrait,
  implicit val queryTable: QueryTable
) extends ResultChecker {
  override def run(notice: NoticeMe): Option[CheckResult] = {
    if (notice.dateTime.isDefined) {
      logger.info("dt 1")
      if (
        DateTime.now
          .isAfter(notice.dateTime.get)
      ) {
        logger.info("dt 2")
        Some(
          model.CheckResult(
            "提醒Order",
            s"code ${notice.symbol.symbolType} ${notice.symbol.code} ${notice.symbol.getCodeName} ${notice.dateTime
                .map(r => DateFormat.sdf.format(new Date(r.getMillis)))}",
            category = "日期",
            notice = notice
          )
        )
      } else {
        Option.empty[CheckResult]
      }
    } else {
      Option.empty[CheckResult]
    }
  }

  override def accept(notice: NoticeMe): Boolean = {
    true
  }
}
