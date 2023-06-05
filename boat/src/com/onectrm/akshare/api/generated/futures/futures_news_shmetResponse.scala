package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_news_shmetResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_news_shmet 目标地址:
  * https://www.shmet.com/newsFlash/newsFlash.html?searchKeyword= 描述: 上海金属网-快讯 限量: 指定 symbol 的数据
  */
case class Respfutures_news_shmetResponse(
  `p_fa1bu4shi2jian1`: String,
  `p_nei4rong2`: String
)

case class futures_news_shmetResponse(
  `p_fa1bu4shi2jian1`: String,
  `p_nei4rong2`: String
)

trait Json_futures_news_shmetResponse {

  implicit val a_futures_news_shmetResponse = new Decoder[futures_news_shmetResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_news_shmetResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_fa1bu4shi2jian1 <- c.downField("发布时间").as[String]

        p_nei4rong2 <- c.downField("内容").as[String]

      } yield {
        futures_news_shmetResponse(
          p_fa1bu4shi2jian1,
          p_nei4rong2
        )
      }
  }

}

object JsonItem_futures_news_shmetResponse extends Json_futures_news_shmetResponse
