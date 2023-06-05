package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_uk_retail_monthlyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_uk_retail_monthly 目标地址: http://data.eastmoney.com/cjsj/foreign_4_8.html 描述:
  * 东方财富-经济数据-英国-零售销售月率 限量: 单次返回所有历史数据
  */
case class Respmacro_uk_retail_monthlyResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

case class macro_uk_retail_monthlyResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

trait Json_macro_uk_retail_monthlyResponse {

  implicit val a_macro_uk_retail_monthlyResponse = new Decoder[macro_uk_retail_monthlyResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_uk_retail_monthlyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_qian2zhi2 <- c.downField("前值").as[Double]

        p_xian4zhi2 <- c.downField("现值").as[Double]

        p_fa1bu4ri4qi1 <- c.downField("发布日期").as[String]

      } yield {
        macro_uk_retail_monthlyResponse(
          p_shi2jian1,
          p_qian2zhi2,
          p_xian4zhi2,
          p_fa1bu4ri4qi1
        )
      }
  }

}

object JsonItem_macro_uk_retail_monthlyResponse extends Json_macro_uk_retail_monthlyResponse
