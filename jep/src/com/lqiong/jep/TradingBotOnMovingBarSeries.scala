package com.lqiong.jep

import java.time.Duration
import java.time.ZonedDateTime
import org.ta4j.core.{
  Bar,
  BarSeries,
  BaseBar,
  BaseBarSeries,
  BaseStrategy,
  BaseTradingRecord,
  Strategy,
  Trade,
  TradingRecord
}
import org.ta4j.core.indicators.SMAIndicator
import org.ta4j.core.indicators.helpers.ClosePriceIndicator
import org.ta4j.core.num.DecimalNum
import org.ta4j.core.num.Num
import org.ta4j.core.rules.OverIndicatorRule
import org.ta4j.core.rules.UnderIndicatorRule

/** This class is an example of a dummy trading bot using ta4j. <p/>
  */
object TradingBotOnMovingBarSeries {

  /** Close price of the last bar
    */
  private var LAST_BAR_CLOSE_PRICE: Num = DecimalNum.valueOf("0.03")

  /** @param series
    *   a bar series
    * @return
    *   a dummy strategy
    */
  private def buildStrategy(series: BarSeries) = {
    if (series == null)
      throw new IllegalArgumentException("Series cannot be null")
    val closePrice = new ClosePriceIndicator(series)
    val sma = new SMAIndicator(closePrice, 12)
    // Signals
    // Buy when SMA goes over close price
    // Sell when close price goes over SMA
    val buySellSignals = new BaseStrategy(
      new OverIndicatorRule(sma, closePrice),
      new UnderIndicatorRule(sma, closePrice)
    )
    buySellSignals
  }

  private def randDecimal(min: Num, max: Num) = {
    var randomDecimal: Num = null
    if (min != null && max != null && min.isLessThan(max)) {
      val range = max.minus(min)
      val position: Num = range.multipliedBy(DecimalNum.valueOf(Math.random))
      randomDecimal = min.plus(position)
    }
    randomDecimal
  }

  /** Generates a random bar.
    *
    * @return
    *   a random bar
    */
  private def generateRandomBar = {
    val maxRange = DecimalNum.valueOf("0.03") // 3.0%
    val openPrice = LAST_BAR_CLOSE_PRICE
    val lowPrice =
      openPrice.minus(maxRange.multipliedBy(DecimalNum.valueOf(Math.random)))
    val highPrice =
      openPrice.plus(maxRange.multipliedBy(DecimalNum.valueOf(Math.random)))
    val closePrice = randDecimal(lowPrice, highPrice)
    LAST_BAR_CLOSE_PRICE = closePrice
    new BaseBar(
      Duration.ofDays(1),
      ZonedDateTime.now,
      openPrice,
      highPrice,
      lowPrice,
      closePrice,
      DecimalNum.valueOf(1),
      DecimalNum.valueOf(1)
    )
  }

  def execute(series: BaseBarSeries): Unit = {
    System.out.println(
      "********************** Initialization **********************"
    )
    // Getting the bar series
    // Building the trading strategy
    val strategy = buildStrategy(series)
    // Initializing the trading history
    val tradingRecord = new BaseTradingRecord
    System.out.println(
      "************************************************************"
    )
    /*
     * We run the strategy for the 50 next bars.
     */
    for (i <- 0 until 50) { // New bar
      Thread.sleep(30) // I know...

      val newBar = generateRandomBar
      System.out.println(
        "------------------------------------------------------\n" + "Bar " + i + " added, close price = " + newBar.getClosePrice.doubleValue
      )
      series.addBar(newBar)
      val endIndex = series.getEndIndex
      if (strategy.shouldEnter(endIndex)) { // Our strategy should enter
        System.out.println("Strategy should ENTER on " + endIndex)
        val entered = tradingRecord.enter(
          endIndex,
          newBar.getClosePrice,
          DecimalNum.valueOf(10)
        )
        if (entered) {
          val entry = tradingRecord.getLastEntry
          System.out.println(
            "Entered on " + entry.getIndex + " (price=" + entry.getNetPrice.doubleValue + ", amount=" + entry.getAmount.doubleValue + ")"
          )
        }
      } else if (strategy.shouldExit(endIndex)) { // Our strategy should exit
        System.out.println("Strategy should EXIT on " + endIndex)
        val exited = tradingRecord.exit(
          endIndex,
          newBar.getClosePrice,
          DecimalNum.valueOf(10)
        )
        if (exited) {
          val exit = tradingRecord.getLastExit
          System.out.println(
            "Exited on " + exit.getIndex + " (price=" + exit.getNetPrice.doubleValue + ", amount=" + exit.getAmount.doubleValue + ")"
          )
        }
      }
    }
  }
}
