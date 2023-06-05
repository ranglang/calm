package com.lqiong.jep.notice.checker

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.checker.model
import com.lqiong.jep.checker.model.CheckResult
import com.lqiong.jep.claim.model.PanmingFactor
import com.lqiong.jep.entry.QuantMetric.chaodiePanMing
import com.lqiong.jep.entry.QuantMetricFormatter
import com.lqiong.jep.notice.inter.ResultChecker
import com.lqiong.model.StockTrait
import com.lqiong.model.order.NoticeMe

import scala.concurrent.Await
import scala.concurrent.duration.DurationInt

class PanmingChecker @Inject() (
  val logger: LoggingAdapter,
  implicit val retryPolicy: RetryPolicy,
  implicit val stockImpl: StockTrait,
  val panMingFactor: PanmingFactor
) extends ResultChecker {
  override def run(notice: NoticeMe): Option[CheckResult] = {

    if (!accept(notice)) {
      return Option.empty[CheckResult]
    }

    logger.info("panming {}", notice.symbol)
    logger.info("panming {}", notice.indexSymbol)
    notice.indexSymbol match {
      case Some(symbol) =>
        logger.info("symbol index");
        if (notice.metricOpt.isDefined) {
          logger.info("symbol index metricOpt");
          if (notice.metricOpt.get == chaodiePanMing) {
            logger.info("symbol index metricOpt ppppm");
            val a: Double =
              Await
                .result(
                  panMingFactor.getRealTimeLatest(
                    symbol
                  ),
                  6000.seconds
                )
                .map(r => r.value)
                .getOrElse(0d)
//            val f = Try(Await.result(mertrieResult, 620.seconds)).getOrElse(List.empty)
//            val a: Double =
//              Try(f.takeRight(1).head.value).getOrElse(0)
            if (notice.isAsc.getOrElse(false)) {
              if (a > notice.referenceValue.get) {
                Some(
                  model.CheckResult(
                    "提醒指数",
                    s"${notice.indexSymbol.get.code}判明指标超过${notice.referenceValue}: 当前${a}",
                    notice = notice,
                    category = QuantMetricFormatter.getLabel(notice.metricOpt.get)
//                    "提醒价格",
//                    s"${notice.symbol.code} ${notice.symbol.getCodeName}价格${currentPrice}超过${notice.referenceValue}",
//                    category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
//                    notice = notice,
//                    current = Some(currentPrice)
                  )
                )
              } else {
                Option.empty[CheckResult]
              }
            } else {
              val a: Double =
                Await
                  .result(
                    panMingFactor.getRealTimeLatest(
                      symbol
                    ),
                    6000.seconds
                  )
                  .map(r => r.value)
                  .getOrElse(0d)
              if (a < notice.referenceValue.get) {
                Some(
                  model.CheckResult(
                    "提醒指数",
                    s"${notice.indexSymbol.get.code}判明指标下跌至${notice.referenceValue}: 当前 ${a}",
                    category = QuantMetricFormatter.getLabel(notice.metricOpt.get),
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
        } else {
          Option.empty[CheckResult]
        }
      case _ =>
        Option.empty[CheckResult]
    }
  }

  override def accept(notice: NoticeMe): Boolean = {
    notice.indexSymbol match {
      case Some(_) =>
        notice.metricOpt match {
          case Some(_) =>
            true
          case _ =>
            false
        }
      case _ =>
        false
    }
  }
}
