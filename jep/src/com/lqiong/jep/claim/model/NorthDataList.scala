package com.lqiong.jep.claim.model

//class NorthDataList {}

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

class NorthDataList @Inject() (
  indexName: String, // 沪股通
  val logger: LoggingAdapter,
  implicit val policy: RetryPolicy
)(
  implicit val dataFrameDao: DataFrameDao,
  implicit val ex: ExecutionContext,
  implicit val queryTable: QueryTable
) extends JepAbsctractData[CommonItemValue](
      s"""stock_em_hsgt_north_net_flow_in${indexName}""",
      indexName
    ) {

  override def getDataList() = {
    import queryTable.db._
    queryTable.db.run(dynamicQuerySchema[CommonItemValue](getTableName))
  }

  override def transform(dateFrame: DataFrame) = dateFrame
    .withColumn("date", col("date").cast(DateType))

  override val scriptsToDateframe: List[String] = List(
    s"import akshare as ak",
    s"""ak.stock_em_hsgt_north_net_flow_in(indicator="${indexName}")"""
  )
}
