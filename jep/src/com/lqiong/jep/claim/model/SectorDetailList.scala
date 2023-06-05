package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.DataFrameDao
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.{col, udf}
import org.apache.spark.sql.types.{DoubleType, FloatType, StructField, StructType}

import scala.concurrent.{ExecutionContext, Future}

class SectorDetailList @Inject() (
  code: String,
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[SectorDetailItem]("sector_items", code) {

  override def getDataList(): Future[List[SectorDetailItem]] = {
    //      List.empty[SectorDetailItem]

    import queryTable.db._
    val r1 = dynamicQuerySchema[SectorDetailItem](getTableName)
    val result: Future[List[SectorDetailItem]] = queryTable.db
      .run(r1)
    result
  }

  override val schema = Some(
    StructType(
      List(
//      item1 changepercent object getType StringType
//  INFO  2021-12-08 21:17:54 dataFrameDao_df22222 - item1 buy object getType StringType
//  INFO  2021-12-08 21:17:54 dataFrameDao_df22222 - item1 sell object getType StringType
//  INFO  2021-12-08 21:17:54 dataFrameDao_df22222 - item1 settlement object getType StringType
//  INFO  2021-12-08 21:17:54 dataFrameDao_df22222 - item1 open object getType StringType
//  INFO  2021-12-08 21:17:54 dataFrameDao_df22222 - item1 high object getType StringType
//  INFO  2021-12-08 21:17:54 dataFrameDao_df22222 - item1 low object getType StringType

//        INFO  2021-12-08 22:38:17 dataFrameDao_df22222 - class java.lang.String
//  INFO  2021-12-08 22:38:17 dataFrameDao_df22222 - class java.lang.String
//  INFO  2021-12-08 22:38:17 dataFrameDao_df22222 - class java.lang.String
//  INFO  2021-12-08 22:38:17 dataFrameDao_df22222 - class java.lang.String
//  INFO  2021-12-08 22:38:17 dataFrameDao_df22222 - class java.lang.String
//  INFO  2021-12-08 22:38:17 dataFrameDao_df22222 - class java.lang.String

        // StructField("trade", StringType, nullable = false),

//        volume
        StructField("pricechange", DoubleType, nullable = false),
        StructField("changepercent", DoubleType, nullable = false)

//        StructField("volume", LongType, nullable = false),
//        StructField("amount", LongType, nullable = false),
//        StructField("buy", DoubleType, nullable = false),
//        StructField("sell", DoubleType, nullable = false),
//        StructField("settlement", DoubleType, nullable = false),
//        StructField("open", DoubleType, nullable = false),
//        StructField("low", DoubleType, nullable = false),
//        StructField("high", DoubleType, nullable = false)
      )
    )
  )

  //  case class SectorDetailItem(
  //                         label: String,
  //                         sector: String,
  //                         stockcount: Int,
  //                         avgPrice: Double,
  //                         //    涨跌额
  //                         changeAmount: Double,
  //                         //    总成交量(手)
  //                         orderCount: Double,
  //                         //    总成交额(万元)
  //                         orderAmount: Double,
  //                         //    股票代码
  //                         simpleCode: Double,
  //                         //    涨跌幅
  //                         changePercent: Double,
  //                         //    当前价
  //
  //                         currentPrice: Double
  //                         //    涨跌额   股票名称
  //                         //    label    板块 公司家数
  //                         //    平均价格
  //                         //    涨跌幅
  //
  //                       )
  //   公司家数             平均价格                 涨跌额
  //   涨跌幅     总成交量(手)     总成交额(万元)      股票代码
  //   涨跌幅      当前价     涨跌额   股票名称

  val squared = udf((s: String) => {
    logger.info("s{} {}", s, s.getClass)
    s
  })

//  # convert Series
//    my_series = pd.to_numeric(my_series)
//
//  # convert column "a" of a DataFrame
//    df["a"] = pd.to_numeric(df["a"])

  override def transform(dateFrame: DataFrame): DataFrame = dateFrame
    .drop(
      Seq(
//   "trade",
        "pricechange",
//      "changepercent",
//      "buy",
        "sell",
        "settlement",
        "open",
        "high",
        "low",
        "volume",
        "amount",
        "buy",
//      "per",
//      "pb",
        "mktcap",
        "nmc",
        "turnoverratio"
      ): _*
    )
    .withColumn("trade", col("trade").cast(FloatType))
//  .withColumn("changepercent", squared(col("changepercent")).cast(DoubleType))
//  changepercent
//   .withColumn("buy", col("buy").cast(FloatType))
//   .withColumn("pricechange", col("pricechange").cast(DoubleType))

  //  override def transform(dateFrame: DataFrame): DataFrame =
//    dateFrame

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"import pandas as pd",
    s"""df=ak.stock_sector_detail(sector="$code")""",
    s"""df["changepercent"] = pd.to_numeric(df["changepercent"])""",
    s"""df"""
  )

}
