package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_non_man_pmiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_non_man_pmi 目标地址:
  * https://datacenter.jin10.com/reportType/dc_chinese_non_manufacturing_pmi 描述: 获取中国官方非制造业PMI,
  * 数据区间从20160101-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_non_man_pmiResponse(
  `p_index`: String,
  `p_value`: Double
)

case class macro_china_non_man_pmiResponse(
  `p_index`: String,
  `p_value`: Double
)

trait Json_macro_china_non_man_pmiResponse {

  implicit val a_macro_china_non_man_pmiResponse = new Decoder[macro_china_non_man_pmiResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_non_man_pmiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_index <- c.downField("index").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        macro_china_non_man_pmiResponse(
          p_index,
          p_value
        )
      }
  }

}

object JsonItem_macro_china_non_man_pmiResponse extends Json_macro_china_non_man_pmiResponse
