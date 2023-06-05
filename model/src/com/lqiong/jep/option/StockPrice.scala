package com.lqiong.jep.option

import com.lqiong.jep.entry.JsonDateTime
import io.circe.generic.JsonCodec

case class IndexChaodie(`chaodie`: Double, date: String)

case class VIxItem(vix: Double, date: String, skew: Double)

case class PanMingChaoDieItem(chaodie: Double, date: String)

case class PanMingChaoDieItem1(chaodie: Double, date: java.sql.Date)

@JsonCodec
case class PanMingChaoDieItem2(value: Double, date: java.util.Date) {

//  implicit val encoderDateTime: Encoder[DateTime] =ExpressionEncoder()
}

@JsonCodec
case class PanMingChaoDieItem3(value: Double, date: String)

object PanMingChaoDieItem2 extends JsonDateTime

case class VolumeIndicatorItem(bb30: Double, date: java.util.Date)

/** ak share
  * @param code
  * @param open
  * @param close
  * @param high
  * @param low
  */
case class StockCodePrice(
  code: String,
  open: Double,
  close: Double,
  high: Double,
  low: Double
)

case class KeyValueOptionValue(
  date: String,
  up: Double,
  down: Double,
  zhangting: Double,
  dieting: Double,
  rate: String
)

case class Qiangshigu(`名称`: String, `代码`: String, `所属行业`: String)

case class StockPrice(open: Double, close: Double, high: Double, low: Double) {
  def isTradeOk = {
    Math.abs(open - close) / open > -0.05
  }
}

object StockPrice {}
