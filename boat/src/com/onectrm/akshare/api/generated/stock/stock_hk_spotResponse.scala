package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hk_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hk_spot 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#qbgg_hk 描述:
  * 获取所有港股的实时行情数据 15 分钟延时 限量: 单次返回当前时间戳的所有港股的数据
  */
case class Respstock_hk_spotResponse(
  `p_symbol`: String,
  `p_name`: String,
  `p_engname`: String,
  `p_tradetype`: String,
  `p_lasttrade`: Double,
  `p_prevclose`: Double,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Double,
  `p_amount`: Double,
  `p_ticktime`: String,
  `p_buy`: Double,
  `p_sell`: Double,
  `p_pricechange`: Double,
  `p_changepercent`: Double
)

case class stock_hk_spotResponse(
  `p_symbol`: String,
  `p_name`: String,
  `p_engname`: String,
  `p_tradetype`: String,
  `p_lasttrade`: Double,
  `p_prevclose`: Double,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Double,
  `p_amount`: Double,
  `p_ticktime`: String,
  `p_buy`: Double,
  `p_sell`: Double,
  `p_pricechange`: Double,
  `p_changepercent`: Double
)

trait Json_stock_hk_spotResponse {

  implicit val a_stock_hk_spotResponse = new Decoder[stock_hk_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hk_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_symbol <- c.downField("symbol").as[String]

        p_name <- c.downField("name").as[String]

        p_engname <- c.downField("engname").as[String]

        p_tradetype <- c.downField("tradetype").as[String]

        p_lasttrade <- c.downField("lasttrade").as[Double]

        p_prevclose <- c.downField("prevclose").as[Double]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_volume <- c.downField("volume").as[Double]

        p_amount <- c.downField("amount").as[Double]

        p_ticktime <- c.downField("ticktime").as[String]

        p_buy <- c.downField("buy").as[Double]

        p_sell <- c.downField("sell").as[Double]

        p_pricechange <- c.downField("pricechange").as[Double]

        p_changepercent <- c.downField("changepercent").as[Double]

      } yield {
        stock_hk_spotResponse(
          p_symbol,
          p_name,
          p_engname,
          p_tradetype,
          p_lasttrade,
          p_prevclose,
          p_open,
          p_high,
          p_low,
          p_volume,
          p_amount,
          p_ticktime,
          p_buy,
          p_sell,
          p_pricechange,
          p_changepercent
        )
      }
  }

}

object JsonItem_stock_hk_spotResponse extends Json_stock_hk_spotResponse
