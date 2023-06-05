package com.lqiong.model.order

import com.lqiong.model.StockSymbol
import io.circe.generic.{AutoDerivation, JsonCodec}

@JsonCodec
case class StockOrder(
  symbol: StockSymbol,
  direction: OrderCommand,
  priceType: Option[OrderPriceType] = Option.empty[OrderPriceType],
  amountOpt: Option[Int] = Option.empty[Int],
  val priceOpt: Option[Double] = Option.empty[Double],
  val channel: String = ""
)

object StockOrder extends AutoDerivation
