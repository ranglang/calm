package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_cons_silver_amountResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_cons_silver_amount 目标地址:
  * https://datacenter.jin10.com/reportType/dc_eurozone_sentix_investor_confidence 描述:
  * 获取全球最大白银ETF--iShares Silver Trust持仓报告-总价值(美元), 数据区间从20060429-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_cons_silver_amountResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

case class macro_cons_silver_amountResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

trait Json_macro_cons_silver_amountResponse {

  implicit val a_macro_cons_silver_amountResponse = new Decoder[macro_cons_silver_amountResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_cons_silver_amountResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhi2 <- c.downField("值").as[Double]

      } yield {
        macro_cons_silver_amountResponse(
          p_ri4qi1,
          p_zhi2
        )
      }
  }

}

object JsonItem_macro_cons_silver_amountResponse extends Json_macro_cons_silver_amountResponse
