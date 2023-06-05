package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.claim.model.item.QQOPTVIXItem
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao}
import org.apache.spark.sql.functions.{col, to_date, udf}
import org.apache.spark.sql.types.{DoubleType, StringType, StructField, StructType}
import org.apache.spark.sql.{DataFrame, SparkSession}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.control.NonFatal

class OptionRiskFactor @Inject() (
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy,
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
//  override val logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val ex: ExecutionContext
) extends JepAbsctractData[QQOPTVIXItem]("qqlt", "000050") {
  val squared = udf((s: String) => {
    logger.info("ssssss {}", s)
//  logger.info("ssssss {}", DateFormat.getTimeSlashFormat(s))
    s.replaceAll("\\?", "").toDouble
  })
  override def transform(dateFrame: DataFrame): DataFrame = dateFrame
    .withColumn("date", to_date(col("date"), "yyyy-MM-dd"))
    .withColumn("open", col("open").cast(DoubleType))
    .withColumn("close", col("close").cast(DoubleType))
    .withColumn("high", col("high").cast(DoubleType))
    .withColumn("low", squared(col("low")).cast(DoubleType))
    .na
    .drop()

  override def getDataList(): Future[List[QQOPTVIXItem]] = {
    import queryTable.db._
    val r1 =
      dynamicQuerySchema[QQOPTVIXItem](getTableName)
    val result: Future[List[QQOPTVIXItem]] = queryTable.db
      .run(r1)

    result.recover { case NonFatal(x) =>
      logger.error("panming Factor error {}", x)
      List.empty[QQOPTVIXItem]
    }
  }

  override val schema = Some(
    StructType(
      List(
        StructField("date", StringType, true),
        StructField("close", StringType, nullable = false),
        StructField("open", StringType, nullable = false),
        StructField("high", StringType, nullable = false),
        StructField("low", StringType, nullable = false),
        StructField("close", StringType, nullable = false)
      )
    )
  )

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.option_50etf_qvix()"""
  )

  override def fetchData = {
    Future {
      val r = dataFrameDao.jepExecutor.runDateFrameByExecImportListSchedma(
        scriptsToDateframe,
        addDate = false,
        schema
      )
      if (r.isRight) {
        val d = transform(r.right.get)
        println("ok")
        logger.info("save   table")
        logger.info(d.takeAsList(1).toString)
        d.printSchema()
        println("ok")
        logger.info("save   table")
        dataFrameDao.saveDynamicTable(d, getTableName, Some(createTable))
      } else {
        logger.info("save  load")
      }
    }
  }
}
