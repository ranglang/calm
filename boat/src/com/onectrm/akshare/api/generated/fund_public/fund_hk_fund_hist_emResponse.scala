package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_hk_fund_hist_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_hk_fund_hist_em 目标地址:
  * http://overseas.1234567.com.cn/f10/FundJz/968092#FHPS 描述: 东方财富网站-天天基金网-基金数据-香港基金-历史净值明细 限量:
  * 单次返回指定 code 和 symbol 所有历史数据
  */
case class Respfund_hk_fund_hist_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4zeng1zhang3zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_dan1wei4`: String
)

case class fund_hk_fund_hist_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4zeng1zhang3zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_dan1wei4`: String
)

trait Json_fund_hk_fund_hist_emResponse {

  implicit val a_fund_hk_fund_hist_emResponse = new Decoder[fund_hk_fund_hist_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_hk_fund_hist_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jing4zhi2ri4qi1 <- c.downField("净值日期").as[String]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

        p_ri4zeng1zhang3zhi2 <- c.downField("日增长值").as[Double]

        p_ri4zeng1zhang3lu4 <- c.downField("日增长率").as[Double]

        p_dan1wei4 <- c.downField("单位").as[String]

      } yield {
        fund_hk_fund_hist_emResponse(
          p_jing4zhi2ri4qi1,
          p_dan1wei4jing4zhi2,
          p_ri4zeng1zhang3zhi2,
          p_ri4zeng1zhang3lu4,
          p_dan1wei4
        )
      }
  }

}

object JsonItem_fund_hk_fund_hist_emResponse extends Json_fund_hk_fund_hist_emResponse
