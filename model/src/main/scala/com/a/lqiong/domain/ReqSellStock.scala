package com.lqiong.domain

import io.circe.generic.JsonCodec

@JsonCodec
case class ReqSellStock(
  contractId: String,
  stockSymbol: String
)

@JsonCodec
case class ReqSellContract(
  contractId: String
)
