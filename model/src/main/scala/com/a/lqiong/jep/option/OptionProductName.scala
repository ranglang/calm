package com.lqiong.jep.option

import enumeratum.values._

sealed abstract class OptionProductName(val value: String) extends StringEnumEntry

case object OptionProductName
    extends StringEnum[OptionProductName]
    with StringCirceEnum[OptionProductName] {
  case object HX50 extends OptionProductName(value = "华夏上证50ETF期权")
  case object HT300 extends OptionProductName(value = "华泰柏瑞沪深300ETF期权")

  val values = findValues

}
//
//CirceLibraryItem.values.foreach { item =>
//assert(item.asJson == Json.fromInt(item.value))
//}

//trait EnumOptionName extends Enumeration {
//  type EnumOptionName = Value
//  val ETF_50 = Value("华夏上证50ETF期权")
//  val ETF_300 = Value("华泰柏瑞沪深300ETF期权")
//}
//
//object EnumOptionName extends EnumOptionName

sealed abstract class OptionDirection(val value: String) extends StringEnumEntry

case object OptionDirection
    extends StringEnum[OptionDirection]
    with StringCirceEnum[OptionDirection] {
  case object CALL extends OptionDirection(value = "CALL")
  case object PUT extends OptionDirection(value = "PUT")

  val values = findValues

}
