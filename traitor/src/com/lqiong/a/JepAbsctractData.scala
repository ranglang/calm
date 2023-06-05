package com.lqiong.a

import akka.event.LoggingAdapter
import com.lqiong.jep.option.DataFrameDao
import com.lqiong.model.order.AbstractItem
import org.apache.spark.sql.types.StructType
import org.apache.spark.sql.{DataFrame, Dataset, Encoder}

import scala.collection.JavaConverters.asScalaBufferConverter
import scala.concurrent.{ExecutionContext, Future}

abstract class JepAbsctractData[T](prefix: String, code: String)
    extends AbstractItem[T](prefix: String, code: String) {

  val createTable = ""

  val logger: LoggingAdapter;
  implicit val ex: ExecutionContext

  implicit val dataFrameDao: DataFrameDao

  val scriptsToDateframe: List[String]

  def transform(dateFrame: DataFrame): DataFrame = dateFrame

  val schema: Option[StructType] = Option.empty[StructType]

  def getLatest(): Future[Option[T]] = Future.successful(Option.empty[T])


  def getRealTimeOne[Y]()(implicit ec: Encoder[Y]): Future[Option[Y]] = {
    getRealTimeList[Y]()(ec).map(_.headOption)
  }

  def getRealTimeList[Y]()(implicit ec: Encoder[Y]): Future[List[Y]] = {
    getRealTimeDataset().map {
      case Some(x) =>
        x.collectAsList().asScala.toList
      case _ => List.empty
    }
  }

  def getRealTimeDataset[Y]()(implicit ec: Encoder[Y]): Future[Option[Dataset[Y]]] =  {
    Future{
      val r = dataFrameDao.jepExecutor.runDateFrameByExecImportListSchedma(
        scriptsToDateframe,
        false,
        schema
      )
      if (r.isRight) {
        val d = transform(r.right.get)
        println("ok")
        logger.info("save   table")
        logger.info(d.takeAsList(1).toString)
        d.printSchema()
        println("ok")
        logger.info("save   table")
        Some(d.as[Y])
      } else {
        Option.empty
      }
    }
  }
//    Future.successful(List.empty[T])
  override def fetchData = {
    Future {
      val r = dataFrameDao.jepExecutor.runDateFrameByExecImportListSchedma(
        scriptsToDateframe,
        false,
        schema
      )
      if (r.isRight) {
        val d = transform(r.right.get)
        println("ok")
        logger.info("save   table")
        logger.info(d.takeAsList(1).toString)
        d.printSchema()
        println("ok")
        logger.info("save   table")
        dataFrameDao.saveDynamicTable(d, getTableName, Some(createTable))
      } else {
        logger.info("save  load")
      }
    }
  }

}
