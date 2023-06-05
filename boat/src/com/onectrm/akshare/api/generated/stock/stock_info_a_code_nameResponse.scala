package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_a_code_nameResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_a_code_name 目标地址: 沪深京三个交易所 描述: 沪深京 A 股股票代码和股票简称数据 限量: 单次获取所有 A
  * 股股票代码和简称数据
  */
case class Respstock_info_a_code_nameResponse(
  `p_code`: String,
  `p_name`: String
)

case class stock_info_a_code_nameResponse(
  `p_code`: String,
  `p_name`: String
)

trait Json_stock_info_a_code_nameResponse {

  implicit val a_stock_info_a_code_nameResponse = new Decoder[stock_info_a_code_nameResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_a_code_nameResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_code <- c.downField("code").as[String]

        p_name <- c.downField("name").as[String]

      } yield {
        stock_info_a_code_nameResponse(
          p_code,
          p_name
        )
      }
  }

}

object JsonItem_stock_info_a_code_nameResponse extends Json_stock_info_a_code_nameResponse
