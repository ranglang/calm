package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_open_fund_daily_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_open_fund_daily_em 目标地址:
  * http://fund.eastmoney.com/fund.html#os_0;isall_0;ft_;pt_1 描述: 东方财富网-天天基金网-基金数据, 此接口在每个交易日
  * **16:00-23:00** 更新当日的最新开放式基金净值数据 限量: 单次返回当前时刻所有历史数据
  */
case class Respfund_open_fund_daily_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_lei3ji4jing4zhi2`: Double,
  `p_qian2jiao1yi4ri4dan1wei4jing4zhi2`: Double,
  `p_qian2jiao1yi4ri4lei3ji4jing4zhi2`: Double,
  `p_ri4zeng1zhang3zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String,
  `p_shou3xu4fei4`: String
)

case class fund_open_fund_daily_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_lei3ji4jing4zhi2`: Double,
  `p_qian2jiao1yi4ri4dan1wei4jing4zhi2`: Double,
  `p_qian2jiao1yi4ri4lei3ji4jing4zhi2`: Double,
  `p_ri4zeng1zhang3zhi2`: Double,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String,
  `p_shou3xu4fei4`: String
)

trait Json_fund_open_fund_daily_emResponse {

  implicit val a_fund_open_fund_daily_emResponse = new Decoder[fund_open_fund_daily_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_open_fund_daily_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

        p_lei3ji4jing4zhi2 <- c.downField("累计净值").as[Double]

        p_qian2jiao1yi4ri4dan1wei4jing4zhi2 <- c.downField("前交易日-单位净值").as[Double]

        p_qian2jiao1yi4ri4lei3ji4jing4zhi2 <- c.downField("前交易日-累计净值").as[Double]

        p_ri4zeng1zhang3zhi2 <- c.downField("日增长值").as[Double]

        p_ri4zeng1zhang3lu4 <- c.downField("日增长率").as[Double]

        p_shen1gou4zhuang4tai4 <- c.downField("申购状态").as[String]

        p_shu2hui2zhuang4tai4 <- c.downField("赎回状态").as[String]

        p_shou3xu4fei4 <- c.downField("手续费").as[String]

      } yield {
        fund_open_fund_daily_emResponse(
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_dan1wei4jing4zhi2,
          p_lei3ji4jing4zhi2,
          p_qian2jiao1yi4ri4dan1wei4jing4zhi2,
          p_qian2jiao1yi4ri4lei3ji4jing4zhi2,
          p_ri4zeng1zhang3zhi2,
          p_ri4zeng1zhang3lu4,
          p_shen1gou4zhuang4tai4,
          p_shu2hui2zhuang4tai4,
          p_shou3xu4fei4
        )
      }
  }

}

object JsonItem_fund_open_fund_daily_emResponse extends Json_fund_open_fund_daily_emResponse
