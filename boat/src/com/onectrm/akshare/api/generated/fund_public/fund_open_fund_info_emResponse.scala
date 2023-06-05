package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_open_fund_info_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_open_fund_info_em 目标地址:
  * http://fund.eastmoney.com/pingzhongdata/710001.js 描述: 东方财富网-天天基金网-基金数据-具体基金信息 限量:
  * 单次返回当前时刻所有历史数据, 在查询基金数据的时候注意基金前后端问题
  */
case class Respfund_open_fund_info_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double
)

case class fund_open_fund_info_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double
)

trait Json_fund_open_fund_info_emResponse {

  implicit val a_fund_open_fund_info_emResponse = new Decoder[fund_open_fund_info_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_open_fund_info_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jing4zhi2ri4qi1 <- c.downField("净值日期").as[String]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

        p_ri4zeng1zhang3lu4 <- c.downField("日增长率").as[Double]

      } yield {
        fund_open_fund_info_emResponse(
          p_jing4zhi2ri4qi1,
          p_dan1wei4jing4zhi2,
          p_ri4zeng1zhang3lu4
        )
      }
  }

}

object JsonItem_fund_open_fund_info_emResponse extends Json_fund_open_fund_info_emResponse
