package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_high_low_statisticsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_high_low_statistics 目标地址:
  * https://www.legulegu.com/stockdata/high-low-statistics 描述: 不同市场的创新高和新低的股票数量 限量: 单次获取指定 market
  * 的所有历史数据
  */
case class Respstock_a_high_low_statisticsResponse(
  `p_date`: String,
  `p_close`: Double,
  `p_high20`: Double,
  `p_low20`: Double,
  `p_high60`: Double,
  `p_low60`: Double,
  `p_high120`: Double,
  `p_low120`: Double
)

case class stock_a_high_low_statisticsResponse(
  `p_date`: String,
  `p_close`: Double,
  `p_high20`: Double,
  `p_low20`: Double,
  `p_high60`: Double,
  `p_low60`: Double,
  `p_high120`: Double,
  `p_low120`: Double
)

trait Json_stock_a_high_low_statisticsResponse {

  implicit val a_stock_a_high_low_statisticsResponse =
    new Decoder[stock_a_high_low_statisticsResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_a_high_low_statisticsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_date <- c.downField("date").as[String]

          p_close <- c.downField("close").as[Double]

          p_high20 <- c.downField("high20").as[Double]

          p_low20 <- c.downField("low20").as[Double]

          p_high60 <- c.downField("high60").as[Double]

          p_low60 <- c.downField("low60").as[Double]

          p_high120 <- c.downField("high120").as[Double]

          p_low120 <- c.downField("low120").as[Double]

        } yield {
          stock_a_high_low_statisticsResponse(
            p_date,
            p_close,
            p_high20,
            p_low20,
            p_high60,
            p_low60,
            p_high120,
            p_low120
          )
        }
    }

}

object JsonItem_stock_a_high_low_statisticsResponse extends Json_stock_a_high_low_statisticsResponse
