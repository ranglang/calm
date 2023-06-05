package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_ctciResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_ctci 目标地址: http://jgjc.ndrc.gov.cn/dmzs.aspx?clmId=741 描述:
  * 获取中国电煤价格指数-全国综合电煤价格指数图, 20140101-至今的所有历史数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_ctciResponse(
  `p_date`: String,
  `p_value`: Double
)

case class macro_china_ctciResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_macro_china_ctciResponse {

  implicit val a_macro_china_ctciResponse = new Decoder[macro_china_ctciResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_ctciResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        macro_china_ctciResponse(
          p_date,
          p_value
        )
      }
  }

}

object JsonItem_macro_china_ctciResponse extends Json_macro_china_ctciResponse
