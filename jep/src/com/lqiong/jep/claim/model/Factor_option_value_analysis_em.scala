package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao}
import io.circe.generic.JsonCodec
import org.apache.spark.sql.functions.udf
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.{DataFrame, SparkSession}

import scala.concurrent.{ExecutionContext, Future}
import scala.util.control.NonFatal

//"期权代码": "10004713"
//,
//"期权名称": "300ETF沽6月3938A"
//,
//"最新价": 0.0728
//,
//"时间价值": 0.0668
//,
//"内在价值": 0.006
//,
//"隐含波动率": 13.13
//,
//"理论价格": 0.0898
//,
//"标的名称": "沪深300ETF"
//,
//"标的最新价": 3.932
//,
//"标的近一年波动率": 16.12
//,
//"到期日": "2023-06-28T00:00:00.000"
//},
//

@JsonCodec
case class QQOPTVIXMetaItem(
  `期权代码`: String,
  `期权名称`: String
)

/** \|-- 期权代码: string (nullable = true) \|-- 期权名称: string (nullable = true) \|-- 最新价: double
  * (nullable = true) \|-- 时间价值: double (nullable = true) \|-- 内在价值: double (nullable = true) \|--
  * 隐含波动率: double (nullable = true) \|-- 理论价格: double (nullable = true) \|-- 标的名称: string (nullable
  * \= true) \|-- 标的最新价: double (nullable = true) \|-- 标的近一年波动率: double (nullable = true) \|-- 到期日:
  * string (nullable = true)
  */

class Factor_option_value_analysis_em @Inject() (
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy,
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val ex: ExecutionContext
) extends JepAbsctractData[QQOPTVIXMetaItem]("option_value_analysis_em", "") {
  val squared = udf((s: String) => {
    logger.info("ssssss {}", s)
    //  logger.info("ssssss {}", DateFormat.getTimeSlashFormat(s))
    s.replaceAll("\\?", "").toDouble
  })
  override def transform(dateFrame: DataFrame): DataFrame = dateFrame
//      .withColumn("date", to_date(col("date"), "yyyy-MM-dd"))
//      .withColumn("open", col("open").cast(DoubleType))
//      .withColumn("close", col("close").cast(DoubleType))
//      .withColumn("high", col("high").cast(DoubleType))
//      .withColumn("low", squared(col("low")).cast(DoubleType))
    .na
    .drop()

  override def getDataList(): Future[List[QQOPTVIXMetaItem]] = {
    import queryTable.db._
    val r1 =
      dynamicQuerySchema[QQOPTVIXMetaItem](getTableName)
    val result: Future[List[QQOPTVIXMetaItem]] = queryTable.db
      .run(r1)

    result.recover { case NonFatal(x) =>
      logger.error("panming Factor error {}", x)
      List.empty[QQOPTVIXMetaItem]
    }
  }

  override val schema = Some(
    StructType(
      List(
//          StructField("date", StringType, true),
//          StructField("close", StringType, nullable = false),
//          StructField("open", StringType, nullable = false),
//          StructField("high", StringType, nullable = false),
//          StructField("low", StringType, nullable = false),
//          StructField("close", StringType, nullable = false)
      )
    )
  )

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.option_value_analysis_em()"""
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
