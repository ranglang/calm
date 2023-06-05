package com.lqiong.jep

import org.ta4j.core.indicators.SMAIndicator
import org.ta4j.core.indicators.helpers.ClosePriceIndicator
import org.ta4j.core.{BaseBarSeries, BaseStrategy}
import org.ta4j.core.rules.{OverIndicatorRule, UnderIndicatorRule}

object BaseBarSeriesAnalysis {

  import org.ta4j.core.BarSeriesManager
  import org.ta4j.core.TradingRecord
  import org.ta4j.core.analysis.criteria.AverageReturnPerBarCriterion
  import org.ta4j.core.analysis.criteria.BuyAndHoldReturnCriterion
  import org.ta4j.core.analysis.criteria.LinearTransactionCostCriterion
  import org.ta4j.core.analysis.criteria.MaximumDrawdownCriterion
  import org.ta4j.core.analysis.criteria.NumberOfBarsCriterion
  import org.ta4j.core.analysis.criteria.NumberOfPositionsCriterion
  import org.ta4j.core.analysis.criteria.ReturnOverMaxDrawdownCriterion
  import org.ta4j.core.analysis.criteria.VersusBuyAndHoldCriterion
  import org.ta4j.core.analysis.criteria.WinningPositionsRatioCriterion
  import org.ta4j.core.analysis.criteria.pnl.GrossReturnCriterion

  def execute(series: BaseBarSeries) = {

    val closePrice: ClosePriceIndicator = new ClosePriceIndicator(series)
    val sma = new SMAIndicator(closePrice, 3)
    val strategy = new BaseStrategy(
      new UnderIndicatorRule(sma, closePrice),
      new OverIndicatorRule(sma, closePrice)
    )
//    val strategy = MovingMomentumStrategy.buildStrategy(series)
    // Running the strategy
    val seriesManager = new BarSeriesManager(series)
    val tradingRecord: TradingRecord = seriesManager.run(strategy)

    /*
     * Analysis criteria
     */

    // Total profit
    val totalReturn = new GrossReturnCriterion
    System.out.println(
      "Total return: " + totalReturn.calculate(series, tradingRecord)
    )
    // Number of bars
    System.out.println(
      "Number of bars: " + new NumberOfBarsCriterion()
        .calculate(series, tradingRecord)
    )
    // Average profit (per bar)
    System.out.println(
      "Average return (per bar): " + new AverageReturnPerBarCriterion()
        .calculate(series, tradingRecord)
    )
    // Number of positions
    System.out.println(
      "Number of positions: " + new NumberOfPositionsCriterion()
        .calculate(series, tradingRecord)
    )
    // Profitable position ratio
    System.out.println(
      "Winning positions ratio: " + new WinningPositionsRatioCriterion()
        .calculate(series, tradingRecord)
    )
    // Maximum drawdown
    System.out.println(
      "Maximum drawdown: " + new MaximumDrawdownCriterion()
        .calculate(series, tradingRecord)
    )
    // Reward-risk ratio
    System.out.println(
      "Return over maximum drawdown: " + new ReturnOverMaxDrawdownCriterion()
        .calculate(series, tradingRecord)
    )
    // Total transaction cost
    System.out.println(
      "Total transaction cost (from $1000): " + new LinearTransactionCostCriterion(
        1000,
        0.005
      ).calculate(series, tradingRecord)
    )
    // Buy-and-hold
    System.out.println(
      "Buy-and-hold return: " + new BuyAndHoldReturnCriterion()
        .calculate(series, tradingRecord)
    )
    // Total profit vs buy-and-hold
    System.out.println(
      "Custom strategy return vs buy-and-hold strategy return: " + new VersusBuyAndHoldCriterion(
        totalReturn
      ).calculate(series, tradingRecord)
    )
  }
}
