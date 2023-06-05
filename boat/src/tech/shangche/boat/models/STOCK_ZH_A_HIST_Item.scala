package tech.shangche.boat.models

import com.lqiong.jep.models.StockHotPrice1

case class STOCK_ZH_A_HIST_Item(
  `日期`: String,
  `开盘`: Double,
  `收盘`: Double,
  `最高`: Double,
  `最低`: Double,
  `成交量`: Double,
  `成交额`: Double,
  `振幅`: Double,
  `涨跌幅`: Double,
  `涨跌额`: Double,
  `换手率`: Double
) {

  def universal(): StockHotPrice1 = {
    import io.scalaland.chimney.dsl._
    this
      .into[StockHotPrice1]
      .withFieldRenamed(_.`开盘`, _.open)
      .withFieldRenamed(_.`收盘`, _.close)
      .withFieldRenamed(_.`最高`, _.high)
      .withFieldRenamed(_.`最低`, _.low)
      .withFieldRenamed(_.`成交量`, _.volume)
      .withFieldRenamed(_.`成交额`, _.mount)
      .withFieldRenamed(_.`收盘`, _.price)
      .withFieldRenamed(_.`日期`, _.date)
      .transform
  }
}
