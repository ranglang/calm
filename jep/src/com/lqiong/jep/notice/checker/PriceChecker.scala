package com.lqiong.jep.notice.checker

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.checker.model
import com.lqiong.jep.checker.model.CheckResult
import com.lqiong.jep.claim.model.PanmingFactor
import com.lqiong.jep.entry.QuantMetric.symbolPrice
import com.lqiong.jep.entry.SymbolEnum.stock
import com.lqiong.jep.entry.{QuantMetricFormatter, QueryTable}
import com.lqiong.jep.notice.inter.ResultChecker
import com.lqiong.model.order.NoticeMe
import com.lqiong.model.{IndexSymbol, StockSymbol, StockTrait}

class PriceChecker @Inject() (
  val logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val retryPolicy: RetryPolicy,
  implicit val stockImpl: StockTrait,
  val panMingFactor: PanmingFactor
) extends ResultChecker {

  private def checkPrice(notice: NoticeMe): Option[CheckResult] = {
    logger.info("checkPrice time {}", notice.symbol)
    logger.info("checkPrice time {}", notice.indexSymbol)
    notice.symbol match {
      case symbol: IndexSymbol => {
        if (
          notice.metricOpt.isDefined && notice.metricOpt.get == symbolPrice && notice.referenceValue.nonEmpty && notice.symbolType == stock
          && notice.isValid
        ) {
          val currentPrice = symbol.getCurrentPrice()
          logger.info("current price {}", currentPrice)
          if (notice.isAsc.getOrElse(false)) {
            if (currentPrice > notice.referenceValue.get) {
              Some(
                model.CheckResult(
                  "提醒价格",
                  s"${notice.symbol.code} ${notice.symbol.getCodeName}价格${currentPrice}超过${notice.referenceValue}",
                  category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
                  notice = notice,
                  current = Some(currentPrice)
                )
              )
            } else {
              Option.empty[CheckResult]
            }
          } else {
            if (currentPrice < notice.referenceValue.get) {
              Some(
                model.CheckResult(
                  "提醒价格",
                  s"${notice.symbol.code} ${notice.symbol.getCodeName}价格${currentPrice}小于${notice.referenceValue}",
                  category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
                  current = Some(currentPrice),
                  notice = notice
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

      case symbol: StockSymbol =>
        if (
          notice.metricOpt.isDefined && notice.metricOpt.get == symbolPrice && notice.referenceValue.nonEmpty && notice.symbolType == stock
          && notice.isValid
        ) {
          val currentPrice = symbol.getPrice
          logger.info("current price {}", currentPrice)
          if (notice.isAsc.getOrElse(false)) {
            if (symbol.getPrice.price > notice.referenceValue.get) {
              Some(
                model.CheckResult(
                  "提醒价格",
                  s"${notice.symbol.code} ${notice.symbol.getCodeName}价格${currentPrice}超过${notice.referenceValue}",
                  category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
                  current = Some(currentPrice.price),
                  notice = notice
                )
              )
            } else {
              Option.empty[CheckResult]
            }
          } else {
            logger.info("current price {}", currentPrice)
            if (symbol.getPrice.price < notice.referenceValue.get) {
              Some(
                model.CheckResult(
                  "提醒价格",
                  s"${notice.symbol.code} ${notice.symbol.getCodeName}价格${currentPrice}小于${notice.referenceValue}",
                  category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
                  notice = notice,
                  current = Some(currentPrice.price)
                )
              )
            } else {
              Option.empty[CheckResult]
            }
          }
        } else {
          Option.empty[CheckResult]
        }
      case _ =>
        Option.empty[CheckResult]
    }

  }

  override def run(notice: NoticeMe): Option[CheckResult] = {
    checkPrice(notice)
  }

  override def accept(notice: NoticeMe): Boolean = true
}
