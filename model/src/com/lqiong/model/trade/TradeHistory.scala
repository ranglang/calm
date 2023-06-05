package com.lqiong.model.trade

import com.lqiong.jep.entry.JsonDateTime
import com.lqiong.model.order.OrderCommand
import io.circe.generic.JsonCodec
import org.joda.time.DateTime

@JsonCodec
case class TradeHistory(
  direction: OrderCommand,
  tradeAmount: Int = 0,
  price: Double = 0,
  tradeMoney: Option[Double] = Option.empty[Double],
  dateTime: Option[DateTime] = Option.empty[DateTime],
  info: Option[String] = Option.empty[String]
)

object TradeHistory extends JsonDateTime
