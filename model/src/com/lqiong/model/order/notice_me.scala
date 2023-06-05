package com.lqiong.model.order

import com.lqiong.jep.entry.SymbolEnum.stock
import com.lqiong.jep.entry.{DateFormat, QuantMetric, SymbolEnum}
import com.lqiong.model.symbol.codesyntax
import com.lqiong.model.{IndexSymbol, LSymbol, StockSymbol}

object notice_me extends codesyntax {

  implicit class DurationOps(duration: NoticeMe) extends codesyntax {

    def msg(other: String): NoticeMe = {
      duration.copy(messageOpt = Some(other))
    }

    def above(price: Double): NoticeMe = {
      duration.copy(referenceValue = Some(price), isAsc = Some(true))
    }

    def below(price: Double): NoticeMe = {
      duration.copy(referenceValue = Some(price), isAsc = Some(false))
    }

    def target(other: LSymbol): NoticeMe = {
      duration.copy(symbol = other, symbolType = stock)
    }

    def code(other: LSymbol): NoticeMe = {
      other match {
        case other: StockSymbol => duration.copy(symbol = other, symbolType = stock)
        case other: IndexSymbol => {
          duration.copy(indexSymbol = Some(other), symbolType = SymbolEnum.`index`)
        }
      }
    }

    def metric(other: QuantMetric): NoticeMe = {
      duration.copy(metricOpt = Some(other))
    }

    def at(date: String): NoticeMe = {
      duration.copy(dateTime = Some(DateFormat.getTimeOrDayFormat().parseDateTime(date)))
    }
  }

  def notice: NoticeMe = NoticeMe(symbol = StockSymbol(""))
}
