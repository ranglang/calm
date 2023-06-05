package com.lqiong.model.order

import com.lqiong.jep.entry.QuantMetric.symbolPrice
import com.lqiong.jep.entry.{QuantMetric, SymbolEnum}
import com.lqiong.model.symbol.codesyntax
import com.lqiong.model.{IndexSymbol, LSymbol}
import org.joda.time.DateTime

case class NoticeMe(
  symbol: LSymbol,
  symbolType: SymbolEnum = SymbolEnum.empty,
  noticeStrategy: String = "date",
  dateTime: Option[DateTime] = Option.empty[DateTime],
  messageOpt: Option[String] = Option.empty[String],
  referenceValue: Option[Double] = Option.empty[Double],
  isAsc: Option[Boolean] = Option.empty[Boolean],
  indexSymbol: Option[IndexSymbol] = Option.empty[IndexSymbol],
  metricOpt: Option[QuantMetric] = Some(symbolPrice)
) {

  def isValid = {
    if (symbol.symbolType == SymbolEnum.stock) {
      symbol.code.nonEmpty
    } else {
      true
    }
  }
}

case class StarDate(
  symbol: LSymbol,
  date: DateTime,
  msg: Option[String] = Option.empty[String]
)

case class NoticeGroup(
  groupName: String = "",
  items: List[LSymbol] = List.empty[LSymbol],
  list: List[StarDate] = List.empty[StarDate]
)

object noticesGroups extends codesyntax {

  implicit class NoticeGroupOps(duration: NoticeGroup) {

    def name(other: String): NoticeGroup = {
      duration.copy(groupName = other)
    }

    def members(list: List[LSymbol]): NoticeGroup = {
      duration.copy(items = list)
    }

    def in(list: List[StarDate]): NoticeGroup = {
      duration.copy(list = list)
    }
  }

  def noticesGroup: NoticeGroup = NoticeGroup()
}
