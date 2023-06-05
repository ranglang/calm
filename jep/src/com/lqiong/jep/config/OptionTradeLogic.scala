package com.lqiong.jep.config

case class OptionTradeRestrict(
  tradingDayInterval: Int

//  qvix:
)

case class UserInput(
  a: Int // TODO 凯利公式 , 推荐仓位
  // 仓位处理
)

case class CurrrentOptionTradeLogic(
  capital: Double,
  history: List[String],
  userInput: UserInput,
  optionTradeRestrict: OptionTradeRestrict,
  usedCapital: Double,
  holds: List[String] = List.empty, // TODO  updateAt  target number  it shouldbejson
  strategyName: String,
  closing: String,
  description: Option[String],
  notification: List[String], // TODO 观察指标。
  watchedIndicator: List[String],
  tradingRestrictions: List[String], // TODO 除外指标。
  nextShot: String = ""
)
