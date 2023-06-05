package com.lqiong.jep.selector.A

import akka.event.LoggingAdapter
import carldata.series.Sessions
import com.github.takezoe.retry.{RetryPolicy, retry}
import com.google.inject.Inject
import com.lqiong.jep.entry.{LStockItem, QueryTable}
import com.lqiong.model.StockSymbol
import org.ta4j.core.{BaseBarSeries, BaseBarSeriesBuilder}

import java.time.{ZoneId, ZonedDateTime}
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext}
import scala.util.Try
import scala.util.control.NonFatal

class TimeSeriesSelect @Inject() (
  implicit val queryTable: QueryTable,
  implicit val ex: ExecutionContext,
  implicit val retry1: RetryPolicy,
  val logger: LoggingAdapter
) {

  def selectTimeSeriesSymbol(stockSymbol: StockSymbol): List[LStockItem] = {
    logger.info("fetching selectTimeSeriesSymbol {}", stockSymbol.code)
    retry {
      import queryTable.db._
      val f = Try {
        val r12 = dynamicQuerySchema[LStockItem](stockSymbol.getTableName)
        val result = queryTable.db.run(r12)
        val list: List[LStockItem] = Await.result(result, 200.seconds)
        val r1 = list
          .sortWith((a, b) => a.date.before(b.date))


        r1

//        it should "access element at given index" in {
//          val series: TimeSeries[Double] = TimeSeries.fromTimestamps(Seq((1, 1), (2, 3.4), (3, 5.6)))
//          series.get(2) shudBe 5.6
//        }ol
//
//        it should "return 0 for element outside of the index" in {
//          val series: TimeSeries[Double] = TimeSeries.fromTimestamps(Seq((1, 1), (2, 3.4), (3, 5.6)))
//          series.get(20) shouldBe 0
//        }
//

        //        al series: TimeSeries[Int] = TimeSeries.fromTimestamps(Seq((1, 1), (2, 2), (5, 5), (3, 3), (4, 4), (6, 6)))
//        val expected: TimeSeries[Int] = TimeSeries.fromTimestamps(Seq((1, 1), (2, 2), (5, 5), (6, 6)))
//        series.sortByIndex shouldBe expected

//          .map(r => (
//            r.date.toInstant.getEpochSecond, r.close.toDouble)
//          )
//        val timeSeries = TimeSeries.fromTimestamps(r1)

//        timeSeries
      }
      f.get
    }
  }

  def getBaseBarSeries(stockSymbol: StockSymbol): Option[BaseBarSeries] = {
    retry {
      import queryTable.db._
      val f = Try {
        val r12 = dynamicQuerySchema[LStockItem](stockSymbol.getTableName)
        val result = queryTable.db.run(r12)
        val list: List[LStockItem] = Await.result(result, 200.seconds)

        val series: BaseBarSeries =
          new BaseBarSeriesBuilder().withName("AXP_Stock").build();
        val ZONEID_OF_SHANGHAI = "Asia/Shanghai"
        val r1: BaseBarSeries = list
          .sortWith((a, b) => a.date.before(b.date))
          .foldLeft(series)((p: BaseBarSeries, r1: LStockItem) => {
            p.addBar(
              ZonedDateTime
                .of(r1.date.toLocalDateTime, ZoneId.of(ZONEID_OF_SHANGHAI)),
              r1.open,
              r1.high,
              r1.low,
              r1.close,
              r1.volume
            )
            p
          })
        Some(
          r1
        )
      } recover { case NonFatal(x) =>
        logger.error(s" selectAll1 {} {}", stockSymbol, x)
        Option.empty[BaseBarSeries]
      }
      f.get
    }
  }

//  def selectAll(stockSymbol: StockSymbol): Option[BaseBarSeries] = {
//    retry {
//      import queryTable.db._
//      val f = Try {
//        val r12 = dynamicQuerySchema[WeatherStation](stockSymbol.getTableName)
//        val result = queryTable.db.run(r12)
//        val list: List[WeatherStation] = Await.result(result, 200.seconds)
//        val series: BaseBarSeries =
//          new BaseBarSeriesBuilder().withName("AXP_Stock").build();
//        val ZONEID_OF_SHANGHAI = "Asia/Shanghai"
//        val r1: BaseBarSeries = list
//          .sortWith((a, b) => a.date.before(b.date))
//          .foldLeft(series)((p: BaseBarSeries, r1: WeatherStation) => {
//            p.addBar(
//              ZonedDateTime
//                .of(r1.date.toLocalDateTime, ZoneId.of(ZONEID_OF_SHANGHAI)),
//              r1.open,
//              r1.high,
//              r1.low,
//              r1.close,
//              r1.volume
//            )
//            p
//          })
//        Some(
//          r1
//        )
//      } recover { case NonFatal(x) =>
//        logger.info(s"selectAll {}", x)
//        Option.empty[BaseBarSeries]
//      }
//      f.get
//    }
//  }
}
