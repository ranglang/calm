package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_euro_services_pmiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_euro_services_pmi 目标地址:
  * https://datacenter.jin10.com/reportType/dc_eurozone_services_pmi 描述: 获取欧元区服务业PMI终值报告,
  * 数据区间从20080222-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_euro_services_pmiResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

case class macro_euro_services_pmiResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

trait Json_macro_euro_services_pmiResponse {

  implicit val a_macro_euro_services_pmiResponse = new Decoder[macro_euro_services_pmiResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_euro_services_pmiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhi2 <- c.downField("值").as[Double]

      } yield {
        macro_euro_services_pmiResponse(
          p_ri4qi1,
          p_zhi2
        )
      }
  }

}

object JsonItem_macro_euro_services_pmiResponse extends Json_macro_euro_services_pmiResponse
