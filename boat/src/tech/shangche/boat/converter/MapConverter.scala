package tech.shangche.boat.converter

import tech.shangche.boat.generic.ToMap
import tech.shangche.boat.models.{ReqIndexItem, ReqStockItem}

object MapConverter {

  def getMap(t: ReqStockItem): Map[String, String] = ToMap(t).asInstanceOf[Map[String, String]]
  def getMapIndex(t: ReqIndexItem): Map[String, String] = ToMap(t).asInstanceOf[Map[String, String]]
}
