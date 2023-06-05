package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_hq_subscribe_exchange_symbolResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_hq_subscribe_exchange_symbol 目标地址:
  * https://finance.sina.com.cn/money/future/hf.html 描述: 新浪财经-外盘商品期货品种代码表数据 限量:
  * 单次返回当前交易日的订阅的所有期货品种的品种代码表数据
  */
case class Respfutures_hq_subscribe_exchange_symbolResponse(
  `p_symbol`: String,
  `p_code`: String
)

case class futures_hq_subscribe_exchange_symbolResponse(
  `p_symbol`: String,
  `p_code`: String
)

trait Json_futures_hq_subscribe_exchange_symbolResponse {

  implicit val a_futures_hq_subscribe_exchange_symbolResponse =
    new Decoder[futures_hq_subscribe_exchange_symbolResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_hq_subscribe_exchange_symbolResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_symbol <- c.downField("symbol").as[String]

          p_code <- c.downField("code").as[String]

        } yield {
          futures_hq_subscribe_exchange_symbolResponse(
            p_symbol,
            p_code
          )
        }
    }

}

object JsonItem_futures_hq_subscribe_exchange_symbolResponse
    extends Json_futures_hq_subscribe_exchange_symbolResponse
