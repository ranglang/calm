package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_value_estimation_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_value_estimation_em 目标地址: http://fund.eastmoney.com/fundguzhi.html 描述:
  * 东方财富网-数据中心-净值估算 限量: 单次返回当前交易日指定 symbol 的所有数据
  */
case class Respfund_value_estimation_emResponse(
  `p_xu4hao4`: Long,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1ming2cheng1`: String,
  `p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2`: Double,
  `p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4`: String,
  `p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2`: Double,
  `p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4`: String,
  `p_gu1suan4pian1cha1`: String,
  `p_jiao1yi4ri4dan1wei4jing4zhi2`: String
)

case class fund_value_estimation_emResponse(
  `p_xu4hao4`: Long,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1ming2cheng1`: String,
  `p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2`: Double,
  `p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4`: String,
  `p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2`: Double,
  `p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4`: String,
  `p_gu1suan4pian1cha1`: String,
  `p_jiao1yi4ri4dan1wei4jing4zhi2`: String
)

trait Json_fund_value_estimation_emResponse {

  implicit val a_fund_value_estimation_emResponse = new Decoder[fund_value_estimation_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_value_estimation_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1ming2cheng1 <- c.downField("基金名称").as[String]

        p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2 <- c.downField("交易日-估算数据-估算值").as[Double]

        p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4 <- c
          .downField("交易日-估算数据-估算增长率")
          .as[String]

        p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2 <- c.downField("交易日-公布数据-单位净值").as[Double]

        p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4 <- c.downField("交易日-公布数据-日增长率").as[String]

        p_gu1suan4pian1cha1 <- c.downField("估算偏差").as[String]

        p_jiao1yi4ri4dan1wei4jing4zhi2 <- c.downField("交易日-单位净值").as[String]

      } yield {
        fund_value_estimation_emResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1ming2cheng1,
          p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zhi2,
          p_jiao1yi4ri4gu1suan4shu4ju4gu1suan4zeng1zhang3lu4,
          p_jiao1yi4ri4gong1bu4shu4ju4dan1wei4jing4zhi2,
          p_jiao1yi4ri4gong1bu4shu4ju4ri4zeng1zhang3lu4,
          p_gu1suan4pian1cha1,
          p_jiao1yi4ri4dan1wei4jing4zhi2
        )
      }
  }

}

object JsonItem_fund_value_estimation_emResponse extends Json_fund_value_estimation_emResponse
