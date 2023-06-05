package com.lqiong.jep.entry

import org.ta4j.core.{
  BarSeries,
  BarSeriesManager,
  BaseBarSeries,
  BaseStrategy,
  Rule,
  Strategy,
  TradingRecord
}
import org.ta4j.core.analysis.criteria.pnl.GrossReturnCriterion
import org.ta4j.core.indicators.RSIIndicator
import org.ta4j.core.indicators.SMAIndicator
import org.ta4j.core.indicators.helpers.ClosePriceIndicator
import org.ta4j.core.rules.CrossedDownIndicatorRule
import org.ta4j.core.rules.CrossedUpIndicatorRule
import org.ta4j.core.rules.OverIndicatorRule
import org.ta4j.core.rules.UnderIndicatorRule

/** 2-Period RSI Strategy
  *
  * @see
  *   <a href= "http://stockcharts.com/school/doku.php?id=chart_school:trading_strategies:rsi2">
  *   http://stockcharts.com/school/doku.php?id=chart_school:trading_strategies:rsi2</a>
  */
object RSI2Strategy {

  /** @param series
    *   a bar series
    * @return
    *   a 2-period RSI strategy
    */
  def buildStrategy(series: BarSeries): Strategy = {
    if (series == null)
      throw new IllegalArgumentException("Series cannot be null")
    val closePrice = new ClosePriceIndicator(series)
    val shortSma: SMAIndicator = new SMAIndicator(closePrice, 5)
    val longSma: SMAIndicator = new SMAIndicator(closePrice, 200)
    // We use a 2-period RSI indicator to identify buying
    // or selling opportunities within the bigger trend.
    val rsi = new RSIIndicator(closePrice, 2)
    // Entry rule
    // The long-term trend is up when a security is above its 200-period SMA.
    val entryRule = new OverIndicatorRule(shortSma, longSma)
      .and(new CrossedDownIndicatorRule(rsi, 5))
      .and(new OverIndicatorRule(shortSma, closePrice)) // Signal 2
    // Exit rule
    // The long-term trend is down when a security is below its 200-period SMA.
    val exitRule = new UnderIndicatorRule(shortSma, longSma)
      .and(new CrossedUpIndicatorRule(rsi, 95))
      .and(new UnderIndicatorRule(shortSma, closePrice))
    // TODO: Finalize the strategy
    new BaseStrategy(entryRule, exitRule)
  }

  def execute(series: BarSeries): Unit = { // Getting the bar series
    // Building the trading strategy
    val strategy = buildStrategy(series)
    // Running the strategy
    val seriesManager = new BarSeriesManager(series)
    val tradingRecord = seriesManager.run(strategy)
    System.out.println(
      "Number of positions for the strategy: " + tradingRecord.getPositionCount
    )
    // Analysis
    System.out.println(
      "Total return for the strategy: " + new GrossReturnCriterion()
        .calculate(series, tradingRecord)
    )
  }
}
