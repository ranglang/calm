package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sector_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sector_detail 目标地址: http://finance.sina.com.cn/stock/sl/#area_1 描述:
  * 新浪行业-板块行情-成份详情, 由于新浪网页提供的统计数据有误, 部分行业数量大于统计数 限量: 单次获取指定的新浪行业-板块行情-成份详情
  */
case class Respstock_sector_detailResponse(
  `p_symbol`: String,
  `p_code`: String,
  `p_name`: String,
  `p_trade`: Double,
  `p_pricechange`: Double,
  `p_changepercent`: Double,
  `p_buy`: Double,
  `p_sell`: Double,
  `p_settlement`: Double,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Integer,
  `p_amount`: Integer,
  `p_ticktime`: String,
  `p_per`: Double,
  `p_pb`: Double,
  `p_mktcap`: Double,
  `p_nmc`: Double,
  `p_turnoverratio`: Double
)

case class stock_sector_detailResponse(
  `p_symbol`: String,
  `p_code`: String,
  `p_name`: String,
  `p_trade`: Double,
  `p_pricechange`: Double,
  `p_changepercent`: Double,
  `p_buy`: Double,
  `p_sell`: Double,
  `p_settlement`: Double,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Integer,
  `p_amount`: Integer,
  `p_ticktime`: String,
  `p_per`: Double,
  `p_pb`: Double,
  `p_mktcap`: Double,
  `p_nmc`: Double,
  `p_turnoverratio`: Double
)

trait Json_stock_sector_detailResponse {

  implicit val a_stock_sector_detailResponse = new Decoder[stock_sector_detailResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_sector_detailResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_symbol <- c.downField("symbol").as[String]

        p_code <- c.downField("code").as[String]

        p_name <- c.downField("name").as[String]

        p_trade <- c.downField("trade").as[Double]

        p_pricechange <- c.downField("pricechange").as[Double]

        p_changepercent <- c.downField("changepercent").as[Double]

        p_buy <- c.downField("buy").as[Double]

        p_sell <- c.downField("sell").as[Double]

        p_settlement <- c.downField("settlement").as[Double]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_volume <- c.downField("volume").as[Integer]

        p_amount <- c.downField("amount").as[Integer]

        p_ticktime <- c.downField("ticktime").as[String]

        p_per <- c.downField("per").as[Double]

        p_pb <- c.downField("pb").as[Double]

        p_mktcap <- c.downField("mktcap").as[Double]

        p_nmc <- c.downField("nmc").as[Double]

        p_turnoverratio <- c.downField("turnoverratio").as[Double]

      } yield {
        stock_sector_detailResponse(
          p_symbol,
          p_code,
          p_name,
          p_trade,
          p_pricechange,
          p_changepercent,
          p_buy,
          p_sell,
          p_settlement,
          p_open,
          p_high,
          p_low,
          p_volume,
          p_amount,
          p_ticktime,
          p_per,
          p_pb,
          p_mktcap,
          p_nmc,
          p_turnoverratio
        )
      }
  }

}

object JsonItem_stock_sector_detailResponse extends Json_stock_sector_detailResponse
