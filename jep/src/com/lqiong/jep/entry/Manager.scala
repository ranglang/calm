package com.lqiong.jep.entry

import akka.actor.typed.Behavior
import akka.actor.typed.scaladsl.Behaviors
import akka.event.LoggingAdapter
import com.lqiong.jep.option.cassandra.GetSparkTable
import com.lqiong.model.StockSymbol
import org.joda.time.DateTime

object Manager {
  sealed trait UpdateCommand
  final case class UpdateCommandItem(
    stock: StockSymbol,
    date: DateTime,
    item: TodayStockPrice
  ) extends UpdateCommand

  def apply(
    entityId: String,
    logger: LoggingAdapter,
    getSparkTable: GetSparkTable
  ): Behavior[UpdateCommand] = {
    def updated(value: Int): Behavior[UpdateCommand] = {
      Behaviors.receiveMessage[UpdateCommand] { case UpdateCommandItem(stock, date, item) =>
        getSparkTable.insertDate(stock, date, item)
        Behaviors.same
      }
    }

    updated(0)
  }
}
