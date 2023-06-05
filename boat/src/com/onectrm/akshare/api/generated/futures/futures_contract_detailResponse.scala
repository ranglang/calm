package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_contract_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_contract_detail 目标地址:
  * https://finance.sina.com.cn/futures/quotes/V2101.shtml 描述: 新浪财经-期货-期货合约详情数据 限量: 单次返回指定 symbol
  * 的合约详情数据
  */
case class Respfutures_contract_detailResponse(
  `p_item`: String,
  `p_value`: String
)

case class futures_contract_detailResponse(
  `p_item`: String,
  `p_value`: String
)

trait Json_futures_contract_detailResponse {

  implicit val a_futures_contract_detailResponse = new Decoder[futures_contract_detailResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_contract_detailResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_item <- c.downField("item").as[String]

        p_value <- c.downField("value").as[String]

      } yield {
        futures_contract_detailResponse(
          p_item,
          p_value
        )
      }
  }

}

object JsonItem_futures_contract_detailResponse extends Json_futures_contract_detailResponse
