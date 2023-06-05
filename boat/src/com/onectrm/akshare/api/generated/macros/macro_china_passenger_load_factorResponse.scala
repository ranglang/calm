package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_passenger_load_factorResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_passenger_load_factor 目标地址:
  * http://finance.sina.com.cn/mac/#industry-20-0-31-1 描述: 国家统计局-民航客座率及载运率 限量: 单次返回所有历史数据
  */
case class Respmacro_china_passenger_load_factorResponse(
  `p_tong3ji4nian2du4`: String,
  `p_ke4zuo4lu4`: Double,
  `p_zai3yun4lu4`: Double
)

case class macro_china_passenger_load_factorResponse(
  `p_tong3ji4nian2du4`: String,
  `p_ke4zuo4lu4`: Double,
  `p_zai3yun4lu4`: Double
)

trait Json_macro_china_passenger_load_factorResponse {

  implicit val a_macro_china_passenger_load_factorResponse =
    new Decoder[macro_china_passenger_load_factorResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_passenger_load_factorResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4nian2du4 <- c.downField("统计年度").as[String]

          p_ke4zuo4lu4 <- c.downField("客座率").as[Double]

          p_zai3yun4lu4 <- c.downField("载运率").as[Double]

        } yield {
          macro_china_passenger_load_factorResponse(
            p_tong3ji4nian2du4,
            p_ke4zuo4lu4,
            p_zai3yun4lu4
          )
        }
    }

}

object JsonItem_macro_china_passenger_load_factorResponse
    extends Json_macro_china_passenger_load_factorResponse
