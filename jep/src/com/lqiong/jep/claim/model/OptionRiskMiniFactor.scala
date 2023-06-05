package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.claim.model.item.QQOPTVIXItemMinute
import com.lqiong.jep.claim.model.item.QQOPTVIXItemMinute.QQOPTVIXItemMinute1
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao}
import io.getquill.Ord
import org.apache.spark.sql.functions.{col, to_timestamp, udf}
import org.apache.spark.sql.types._
import org.apache.spark.sql.{DataFrame, Encoder, SparkSession}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.control.NonFatal

// https://github.com/akfamily/akshare/blob/6cadabcbd4b9d93fe585dc88d190022e2f8f6599/akshare/option/option_value_analysis_em.py#L5
// http://175.24.206.163:30006/api/public/option_finance_underlying
// http://175.24.206.163:30006/api/public/option_finance_board
// http://175.24.206.163:30006/api/public/option_value_analysis_em
// http://175.24.206.163:30006/api/public/option_risk_indicator_sse

class OptionRiskMiniFactor @Inject() (
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy,
  private val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
//  override val logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val ex: ExecutionContext
) extends JepAbsctractData[QQOPTVIXItemMinute]("qqlt_minute", "000050") {

  val squared = udf((s: String) => {
    s.replaceAll("\\?", "").toDouble
  })

  implicit val encoder: Encoder[QQOPTVIXItemMinute1] =
    org.apache.spark.sql.Encoders.product[QQOPTVIXItemMinute1]

  override def transform(dateFrame: DataFrame): DataFrame = dateFrame
    .withColumn("time", to_timestamp(col("time"), "H:mm:ss").cast(TimestampType))
    .na
    .drop()

  override def getLatest() = {
    import queryTable.db._
    val r1 =
      dynamicQuerySchema[QQOPTVIXItemMinute](getTableName).sortBy(_.time)(Ord.desc).take(1)
    val result: Future[Option[QQOPTVIXItemMinute]] = queryTable.db
      .run(r1)
      .map(r => r.headOption)

    result.recover { case NonFatal(x) =>
      logger.error("panming Factor error {}", x)
      Option.empty[QQOPTVIXItemMinute]
    }
  }

  def getRealTimeList(): Future[List[QQOPTVIXItemMinute1]] = {
    super.getRealTimeList()(encoder)
  }

  def getRealTimeOne() = {
    super.getRealTimeOne()
  }

  override def getDataList() = {
    import queryTable.db._
    val r1 =
      dynamicQuerySchema[QQOPTVIXItemMinute](getTableName)
    val result: Future[List[QQOPTVIXItemMinute]] = queryTable.db
      .run(r1)

    result.recover { case NonFatal(x) =>
      logger.error("panming Factor error {}", x)
      List.empty[QQOPTVIXItemMinute]
    }
  }

  override val schema = Some(
    StructType(
      List(
        StructField("time", StringType, true),
        StructField("qvix", DoubleType, nullable = false)
      )
    )
  )

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.option_50etf_min_qvix()"""
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
        if (!d.isEmpty) {
          dataFrameDao.saveDynamicTable(d, getTableName, Some(createTable))
        }
      } else {
        logger.info("save  load")
      }
    }
  }
}
