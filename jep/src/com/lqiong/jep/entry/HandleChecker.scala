package com.lqiong.jep.entry

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.email.EmailServiceTrait
import com.lqiong.jep.checker.model
import com.lqiong.jep.checker.model.CheckResult
import com.lqiong.jep.claim.model.PanmingFactor
import com.lqiong.jep.entry.QuantMetric.chaodieZhishu
import com.lqiong.jep.entry.SymbolEnum.{index, stock}
import com.lqiong.model.order.NoticeMe
import com.lqiong.model.{QueryTableInter, StockSymbol, StockTrait}
import org.joda.time.DateTime

/** deprecated
  * @param emailService
  * @param logger
  * @param stockImpl
  * @param retryPolicy
  * @param queryTableInter
  * @param panMingFactor
  */
class HandleChecker @Inject() (
  val emailService: EmailServiceTrait,
  val logger: LoggingAdapter,
  implicit val stockImpl: StockTrait,
  implicit val retryPolicy: RetryPolicy,
  implicit val queryTableInter: QueryTableInter,
  val panMingFactor: PanmingFactor
) {

  def checkIndexChaoDieZhiShu(notice: NoticeMe): Option[CheckResult] = {
    if (
      notice.metricOpt.isDefined && notice.metricOpt.get == chaodieZhishu && notice.referenceValue.nonEmpty && notice.symbolType == index
    ) {
      logger.info("getChaodieList {}", notice)
      val chaoDieValue = notice.indexSymbol.get.getChaodieDayList().map(_.chaodie).takeRight(2)
      if (notice.isAsc.getOrElse(false)) {
        if (
          chaoDieValue.last > notice.referenceValue.get
//            && chaoDieValue.head < notice.referenceValue.get
        ) {
          Some(
            model.CheckResult(
              s"提醒${notice.metricOpt}",
              s"${notice.symbol.code} ${notice.symbol.getCodeName} ${notice.metricOpt}超过${notice.referenceValue}",
              category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
              notice = notice
//                  updateAt = QuantMetricFormatter.getTime(ddd.map(r => new DateTime(r.date)))
            )
          )
//          emailService.sendEmail(
//          )
        } else {
          Option.empty[CheckResult]
        }
      } else {
        if (
          chaoDieValue.last < notice.referenceValue.get && chaoDieValue.head > notice.referenceValue.get
        ) {

          Some(
            model.CheckResult(
              s"提醒${notice.metricOpt}",
              s"${notice.symbol.code} ${notice.symbol.getCodeName} ${notice.metricOpt}小于${notice.referenceValue}",
              category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
              notice = notice
            )
          )
        } else {
          Option.empty[CheckResult]
        }
      }
    } else Option.empty[CheckResult]
  }

  def checkStockChaoDieZhiShu(notice: NoticeMe): Option[CheckResult] = {
    logger.info("checkStockChaoDieZhiShu time {}", notice.symbol)
    logger.info("checkStockChaoDieZhiShu time {}", notice.indexSymbol)
    notice.symbol match {
      case symbol: StockSymbol => {
        if (
          notice.metricOpt.isDefined && notice.metricOpt.get == chaodieZhishu && notice.referenceValue.nonEmpty && notice.symbolType == stock
        ) {
          val ddd = symbol.getChaodieDayList().takeRight(1).lastOption
          val chaoDieValue: Double =
            symbol.getChaodieDayList().map(_.chaodie).takeRight(1).lastOption.getOrElse(0)
          if (notice.isAsc.getOrElse(false)) {
            if (chaoDieValue > notice.referenceValue.get) {
              Some(
                model.CheckResult(
                  s"提醒${notice.metricOpt}",
                  s"${notice.symbol.code} 目标${notice.referenceValue.get} ${notice.symbol.getCodeName} ${notice.metricOpt} 当前${chaoDieValue}超过${notice.referenceValue}",
                  category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
                  updateAt = Some(QuantMetricFormatter.getTime(ddd.map(r => new DateTime(r.date)))),
                  notice = notice,
                  current = Some(chaoDieValue)
                )
              )
            } else {
              logger.info("xxxxxxxxx1")
              Option.empty[CheckResult]
            }
          } else {
            if (chaoDieValue < notice.referenceValue.get) {
              Some(
                model.CheckResult(
                  s"提醒${notice.metricOpt}",
                  s"${notice.symbol.code} 目标${notice.referenceValue.get} ${notice.symbol.getCodeName}  ${notice.metricOpt} 当前${chaoDieValue}小于${notice.referenceValue}",
                  category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
                  updateAt = Some(QuantMetricFormatter.getTime(ddd.map(r => new DateTime(r.date)))),
                  notice = notice,
                  current = Some(chaoDieValue)
                )
              )
            } else {
              Option.empty[CheckResult]
            }
          }
        } else {
          Option.empty[CheckResult]
        }
      }
      case _ => {
        Option.empty[CheckResult]
      }
    }

  }
}
