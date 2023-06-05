package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_hk_market_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_hk_market_info 目标地址:
  * https://datacenter.jin10.com/reportType/dc_hk_market_info 描述: 香港同业拆借报告, 数据区间从 20170320-至今 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_china_hk_market_infoResponse(
  `p_ri4qi1`: String,
  `p_1Wding4jia4`: Double,
  `p_1Wzhang3die1fu2`: Double,
  `p_2Wding4jia4`: Double,
  `p_2Wzhang3die1fu2`: Double,
  `p_1Mding4jia4`: Double,
  `p_1Mzhang3die1fu2`: Double,
  `p_3Mding4jia4`: Double,
  `p_3Mzhang3die1fu2`: Double,
  `p_6Mding4jia4`: Double,
  `p_6Mzhang3die1fu2`: Double,
  `p_9Mding4jia4`: Double,
  `p_9Mzhang3die1fu2`: Double,
  `p_1Yding4jia4`: Double,
  `p_1Yzhang3die1fu2`: Double,
  `p_2Mding4jia4`: Double,
  `p_2Mzhang3die1fu2`: Double
)

case class macro_china_hk_market_infoResponse(
  `p_ri4qi1`: String,
  `p_1Wding4jia4`: Double,
  `p_1Wzhang3die1fu2`: Double,
  `p_2Wding4jia4`: Double,
  `p_2Wzhang3die1fu2`: Double,
  `p_1Mding4jia4`: Double,
  `p_1Mzhang3die1fu2`: Double,
  `p_3Mding4jia4`: Double,
  `p_3Mzhang3die1fu2`: Double,
  `p_6Mding4jia4`: Double,
  `p_6Mzhang3die1fu2`: Double,
  `p_9Mding4jia4`: Double,
  `p_9Mzhang3die1fu2`: Double,
  `p_1Yding4jia4`: Double,
  `p_1Yzhang3die1fu2`: Double,
  `p_2Mding4jia4`: Double,
  `p_2Mzhang3die1fu2`: Double
)

trait Json_macro_china_hk_market_infoResponse {

  implicit val a_macro_china_hk_market_infoResponse =
    new Decoder[macro_china_hk_market_infoResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_hk_market_infoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_1Wding4jia4 <- c.downField("1W_定价").as[Double]

          p_1Wzhang3die1fu2 <- c.downField("1W_涨跌幅").as[Double]

          p_2Wding4jia4 <- c.downField("2W_定价").as[Double]

          p_2Wzhang3die1fu2 <- c.downField("2W_涨跌幅").as[Double]

          p_1Mding4jia4 <- c.downField("1M_定价").as[Double]

          p_1Mzhang3die1fu2 <- c.downField("1M_涨跌幅").as[Double]

          p_3Mding4jia4 <- c.downField("3M_定价").as[Double]

          p_3Mzhang3die1fu2 <- c.downField("3M_涨跌幅").as[Double]

          p_6Mding4jia4 <- c.downField("6M_定价").as[Double]

          p_6Mzhang3die1fu2 <- c.downField("6M_涨跌幅").as[Double]

          p_9Mding4jia4 <- c.downField("9M_定价").as[Double]

          p_9Mzhang3die1fu2 <- c.downField("9M_涨跌幅").as[Double]

          p_1Yding4jia4 <- c.downField("1Y_定价").as[Double]

          p_1Yzhang3die1fu2 <- c.downField("1Y_涨跌幅").as[Double]

          p_2Mding4jia4 <- c.downField("2M_定价").as[Double]

          p_2Mzhang3die1fu2 <- c.downField("2M_涨跌幅").as[Double]

        } yield {
          macro_china_hk_market_infoResponse(
            p_ri4qi1,
            p_1Wding4jia4,
            p_1Wzhang3die1fu2,
            p_2Wding4jia4,
            p_2Wzhang3die1fu2,
            p_1Mding4jia4,
            p_1Mzhang3die1fu2,
            p_3Mding4jia4,
            p_3Mzhang3die1fu2,
            p_6Mding4jia4,
            p_6Mzhang3die1fu2,
            p_9Mding4jia4,
            p_9Mzhang3die1fu2,
            p_1Yding4jia4,
            p_1Yzhang3die1fu2,
            p_2Mding4jia4,
            p_2Mzhang3die1fu2
          )
        }
    }

}

object JsonItem_macro_china_hk_market_infoResponse extends Json_macro_china_hk_market_infoResponse
