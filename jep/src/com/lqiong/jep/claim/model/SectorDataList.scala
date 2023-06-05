package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.DataFrameDao
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.{DoubleType, LongType}

import scala.concurrent.{ExecutionContext, Future}

class SectorDataList @Inject() (
  code: String,
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[SectorItem]("sector_info", code) {

  override def getDataList(): Future[List[SectorItem]] = {
//      List.empty[SectorItem]

    import queryTable.db._
    val r1 = dynamicQuerySchema[SectorItem](getTableName)
    val result: Future[List[SectorItem]] = queryTable.db
      .run(r1)
    result
  }

//  case class SectorItem(
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
  override def transform(dateFrame: DataFrame) = dateFrame
    .dropDuplicates("涨跌幅", "涨跌额")
    .withColumnRenamed("板块", "name")
    .withColumnRenamed("股票名称", "code_name")
    .withColumnRenamed("公司家数", "stock_count")
    .withColumn("stock_count", col("stock_count").cast(LongType))
    .withColumnRenamed("平均价格", "avg_price")
    .withColumn("avg_price", col("avg_price").cast(DoubleType))
    .drop("涨跌额")
    .drop("涨跌幅")
//  .withColumnRenamed("涨跌幅", "changePercent")
    .withColumnRenamed("总成交量(手)", "order_count")
    .withColumn("order_count", col("order_count").cast(DoubleType))
    .withColumnRenamed("总成交额(万元)", "order_amount")
    .withColumn("order_amount", col("order_amount").cast(DoubleType))
    .withColumnRenamed("股票代码", "simple_code")
    .withColumnRenamed("当前价", "current_price")
    .withColumn("current_price", col("current_price").cast(DoubleType))

  //   公司家数             平均价格                 涨跌额
  //   涨跌幅     总成交量(手)     总成交额(万元)      股票代码
  //   涨跌幅      当前价     涨跌额   股票名称

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.stock_sector_spot(indicator=\"${code}\")"""
  )

}
