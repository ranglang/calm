package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_trade_balanceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_trade_balance 目标地址:
  * https://datacenter.jin10.com/reportType/dc_chinese_trade_balance 描述: 获取中国以美元计算贸易帐报告,
  * 数据区间从19810201-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_trade_balanceResponse(
  `p_index`: String,
  `p_value`: Double
)

case class macro_china_trade_balanceResponse(
  `p_index`: String,
  `p_value`: Double
)

trait Json_macro_china_trade_balanceResponse {

  implicit val a_macro_china_trade_balanceResponse =
    new Decoder[macro_china_trade_balanceResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_trade_balanceResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_index <- c.downField("index").as[String]

          p_value <- c.downField("value").as[Double]

        } yield {
          macro_china_trade_balanceResponse(
            p_index,
            p_value
          )
        }
    }

}

object JsonItem_macro_china_trade_balanceResponse extends Json_macro_china_trade_balanceResponse
