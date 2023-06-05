package com.lqiong.model.order

import io.circe.generic.JsonCodec

@JsonCodec
case class OptionItem(
  productName: String,
  code: String,
  price: Double,
  exercisePrice: Double,
  amount: Long
)
