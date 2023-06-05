package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_tweet_xqResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_tweet_xq 目标地址: https://xueqiu.com/hq 描述: 雪球-沪深股市-热度排行榜-讨论排行榜 限量:
  * 单次返回所有股票的热度数据
  */
case class Respstock_hot_tweet_xqResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_guan1zhu4`: Double,
  `p_zui4xin1jia4`: Double
)

case class stock_hot_tweet_xqResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_guan1zhu4`: Double,
  `p_zui4xin1jia4`: Double
)

trait Json_stock_hot_tweet_xqResponse {

  implicit val a_stock_hot_tweet_xqResponse = new Decoder[stock_hot_tweet_xqResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_tweet_xqResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_guan1zhu4 <- c.downField("关注").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

      } yield {
        stock_hot_tweet_xqResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_guan1zhu4,
          p_zui4xin1jia4
        )
      }
  }

}

object JsonItem_stock_hot_tweet_xqResponse extends Json_stock_hot_tweet_xqResponse
