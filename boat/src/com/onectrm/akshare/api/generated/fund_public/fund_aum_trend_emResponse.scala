package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_aum_trend_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_aum_trend_em 目标地址: http://fund.eastmoney.com/Company/default.html 描述:
  * 天天基金网-基金数据-市场全部基金规模走势 限量: 单次返回所有市场全部基金规模走势数据
  */
case class Respfund_aum_trend_emResponse(
  `p_date`: String,
  `p_value`: Double
)

case class fund_aum_trend_emResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_fund_aum_trend_emResponse {

  implicit val a_fund_aum_trend_emResponse = new Decoder[fund_aum_trend_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_aum_trend_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        fund_aum_trend_emResponse(
          p_date,
          p_value
        )
      }
  }

}

object JsonItem_fund_aum_trend_emResponse extends Json_fund_aum_trend_emResponse
