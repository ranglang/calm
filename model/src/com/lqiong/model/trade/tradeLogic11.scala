package com.lqiong.model.trade

import com.lqiong.jep.option.StockStudyNote
import com.lqiong.model.{IndexSymbol, LSymbol, StockSymbol}
import com.lqiong.model.symbol.codesyntax
import org.joda.time.DateTime

object tradeLogic11 extends codesyntax {

  implicit class TradeLogic1(duration: TradeLogic) {

    def current(other: String): TradeLogic = {
      duration.copy(currentMsg = Some(other))
    }
    def logic(other: String): TradeLogic = {
      duration.copy(tradeLogicMsg = Some(other))
    }

    def code(other: StockSymbol): TradeLogic = {
      duration.copy(symbol = other)
    }

    def index(other: IndexSymbol): TradeLogic = {
      duration.copy(symbol = other)
    }

    def biji(other: StockStudyNote): TradeLogic = {
      duration.copy(note = Some(other))
    }

    def shots(list: List[TradeHistory]): TradeLogic = {
      val step =
        if (duration.currentStep == LogicPeriod.start && list.nonEmpty) LogicPeriod.start
        else duration.currentStep
      duration.copy(tradeHistory = list, currentStep = step)
    }

    def hold(other: Int): TradeLogic = {
      val step =
        if (duration.currentStep == LogicPeriod.start) LogicPeriod.start else duration.currentStep
      duration.copy(currentHoldAmount = Some(other), currentStep = step)
    }

    def enterBy(
      a: Tuple2[String, Function1[LSymbol, Boolean]]
    ): TradeLogic = {
      duration.copy(enterReason = Some(a._2)).copy(enterMeta = Some(a._1))
    }

    def leaveBy(
      a: Tuple2[String, Function1[LSymbol, Boolean]]
    ): TradeLogic = {
      duration.copy(leaveReason = Some(a._2)).copy(leaveReasonMsg = Some(a._1))
    }

    def leaveWith(a: Function1[LSymbol, Boolean]): TradeLogic = {
      duration.copy(leaveReason = Some(a))
    }

    def updateAt(other: DateTime): TradeLogic = {
      duration.copy(updateWhen = Some(other))
    }

    def step(other: LogicPeriod): TradeLogic = {
      duration.copy(currentStep = other)
    }

    def enter(other: String): TradeLogic = {
      duration.copy(enterReasonMsg = Some(other))
    }

    def leave(other: String): TradeLogic = {
      duration.copy(leaveReasonMsg = Some(other))
    }

    def start(other: DateTime): TradeLogic = {
      duration.copy(startTime = Some(other))
    }

    def end(other: DateTime): TradeLogic = {
      duration.copy(valid = false, endTime = Some(other))
    }
  }

  def trade(): TradeLogic = TradeLogic(StockSymbol(""))
}
