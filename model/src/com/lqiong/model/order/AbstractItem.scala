package com.lqiong.model.order

import scala.concurrent.{ExecutionContext, Future}

abstract class AbstractItem[T](prefix: String, code: String) {

  val ex: ExecutionContext

  def getTableName = {
    s"${prefix}_${code}"
  }

  def getDataList(): Future[List[T]] = Future.successful(List.empty[T])
//  def getRealTimeDataList()(implicit ec: Encoder[T]): Future[Option[Dataset[T]]]

  def fetchData(): Future[Unit] = Future.successful()

}
