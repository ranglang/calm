package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_usa_ism_pmiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_usa_ism_pmi 目标地址: https://datacenter.jin10.com/reportType/dc_usa_ism_pmi
  * 描述: 获取美国ISM制造业PMI报告, 数据区间从19700101-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_usa_ism_pmiResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

case class macro_usa_ism_pmiResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

trait Json_macro_usa_ism_pmiResponse {

  implicit val a_macro_usa_ism_pmiResponse = new Decoder[macro_usa_ism_pmiResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_usa_ism_pmiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhi2 <- c.downField("值").as[Double]

      } yield {
        macro_usa_ism_pmiResponse(
          p_ri4qi1,
          p_zhi2
        )
      }
  }

}

object JsonItem_macro_usa_ism_pmiResponse extends Json_macro_usa_ism_pmiResponse
