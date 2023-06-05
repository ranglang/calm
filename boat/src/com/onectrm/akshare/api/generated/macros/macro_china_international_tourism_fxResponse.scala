package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_international_tourism_fxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_international_tourism_fx 目标地址:
  * http://finance.sina.com.cn/mac/#industry-15-0-31-3 描述: 国家统计局-国际旅游外汇收入构成 限量: 单次返回所有历史数据
  */
case class Respmacro_china_international_tourism_fxResponse(
  `p_tong3ji4nian2du4`: String,
  `p_zhi3biao1`: Double,
  `p_shu4liang4`: Double,
  `p_bi3zhong4`: Double
)

case class macro_china_international_tourism_fxResponse(
  `p_tong3ji4nian2du4`: String,
  `p_zhi3biao1`: Double,
  `p_shu4liang4`: Double,
  `p_bi3zhong4`: Double
)

trait Json_macro_china_international_tourism_fxResponse {

  implicit val a_macro_china_international_tourism_fxResponse =
    new Decoder[macro_china_international_tourism_fxResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_international_tourism_fxResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4nian2du4 <- c.downField("统计年度").as[String]

          p_zhi3biao1 <- c.downField("指标").as[Double]

          p_shu4liang4 <- c.downField("数量").as[Double]

          p_bi3zhong4 <- c.downField("比重").as[Double]

        } yield {
          macro_china_international_tourism_fxResponse(
            p_tong3ji4nian2du4,
            p_zhi3biao1,
            p_shu4liang4,
            p_bi3zhong4
          )
        }
    }

}

object JsonItem_macro_china_international_tourism_fxResponse
    extends Json_macro_china_international_tourism_fxResponse
