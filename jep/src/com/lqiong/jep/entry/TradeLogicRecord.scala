package com.lqiong.jep.entry

import com.lqiong.model.trade.{LogicPeriod, TradeHistory}
import io.circe.generic.JsonCodec

@JsonCodec
case class TradeLogicRecord(
  code: String,
  name: String,
  step: LogicPeriod,
  logic: Option[String],
  strategyName: Option[String],
  history: List[TradeHistory]
)
