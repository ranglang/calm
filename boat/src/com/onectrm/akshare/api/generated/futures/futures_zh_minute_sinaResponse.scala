package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_zh_minute_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_zh_minute_sina 目标地址:
  * http://vip.stock.finance.sina.com.cn/quotes_service/view/qihuohangqing.html#titlePos_3 描述:
  * 新浪财经-期货-分时数据 限量: 单次返回指定 symbol 和 period 的分时数据
  */
case class Respfutures_zh_minute_sinaResponse(
  `p_datetime`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer,
  `p_hold`: Integer
)

case class futures_zh_minute_sinaResponse(
  `p_datetime`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer,
  `p_hold`: Integer
)

trait Json_futures_zh_minute_sinaResponse {

  implicit val a_futures_zh_minute_sinaResponse = new Decoder[futures_zh_minute_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_zh_minute_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_datetime <- c.downField("datetime").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Integer]

        p_hold <- c.downField("hold").as[Integer]

      } yield {
        futures_zh_minute_sinaResponse(
          p_datetime,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume,
          p_hold
        )
      }
  }

}

object JsonItem_futures_zh_minute_sinaResponse extends Json_futures_zh_minute_sinaResponse
