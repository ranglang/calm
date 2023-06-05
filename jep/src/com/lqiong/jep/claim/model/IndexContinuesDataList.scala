package com.lqiong.jep.claim.model

import akka.NotUsed
import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.stream.scaladsl.{Sink, Source}
import com.github.takezoe.retry.{retry, ExponentialBackOff, RetryPolicy}
import com.google.inject.Inject
import com.lqiong.jep.entry.{LStockItemContinue, QueryTable, QuillEncoder}
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao}
import com.lqiong.model.{IndexSymbol, LSymbol, StockSymbol}
import org.apache.spark.sql.types.{DateType, IntegerType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

import java.util.Date
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.control.NonFatal

class IndexContinuesDataList @Inject() (
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val executionContext: ExecutionContext,
  implicit val system: ActorSystem,
  val continuesDataList: ContinuesDataList
) extends AbsctractFactor[LStockItemContinue]
    with QuillEncoder {

  override val name: String = "index_continues_5_"

  def get_table_name(code: String, count: Int): String = {
    s"${name}_${code}_${count}"
  }

  def fetchDataByCout(symbol: LSymbol, count: Int): Unit = {
    symbol match {
      case a: IndexSymbol =>
        val codes =
          dataSource.getIndexCodes(a.code).collectAsList().toList
//            .take(10)
        val sink = Sink.reduce[List[LStockItemContinue]]((p, c) => {
          logger.info("P {}", p)
          logger.info("C {}", c)
          val a = p.map(r => r.date)
          val b = c.map(r => r.date)
          val c1 = (a ::: b).distinct.map((r: Date) => {
            val a1 =
              p.find(inner => inner.date == r).map(r => r.count).getOrElse(0)
            val b1 = c
              .find(inner => inner.date == r && inner.count >= count)
              .map(r => r.count)
              .getOrElse(0)
            LStockItemContinue(new java.sql.Date(r.getTime), a1 + b1)
          })
          c1
        })
        val f: Source[List[LStockItemContinue], NotUsed] = Source(codes)
          .map(r => StockSymbol(r.code))
          .mapAsync(1)(r => continuesDataList.getList(r))

        val f2: Future[List[LStockItemContinue]] = f.runWith(sink)

        implicit val updatePStatePriceProxy = RetryPolicy(
          maxAttempts = 4,
          retryDuration = 3.second,
          backOff = ExponentialBackOff, // default is FixedBackOff
          jitter = 5.second // default is no jitter
        )
        val data = retry(Await.result(f2, 5.minutes))

        logger.info("data {}", data)

        val schema = StructType(
          List(
            StructField("date", DateType, true),
            StructField("count", IntegerType, true)
          )
        )

        /* Convert list to RDD */
        val rdd = spark.sparkContext.parallelize(
          data.map(r => Row(new java.sql.Date(r.date.getTime), r.count))
        )
        val df = spark.createDataFrame(rdd, schema)
        dataFrameDao.saveDynamicTable(df, get_table_name(symbol.code, count))
      case _ =>
    }
  }

  override def fetchData(symbol: LSymbol): Unit = {
    fetchDataByCout(symbol, 5)
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

  override def getList(symbol: LSymbol): Future[List[LStockItemContinue]] = {
    symbol match {
      case index: StockSymbol =>
        import queryTable.db._

        val s = get_table_name(index.code, 5)
        logger.info("s {}", s)
        logger.info("s {}", s)
        logger.info("s {}", s)
        val r1 = {
          dynamicQuerySchema[LStockItemContinue](s)
        }
        val result = queryTable.db.run(r1)
        result.recover {
          case NonFatal(x) => {
            logger.error("query index {}", x)
            List.empty[LStockItemContinue]
          }
        }
      //        result
      case _ =>
        Future.successful(List.empty[LStockItemContinue])
    }
  }
}
