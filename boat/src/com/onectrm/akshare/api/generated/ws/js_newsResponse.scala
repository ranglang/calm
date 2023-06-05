package com.onectrm.akshare.api.generated.ws;

import com.onectrm.akshare.api.generated.ws.js_newsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: ws 接口: js_news 目标地址: https://www.jin10.com/ 描述: 金十数据新闻资讯数据 限量: 当日最近 4 小时内的新闻资讯数据
  */
case class Respjs_newsResponse(
  `p_datetime`: String,
  `p_content`: String
)

case class js_newsResponse(
  `p_datetime`: String,
  `p_content`: String
)

trait Json_js_newsResponse {

  implicit val a_js_newsResponse = new Decoder[js_newsResponse] {
    final def apply(c: HCursor): Decoder.Result[js_newsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_datetime <- c.downField("datetime").as[String]

        p_content <- c.downField("content").as[String]

      } yield {
        js_newsResponse(
          p_datetime,
          p_content
        )
      }
  }

}

object JsonItem_js_newsResponse extends Json_js_newsResponse
