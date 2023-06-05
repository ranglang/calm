package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_swiss_gbd_bank_rateResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_swiss_gbd_bank_rate 目标地址: http://data.eastmoney.com/cjsj/foreign_2_5.html
  * 描述: 东方财富-经济数据-瑞士-央行公布利率决议 限量: 单次返回所有历史数据
  */
case class Respmacro_swiss_gbd_bank_rateResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

case class macro_swiss_gbd_bank_rateResponse(
  `p_shi2jian1`: String,
  `p_qian2zhi2`: Double,
  `p_xian4zhi2`: Double,
  `p_fa1bu4ri4qi1`: String
)

trait Json_macro_swiss_gbd_bank_rateResponse {

  implicit val a_macro_swiss_gbd_bank_rateResponse =
    new Decoder[macro_swiss_gbd_bank_rateResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_swiss_gbd_bank_rateResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shi2jian1 <- c.downField("时间").as[String]

          p_qian2zhi2 <- c.downField("前值").as[Double]

          p_xian4zhi2 <- c.downField("现值").as[Double]

          p_fa1bu4ri4qi1 <- c.downField("发布日期").as[String]

        } yield {
          macro_swiss_gbd_bank_rateResponse(
            p_shi2jian1,
            p_qian2zhi2,
            p_xian4zhi2,
            p_fa1bu4ri4qi1
          )
        }
    }

}

object JsonItem_macro_swiss_gbd_bank_rateResponse extends Json_macro_swiss_gbd_bank_rateResponse