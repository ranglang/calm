package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.news_cctvResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: news_cctv 目标地址: https://tv.cctv.com/lm/xwlb/?spm=C52056131267.P4y8I53JvSWE.0.0
  * 描述: 新闻联播文字稿, 数据区间从 20160330-至今 限量: 单次返回指定日期新闻联播文字稿数据
  */
case class Respnews_cctvResponse(
  `p_date`: String,
  `p_title`: String,
  `p_content`: String
)

case class news_cctvResponse(
  `p_date`: String,
  `p_title`: String,
  `p_content`: String
)

trait Json_news_cctvResponse {

  implicit val a_news_cctvResponse = new Decoder[news_cctvResponse] {
    final def apply(c: HCursor): Decoder.Result[news_cctvResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_title <- c.downField("title").as[String]

        p_content <- c.downField("content").as[String]

      } yield {
        news_cctvResponse(
          p_date,
          p_title,
          p_content
        )
      }
  }

}

object JsonItem_news_cctvResponse extends Json_news_cctvResponse
