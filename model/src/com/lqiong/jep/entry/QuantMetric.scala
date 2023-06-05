package com.lqiong.jep.entry
import enumeratum._
import enumeratum.{CirceEnum, EnumEntry}
import org.joda.time.DateTime

sealed trait QuantMetric extends EnumEntry

case object QuantMetric extends Enum[QuantMetric] with CirceEnum[QuantMetric] {
  case object chaodiePanMing extends QuantMetric
  case object chaodieZhishu extends QuantMetric
  case object symbolPrice extends QuantMetric
  val values = findValues
}

object QuantMetricFormatter {
  def getLabel(n: QuantMetric): String = {
    n match {
      case QuantMetric.chaodieZhishu  => "超跌指数"
      case QuantMetric.chaodiePanMing => "判明指数"
      case QuantMetric.symbolPrice    => "价格"
      case _                          => n.entryName
    }
  }

  def getTime(date: Option[DateTime]): DateTime = {
    val d = date.getOrElse(DateFormat.fromString("2022-01-01"))
    d
  }
}
