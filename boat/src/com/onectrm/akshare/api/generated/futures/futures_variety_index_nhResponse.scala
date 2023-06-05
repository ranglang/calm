package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_variety_index_nhResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_variety_index_nh 目标地址: http://www.nanhua.net/nhzc/varietychange.html
  * 描述: 南华期货-市场涨跌-品种指数涨跌 限量: 单次返回指定 start_date 和 end_date 的所有历史数据
  */
case class Respfutures_variety_index_nhResponse(
  `p_name`: String,
  `p_return`: Double
)

case class futures_variety_index_nhResponse(
  `p_name`: String,
  `p_return`: Double
)

trait Json_futures_variety_index_nhResponse {

  implicit val a_futures_variety_index_nhResponse = new Decoder[futures_variety_index_nhResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_variety_index_nhResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_name <- c.downField("name").as[String]

        p_return <- c.downField("return").as[Double]

      } yield {
        futures_variety_index_nhResponse(
          p_name,
          p_return
        )
      }
  }

}

object JsonItem_futures_variety_index_nhResponse extends Json_futures_variety_index_nhResponse
