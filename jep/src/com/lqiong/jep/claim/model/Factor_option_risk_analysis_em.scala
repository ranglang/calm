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
import org.apache.spark.sql.{DataFrame, Dataset, Encoder, SparkSession}

import scala.collection.JavaConverters.asScalaBufferConverter
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

//期权代码:string,期权名称:string,最新价:double,涨跌幅:double,杠杆比率:double,实际杠杆比率:double,delta:double,gamma:double,vega:double,rho:double,theta:double,到期日:string

@JsonCodec
case class Itemoption_risk_analysis_em(
  `期权代码`: String,
  `期权名称`: String,
  `最新价`: Double,
  `涨跌幅`: Double,
  `杠杆比率`: Double,
  `实际杠杆比率`: Double,
  `delta`: Double,
  `gamma`: Double,
  `vega`: Double,
  `rho`: Double,
  `theta`: Double,
  `到期日`: String
)

//|-- 期权代码: string
//(nullable = true)
//|-- 期权名称: string
//(nullable = true)
//|-- 最新价: double
//(nullable = true)
//|-- 涨跌幅: double
//(nullable = true)
//|-- 杠杆比率: double
//(nullable = true)
//|-- 实际杠杆比率: double
//(nullable = true)
//|-- Delta: double
//(nullable = true)
//|-- Gamma: double
//(nullable = true)
//|-- Vega: double
//(nullable = true)
//|-- Rho: double
//(nullable = true)
//|-- Theta: double
//(nullable = true)
//|-- 到期日: string
//(nullable = true)

class Factor_option_risk_analysis_em @Inject() (
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy,
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val ex: ExecutionContext
) extends JepAbsctractData[Itemoption_risk_analysis_em]("Factor_option_risk_analysis_em", "") {
  val squared = udf((s: String) => {
    logger.info("ssssss {}", s)
    //  logger.info("ssssss {}", DateFormat.getTimeSlashFormat(s))
    s.replaceAll("\\?", "").toDouble
  })

//  `delta`: Double
//  ,
//  `gamma`: Double
//  ,
//  `vega`: Double
//  ,
//  `rho`: Double
//  ,
//  `theta`: Double

  override def transform(dateFrame: DataFrame): DataFrame = dateFrame
    .withColumnRenamed("Delta", "delta")
    .withColumnRenamed("Gamma", "gamma")
    .withColumnRenamed("Vega", "vega")
    .withColumnRenamed("Rho", "rho")
    .withColumnRenamed("Theta", "theta")

  implicit val ec: Encoder[Itemoption_risk_analysis_em] =
    org.apache.spark.sql.Encoders.product[Itemoption_risk_analysis_em]
  def getRealTimeDataset(): Future[Option[Dataset[Itemoption_risk_analysis_em]]] = {
    super.getRealTimeDataset()(ec)
  }

  def getRealTimeList(): Future[List[Itemoption_risk_analysis_em]] = {
    getRealTimeDataset().map {
      case Some(x) =>
        x.collectAsList().asScala.toList
      case _ => List.empty
    }
  }

  override def getDataList(): Future[List[Itemoption_risk_analysis_em]] = {
    import queryTable.db._
    val r1 =
      dynamicQuerySchema[Itemoption_risk_analysis_em](getTableName)
    val result: Future[List[Itemoption_risk_analysis_em]] = queryTable.db
      .run(r1)

    result.recover { case NonFatal(x) =>
      logger.error("panming Factor error {}", x)
      List.empty[Itemoption_risk_analysis_em]
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
    s"""ak.option_risk_analysis_em()"""
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
