package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_usa_api_crude_stockResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_usa_api_crude_stock 目标地址:
  * https://datacenter.jin10.com/reportType/dc_usa_api_crude_stock 描述: 获取美国API原油库存报告,
  * 数据区间从20120328-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_usa_api_crude_stockResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

case class macro_usa_api_crude_stockResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

trait Json_macro_usa_api_crude_stockResponse {

  implicit val a_macro_usa_api_crude_stockResponse =
    new Decoder[macro_usa_api_crude_stockResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_usa_api_crude_stockResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_zhi2 <- c.downField("值").as[Double]

        } yield {
          macro_usa_api_crude_stockResponse(
            p_ri4qi1,
            p_zhi2
          )
        }
    }

}

object JsonItem_macro_usa_api_crude_stockResponse extends Json_macro_usa_api_crude_stockResponse
