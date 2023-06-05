package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_hk_trade_diff_ratioResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_hk_trade_diff_ratio 目标地址:
  * https://data.eastmoney.com/cjsj/foreign_8_7.html 描述: 东方财富-经济数据一览-中国香港-香港商品贸易差额年率 限量: 单次返回所有历史数据
  */
case class Respmacro_china_hk_trade_diff_ratioResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

case class macro_china_hk_trade_diff_ratioResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

trait Json_macro_china_hk_trade_diff_ratioResponse {

  implicit val a_macro_china_hk_trade_diff_ratioResponse =
    new Decoder[macro_china_hk_trade_diff_ratioResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_hk_trade_diff_ratioResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shi2jian1 <- c.downField("时间").as[String]

          p_qian2zhi2 <- c.downField("前值").as[Double]

          p_xian4zhi2 <- c.downField("现值").as[Double]

          p_fa1bu4ri4qi1 <- c.downField("发布日期").as[String]

        } yield {
          macro_china_hk_trade_diff_ratioResponse(
            p_shi2jian1,
            p_qian2zhi2,
            p_xian4zhi2,
            p_fa1bu4ri4qi1
          )
        }
    }

}

object JsonItem_macro_china_hk_trade_diff_ratioResponse
    extends Json_macro_china_hk_trade_diff_ratioResponse
