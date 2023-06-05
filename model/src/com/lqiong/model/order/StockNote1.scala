package com.lqiong.model.order

import com.lqiong.jep.entry.{EnumInfoLevel, JsonDate, JsonDateTime}
import com.lqiong.model.{GenericDerivation, LSymbol, StockSymbol}
import io.circe.generic.{AutoDerivation, JsonCodec}
import org.joda.time.DateTime

import java.util.Date

case class Contract(
  code: String,
  name: String,
  date: DateTime = DateTime.now
)

//基金代码,基金简称,日增长值,日增长率,申购状态,赎回状态,手续费

case class FundMeta(
  code: String,
  name: String,
  daygrowvalue: String,
  daygrowrate: String,
  claimstatus: String,
  redeemstatus: String,
  changefee: String
  // 基金代码,基金简称,日增长值,日增长率,申购状态,赎回状态,
)

case class ReportDate(
  code: String,
  name: String,
  first: String,
  second: String,
  third: String,
  forth: String,
  real: String
)

case class UsStock(
  name: String,
  cname: String,
  symbol: String
)

@JsonCodec
case class StockNote(
  symbol: LSymbol,
  dateTime: Option[DateTime] = Option.empty[DateTime],
  eventNameOpt: Option[String] = Option.empty[String],
  descriptionOpt: Option[String] = Option.empty[String],
  url: Option[String] = Option.empty[String],
  levelOpt: Option[EnumInfoLevel] = Option.empty[EnumInfoLevel]
) extends JsonDateTime
    with AutoDerivation
    with GenericDerivation {
  override def hashCode: Int = {
    s"index${symbol.getName}".hashCode
  }
}

case class StockNoteDate(
  symbol: LSymbol,
  dateTime: Option[Date] = Option.empty[Date],
  eventNameOpt: Option[String] = Option.empty[String],
  descriptionOpt: Option[String] = Option.empty[String],
  url: Option[String] = Option.empty[String],
  levelOpt: Option[EnumInfoLevel] = Option.empty[EnumInfoLevel]
) extends JsonDate
    with AutoDerivation
    with GenericDerivation {
  override def hashCode: Int = {
    s"code${symbol.code}".hashCode
  }
}

object StockNote extends JsonDateTime with AutoDerivation with GenericDerivation

@JsonCodec
case class RetStockNotes(records: List[StockNote], code: Int = 2001)
    extends JsonDateTime
    with AutoDerivation
    with GenericDerivation
object RetStockNotes extends JsonDateTime with AutoDerivation with GenericDerivation
