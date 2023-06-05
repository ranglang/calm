package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_index_cscidxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_index_cscidx 目标地址: http://www.cscidx.com/index.html 描述: 中证商品指数-指数分时数据
  * 限量: 单次返回指定 symbol 的指数分时数据
  */
case class Respfutures_index_cscidxResponse(
  `p_datetime`: String,
  `p_value`: String
)

case class futures_index_cscidxResponse(
  `p_datetime`: String,
  `p_value`: String
)

trait Json_futures_index_cscidxResponse {

  implicit val a_futures_index_cscidxResponse = new Decoder[futures_index_cscidxResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_index_cscidxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_datetime <- c.downField("datetime").as[String]

        p_value <- c.downField("value").as[String]

      } yield {
        futures_index_cscidxResponse(
          p_datetime,
          p_value
        )
      }
  }

}

object JsonItem_futures_index_cscidxResponse extends Json_futures_index_cscidxResponse
