package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_euro_zew_economic_sentimentResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_euro_zew_economic_sentiment 目标地址:
  * https://datacenter.jin10.com/reportType/dc_eurozone_zew_economic_sentiment 描述: 获取欧元区ZEW经济景气指数报告,
  * 数据区间从20080212-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_euro_zew_economic_sentimentResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

case class macro_euro_zew_economic_sentimentResponse(
  `p_ri4qi1`: String,
  `p_zhi2`: Double
)

trait Json_macro_euro_zew_economic_sentimentResponse {

  implicit val a_macro_euro_zew_economic_sentimentResponse =
    new Decoder[macro_euro_zew_economic_sentimentResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_euro_zew_economic_sentimentResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_zhi2 <- c.downField("值").as[Double]

        } yield {
          macro_euro_zew_economic_sentimentResponse(
            p_ri4qi1,
            p_zhi2
          )
        }
    }

}

object JsonItem_macro_euro_zew_economic_sentimentResponse
    extends Json_macro_euro_zew_economic_sentimentResponse
