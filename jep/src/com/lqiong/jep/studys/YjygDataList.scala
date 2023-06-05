package com.lqiong.jep.studys

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.claim.model.YjYgItem
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.DataFrameDao
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.DateType

import scala.concurrent.{ExecutionContext, Future}

class YjygDataList @Inject() (
  date: String,
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[YjYgItem]("stock_em_yjkb", date) {

  override def getDataList(): Future[List[YjYgItem]] = {
    //      List.empty[SectorItem]
    import queryTable.db._
    val r1 = dynamicQuerySchema[YjYgItem](getTableName)
    val result: Future[List[YjYgItem]] = queryTable.db
      .run(r1)
    result
  }

  // (序号,股票代码,股票简称,预测指标,业绩变动,预测数值,业绩变动幅度,业绩变动原因,预告类型,上年同期值,公告日期

  override def transform(dateFrame: DataFrame) = {
    val colList = dateFrame.columns.toList
    val todropColumns: List[String] = colList
      .filter(r =>
        !List("股票代码", "公告日期", "业绩变动幅度", "业绩变动原因", "股票简称", "预测指标", "预告类型")
          .contains(r)
      )

    dateFrame
      .drop(todropColumns: _*)
      .withColumnRenamed("股票代码", "code")
      .withColumnRenamed("股票简称", "name")
      .withColumnRenamed("公告日期", "pubdate")
      .withColumnRenamed("业绩变动幅度", "changepercent")
      .withColumnRenamed("预告类型", "changetype")
      .withColumnRenamed("业绩变动原因", "changereason")
      .withColumnRenamed("预测指标", "forcastname")
      .withColumn("pubdate", col("pubdate").cast(DateType))
//      业绩变动幅度
  }

  //    dateFrame
  //      .dropDuplicates("涨跌幅", "涨跌额")

  //   公司家数             平均价格                 涨跌额
  //   涨跌幅     总成交量(手)     总成交额(万元)      股票代码
  //   涨跌幅      当前价     涨跌额   股票名称

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.stock_em_yjyg(date="${date}")"""
  )

}
