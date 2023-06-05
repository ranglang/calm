package com.lqiong.a

import enumeratum._
import enumeratum.{CirceEnum, _}
import sttp.tapir.codec.enumeratum.TapirCodecEnumeratum

sealed abstract class PigSymbol(override val entryName: String) extends EnumEntry

object PigSymbol extends Enum[PigSymbol] with CirceEnum[PigSymbol] with TapirCodecEnumeratum {

  val values = findValues

  case object ZhurouPifa extends PigSymbol("猪肉批发价")
  case object Alaska extends PigSymbol("猪肉批发价1")
}
