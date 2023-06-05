package com.lqiong.jep.claim.model

//class MeadiumDataList {

import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.stream.scaladsl.{Sink, Source}
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.StockItem
import com.lqiong.jep.entry.{QueryTable, QuillEncoder}
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao, PanMingChaoDieItem2}
import com.lqiong.model.{IndexSymbol, ItemPrice, LSymbol}
import org.apache.spark.sql.types.{DateType, DoubleType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.Try
import scala.util.control.NonFatal

class MeadiumDataList @Inject() (
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val executionContext: ExecutionContext,
  implicit val system: ActorSystem,
  val continuesDataList: ContinuesDataList,
  implicit val retryPolicy: RetryPolicy
) extends AbsctractFactor[PanMingChaoDieItem2]
    with QuillEncoder {

  override val name: String = "meadium"

  def get_table_name(code: String, value: Double): String = {
    s"${name}_${code}_${(value * 10).toInt}"
  }

  val count = 200
  def fetchDataByCout(symbol: LSymbol, value: Double): Unit = {
    symbol match {
      case a: IndexSymbol => {
        val codes =
          dataSource.getIndexCodes(a.code).collectAsList().toList
        //        val stockList = codes.map(r => StockSymbol(r.code))
        //        val l1 = stockList.map(item  => {
        //        })
        case class Histogram(
          list: List[List[Double]] = List.empty[List[Double]]
        ) {
          def add(i: List[ItemPrice]): Histogram = {

            //            list2: 1, 2,3,4,5
            //            list3 : 1, 2,3,4,5

            //            list.zipAll()

            val data = i.zipWithIndex.map(r => {
              //              val toList = r._1
              Try(list(r._2)).getOrElse(List.empty[Double]) ::: List(
                Try(i(r._2).price).getOrElse(0.0)
              )
            })
            copy(data)
          }
          //            if (i < 100) copy(low = low + 1) else copy(high = high + 1)
        }

        //        open: Double,
        //        close: Double,
        //        high: Double,
        //        low: Double,
        //        volume: Double,
        //        turnover: Double,
        //        outstanding_share: Double
        //        .sortWith((a, b) => a.date.isBefore(b.date))

        def getPercentile(times: List[Double], per: Double): Double = {
          val timesSorted = times.sortWith(_ < _)
          val percent = (timesSorted.length * per).asInstanceOf[Int]
          timesSorted(percent)
        }

        val sl = Source(codes)
          .map(item => {
            val stockItem = new StockItem(item.code, retryPolicy)
            val l = stockItem
              .getChangeList()
              .takeRight(count)
            val l1 =
              l.map(r => ItemPrice(new org.joda.time.DateTime(r._1), r._2))
            l1
          })
          .fold(Histogram())((acc, element) => acc.add(element))

        val dd: Future[List[Double]] = sl
          .map(r => {
            r.list.map(r => getPercentile(r, value))
          })
          .runWith(Sink.last)
        //          .map(item => logger.info("xx" + item.toString))
        //          .runWith(Sink.ignore)
        val l1 = Await.result(dd, 4.hours)

        //        dataSource
        val schema = StructType(
          List(
            StructField("date", DateType, true),
            StructField("value", DoubleType, true)
          )
        )

        val aList = Await
          .result(dataSource.getCurrentTradeDays(), 100.seconds)
          .takeRight(count)
        val rdd = spark.sparkContext.parallelize(
          l1.zipWithIndex.map(r => Row(new java.sql.Date(aList(r._2).toDate.getTime), r._1))
        )
        val df = spark.createDataFrame(rdd, schema)
        dataFrameDao.saveDynamicTable(df, get_table_name(symbol.code, value));
      }
      case _ => {}
    }
  }

  override def fetchData(symbol: LSymbol): Unit = {
    fetchDataByCout(symbol, 0.8)
  }
  //      import queryTable.db._
  //      val r1 = dynamicQuerySchema[LStockItemDate](symbol.getTableName)
  //      val result = queryTable.db
  //        .run(r1)
  //      val l: List[LStockItemDate] = Await.result(result, 200.seconds)
  //      val convertted = convertContinue(l)
  //      logger.info("l {}", convertted)
  //
  //      //    /* List */
  //      //    val data = List(Row("Category A", 100, "This is category A"),
  //      //      Row("Category B", 120, "This is category B"),
  //      //      Row("Category C", 150, "This is category C"))
  //
  //

  def getList1(
    symbol: LSymbol,
    value: Double
  ): Future[List[PanMingChaoDieItem2]] = {
    symbol match {
      case index: IndexSymbol =>
        import queryTable.db._

        val s = get_table_name(index.code, value)
        val r1 = {
          dynamicQuerySchema[PanMingChaoDieItem2](s)
        }
        val result = queryTable.db.run(r1)
        result.recover {
          case NonFatal(x) => {
            List.empty[PanMingChaoDieItem2]
          }
        }
      //        result
      case _ =>
        Future.successful(List.empty[PanMingChaoDieItem2])
    }
  }

  override def getList(symbol: LSymbol): Future[List[PanMingChaoDieItem2]] =
    Future.successful(List.empty[PanMingChaoDieItem2])
}
