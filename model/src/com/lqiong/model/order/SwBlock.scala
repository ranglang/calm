package com.lqiong.model.order

case class SwBlock(
  code: String,
  name: String,
  close: Double,
  open: Double,
  high: Double,
  low: Double,
  amount: Double,
  price: Double,
  volume: Double
)

//  case class CaseClass (指数代码,指数名称,昨收盘,今开盘,成交额,最高价,最低价,最新价,成交量)
