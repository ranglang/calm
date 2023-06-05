package com.lqiong.jep.entry

import akka.event.LoggingAdapter
import com.google.inject.Inject
import com.lqiong.jep.selector.A.TimeSeriesSelect
import com.lqiong.model.{IndexSymbol, LSymbol, StockSymbol, StockTrait}
import org.joda.time.DateTime

import scala.util.Try

class EnterReason @Inject() (
  val timeSeries: TimeSeriesSelect,
  implicit val stockTrait: StockTrait,
  val logger: LoggingAdapter
) {

  def downIn3Days(): (String, LSymbol => Boolean) = {
//      Try {
//        logger.info("downIn3Days {}", stock)
//        val f = timeSeries.selectAll1(stock)
//        logger.error("downIn3Days selectAll1 {}", stock, f)
//        val f1 = f.get
//        if (f1.getBarCount > 4) {
//          val last = f1.getBar(f1.getEndIndex).getClosePrice.doubleValue
//          val pre3 = f1.getBar(f1.getEndIndex - 3).getClosePrice.doubleValue
//          (last - pre3) / pre3 < -0.07
//        } else {
//          false
//        }
//      }.getOrElse {
//        logger.error("downIn3Days  ERROR {}", stock)
//        false
//      }
    (s"价格低于", (a: LSymbol) => true)
  }

  private def downPriceLSymbol(reference: Double): LSymbol => Boolean = { (stock: LSymbol) =>
    {
      val tuple2 = stock.getCurrentPrice
      logger.info("downPrice reference {} to {} by result {}", reference, stock, tuple2)
      tuple2 < reference
    }
  }

  def downPriceBy(reference: Double) = {
    val f = (stock: LSymbol) => {
      downPriceLSymbol(reference)(stock)
    }
    (s"价格低于${reference}", f)
  }

  private def abovePrice(reference: Double): LSymbol => Boolean = { (stock: LSymbol) =>
    {
      val tuple2 = stock.getCurrentPrice
      logger.info("abovePrice reference {} to {} by result {}", reference, stock, tuple2)
      tuple2 > reference
    }
  }

  def abovePriceBy(reference: Double): (String, LSymbol => Boolean) = {
    val f = (stock: LSymbol) => {
      abovePrice(reference)(stock)
    }
    (s"价格超过${reference}", f)
  }

  def aboveChaoDieBy(reference: Double) = {
    val f = (stock: LSymbol) => {
      val tuple2: Double =
        Try(stock.getChaodieDayList().map(r => r.chaodie).takeRight(3).last).getOrElse(0)
      logger.info("aboveChaoDieBy reference {} to {} by result {}", reference, stock, tuple2)
//      tuple2.head < reference &&
      tuple2 > reference
    }
    (s"超过超跌指数${reference}", f)
  }

  def timeAfter(date: DateTime) = {
    val f = (stock: LSymbol) => {
      DateTime.now.isAfter(date)
    }
    (s"超过时间${DateFormat.getSafeDay(date.toMutableDateTime())}", f)
  }

  def downChaodieBy(reference: Double) = {
    val f = (stock: LSymbol) => {
      val tuple2: Double =
        Try(stock.getChaodieDayList().map(_.chaodie).takeRight(3).last).getOrElse(0)
      logger.info("aboveChaoDieBy reference {} to {} by result {}", reference, stock, tuple2)
      tuple2 < reference
    }
    (s"小于超跌指数${reference}", f)
  }

  def abovePanmingBy(reference: Double) = {
    val f = (stock: LSymbol) => {
      stock match {
        case a: IndexSymbol =>
          val tuple2: Double = a.getPanming()
          logger.info("aboveChaoDieBy reference {} to {} by result {}", reference, stock, tuple2)
          //      tuple2.head < reference &&
          tuple2 < reference
        case _ =>
          true
      }
    }
    (s"小于超跌指数${reference}", f)
  }

  def downPanmingBy(reference: Double) = {
    val f = (stock: LSymbol) => {
      stock match {
        case a: IndexSymbol =>
          val tuple2: Double = a.getPanming()
          logger.info("aboveChaoDieBy reference {} to {} by result {}", reference, stock, tuple2)
          //      tuple2.head < reference &&
          tuple2 < reference
        case _ =>
          true
      }
    }
    (s"小于超跌指数${reference}", f)
  }
}
