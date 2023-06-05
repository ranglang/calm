package com.lqiong.jep.option

import enumeratum.values.{StringCirceEnum, StringEnum, StringEnumEntry}

//class AB {

sealed abstract class OptionBkName(val value: String) extends StringEnumEntry

case object OptionBkName extends StringEnum[OptionBkName] with StringCirceEnum[OptionBkName] {
  case object hangye extends OptionBkName(value = "北向资金增持行业板块排行")
  case object gainian extends OptionBkName(value = "北向资金增持概念板块排行")
  case object diqu extends OptionBkName(value = "北向资金增持地域板块排行")

  val values = findValues

}

sealed abstract class BlockPeriodType(val value: String) extends StringEnumEntry

case object BlockPeriodType
    extends StringEnum[BlockPeriodType]
    with StringCirceEnum[BlockPeriodType] {
  case object day_5 extends BlockPeriodType(value = "5日")
  case object month_1 extends BlockPeriodType(value = "1月")
  val values = findValues
}
