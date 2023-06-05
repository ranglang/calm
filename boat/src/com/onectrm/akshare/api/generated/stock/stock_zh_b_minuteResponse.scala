package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_b_minuteResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_b_minute 目标地址:
  * http://finance.sina.com.cn/realstock/company/sh900901/nc.shtml 描述: 新浪财经 B 股股票或者指数的分时数据，目前可以获取 1,
  * 5, 15, 30, 60 分钟的数据频率, 可以指定是否复权 限量: 单次返回指定股票或指数的指定频率的最近交易日的历史分时行情数据
  */
case class Respstock_zh_b_minuteResponse(
  `p_day`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

case class stock_zh_b_minuteResponse(
  `p_day`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

trait Json_stock_zh_b_minuteResponse {

  implicit val a_stock_zh_b_minuteResponse = new Decoder[stock_zh_b_minuteResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_b_minuteResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_day <- c.downField("day").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

      } yield {
        stock_zh_b_minuteResponse(
          p_day,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume
        )
      }
  }

}

object JsonItem_stock_zh_b_minuteResponse extends Json_stock_zh_b_minuteResponse
