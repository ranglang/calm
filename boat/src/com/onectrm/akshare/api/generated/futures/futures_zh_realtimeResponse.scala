package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_zh_realtimeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_zh_realtime 目标地址:
  * http://vip.stock.finance.sina.com.cn/quotes_service/view/qihuohangqing.html#titlePos_1 描述:
  * 新浪财经-期货实时行情数据 限量: 单次返回指定 symbol 的数据
  */
case class Respfutures_zh_realtimeResponse(
  `p_symbol`: String,
  `p_exchange`: String,
  `p_name`: String,
  `p_trade`: Double,
  `p_settlement`: Double,
  `p_presettlement`: Double,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_bidprice1`: Double,
  `p_askprice1`: Double,
  `p_bidvol1`: Integer,
  `p_askvol1`: Integer,
  `p_volume`: Integer,
  `p_position`: Integer,
  `p_ticktime`: String,
  `p_tradedate`: String,
  `p_preclose`: Double,
  `p_changepercent`: Double,
  `p_bid`: Double,
  `p_ask`: Double,
  `p_prevsettlement`: Double
)

case class futures_zh_realtimeResponse(
  `p_symbol`: String,
  `p_exchange`: String,
  `p_name`: String,
  `p_trade`: Double,
  `p_settlement`: Double,
  `p_presettlement`: Double,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_bidprice1`: Double,
  `p_askprice1`: Double,
  `p_bidvol1`: Integer,
  `p_askvol1`: Integer,
  `p_volume`: Integer,
  `p_position`: Integer,
  `p_ticktime`: String,
  `p_tradedate`: String,
  `p_preclose`: Double,
  `p_changepercent`: Double,
  `p_bid`: Double,
  `p_ask`: Double,
  `p_prevsettlement`: Double
)

trait Json_futures_zh_realtimeResponse {

  implicit val a_futures_zh_realtimeResponse = new Decoder[futures_zh_realtimeResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_zh_realtimeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_symbol <- c.downField("symbol").as[String]

        p_exchange <- c.downField("exchange").as[String]

        p_name <- c.downField("name").as[String]

        p_trade <- c.downField("trade").as[Double]

        p_settlement <- c.downField("settlement").as[Double]

        p_presettlement <- c.downField("presettlement").as[Double]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_bidprice1 <- c.downField("bidprice1").as[Double]

        p_askprice1 <- c.downField("askprice1").as[Double]

        p_bidvol1 <- c.downField("bidvol1").as[Integer]

        p_askvol1 <- c.downField("askvol1").as[Integer]

        p_volume <- c.downField("volume").as[Integer]

        p_position <- c.downField("position").as[Integer]

        p_ticktime <- c.downField("ticktime").as[String]

        p_tradedate <- c.downField("tradedate").as[String]

        p_preclose <- c.downField("preclose").as[Double]

        p_changepercent <- c.downField("changepercent").as[Double]

        p_bid <- c.downField("bid").as[Double]

        p_ask <- c.downField("ask").as[Double]

        p_prevsettlement <- c.downField("prevsettlement").as[Double]

      } yield {
        futures_zh_realtimeResponse(
          p_symbol,
          p_exchange,
          p_name,
          p_trade,
          p_settlement,
          p_presettlement,
          p_open,
          p_high,
          p_low,
          p_close,
          p_bidprice1,
          p_askprice1,
          p_bidvol1,
          p_askvol1,
          p_volume,
          p_position,
          p_ticktime,
          p_tradedate,
          p_preclose,
          p_changepercent,
          p_bid,
          p_ask,
          p_prevsettlement
        )
      }
  }

}

object JsonItem_futures_zh_realtimeResponse extends Json_futures_zh_realtimeResponse
