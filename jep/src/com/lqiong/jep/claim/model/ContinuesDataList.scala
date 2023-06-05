package com.lqiong.jep.claim.model

import akka.NotUsed
import akka.actor.ActorSystem
import akka.event.LoggingAdapter
import akka.util.Timeout
import com.github.takezoe.retry.{retry, RetryPolicy}
import com.google.inject.Inject
import com.lqiong.jep.entry.{LStockItemContinue, LStockItemDate, QueryTable, QuillEncoder}
import com.lqiong.jep.option.DataFrameDao
import com.lqiong.model.{LSymbol, StockSymbol}
import org.apache.spark.sql.types.{DateType, IntegerType, StructField, StructType}
import org.apache.spark.sql.{Row, SparkSession}

import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.control.NonFatal

class ContinuesDataList @Inject() (
  implicit val dataFrameDao: DataFrameDao,
  logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val executionContext: ExecutionContext,
  implicit val system: ActorSystem,
  implicit val retryProxy: RetryPolicy
) extends AbsctractFactor[LStockItemContinue]
    with QuillEncoder {

  override val name: String = "continues"

  def get_table_name(code: String): String = {
    s"${name}_${code}"
  }

  // ***/ continue
  def convertContinue(
    list: List[LStockItemDate],
    count: Int = 200
  ): List[LStockItemContinue] = {
    logger.info("take {}", list.take(2))
    logger.info("take right {}", list.takeRight(2))
    retry {
      val rightList = list.takeRight(count)

      import akka.stream.scaladsl._
      val sourceList = Source(rightList)
      val f: Source[LStockItemDate, NotUsed] = sourceList
      val printlnSink1: Sink[LStockItemDate, Future[
        (Double, Int, List[LStockItemContinue])
      ]] = Sink.fold[(Double, Int, List[LStockItemContinue]), LStockItemDate](
        (10000.0, 0, List.empty[LStockItemContinue])
      )(f = (p, c) => {
        val current = if (c.close > p._1) p._2 + 1 else 0
        (
          c.close,
          current,
          p._3 ::: (List(
            LStockItemContinue(new java.sql.Date(c.date.getTime), current)
          ))
        )
      })
      val f1 = f.runWith(printlnSink1)

      Await.result(f1, 2.hours)._3
    }
  }

  override def fetchData(symbol: LSymbol): Unit = {
    retry {
      import queryTable.db._
      val r1 = dynamicQuerySchema[LStockItemDate](symbol.getTableName)
      val result = queryTable.db
        .run(r1)
        .recover { case NonFatal(x) =>
          logger.error("continues fetchData {}", x)
          List.empty[LStockItemDate]
        }
      val l: List[LStockItemDate] = Await.result(result, 200.seconds)
      val convertted = convertContinue(l)
      logger.info("l {}", convertted)

      val schema = StructType(
        List(
          StructField("date", DateType, true),
          StructField("count", IntegerType, true)
        )
      )

      /* Convert list to RDD */
      val rdd = spark.sparkContext.parallelize(
        convertted.map(r => Row(r.date, r.count))
      )

      /* Create data frame */
      val df = spark.createDataFrame(rdd, schema)

      dataFrameDao.saveDynamicTable(df, get_table_name(symbol.code))
    }
  }

  override def getList(symbol: LSymbol): Future[List[LStockItemContinue]] = {
    implicit val timeout: Timeout = 60.seconds
    symbol match {
      case index: StockSymbol =>
        import queryTable.db._

        val s = get_table_name(index.code)
        logger.info("s {}", s)
        logger.info("s {}", s)
        logger.info("s {}", s)
        val r1 = {
          dynamicQuerySchema[LStockItemContinue](s)
        }
        retry(queryTable.db.run(r1))
      case _ =>
        Future.successful(List.empty[LStockItemContinue])
    }
  }
}
