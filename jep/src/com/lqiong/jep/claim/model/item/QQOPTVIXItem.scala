package com.lqiong.jep.claim.model.item

import com.lqiong.jep.entry.JsonDateTime
import io.circe.generic.JsonCodec
import org.joda.time.DateTime

@JsonCodec
case class QQOPTVIXItemMinute(
  time: DateTime,
  qvix: Double
)
object QQOPTVIXItemMinute extends JsonDateTime {

  case class QQOPTVIXItemMinute1(
    time: java.sql.Timestamp,
    qvix: Double
  )

//  implicit val encoderDateTime: Encoder[DateTime] =ExpressionEncoder()
//  org.apache.spark.sql.Encoders.
//  DATE[DateTime]
}

@JsonCodec
case class QQOPTVIXItem(
  date: java.util.Date,
  open: Double,
  close: Double,
  high: Double,
  low: Double
)

object QQOPTVIXItem extends JsonDateTime
