package com.lqiong.jep.claim.model

import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.entry.QueryTable

//class YjbgDataList {
import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.option.DataFrameDao
import org.apache.spark.sql.DataFrame

import scala.concurrent.{ExecutionContext, Future}

class YjbgDataList @Inject() (
  date: String,
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[YjbgItem]("stock_em_yjbb", date) {

  override def getDataList(): Future[List[YjbgItem]] = {
    //      List.empty[SectorItem]
    import queryTable.db._
    val r1 = dynamicQuerySchema[YjbgItem](getTableName)
    val result: Future[List[YjbgItem]] = queryTable.db
      .run(r1)
    result
  }

  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (,7) value: 1.8936113686E8 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (净利润-同比增长,8) value: 11.5338883933 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (净利润-季度环比增长,9) value: 55.621 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (每股净资产,10) value: 4.523424472458 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (净资产收益率,11) value: 5.4 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (每股经营现金流量,12) value: 0.484335322523 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (营业收入-营业收入,4) value: 1.23110306739E9 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (营业收入-同比增长,5) value: 6.7183964067 class: class java.lang.Double
  //    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (营业收入-季度环比增长,6) value: 22.8696 class: class java.lang.Double

//    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (每股收益,3) value: 0.2377 class: class java.lang.Double
//    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (销售毛利率,13) value: 39.3788540742 class: class java.lang.Double
//    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (所处行业,14) value: 食品饮料 class: class java.lang.String
//    INFO  2021-12-11 09:31:37 dataFrameDao_df22222 - trade column (最新公告日期,15) value: 2021-12-04 00:00:00 class: class java.lang.String
//
  override def transform(dateFrame: DataFrame) = {
    val colList = dateFrame.columns.toList
    val todropColumns: List[String] = colList
      .filter(r =>
        !List("股票代码", "股票简称", "净利润-净利润")
          .contains(r)
      )

//  jlr: Double,
//  jlrtbzz: Double,
//  jlrtjdhb: Double,
//  mgjzc: Double,
//  jzcsyl: Double,
//  mgjyxjl: Double,
//  yysr: Double,
//  yysrtbzz: Double,
//  yysrjdhbzz: Double,

    dateFrame
      .drop(todropColumns: _*)
      .withColumnRenamed("股票代码", "code")
      .withColumnRenamed("股票简称", "name")
      .withColumnRenamed("净利润-净利润", "jlr")
  }

  //    dateFrame
  //      .dropDuplicates("涨跌幅", "涨跌额")

  //   公司家数             平均价格                 涨跌额
  //   涨跌幅     总成交量(手)     总成交额(万元)      股票代码
  //   涨跌幅      当前价     涨跌额   股票名称

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.stock_em_yjbb(date="${date}")"""
  )

}
//}
