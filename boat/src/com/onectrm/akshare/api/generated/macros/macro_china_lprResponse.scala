package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_lprResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_lpr 目标地址: http://data.eastmoney.com/cjsj/globalRateLPR.html 描述: 中国
  * LPR 品种数据, 数据区间从 19910421-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_lprResponse(
  `p_TRADEDATE`: String,
  `p_LPR1Y`: Double,
  `p_LPR5Y`: Double,
  `p_RATE1`: Double,
  `p_RATE2`: Double
)

case class macro_china_lprResponse(
  `p_TRADEDATE`: String,
  `p_LPR1Y`: Double,
  `p_LPR5Y`: Double,
  `p_RATE1`: Double,
  `p_RATE2`: Double
)

trait Json_macro_china_lprResponse {

  implicit val a_macro_china_lprResponse = new Decoder[macro_china_lprResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_lprResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_TRADEDATE <- c.downField("TRADE_DATE").as[String]

        p_LPR1Y <- c.downField("LPR1Y").as[Double]

        p_LPR5Y <- c.downField("LPR5Y").as[Double]

        p_RATE1 <- c.downField("RATE_1").as[Double]

        p_RATE2 <- c.downField("RATE_2").as[Double]

      } yield {
        macro_china_lprResponse(
          p_TRADEDATE,
          p_LPR1Y,
          p_LPR5Y,
          p_RATE1,
          p_RATE2
        )
      }
  }

}

object JsonItem_macro_china_lprResponse extends Json_macro_china_lprResponse
