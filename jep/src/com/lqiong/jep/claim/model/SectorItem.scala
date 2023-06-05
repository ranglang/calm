package com.lqiong.jep.claim.model

import java.util.Date

case class YjbgItem(
  code: String,
  name: String,
  jlr: Double
//                     jlrtbzz: Double,
//                     jlrtjdhb: Double,
//                     mgjzc: Double,
//                     jzcsyl: Double,
//                     mgjyxjl: Double,
//                     yysr: Double,
//                     yysrtbzz: Double,
//                     yysrjdhbzz: Double,
)

case class YjYgItem(
  code: String,
  pubdate: Date,
  forcastname: Option[String],
  changepercent: Double,
  changereason: Option[String],
  changetype: String,
  name: String
)

case class EarnForcastItem(
  code: String,
  name: String,
  y2021: Option[Double],
  y2022: Option[Double],
  y2023: Option[Double]
//                   y2024: Option[Double] = Option.empty[Double],
//                   y2025: Option[Double],
//                   y2026: Option[Double],
//                   y2027: Option[Double],
)
case class SectorItem(
  label: String,
  name: String,
  stock_count: Int,
  avg_price: Double,
  //    涨跌额
//    changePrice: Double,
  //    总成交量(手)
  order_count: Double,
  //    总成交额(万元)
  order_amount: Double,
  //    股票代码
  simple_code: String,
  //    涨跌幅
//    change_percent: Double,
  //    当前价
  current_price: Double,
  code_name: String
  //    涨跌额   股票名称
  //    label    板块 公司家数
  //    平均价格
  //    涨跌幅
)
