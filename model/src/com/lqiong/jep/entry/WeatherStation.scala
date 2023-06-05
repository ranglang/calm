package com.lqiong.jep.entry

import io.circe.generic.JsonCodec
import io.circe.{Decoder, Encoder, Json}
import org.joda.time.DateTime
import org.joda.time.format.{DateTimeFormatter, ISODateTimeFormat}

import java.util.Date
import scala.util.Try

trait JsonDateTime {

  private val parserISO: DateTimeFormatter =
    ISODateTimeFormat.dateTimeNoMillis()

  implicit val dateWithoutMillisDecoder: Decoder[Date] =
    Decoder[String].emapTry(str => Try(parserISO.parseDateTime(str).toDate)) or Decoder[Long]
      .emapTry(r => Try(new java.util.Date(r)))

  implicit val dateWithoutMillisEncoder1: Encoder[java.sql.Timestamp] =
    new Encoder[java.sql.Timestamp] {
      override def apply(a: java.sql.Timestamp): Json =
        Encoder.encodeLong.apply(a.getTime)
    }

  implicit val dateWithoutMillisEncoder: Encoder[java.util.Date] =
    new Encoder[java.util.Date] {
      override def apply(a: java.util.Date): Json =
        Encoder.encodeLong.apply(a.getTime)
    }

  implicit val dateTimeWithoutMillisDecoder: Decoder[DateTime] =
    Decoder[String].emapTry(str => Try(parserISO.parseDateTime(str))) or Decoder[Long].emapTry(r =>
      Try(new DateTime(r))
    )

  implicit val dateTimeWithoutMillisEncoder: Encoder[DateTime] =
    new Encoder[DateTime] {
      override def apply(a: DateTime): Json =
        Encoder.encodeLong.apply(a.getMillis)
    }

}

trait JsonDate {
  implicit val dateWithoutMillisDecoder: Decoder[Date] =
    Decoder[Long].emapTry(r => Try(new Date(r)))

  implicit val dateWithoutMillisEncoder: Encoder[Date] =
    new Encoder[Date] {
      override def apply(a: Date): Json =
        Encoder.encodeLong.apply(a.getTime)
    }
}

case class IndexDailyPrice(
  date: java.sql.Timestamp,
  close: Double,
  open: Double,
  high: Double,
  low: Double,
  volume: Double
)

@JsonCodec
case class WeatherStation1(
  date: DateTime,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double,
  turnover: Double,
  outstanding_share: Double
)
object WeatherStation1 extends JsonDateTime

@JsonCodec
case class HkItem(
  symbol: String,
  name: String,
  engname: String,
  tradetype: String,
  lasttrade: String,
  prevclose: String,
  open: String,
  high: String,
  low: String,
  volume: String,
  amount: String,
  ticktime: String,
  buy: String,
  sell: String,
  pricechange: String,
  changepercent: String
)

case class StockChaoDie(date: java.util.Date, chaodie: Double)

@JsonCodec
case class StockChaoDieJoda(date: DateTime, chaodie: Double)
object StockChaoDieJoda extends JsonDateTime

@JsonCodec
case class RetStockChaoDie(records: List[StockChaoDieJoda], code: Int = 2001)

@JsonCodec
case class RetIndexItem(code: String, name: String)

@JsonCodec
case class IndexDailyPriceJodata(
  date: DateTime,
  close: Double,
  volume: Double,
  open: Double,
  high: Double,
  low: Double
)
object IndexDailyPriceJodata extends JsonDateTime

@JsonCodec
case class RetIndexPrice(records: List[IndexDailyPriceJodata], code: Int = 2001)
object RetIndexPrice extends JsonDateTime

@JsonCodec
case class RetStock(records: List[WeatherStation1], code: Int = 2001)
