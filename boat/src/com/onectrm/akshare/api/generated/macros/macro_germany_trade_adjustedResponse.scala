package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_germany_trade_adjustedResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_germany_trade_adjusted 目标地址:
  * http://data.eastmoney.com/cjsj/foreign_1_3.html 描述: 获取贸易帐(季调后) 限量: 单次返回所有历史数据
  */
case class Respmacro_germany_trade_adjustedResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

case class macro_germany_trade_adjustedResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

trait Json_macro_germany_trade_adjustedResponse {

  implicit val a_macro_germany_trade_adjustedResponse =
    new Decoder[macro_germany_trade_adjustedResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_germany_trade_adjustedResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shi2jian1 <- c.downField("时间").as[String]

          p_qian2zhi2 <- c.downField("前值").as[Double]

          p_xian4zhi2 <- c.downField("现值").as[Double]

          p_fa1bu4ri4qi1 <- c.downField("发布日期").as[String]

        } yield {
          macro_germany_trade_adjustedResponse(
            p_shi2jian1,
            p_qian2zhi2,
            p_xian4zhi2,
            p_fa1bu4ri4qi1
          )
        }
    }

}

object JsonItem_macro_germany_trade_adjustedResponse
    extends Json_macro_germany_trade_adjustedResponse
