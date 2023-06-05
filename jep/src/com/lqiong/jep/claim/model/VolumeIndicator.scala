package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.google.inject.Inject
import com.lqiong.jep.claim.model.VolumeIndicator.get_table_name
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.{ClaimDataSource, DataFrameDao, JoinQuantName, VolumeIndicatorItem}
import com.lqiong.model.{IndexSymbol, LSymbol, StockSymbol}
import org.apache.spark.sql.SparkSession

import scala.concurrent.{ExecutionContext, Future}

object VolumeIndicator {
  final val name: String = "volume"
  def get_table_name(code: String): String = {
    s"${name}_${code}"
  }

}
class VolumeIndicator @Inject() (
  val dataSource: ClaimDataSource,
  implicit val dataFrameDao: DataFrameDao,
  logger: LoggingAdapter,
  implicit val queryTable: QueryTable,
  implicit val spark: SparkSession,
  implicit val executionContext: ExecutionContext
) extends AbsctractFactor[VolumeIndicatorItem] {
  override val name: String = "volume"

  override def fetchData(symbol: LSymbol): Unit = {
    symbol match {
      case index: StockSymbol =>
        logger.info("index {}", index);
      case _ =>
        logger.info("ok {}");
    }
  }

  override def getList(symbol: LSymbol): Future[List[VolumeIndicatorItem]] = {
    symbol match {
      case index: StockSymbol =>
        import queryTable.db._
        val r1 =
          dynamicQuerySchema[VolumeIndicatorItem](get_table_name(index.code))
        val result: Future[List[VolumeIndicatorItem]] = queryTable.db
          .run(r1)
        result
      case _ =>
        Future.successful(List.empty[VolumeIndicatorItem])
    }
  }
}
