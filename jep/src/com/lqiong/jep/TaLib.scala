package com.lqiong.jep

import akka.event.LoggingAdapter
import com.tictactec.ta.lib.{Core, MInteger, RetCode}
import org.ta4j.core.{Bar, BaseBarSeries}

import java.util
import scala.jdk.CollectionConverters.CollectionHasAsScala

object TaLib {

  def black(logger: LoggingAdapter, a: BaseBarSeries) = {
    val c1 = new Core
    val TOTAL_PERIODS = a.getBarCount
    logger.info("totla {}", TOTAL_PERIODS)
    import com.tictactec.ta.lib.MInteger
    val l = a.getBarData.asScala
    val lowtPrice: Array[Double] =
      l.map(r => r.getLowPrice.doubleValue()).toArray
    val closePrice: Array[Double] =
      l.map(r => r.getClosePrice.doubleValue()).toArray
    val hightPrice: Array[Double] =
      l.map(r => r.getHighPrice.doubleValue()).toArray
    val openPrice: Array[Double] =
      l.map(r => r.getOpenPrice.doubleValue()).toArray

    val out1 = new Array[Int](TOTAL_PERIODS)

    val begin1 = new MInteger
    val length1 = new MInteger
    val retCode1 = c1.cdl3BlackCrows(
      0,
      TOTAL_PERIODS - 1,
      openPrice,
      hightPrice,
      lowtPrice,
      closePrice,
      begin1,
      length1,
      out1
    )

    logger.info("out1 {}", out1.mkString(","))
    val f = out1.toList.zipWithIndex
      .filter((r => r._1 == -100))
      .map(r => a.getBar(r._2).getDateName)
    if (retCode1 eq RetCode.Success) {
      f.toList.mkString(",")
    } else {
      ""
    }
  }

  def crow(logger: LoggingAdapter, a: BaseBarSeries) = {
    val c1 = new Core
    val TOTAL_PERIODS = a.getBarCount
    logger.info("totla {}", TOTAL_PERIODS)
    import com.tictactec.ta.lib.MInteger
    val l = a.getBarData.asScala
    val lowtPrice: Array[Double] =
      l.map(r => r.getLowPrice.doubleValue()).toArray
    val closePrice: Array[Double] =
      l.map(r => r.getClosePrice.doubleValue()).toArray
    val hightPrice: Array[Double] =
      l.map(r => r.getHighPrice.doubleValue()).toArray
    val openPrice: Array[Double] =
      l.map(r => r.getOpenPrice.doubleValue()).toArray

    val out1 = new Array[Int](TOTAL_PERIODS)

    val begin1 = new MInteger
    val length1 = new MInteger
    val retCode1 = c1.cdl3BlackCrows(
      0,
      TOTAL_PERIODS - 1,
      openPrice,
      hightPrice,
      lowtPrice,
      closePrice,
      begin1,
      length1,
      out1
    )

    val f = out1.toList.zipWithIndex
      .filter((r => r._1 == -100))
      .map(r => a.getBar(r._2).getDateName)
    if (retCode1 eq RetCode.Success) {
      f.toList.mkString(",")
    } else {
      ""
    }
  }

  def run(logger: LoggingAdapter) = {
    val TOTAL_PERIODS = 100

    /** The number of periods to average together.
      */
    val PERIODS_AVERAGE = 30

    import com.tictactec.ta.lib.MInteger
    val hightPrice = new Array[Double](TOTAL_PERIODS)
    val lowtPrice = new Array[Double](TOTAL_PERIODS)
    val closePrice = new Array[Double](TOTAL_PERIODS)
    val openPrice = new Array[Double](TOTAL_PERIODS)

    val out = new Array[Double](TOTAL_PERIODS)
    val begin = new MInteger
    val length = new MInteger

    val c = new Core
    val retCode = c.sma(
      0,
      closePrice.length - 1,
      closePrice,
      PERIODS_AVERAGE,
      begin,
      length,
      out
    )

    import com.tictactec.ta.lib.RetCode
    if (retCode eq RetCode.Success) {
      logger.info("close{}", out.toList.mkString(","))
      logger.info("Output Start Period: " + begin.value)
      logger.info("Output End Period: " + (begin.value + length.value - 1))
    }

    //    inClose: Array[Double]
//    ,
//    outBegIdx: MInteger
//    ,
//    outNBElement: MInteger
//    ,
//    outInteger: Array[Int]
//    )

//    endIdx: Int
//    ,
//    inOpen: Array[Double]
//    ,
//    inHigh: Array[Double]
//    ,
//    inLow: Array[Double]
//    ,
//    inClose: Array[Double]
//    ,
//    outBegIdx: MInteger
//    ,
//    outNBElement: MInteger
//    ,
//    c.cdl3BlackCrows()

  }
}
