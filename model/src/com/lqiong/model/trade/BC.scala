package com.lqiong.model.trade

import com.lqiong.model.order.OrderPriceType.findValues
import enumeratum.{CirceEnum, Enum, EnumEntry}

sealed trait OrderPriceType extends EnumEntry with EnumEntry.Lowercase

object OrderPriceType extends Enum[OrderPriceType] with CirceEnum[OrderPriceType] {
  case object restrict extends OrderPriceType
  case object market extends OrderPriceType
  val values = findValues
}

sealed trait LogicPeriod extends EnumEntry with EnumEntry.Lowercase

object LogicPeriod extends Enum[LogicPeriod] with CirceEnum[LogicPeriod] {
  case object clue extends LogicPeriod
  case object interst extends LogicPeriod
  case object bought extends LogicPeriod
  case object start extends LogicPeriod
  case object middle extends LogicPeriod
  case object sell extends LogicPeriod
  case object end extends LogicPeriod
  val values = findValues
}
