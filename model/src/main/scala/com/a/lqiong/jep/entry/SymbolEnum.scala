package com.lqiong.jep.entry

import enumeratum._

sealed trait SymbolEnum extends EnumEntry

case object SymbolEnum extends Enum[SymbolEnum] with CirceEnum[SymbolEnum] {

  case object empty extends SymbolEnum
  case object stock extends SymbolEnum
  case object index extends SymbolEnum
  case object jijin extends SymbolEnum
  case object usa extends SymbolEnum
  case object block extends SymbolEnum
  case object uk extends SymbolEnum
  case object convertible extends SymbolEnum
  case object bk extends SymbolEnum
  case object option extends SymbolEnum

  val values = findValues
}
