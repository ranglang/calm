package com.lqiong.jep.entry

import com.lqiong.model.StockSymbol

case class StockPortfolio(stock: StockSymbol, count: Int)

case class PortfolioGroup(
  name: String,
  list: List[StockPortfolio] = List.empty[StockPortfolio]
)
