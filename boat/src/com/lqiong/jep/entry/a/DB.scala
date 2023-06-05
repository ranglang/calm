package com.lqiong.jep.entry.a

import com.lqiong.model.order.StockNote
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
