package com.lqiong.claim.actor

import com.lqiong.jep.entry.JsonDateTime
import com.lqiong.model.StockSymbol
import io.circe.generic.JsonCodec
import org.joda.time.DateTime

@JsonCodec
case class BuyPreviewStock(
  stock: StockSymbol,
  name: String,
  total: Double = 999999999
)

@JsonCodec
case class ShameStockPState(
  price: Double,
  code: String = "",
  name: Option[String] = Option.empty[String],
  currentPrice: Option[Double],
  priceUpdateAt: Option[DateTime],
  chaodie: Option[Double]
)

object ShameStockPState extends JsonDateTime
