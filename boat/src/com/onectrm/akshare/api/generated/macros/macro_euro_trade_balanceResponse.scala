package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_euro_trade_balanceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_euro_trade_balance 目标地址:
  * https://datacenter.jin10.com/reportType/dc_eurozone_trade_balance_mom 描述: 获取欧元区未季调贸易帐报告,
  * 数据区间从19990201-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_euro_trade_balanceResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

case class macro_euro_trade_balanceResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

trait Json_macro_euro_trade_balanceResponse {

  implicit val a_macro_euro_trade_balanceResponse = new Decoder[macro_euro_trade_balanceResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_euro_trade_balanceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhi2 <- c.downField("值").as[Double]

      } yield {
        macro_euro_trade_balanceResponse(
          p_ri4qi1,
          p_zhi2
        )
      }
  }

}

object JsonItem_macro_euro_trade_balanceResponse extends Json_macro_euro_trade_balanceResponse
