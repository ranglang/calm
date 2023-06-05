package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_egg_price_areaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_egg_price_area 目标地址: https://www.jidan7.com/trend/ 描述: 鸡蛋信息网-各主产区鸡蛋均价
  * 限量: 全部历史数据
  */
case class Respfutures_egg_price_areaResponse(
  `p_date`: String,
  `p_shan1dong1jun1jia4`: Double,
  `p_he2nan2jun1jia4`: Double,
  `p_he2bei3jun1jia4`: Double,
  `p_liao2ning2jun1jia4`: Double,
  `p_jiang1su1jun1jia4`: Double,
  `p_hu2bei3jun1jia4`: Double
)

case class futures_egg_price_areaResponse(
  `p_date`: String,
  `p_shan1dong1jun1jia4`: Double,
  `p_he2nan2jun1jia4`: Double,
  `p_he2bei3jun1jia4`: Double,
  `p_liao2ning2jun1jia4`: Double,
  `p_jiang1su1jun1jia4`: Double,
  `p_hu2bei3jun1jia4`: Double
)

trait Json_futures_egg_price_areaResponse {

  implicit val a_futures_egg_price_areaResponse = new Decoder[futures_egg_price_areaResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_egg_price_areaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_shan1dong1jun1jia4 <- c.downField("山东均价").as[Double]

        p_he2nan2jun1jia4 <- c.downField("河南均价").as[Double]

        p_he2bei3jun1jia4 <- c.downField("河北均价").as[Double]

        p_liao2ning2jun1jia4 <- c.downField("辽宁均价").as[Double]

        p_jiang1su1jun1jia4 <- c.downField("江苏均价").as[Double]

        p_hu2bei3jun1jia4 <- c.downField("湖北均价").as[Double]

      } yield {
        futures_egg_price_areaResponse(
          p_date,
          p_shan1dong1jun1jia4,
          p_he2nan2jun1jia4,
          p_he2bei3jun1jia4,
          p_liao2ning2jun1jia4,
          p_jiang1su1jun1jia4,
          p_hu2bei3jun1jia4
        )
      }
  }

}

object JsonItem_futures_egg_price_areaResponse extends Json_futures_egg_price_areaResponse
