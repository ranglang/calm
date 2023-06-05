package com.lqiong.jep.models

//时间     开盘     收盘     最高     最低    成交量         成交额     最新价
case class StockHotPrice(
  date: java.sql.Timestamp,
  price: Double,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double,
  mount: Double
) {

  def isTradeOk = {
    Math.abs(open - close) / open > -0.05
  }
}

case class StockHotPrice1(
  date: String,
  price: Double,
  open: Double,
  close: Double,
  high: Double,
  low: Double,
  volume: Double,
  mount: Double
) {
  def isTradeOk = {
    Math.abs(open - close) / open > -0.05
  }
}
