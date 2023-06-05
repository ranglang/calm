package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_zh_daily_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_zh_daily_sina 目标地址:
  * https://finance.sina.com.cn/futures/quotes/V2105.shtml 描述: 新浪财经-期货-日频数据 限量: 单次返回指定 symbol
  * 的所有日频数据
  */
case class Respfutures_zh_daily_sinaResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer,
  `p_hold`: Integer,
  `p_settle`: Double
)

case class futures_zh_daily_sinaResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer,
  `p_hold`: Integer,
  `p_settle`: Double
)

trait Json_futures_zh_daily_sinaResponse {

  implicit val a_futures_zh_daily_sinaResponse = new Decoder[futures_zh_daily_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_zh_daily_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Integer]

        p_hold <- c.downField("hold").as[Integer]

        p_settle <- c.downField("settle").as[Double]

      } yield {
        futures_zh_daily_sinaResponse(
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume,
          p_hold,
          p_settle
        )
      }
  }

}

object JsonItem_futures_zh_daily_sinaResponse extends Json_futures_zh_daily_sinaResponse
