package com.lqiong.jep.option

case class VegaOption(
  code: String,
  contract_num: String,
  short_name: String,
  delta: Double,
  volume: Double,
  gamma: Double,
  vega: Double,
  theta: Double,
  embedded_value: Double,
  vix: Double,
  exercise_price: Double,
  new_price: Double
)
