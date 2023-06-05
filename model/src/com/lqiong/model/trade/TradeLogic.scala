package com.lqiong.model.trade

import com.lqiong.jep.entry.DateFormat
import com.lqiong.jep.option.StockStudyNote
import com.lqiong.model.{LSymbol, StockSymbol}
import com.lqiong.model.order.OrderCommand
import org.joda.time.DateTime

object shot {

  implicit class DurationOps(duration: TradeHistory) {
    def when(other: DateTime): TradeHistory = {
      duration.copy(dateTime = Some(other))
    }

    def amount(other: Int): TradeHistory = {
      duration.copy(tradeAmount = other)
    }

    def msg(other: String): TradeHistory = {
      duration.copy(info = Some(other))
    }
  }

  def put: TradeHistory = TradeHistory(direction = OrderCommand.commandSell)
  def call: TradeHistory = TradeHistory(direction = OrderCommand.commandBuy)
}

case class TradeLogic(
  symbol: LSymbol,
  updateWhen: Option[DateTime] = Option.empty[DateTime],
  enterReason: Option[(LSymbol) => Boolean] = Option.empty[(LSymbol) => Boolean],
  leaveReason: Option[(LSymbol) => Boolean] = Option.empty[(LSymbol) => Boolean],
  enterReasonMsg: Option[String] = Option.empty[String],
  leaveReasonMsg: Option[String] = Option.empty[String],
  enterMeta: Option[String] = Option.empty[String],
  currentHoldAmount: Option[Int] = Option.empty[Int],
  startTime: Option[DateTime] = Option.empty[DateTime],
  endTime: Option[DateTime] = Option.empty[DateTime],
  currentStep: LogicPeriod = LogicPeriod.start,
  tradeHistory: List[TradeHistory] = List.empty[TradeHistory],
  tradeLogicMsg: Option[String] = Option.empty[String],
  valid: Boolean = true,
  currentMsg: Option[String] = Option.empty[String],
  note: Option[StockStudyNote] = Option.empty[StockStudyNote]
) {

  // 一天只能买两次

  override def toString: String = {
    s"""
      |current status for ${symbol.code} currentStep ${currentStep} currentHoldAmount: ${currentHoldAmount} startTime: ${startTime
        .map(r => DateFormat.getDay(r))
        .getOrElse("")}
      |endTime: ${endTime.map(r => DateFormat.getDay(r)).getOrElse("")}
      |enterReasonName: ${enterMeta.getOrElse("")}
      |enterReason:${enterReasonMsg.getOrElse("")}
      |leaveReason: ${leaveReasonMsg.getOrElse("")}
      |
      |""".stripMargin
  }
}
