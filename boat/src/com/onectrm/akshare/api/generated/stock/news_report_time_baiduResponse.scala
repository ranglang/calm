package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.news_report_time_baiduResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: news_report_time_baidu 目标地址: https://gushitong.baidu.com/calendar 描述: 百度股市通-财报发行
  * 限量: 单次获取指定 date 的财报发行, 提供港股的财报发行数据
  */
case class Respnews_report_time_baiduResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_jiao1yi4suo3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_cai2bao4qi1`: String
)

case class news_report_time_baiduResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_jiao1yi4suo3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_cai2bao4qi1`: String
)

trait Json_news_report_time_baiduResponse {

  implicit val a_news_report_time_baiduResponse = new Decoder[news_report_time_baiduResponse] {
    final def apply(c: HCursor): Decoder.Result[news_report_time_baiduResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_jiao1yi4suo3 <- c.downField("交易所").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_cai2bao4qi1 <- c.downField("财报期").as[String]

      } yield {
        news_report_time_baiduResponse(
          p_gu3piao4dai4ma3,
          p_jiao1yi4suo3,
          p_gu3piao4jian3cheng1,
          p_cai2bao4qi1
        )
      }
  }

}

object JsonItem_news_report_time_baiduResponse extends Json_news_report_time_baiduResponse
