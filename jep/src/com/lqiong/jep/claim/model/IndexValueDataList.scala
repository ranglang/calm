package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.a.JepAbsctractData
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.DataFrameDao
import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.functions.col
import org.apache.spark.sql.types.DateType

import scala.concurrent.{ExecutionContext, Future}

class IndexValueDataList @Inject() (
  indexName: String,
  indicator: String,
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[IndexValueItem](
      s"""index_value${indexName}""",
      indicator
    ) {

  override def getDataList(): Future[List[IndexValueItem]] = {
    import queryTable.db._
    val r1 = dynamicQuerySchema[IndexValueItem](getTableName)
    val result: Future[List[IndexValueItem]] = queryTable.db
      .run(r1)
    result
  }

  override def transform(dateFrame: DataFrame) = dateFrame
    .drop("最低10", "最高10")
    .withColumnRenamed("日期", "date")
    .withColumn("date", col("date").cast(DateType))
    .withColumnRenamed("平均值", "average")
    .withColumnRenamed("股息率", "dividendrate")
    .withColumnRenamed("最低30", "low30")
    .withColumnRenamed("最高30", "high30")

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.index_value_hist_funddb(symbol=\"${indexName}\", indicator=\"${indicator}\")"""
  )
}
