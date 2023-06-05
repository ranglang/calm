package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_change_nameResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_change_name 目标地址:
  * http://vip.stock.finance.sina.com.cn/corp/go.php/vCI_CorpInfo/stockid/300378.phtml 描述:
  * 新浪财经-股票曾用名 限量: 单次指定 symbol 的所有历史曾用名称
  */
case class Respstock_info_change_nameResponse(
  `p_index`: Integer,
  `p_name`: String
)

case class stock_info_change_nameResponse(
  `p_index`: Integer,
  `p_name`: String
)

trait Json_stock_info_change_nameResponse {

  implicit val a_stock_info_change_nameResponse = new Decoder[stock_info_change_nameResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_change_nameResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_index <- c.downField("index").as[Integer]

        p_name <- c.downField("name").as[String]

      } yield {
        stock_info_change_nameResponse(
          p_index,
          p_name
        )
      }
  }

}

object JsonItem_stock_info_change_nameResponse extends Json_stock_info_change_nameResponse
