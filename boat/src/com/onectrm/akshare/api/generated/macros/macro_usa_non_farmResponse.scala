package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_usa_non_farmResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_usa_non_farm 目标地址:
  * https://datacenter.jin10.com/reportType/dc_nonfarm_payrolls 描述: 获取美国非农就业人数报告, 数据区间从19700102-至今
  * 限量: 单次返回某一个所有历史数据
  */
case class Respmacro_usa_non_farmResponse(
  `p_ri4qi1`: String,
  `p_jin1zhi2wan4ren2`: Double
)

case class macro_usa_non_farmResponse(
  `p_ri4qi1`: String,
  `p_jin1zhi2wan4ren2`: Double
)

trait Json_macro_usa_non_farmResponse {

  implicit val a_macro_usa_non_farmResponse = new Decoder[macro_usa_non_farmResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_usa_non_farmResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_jin1zhi2wan4ren2 <- c.downField("今值(万人)").as[Double]

      } yield {
        macro_usa_non_farmResponse(
          p_ri4qi1,
          p_jin1zhi2wan4ren2
        )
      }
  }

}

object JsonItem_macro_usa_non_farmResponse extends Json_macro_usa_non_farmResponse
