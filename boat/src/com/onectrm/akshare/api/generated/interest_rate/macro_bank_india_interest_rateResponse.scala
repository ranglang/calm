package com.onectrm.akshare.api.generated.interest_rate;

import com.onectrm.akshare.api.generated.interest_rate.macro_bank_india_interest_rateResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: interest_rate 接口: macro_bank_india_interest_rate 目标地址:
  * https://datacenter.jin10.com/reportType/dc_india_interest_rate_decision 描述: 印度利率决议报告, 数据区间从
  * 20000801-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_bank_india_interest_rateResponse(
  `p_shang1pin3`: String,
  `p_ri4qi1`: String,
  `p_jin1zhi2`: Double,
  `p_yu4ce4zhi2`: Double,
  `p_qian2zhi2`: Double
)

case class macro_bank_india_interest_rateResponse(
  `p_shang1pin3`: String,
  `p_ri4qi1`: String,
  `p_jin1zhi2`: Double,
  `p_yu4ce4zhi2`: Double,
  `p_qian2zhi2`: Double
)

trait Json_macro_bank_india_interest_rateResponse {

  implicit val a_macro_bank_india_interest_rateResponse =
    new Decoder[macro_bank_india_interest_rateResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_bank_india_interest_rateResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shang1pin3 <- c.downField("商品").as[String]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_jin1zhi2 <- c.downField("今值").as[Double]

          p_yu4ce4zhi2 <- c.downField("预测值").as[Double]

          p_qian2zhi2 <- c.downField("前值").as[Double]

        } yield {
          macro_bank_india_interest_rateResponse(
            p_shang1pin3,
            p_ri4qi1,
            p_jin1zhi2,
            p_yu4ce4zhi2,
            p_qian2zhi2
          )
        }
    }

}

object JsonItem_macro_bank_india_interest_rateResponse
    extends Json_macro_bank_india_interest_rateResponse
