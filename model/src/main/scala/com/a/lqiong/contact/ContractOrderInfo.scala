package com.lqiong.contact

import io.circe.generic.JsonCodec

@JsonCodec
case class StockSellNote(
  name: String,
  important: Boolean
)

case class CheckStockSellNoteItem(
  name: String,
  list: List[StockSellNote]
)

@JsonCodec
case class ContractOrderInfo(
  codeName: String,
  code: String,
  entrustId: String,
  entrust: Option[String],
  finalPrice: Option[String],
  volume: Int,
  direction: String,
  state: Option[String]
)

@JsonCodec
case class ContractOrderItem(
  contractId: String,
  contractList: List[ContractOrderInfo]
)

@JsonCodec
case class ContractDetailStockList(
  name: String,
  contractId: String,
  stockOrderVOList: List[ContractOrderInfo]
)
