package com.lqiong.jep.claim.model

case class SectorDetailItem(
  symbol: String,
  code: String,
  name: String,
  ticktime: String,
  trade: Double,
//    pricechange: Double,
  changepercent: Double,
//    buy: Double,
//    sell: Double,
//    settlement: Double,
//    open: Double,
//    high: Double,
//    low: Double,
//    volume: Double,
//    amount: Double,
  per: Double,
  pb: Double
//    mktcap: Double,
//    nmc: Double,
//    turnoverratio: Double
)
