package com.lqiong.jep.option

import org.scalatest.flatspec.AsyncFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.ta4j.core.{BaseBarSeries, BaseBarSeriesBuilder}
import org.ta4j.core.indicators.AroonOscillatorIndicator
import org.ta4j.core.num.Num

import java.time.ZonedDateTime
import scala.language.postfixOps

class ClosePriceIndicatorSpec() extends AsyncFlatSpec  with Matchers   {
  it should "should concat" in {
    val series: BaseBarSeries = new BaseBarSeriesBuilder().withName("AXP_Stock").build();
    series.addBar(ZonedDateTime.now(), 105.42, 112.99, 104.01, 111.42, 1337)

    series.addBar(ZonedDateTime.now(), 107.42, 117.99, 108.01, 119.42, 1337)

    series.addBar(ZonedDateTime.now(), 115.42, 122.99, 104.01, 120.42, 1337)

    import org.ta4j.core.indicators.helpers.ClosePriceIndicator
    val closePrice = new ClosePriceIndicator(series)
    val last: Num = closePrice.getValue(series.getEndIndex)
    series.getEndIndex shouldEqual 2
     last.doubleValue shouldBe 120.42

//    val aroonOscillatorIndicator = new AroonOscillatorIndicator(series, 2)
//     aroonOscillatorIndicator.getValue(series.getEndIndex).doubleValue shouldBe 0.0
  }
}


// https://oss.sonatype.org/service/local/repositories/releases/archive/org/ta4j/ta4j-core/0.11/ta4j-core-0.11-javadoc.jar/!/index.html

