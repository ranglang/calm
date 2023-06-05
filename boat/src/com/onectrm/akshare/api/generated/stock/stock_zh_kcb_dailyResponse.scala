package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_kcb_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_kcb_daily 目标地址:
  * https://finance.sina.com.cn/realstock/company/sh688001/nc.shtml(示例) 描述: 新浪财经-科创板股票历史行情数据 限量:
  * 单次返回指定 symbol 和 adjust 的所有历史行情数据; 请控制采集的频率, 大量抓取容易封IP
  */
case class Respstock_zh_kcb_dailyResponse(
  `p_date`: String,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_open`: Double,
  `p_volume`: Double,
  `p_aftervolume`: Double,
  `p_afteramount`: Double,
  `p_outstandingshare`: Double,
  `p_turnover`: Double
)

case class stock_zh_kcb_dailyResponse(
  `p_date`: String,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_open`: Double,
  `p_volume`: Double,
  `p_aftervolume`: Double,
  `p_afteramount`: Double,
  `p_outstandingshare`: Double,
  `p_turnover`: Double
)

trait Json_stock_zh_kcb_dailyResponse {

  implicit val a_stock_zh_kcb_dailyResponse = new Decoder[stock_zh_kcb_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_kcb_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_close <- c.downField("close").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_open <- c.downField("open").as[Double]

        p_volume <- c.downField("volume").as[Double]

        p_aftervolume <- c.downField("after_volume").as[Double]

        p_afteramount <- c.downField("after_amount").as[Double]

        p_outstandingshare <- c.downField("outstanding_share").as[Double]

        p_turnover <- c.downField("turnover").as[Double]

      } yield {
        stock_zh_kcb_dailyResponse(
          p_date,
          p_close,
          p_high,
          p_low,
          p_open,
          p_volume,
          p_aftervolume,
          p_afteramount,
          p_outstandingshare,
          p_turnover
        )
      }
  }

}

object JsonItem_stock_zh_kcb_dailyResponse extends Json_stock_zh_kcb_dailyResponse
