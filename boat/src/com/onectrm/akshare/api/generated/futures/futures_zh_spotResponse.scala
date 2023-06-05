package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_zh_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_zh_spot 目标地址: https://finance.sina.com.cn/futuremarket/ 描述:
  * 新浪财经-期货页面的实时行情数据 限量: 单次返回当日可以订阅的所有期货品种数据
  */
case class Respfutures_zh_spotResponse(
  `p_symbol`: String,
  `p_time`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_currentprice`: Double,
  `p_bidprice`: Double,
  `p_askprice`: Double,
  `p_buyvol`: Integer,
  `p_sellvol`: Integer,
  `p_hold`: Double,
  `p_volume`: Integer,
  `p_avgprice`: Double,
  `p_lastclose`: Double,
  `p_lastsettleprice`: Double
)

case class futures_zh_spotResponse(
  `p_symbol`: String,
  `p_time`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_currentprice`: Double,
  `p_bidprice`: Double,
  `p_askprice`: Double,
  `p_buyvol`: Integer,
  `p_sellvol`: Integer,
  `p_hold`: Double,
  `p_volume`: Integer,
  `p_avgprice`: Double,
  `p_lastclose`: Double,
  `p_lastsettleprice`: Double
)

trait Json_futures_zh_spotResponse {

  implicit val a_futures_zh_spotResponse = new Decoder[futures_zh_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_zh_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_symbol <- c.downField("symbol").as[String]

        p_time <- c.downField("time").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_currentprice <- c.downField("current_price").as[Double]

        p_bidprice <- c.downField("bid_price").as[Double]

        p_askprice <- c.downField("ask_price").as[Double]

        p_buyvol <- c.downField("buy_vol").as[Integer]

        p_sellvol <- c.downField("sell_vol").as[Integer]

        p_hold <- c.downField("hold").as[Double]

        p_volume <- c.downField("volume").as[Integer]

        p_avgprice <- c.downField("avg_price").as[Double]

        p_lastclose <- c.downField("last_close").as[Double]

        p_lastsettleprice <- c.downField("last_settle_price").as[Double]

      } yield {
        futures_zh_spotResponse(
          p_symbol,
          p_time,
          p_open,
          p_high,
          p_low,
          p_currentprice,
          p_bidprice,
          p_askprice,
          p_buyvol,
          p_sellvol,
          p_hold,
          p_volume,
          p_avgprice,
          p_lastclose,
          p_lastsettleprice
        )
      }
  }

}

object JsonItem_futures_zh_spotResponse extends Json_futures_zh_spotResponse
