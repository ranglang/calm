package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_etf_fund_info_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_etf_fund_info_em 目标地址: http://fundf10.eastmoney.com/jjjz_004186.html
  * 描述: 东方财富网站-天天基金网-基金数据-场内交易基金-历史净值数据 限量: 单次返回当前时刻所有历史数据
  */
case class Respfund_etf_fund_info_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_lei3ji4jing4zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String
)

case class fund_etf_fund_info_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_lei3ji4jing4zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String
)

trait Json_fund_etf_fund_info_emResponse {

  implicit val a_fund_etf_fund_info_emResponse = new Decoder[fund_etf_fund_info_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_etf_fund_info_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jing4zhi2ri4qi1 <- c.downField("净值日期").as[String]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

        p_lei3ji4jing4zhi2 <- c.downField("累计净值").as[Double]

        p_ri4zeng1zhang3lu4 <- c.downField("日增长率").as[Double]

        p_shen1gou4zhuang4tai4 <- c.downField("申购状态").as[String]

        p_shu2hui2zhuang4tai4 <- c.downField("赎回状态").as[String]

      } yield {
        fund_etf_fund_info_emResponse(
          p_jing4zhi2ri4qi1,
          p_dan1wei4jing4zhi2,
          p_lei3ji4jing4zhi2,
          p_ri4zeng1zhang3lu4,
          p_shen1gou4zhuang4tai4,
          p_shu2hui2zhuang4tai4
        )
      }
  }

}

object JsonItem_fund_etf_fund_info_emResponse extends Json_fund_etf_fund_info_emResponse
