package com.lqiong.jep.claim.model

import akka.event.LoggingAdapter
import com.github.takezoe.retry.{retry, RetryPolicy}
import com.google.inject.Inject
import com.lqiong.jep.entry.QueryTable
import com.lqiong.jep.option.{DataFrameDao, JepExecutor, TradeModel}
import com.lqiong.model.AbstractData

import scala.concurrent.{ExecutionContext, Future}

class TradeDayLists @Inject() (
  implicit val jepExecutor: JepExecutor,
  implicit val dataFrameDao: DataFrameDao,
  implicit val queryTable: QueryTable,
  implicit val ex: ExecutionContext,
  val logger: LoggingAdapter,
  implicit val retryPolicy: RetryPolicy
) extends AbstractData[TradeModel]("trade_days") {

  override val scriptsToDateframe: List[String] = List(
    "import akshare as ak",
    s"""ak.tool_trade_date_hist_sina()"""
  )

  override def getList: Future[List[TradeModel]] = {
    import queryTable.db._
    val r1 = dynamicQuerySchema[TradeModel](get_table_name)
    val result: Future[List[TradeModel]] = queryTable.db
      .run(r1)
    logger.info("pig price {}", r1)
    result.map(r => {
      logger.info("xxx trade day length {}", r.length)
      r
    })
  }

  override def fetchData: Unit = {
    retry {
      val r = jepExecutor.runDateFrameByExecImportList(
        scriptsToDateframe,
        convertDate = Some("trade_date")
      )
      if (r.isRight) {
        val d = r.right.get
        dataFrameDao.saveDynamicTable(d, get_table_name)
      } else {
        logger.info(" not get save  load")
      }
    }
  }

}
