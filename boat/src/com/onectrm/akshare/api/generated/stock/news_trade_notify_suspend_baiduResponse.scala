package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.news_trade_notify_suspend_baiduResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: news_trade_notify_suspend_baidu 目标地址: https://gushitong.baidu.com/calendar 描述:
  * 百度股市通-交易提醒-停复牌 限量: 单次获取指定 date 的停复牌数据, 提供港股的停复牌数据
  */
case class Respnews_trade_notify_suspend_baiduResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jiao1yi4suo3`: String,
  `p_ting2pai2shi2jian1`: String,
  `p_fu4pai2shi2jian1`: String,
  `p_ting2pai2shi4xiang4shuo1ming2`: String
)

case class news_trade_notify_suspend_baiduResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jiao1yi4suo3`: String,
  `p_ting2pai2shi2jian1`: String,
  `p_fu4pai2shi2jian1`: String,
  `p_ting2pai2shi4xiang4shuo1ming2`: String
)

trait Json_news_trade_notify_suspend_baiduResponse {

  implicit val a_news_trade_notify_suspend_baiduResponse =
    new Decoder[news_trade_notify_suspend_baiduResponse] {
      final def apply(c: HCursor): Decoder.Result[news_trade_notify_suspend_baiduResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_jiao1yi4suo3 <- c.downField("交易所").as[String]

          p_ting2pai2shi2jian1 <- c.downField("停牌时间").as[String]

          p_fu4pai2shi2jian1 <- c.downField("复牌时间").as[String]

          p_ting2pai2shi4xiang4shuo1ming2 <- c.downField("停牌事项说明").as[String]

        } yield {
          news_trade_notify_suspend_baiduResponse(
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_jiao1yi4suo3,
            p_ting2pai2shi2jian1,
            p_fu4pai2shi2jian1,
            p_ting2pai2shi4xiang4shuo1ming2
          )
        }
    }

}

object JsonItem_news_trade_notify_suspend_baiduResponse
    extends Json_news_trade_notify_suspend_baiduResponse
