package com.lqiong.model.order

//(日期: String,开盘: String,最高: String,最低: String,收盘: String,成交量: String
case class OptionPrice(
  date: String,
  open: Double,
  high: Double,
  low: Double,
  close: Double,
  volume: Double
)
