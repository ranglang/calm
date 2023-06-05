package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.entry.DateFormat
import com.lqiong.jep.models.{StockHotPrice, StockHotPrice1}
import com.lqiong.jep.option.{DataFrameDao, JepExecutor}
import com.lqiong.model.DanamicAbstractData
import levsha.dsl.svg.d
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{col, udf}
import org.apache.spark.sql.types.DateType

import scala.concurrent.{ExecutionContext, Future}
import scala.jdk.CollectionConverters.CollectionHasAsScala

class DynamicAStockPrice @Inject() (
  implicit val jepExecutor: JepExecutor,
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val spark: SparkSession,
  val logger: LoggingAdapter,
  implicit val retryPolicy: RetryPolicy
) extends DanamicAbstractData[StockHotPrice1] {
  override val name = "stock"

  override def scriptsToDateframe(code: String): List[String] = List(
    "import akshare as ak",
    s"""ak.stock_zh_a_hist_pre_min_em(symbol="${code}")"""
  )

  override def getList(code: String): Future[List[StockHotPrice1]] = {
    import spark.implicits._
    logger.info(scriptsToDateframe(code).toString);

//    val squared = udf((s: String) => {
//      logger.info("ssssss {}", s)
//      logger.info("ssssss {}", DateFormat.getTimeSlashFormat(s))
//      DateFormat.getTimeSlashFormat(s)
////      DateFormat.getDay()
//    })

    Future {
      val r = jepExecutor.runDateFrameByExecImportList(
        scriptsToDateframe(code)
//        convertDate = Some("时间")
      )
      if (r.isRight) {
        val df = r.right.get
        val df23 = df
          .withColumnRenamed("时间", "date")
          .withColumnRenamed("开盘", "open")
          .withColumnRenamed("收盘", "close")
          .withColumnRenamed("最高", "high")
          .withColumnRenamed("最低", "low")
          .withColumnRenamed("成交量", "volume")
          .withColumnRenamed("成交额", "mount")
          .withColumnRenamed("最新价", "price")
        df23.as[StockHotPrice1].collectAsList().asScala.toList
      } else {
        List.empty[StockHotPrice1]
      }
    }
  }

}
