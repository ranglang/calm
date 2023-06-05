package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_cdr_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_cdr_daily 目标地址:
  * https://finance.sina.com.cn/realstock/company/sh689009/nc.shtml 描述: 上海证券交易所-科创板-CDR 限量: 单次返回指定
  * CDR 的日频率数据, 分钟历史行情数据可以通过 stock_zh_a_minute 获取
  */
case class Respstock_zh_a_cdr_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

case class stock_zh_a_cdr_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

trait Json_stock_zh_a_cdr_dailyResponse {

  implicit val a_stock_zh_a_cdr_dailyResponse = new Decoder[stock_zh_a_cdr_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_cdr_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

      } yield {
        stock_zh_a_cdr_dailyResponse(
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume
        )
      }
  }

}

object JsonItem_stock_zh_a_cdr_dailyResponse extends Json_stock_zh_a_cdr_dailyResponse
