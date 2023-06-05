package com.lqiong.model.order

import _root_.enumeratum.{CirceEnum, EnumEntry, _}

sealed trait OrderCommand extends EnumEntry with EnumEntry.Lowercase

object OrderCommand extends Enum[OrderCommand] with CirceEnum[OrderCommand] {
  case object commandBuy extends OrderCommand
  case object commandSell extends OrderCommand

  val values = findValues
}

sealed trait OrderPriceType extends EnumEntry with EnumEntry.Lowercase

object OrderPriceType extends Enum[OrderPriceType] with CirceEnum[OrderPriceType] {
  case object restrict extends OrderPriceType
  case object market extends OrderPriceType
  val values = findValues
}
