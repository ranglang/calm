package com.lqiong.jep

import com.lqiong.jep.entry.LStockItem
import io.getquill.ast.BooleanOperator.&&
import io.getquill.ast.NumericOperator.>
import org.ta4j.core.BaseBarSeries

case class Found(index: Int = 0, count: Int = 0)

case class FoundResult(ok: Boolean = false, count: Int = 0)

object StockSelector {

  def get5LianYang(sorted: BaseBarSeries, day: Int, seek: Int) = {
    val a = sorted.getBarCount

    if (a + 1 <= day) {
      FoundResult()
    } else {
      val r = List
        .range(a - day, a)
        .foldLeft(Found())((p, current) => {
          val previousITem = sorted.getBar(current - 1)
          val item = sorted.getBar(current)
          if (p.count > seek) {
            if (
              item.getClosePrice.isGreaterThan(
                previousITem.getClosePrice
              ) && p.index + 1 == current
            ) {
              Found(index = current, count = p.count + 1)
            } else {
              p
            }
          } else {
            if (item.getClosePrice.isGreaterThan(previousITem.getClosePrice)) {
              Found(index = current, count = p.count + 1)
            } else {
              Found()
            }
          }
        })
      FoundResult(r.count >= seek, r.count)
    }
  }

}
