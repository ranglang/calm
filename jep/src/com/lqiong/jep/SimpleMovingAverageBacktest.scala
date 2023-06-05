package com.lqiong.jep

import akka.event.Logging
import ch.qos.logback.classic.Logger
import com.typesafe.scalalogging.Logger
import org.ta4j.core._
import org.ta4j.core.analysis.criteria.pnl.GrossReturnCriterion
import org.ta4j.core.indicators.SMAIndicator
import org.ta4j.core.indicators.helpers.ClosePriceIndicator
import org.ta4j.core.num.{DecimalNum, Num}
import org.ta4j.core.rules.{OverIndicatorRule, UnderIndicatorRule}

object SimpleMovingAverageBacktest {

  def execute(series: BaseBarSeries): Unit = {
    val strategy3DaySma = create3DaySmaStrategy(series)
    val seriesManager = new BarSeriesManager(series)
    val tradingRecord3DaySma = seriesManager.run(
      strategy3DaySma,
      Trade.TradeType.BUY,
      DecimalNum.valueOf(50)
    )
    val strategy2DaySma = create2DaySmaStrategy(series)
    val tradingRecord2DaySma = seriesManager.run(
      strategy2DaySma,
      Trade.TradeType.BUY,
      DecimalNum.valueOf(50)
    )
    System.out.println("tradingRecord2DaySma")
    System.out.println("tradingRecord2DaySma")
    System.out.println("tradingRecord2DaySma")
    System.out.println("tradingRecord2DaySma")
    System.out.println("tradingRecord2DaySma")
    val criterion = new GrossReturnCriterion
    val calculate3DaySma: Num =
      criterion.calculate(series, tradingRecord3DaySma)
    val calculate2DaySma: Num =
      criterion.calculate(series, tradingRecord2DaySma)
    System.out.println("calculate3DaySma ")
    System.out.println(calculate3DaySma)
    System.out.println(calculate2DaySma)
  }

  private def create3DaySmaStrategy(series: BarSeries) = {
    val closePrice = new ClosePriceIndicator(series)
    val sma = new SMAIndicator(closePrice, 3)
    new BaseStrategy(
      new UnderIndicatorRule(sma, closePrice),
      new OverIndicatorRule(sma, closePrice)
    )
  }

  private def create2DaySmaStrategy(series: BarSeries) = {
    val closePrice = new ClosePriceIndicator(series)
    val sma = new SMAIndicator(closePrice, 2)
    new BaseStrategy(
      new UnderIndicatorRule(sma, closePrice),
      new OverIndicatorRule(sma, closePrice)
    )
  }

}
