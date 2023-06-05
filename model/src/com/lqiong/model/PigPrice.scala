package com.lqiong.model

import cats.arrow.Strong

import java.util.Date
import scala.concurrent.{ExecutionContext, Future}

// TODO  Codec for scala
case class PigPrice(
  date: Date,
  value: Double
)

case class PigPrice1(
  date: java.sql.Date,
  value: Double
)

abstract class AbstractData[T](name: String) {

  val ex: ExecutionContext

  val scriptsToDateframe: List[String]

//  def getList: List[T]

  def fetchData: Unit

  val createTable: String = ""

  def getImageName: String = {
    s"/tmp/t_${name}.png"
  }

  def get_table_name: String = {
    s"t_${name}"
  }

  def getList: Future[List[T]]
}

abstract class DanamicAbstractData[T] {

  val name: String;

  val ex: ExecutionContext

  def scriptsToDateframe(code: String): List[String]

  def getList(code: String): Future[List[T]]
}
