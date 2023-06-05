package com.lqiong.claim.test

import com.lqiong.jep.entry.StockChaoDie
import com.lqiong.jep.models.{StockHotPrice, StockHotPrice1}
import com.lqiong.model.{IndexSymbol, ItemPrice, JiJinSymbol, StockSymbol, StockTrait}
import org.joda.time.DateTime

class StockImpl1() extends StockTrait {
//  override def getJqCode(code: String): String = ???

//  override def getJqPrePrice(code: String): Double = ???

  override def getCodeName(code: String): String = ???

  override def getSwIndexName(code: String): String = ???

  override def getFundName(code: String): String = ???

  override def getUsaName(code: String): String = ???

  override def getDayChaodie(code: String, date: Option[DateTime]): Double = ???

  override def getDayChaodieList(
    code: String,
    date: Option[DateTime]
  ): List[StockChaoDie] = ???

  override def getPriceSince(code: String, day: Int): Double = ???

  override def getFundSince(code: JiJinSymbol): List[ItemPrice] = ???

  override def getStockPrices(code: StockSymbol): List[ItemPrice] = ???

//  override def getPanMing(code: String): List[Double] = ???

  override def getConvertibleName(code: String): String = ???

  override def getOptionCode(l: String): String = ???

  override def getHkItemName(code: String): String = ???

  override def getPrice(code: String): StockHotPrice1 = ???

  override def indexGetPrice(code: String): StockHotPrice1 = ???

  override def getPanming(code: String): Double = ???
}
