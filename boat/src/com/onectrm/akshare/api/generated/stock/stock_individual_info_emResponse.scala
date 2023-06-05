package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_individual_info_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_individual_info_em 目标地址:
  * http://quote.eastmoney.com/concept/sh603777.html?from=classic 描述: 东方财富-个股-股票信息 限量: 单次返回指定 symbol
  * 的个股信息
  */
case class Respstock_individual_info_emResponse(
  `p_item`: String,
  `p_value`: String
)

case class stock_individual_info_emResponse(
  `p_item`: String,
  `p_value`: String
)

trait Json_stock_individual_info_emResponse {

  implicit val a_stock_individual_info_emResponse = new Decoder[stock_individual_info_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_individual_info_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_item <- c.downField("item").as[String]

        p_value <- c.downField("value").as[String]

      } yield {
        stock_individual_info_emResponse(
          p_item,
          p_value
        )
      }
  }

}

object JsonItem_stock_individual_info_emResponse extends Json_stock_individual_info_emResponse
