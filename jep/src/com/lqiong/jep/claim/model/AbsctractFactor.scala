package com.lqiong.jep.claim.model

import com.lqiong.model.LSymbol
import org.joda.time.DateTime

import scala.concurrent.Future

abstract class AbsctractFactor[T] {
  val name: String;

  def cal(symbol: LSymbol, date: DateTime): Double = 0
  def calList(symbol: LSymbol): List[(DateTime, Double)] =
    List.empty[(DateTime, Double)]
  def getList(symbol: LSymbol): Future[List[T]]
  def getLatest(symbol: LSymbol): Future[Option[T]] = Future.successful(Option.empty)

  def getByDate(symbol: LSymbol, date: DateTime): Future[Option[T]] = Future.successful(None)

  def fetchData(symbol: LSymbol): Unit
  def fetchDataAsync(symbol: LSymbol): Future[Unit] = Future.successful(())
}
