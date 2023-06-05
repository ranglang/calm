package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_egg_price_yearlyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_egg_price_yearly 目标地址: https://www.jidan7.com/trend/ 描述:
  * 鸡蛋信息网-各年度产区鸡蛋价格走势 限量: 全部历史数据
  */
case class Respfutures_egg_price_yearlyResponse(
  `p_ri4qi1`: String,
  `p_2015nian2`: Double,
  `p_2016nian2`: Double,
  `p_2017nian2`: Double,
  `p_2018nian2`: Double,
  `p_2019nian2`: Double,
  `p_2020nian2`: Double,
  `p_2021nian2`: Double
)

case class futures_egg_price_yearlyResponse(
  `p_ri4qi1`: String,
  `p_2015nian2`: Double,
  `p_2016nian2`: Double,
  `p_2017nian2`: Double,
  `p_2018nian2`: Double,
  `p_2019nian2`: Double,
  `p_2020nian2`: Double,
  `p_2021nian2`: Double
)

trait Json_futures_egg_price_yearlyResponse {

  implicit val a_futures_egg_price_yearlyResponse = new Decoder[futures_egg_price_yearlyResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_egg_price_yearlyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_2015nian2 <- c.downField("2015年").as[Double]

        p_2016nian2 <- c.downField("2016年").as[Double]

        p_2017nian2 <- c.downField("2017年").as[Double]

        p_2018nian2 <- c.downField("2018年").as[Double]

        p_2019nian2 <- c.downField("2019年").as[Double]

        p_2020nian2 <- c.downField("2020年").as[Double]

        p_2021nian2 <- c.downField("2021年").as[Double]

      } yield {
        futures_egg_price_yearlyResponse(
          p_ri4qi1,
          p_2015nian2,
          p_2016nian2,
          p_2017nian2,
          p_2018nian2,
          p_2019nian2,
          p_2020nian2,
          p_2021nian2
        )
      }
  }

}

object JsonItem_futures_egg_price_yearlyResponse extends Json_futures_egg_price_yearlyResponse
