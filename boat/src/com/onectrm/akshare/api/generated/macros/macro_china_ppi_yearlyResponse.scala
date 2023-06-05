package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_ppi_yearlyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_ppi_yearly 目标地址:
  * https://datacenter.jin10.com/reportType/dc_chinese_ppi_yoy 描述: 获取中国年度PPI数据, 数据区间从19950801-至今 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_china_ppi_yearlyResponse(
  `p_index`: String,
  `p_value`: Double
)

case class macro_china_ppi_yearlyResponse(
  `p_index`: String,
  `p_value`: Double
)

trait Json_macro_china_ppi_yearlyResponse {

  implicit val a_macro_china_ppi_yearlyResponse = new Decoder[macro_china_ppi_yearlyResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_ppi_yearlyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_index <- c.downField("index").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        macro_china_ppi_yearlyResponse(
          p_index,
          p_value
        )
      }
  }

}

object JsonItem_macro_china_ppi_yearlyResponse extends Json_macro_china_ppi_yearlyResponse
