package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_ipo_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_ipo_info 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vISSUE_NewStock/stockid/600004.phtml 描述:
  * 新浪财经-发行与分配-新股发行 限量: 单次获取新股发行的基本信息数据
  */
case class Respstock_ipo_infoResponse(
  `p_item`: String,
  `p_value`: String
)

case class stock_ipo_infoResponse(
  `p_item`: String,
  `p_value`: String
)

trait Json_stock_ipo_infoResponse {

  implicit val a_stock_ipo_infoResponse = new Decoder[stock_ipo_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_ipo_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_item <- c.downField("item").as[String]

        p_value <- c.downField("value").as[String]

      } yield {
        stock_ipo_infoResponse(
          p_item,
          p_value
        )
      }
  }

}

object JsonItem_stock_ipo_infoResponse extends Json_stock_ipo_infoResponse
