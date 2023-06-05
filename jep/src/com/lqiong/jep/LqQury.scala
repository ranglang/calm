package com.lqiong.jep

object LqQury {

  def getChangePercent(open: Double, close: Double): Double = {
    (close - open) / open
  }

  def getMedium(list: List[Double]) = {
    if (list.isEmpty) {
      0
    } else {
      list.sortWith((a, b) => a > b)(list.size / 2)
    }
  }
}
