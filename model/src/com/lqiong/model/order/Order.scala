package com.lqiong.model.order

import com.lqiong.model.StockSymbol
import com.lqiong.model.order.OrderPriceType.restrict
import com.lqiong.model.symbol.codesyntax

object order extends codesyntax {

  implicit class DurationOps(duration: StockOrder) {
    def quickly: StockOrder = {
      duration.copy(priceType = Some(OrderPriceType.market))
    }

    def via(code: String): StockOrder = {
      duration.copy(channel = code)
    }

    def code(other: StockSymbol): StockOrder = {
      duration.copy(symbol = other)
    }

    def rmb(price: Double): StockOrder = {
      duration.copy(priceOpt = Some(price), priceType = Some(restrict))
    }

    def amount(amount: Int): StockOrder = {
      duration.copy(amountOpt = Some(amount))
    }
  }

  // 获取当天涨幅......
  val sell: StockOrder =
    StockOrder(StockSymbol(""), direction = OrderCommand.commandSell)
  val buy: StockOrder =
    StockOrder(StockSymbol(""), direction = OrderCommand.commandBuy)
}
