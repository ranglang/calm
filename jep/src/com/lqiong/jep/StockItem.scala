package com.lqiong.jep

import com.github.takezoe.retry.RetryPolicy
import com.google.inject.Inject
import com.lqiong.jep.entry.{LStockItem, QueryTable}
import com.lqiong.model.order.AbstractItem
import com.outworkers.phantom.Manager.logger

import java.util.Date
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, ExecutionContext}
import scala.util.Try
import scala.util.control.NonFatal

class StockItem @Inject() (
  code: String,
  implicit val policy: RetryPolicy
)(implicit val ex: ExecutionContext, implicit val queryTable: QueryTable)
    extends AbstractItem("s", code) {

  import queryTable.db._
  def getChangeList(): List[(Date, Double)] = {
    val f = Try {
      val r1 = dynamicQuerySchema[LStockItem](getTableName)
      val result = queryTable.db.run(r1)
      logger.info("getList Stock Item {}", r1)
      val list = Await.result(result, 30.seconds)
      list.map(r => (r.date, (r.close - r.open) / r.open))
    }.recover { case NonFatal(x) =>
      logger.error("stockItem getList {}", x)
      List.empty[(Date, Double)]
    }
    f.get
  }

  def getList(): List[(Date, Double)] = {
    val f = Try {
      val r1 = dynamicQuerySchema[LStockItem](getTableName)
      val result = queryTable.db.run(r1)
      logger.info("getList Stock Item {}", r1)
      val list = Await.result(result, 30.seconds)
      list.map(r => (r.date, r.close.toDouble))
    }.recover { case NonFatal(x) =>
      logger.error("stockItem getList {}", x)
      List.empty[(Date, Double)]
    }
    f.get
  }
}
