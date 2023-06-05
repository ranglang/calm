package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_egg_priceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_egg_price 目标地址: https://www.jidan7.com/trend/ 描述: 鸡蛋信息网-鸡蛋价格走势 限量:
  * 全部历史数据
  */
case class Respfutures_egg_priceResponse(
  `p_date`: String,
  `p_price`: Double
)

case class futures_egg_priceResponse(
  `p_date`: String,
  `p_price`: Double
)

trait Json_futures_egg_priceResponse {

  implicit val a_futures_egg_priceResponse = new Decoder[futures_egg_priceResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_egg_priceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_price <- c.downField("price").as[Double]

      } yield {
        futures_egg_priceResponse(
          p_date,
          p_price
        )
      }
  }

}

object JsonItem_futures_egg_priceResponse extends Json_futures_egg_priceResponse
