package com.lqiong.jep.entry

import enumeratum._

import enumeratum._

sealed trait EnumInfoLevel extends EnumEntry

case object EnumInfoLevel extends Enum[EnumInfoLevel] with CirceEnum[EnumInfoLevel] {
  val danger = findValues
  val info = findValues
  val warn = findValues

  val values = findValues
}
