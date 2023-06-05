package com.onectrm.akshare.api.generated.currency;

import com.onectrm.akshare.api.generated.currency.currency_convertResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: currency 接口: currency_convert 目标地址: https://currencyscoop.com/ 描述: 获取指定货币对指定货币数量的转换后价格 限量:
  * 单次返回指定货币对的转换后价格-免费账号每月限量访问 5000 次
  */
case class Respcurrency_convertResponse(
  `p_currencyname`: String,
  `p_currencycode`: String,
  `p_decimalunits`: Integer,
  `p_countries`: String
)

case class currency_convertResponse(
  `p_currencyname`: String,
  `p_currencycode`: String,
  `p_decimalunits`: Integer,
  `p_countries`: String
)

trait Json_currency_convertResponse {

  implicit val a_currency_convertResponse = new Decoder[currency_convertResponse] {
    final def apply(c: HCursor): Decoder.Result[currency_convertResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_currencyname <- c.downField("currency_name").as[String]

        p_currencycode <- c.downField("currency_code").as[String]

        p_decimalunits <- c.downField("decimal_units").as[Integer]

        p_countries <- c.downField("countries").as[String]

      } yield {
        currency_convertResponse(
          p_currencyname,
          p_currencycode,
          p_decimalunits,
          p_countries
        )
      }
  }

}

object JsonItem_currency_convertResponse extends Json_currency_convertResponse
