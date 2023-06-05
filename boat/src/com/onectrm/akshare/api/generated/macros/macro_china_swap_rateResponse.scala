package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_swap_rateResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_swap_rate 目标地址:
  * http://www.chinamoney.com.cn/chinese/bkcurvfxhis/?cfgItemType=72&amp;curveType=FR007 描述:
  * 国家统计局-FR007 利率互换曲线历史数据 限量: 单次返回所有历史数据, 该接口只能获取近一年的数据的数据，其中每次只能获取一个月的数据
  */
case class Respmacro_china_swap_rateResponse(
  `p_ri4qi1`: String,
  `p_qu3xian4ming2cheng1`: String,
  `p_shi2ke4`: String,
  `p_jia4ge2lei4xing2`: String,
  `p_1M`: Double,
  `p_3M`: Double,
  `p_6M`: Double,
  `p_9M`: Double,
  `p_1Y`: Double,
  `p_2Y`: Double,
  `p_3Y`: Double,
  `p_4Y`: Double,
  `p_5Y`: Double,
  `p_7Y`: Double,
  `p_10Y`: Double
)

case class macro_china_swap_rateResponse(
  `p_ri4qi1`: String,
  `p_qu3xian4ming2cheng1`: String,
  `p_shi2ke4`: String,
  `p_jia4ge2lei4xing2`: String,
  `p_1M`: Double,
  `p_3M`: Double,
  `p_6M`: Double,
  `p_9M`: Double,
  `p_1Y`: Double,
  `p_2Y`: Double,
  `p_3Y`: Double,
  `p_4Y`: Double,
  `p_5Y`: Double,
  `p_7Y`: Double,
  `p_10Y`: Double
)

trait Json_macro_china_swap_rateResponse {

  implicit val a_macro_china_swap_rateResponse = new Decoder[macro_china_swap_rateResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_swap_rateResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_qu3xian4ming2cheng1 <- c.downField("曲线名称").as[String]

        p_shi2ke4 <- c.downField("时刻").as[String]

        p_jia4ge2lei4xing2 <- c.downField("价格类型").as[String]

        p_1M <- c.downField("1M").as[Double]

        p_3M <- c.downField("3M").as[Double]

        p_6M <- c.downField("6M").as[Double]

        p_9M <- c.downField("9M").as[Double]

        p_1Y <- c.downField("1Y").as[Double]

        p_2Y <- c.downField("2Y").as[Double]

        p_3Y <- c.downField("3Y").as[Double]

        p_4Y <- c.downField("4Y").as[Double]

        p_5Y <- c.downField("5Y").as[Double]

        p_7Y <- c.downField("7Y").as[Double]

        p_10Y <- c.downField("10Y").as[Double]

      } yield {
        macro_china_swap_rateResponse(
          p_ri4qi1,
          p_qu3xian4ming2cheng1,
          p_shi2ke4,
          p_jia4ge2lei4xing2,
          p_1M,
          p_3M,
          p_6M,
          p_9M,
          p_1Y,
          p_2Y,
          p_3Y,
          p_4Y,
          p_5Y,
          p_7Y,
          p_10Y
        )
      }
  }

}

object JsonItem_macro_china_swap_rateResponse extends Json_macro_china_swap_rateResponse
