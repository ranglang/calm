package com.lqiong.model.order

import _root_.enumeratum._

sealed trait EnumSyncOption extends EnumEntry with EnumEntry.Lowercase

object EnumSyncOption extends Enum[EnumSyncOption] with CirceEnum[EnumSyncOption] {
  case object observeGroup extends EnumSyncOption
  case object holdOption1 extends EnumSyncOption
  case object couldOption1 extends EnumSyncOption
  case object options1 extends EnumSyncOption

  val values = findValues
}
