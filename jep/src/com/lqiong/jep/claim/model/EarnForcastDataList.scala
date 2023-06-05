package com.lqiong.jep.claim.model

//class EarnForcast {

import akka.event.LoggingAdapter
import com.comcast.ip4s.Ipv6Address.MappedV4Block.prefix
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.entry.Category.code
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.DataFrameDao
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.DoubleType

import scala.concurrent.{ExecutionContext, Future}

class EarnForcastDataList @Inject() (
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[EarnForcastItem]("stock_profit_forecast", "") {

  override def getTableName = {
    s"earn_${prefix}_${code}"
  }

  override def getDataList(): Future[List[EarnForcastItem]] = {
    //      List.empty[SectorItem]

    import queryTable.db._
    val r1 = dynamicQuerySchema[EarnForcastItem](getTableName)
    val result: Future[List[EarnForcastItem]] = queryTable.db
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
  override def transform(dateFrame: DataFrame) = {

    val colList = dateFrame.columns.toList
    val todropColumns: List[String] = colList
      .filter(r => !List("代码").contains(r))
      .filter(c => !c.contains("预测每股收益"))

    val dropColumns: List[String] = colList
      .filter(r => !List("代码").contains(r))
      .filter(c => c.contains("预测每股收益"))

    val cols = dropColumns
      .filter(r => r.contains("预测每股收益"))
      .map(r1 => {
        (r1, s"y${r1.replace("预测每股收益", "")}")
      })

    val renamedDateFrame = cols.foldRight(dateFrame)((p, c) => {
      c.withColumnRenamed(p._1, p._2)
        .withColumn(p._2, col(p._2).cast(DoubleType))
    })

    logger.info("stock_profit_forecast {}", todropColumns.mkString(","))
    renamedDateFrame
      .drop(todropColumns: _*)
      .withColumnRenamed("代码", "code")
      .withColumnRenamed("名称", "name");

  }

//    dateFrame
//      .dropDuplicates("涨跌幅", "涨跌额")

  //   公司家数             平均价格                 涨跌额
  //   涨跌幅     总成交量(手)     总成交额(万元)      股票代码
  //   涨跌幅      当前价     涨跌额   股票名称

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.stock_profit_forecast()"""
  )

}
