package com.onectrm.akshare.api.generated.currency;

import com.onectrm.akshare.api.generated.currency.currency_time_seriesResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: currency 接口: currency_time_series 目标地址: https://currencyscoop.com/ 描述: 获取货币报价时间序列数据 限量:
  * 单次返回指定货币在指定交易日到另一指定交易日的报价数据-免费账号每月限量访问 5000 次
  */
case class Respcurrency_time_seriesResponse(
  `p_date`: String,
  `p_base`: Double,
  `p_rates`: String
)

case class currency_time_seriesResponse(
  `p_date`: String,
  `p_base`: Double,
  `p_rates`: String
)

trait Json_currency_time_seriesResponse {

  implicit val a_currency_time_seriesResponse = new Decoder[currency_time_seriesResponse] {
    final def apply(c: HCursor): Decoder.Result[currency_time_seriesResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_base <- c.downField("base").as[Double]

        p_rates <- c.downField("rates").as[String]

      } yield {
        currency_time_seriesResponse(
          p_date,
          p_base,
          p_rates
        )
      }
  }

}

object JsonItem_currency_time_seriesResponse extends Json_currency_time_seriesResponse
