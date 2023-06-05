package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_return_index_nhResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_return_index_nh 目标地址: http://www.nanhua.net/nhzc/varietytrend.html 描述:
  * 南华期货-商品指数历史走势-收益率指数 限量: 单次返回单个指数的所有历史数据
  */
case class Respfutures_return_index_nhResponse(
  `p_date`: String,
  `p_value`: Double
)

case class futures_return_index_nhResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_futures_return_index_nhResponse {

  implicit val a_futures_return_index_nhResponse = new Decoder[futures_return_index_nhResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_return_index_nhResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        futures_return_index_nhResponse(
          p_date,
          p_value
        )
      }
  }

}

object JsonItem_futures_return_index_nhResponse extends Json_futures_return_index_nhResponse
