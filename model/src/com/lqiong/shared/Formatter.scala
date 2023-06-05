package com.lqiong.shared

object Formatter {

  def getPercent(price: Double): String = {
    (price * 100).formatted("%.2f")
  }

  def getPercentFormat(price: Double): String = {
    s"${(price * 100).formatted("%.2f")}%"
  }
}
