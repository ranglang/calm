package org.ta4j.core.indicators

import akka.event.LoggingAdapter
import org.ta4j.core.Indicator
import org.ta4j.core.num.Num

import scala.util.Try

/** Simple moving average (SMA) indicator.
  */

class FastDown1Indicator(
  val indicator: Indicator[Num],
  val barCount: Int,
  loggerAdapter: LoggingAdapter
) extends CachedIndicator[Num](indicator) {
  override protected def calculate(index: Int): Num = {

    var sum = numOf(0)
    loggerAdapter.info("get index {}", index)
    log.info("log {}", index)
    for (i <- Math.max(0, index - barCount + 1) to index) {
      sum = sum.plus(indicator.getValue(i))
    }
    val realBarCount = Math.min(barCount, index + 1)
    sum.dividedBy(numOf(realBarCount))

    Try {
      val base = indicator.getValue(Math.min(index, index - barCount))
      indicator.getValue(index).minus(base).dividedBy(base)
    }.getOrElse(
      numOf(1)
    )
  }

  override def toString: String = getClass.getSimpleName + " barCount: " + barCount
}
