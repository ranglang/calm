package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_etf_fund_daily_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_etf_fund_daily_em 目标地址: http://fund.eastmoney.com/cnjy_dwjz.html 描述:
  * 东方财富网站-天天基金网-基金数据-场内交易基金-实时数据, 此接口数据每个交易日 **16:00～23:00** 限量: 单次返回当前时刻所有数据
  */
case class Respfund_etf_fund_daily_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_lei4xing2`: Double,
  `p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2`: String,
  `p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2`: String,
  `p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2`: String,
  `p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2`: String,
  `p_zeng1zhang3zhi2`: Double,
  `p_zeng1zhang3lu4`: String,
  `p_shi4jia4`: String,
  `p_zhe2jia4lu4`: String
)

case class fund_etf_fund_daily_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_lei4xing2`: Double,
  `p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2`: String,
  `p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2`: String,
  `p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2`: String,
  `p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2`: String,
  `p_zeng1zhang3zhi2`: Double,
  `p_zeng1zhang3lu4`: String,
  `p_shi4jia4`: String,
  `p_zhe2jia4lu4`: String
)

trait Json_fund_etf_fund_daily_emResponse {

  implicit val a_fund_etf_fund_daily_emResponse = new Decoder[fund_etf_fund_daily_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_etf_fund_daily_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_lei4xing2 <- c.downField("类型").as[Double]

        p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2 <- c.downField("当前交易日-单位净值").as[String]

        p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2 <- c.downField("当前交易日-累计净值").as[String]

        p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2 <- c.downField("前一个交易日-单位净值").as[String]

        p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2 <- c.downField("前一个交易日-累计净值").as[String]

        p_zeng1zhang3zhi2 <- c.downField("增长值").as[Double]

        p_zeng1zhang3lu4 <- c.downField("增长率").as[String]

        p_shi4jia4 <- c.downField("市价").as[String]

        p_zhe2jia4lu4 <- c.downField("折价率").as[String]

      } yield {
        fund_etf_fund_daily_emResponse(
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_lei4xing2,
          p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2,
          p_dang1qian2jiao1yi4ri4lei3ji4jing4zhi2,
          p_qian2yi1ge4jiao1yi4ri4dan1wei4jing4zhi2,
          p_qian2yi1ge4jiao1yi4ri4lei3ji4jing4zhi2,
          p_zeng1zhang3zhi2,
          p_zeng1zhang3lu4,
          p_shi4jia4,
          p_zhe2jia4lu4
        )
      }
  }

}

object JsonItem_fund_etf_fund_daily_emResponse extends Json_fund_etf_fund_daily_emResponse
