package com.lqiong.model.order

import java.util.Date

//净值日期    单位净值  日增长率
//0     2011-09-21  1.0000     0
//1     2011-09-23  1.0000     0
//code: String,
case class FundDateList(
  date: Date,
  price: Double,
  change_pct: Double
)
