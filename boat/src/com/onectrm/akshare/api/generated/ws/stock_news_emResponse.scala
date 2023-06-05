package com.onectrm.akshare.api.generated.ws;

import com.onectrm.akshare.api.generated.ws.stock_news_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: ws 接口: stock_news_em 目标地址: http://so.eastmoney.com/news/s 描述: 东方财富指定个股的新闻资讯数据 限量: 当日最近 20
  * 条新闻资讯数据
  */
case class Respstock_news_emResponse(
  `p_code`: String,
  `p_title`: String,
  `p_content`: String,
  `p_publictime`: String,
  `p_url`: String
)

case class stock_news_emResponse(
  `p_code`: String,
  `p_title`: String,
  `p_content`: String,
  `p_publictime`: String,
  `p_url`: String
)

trait Json_stock_news_emResponse {

  implicit val a_stock_news_emResponse = new Decoder[stock_news_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_news_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_code <- c.downField("code").as[String]

        p_title <- c.downField("title").as[String]

        p_content <- c.downField("content").as[String]

        p_publictime <- c.downField("public_time").as[String]

        p_url <- c.downField("url").as[String]

      } yield {
        stock_news_emResponse(
          p_code,
          p_title,
          p_content,
          p_publictime,
          p_url
        )
      }
  }

}

object JsonItem_stock_news_emResponse extends Json_stock_news_emResponse
