package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.stock_zh_index_daily_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: stock_zh_index_daily_em 目标地址: http://quote.eastmoney.com/center/hszs.html 描述:
  * 东方财富股票指数数据, 历史数据按日频率更新 限量: 单次返回具体指数的所有历史行情数据
  */
case class Respstock_zh_index_daily_emResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Double,
  `p_amount`: Double
)

case class stock_zh_index_daily_emResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Double,
  `p_amount`: Double
)

trait Json_stock_zh_index_daily_emResponse {

  implicit val a_stock_zh_index_daily_emResponse = new Decoder[stock_zh_index_daily_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_index_daily_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_close <- c.downField("close").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_volume <- c.downField("volume").as[Double]

        p_amount <- c.downField("amount").as[Double]

      } yield {
        stock_zh_index_daily_emResponse(
          p_date,
          p_open,
          p_close,
          p_high,
          p_low,
          p_volume,
          p_amount
        )
      }
  }

}

object JsonItem_stock_zh_index_daily_emResponse extends Json_stock_zh_index_daily_emResponse
