package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_index_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_index_daily 目标地址:
  * https://finance.sina.com.cn/realstock/company/sz399552/nc.shtml(示例) 描述: 股票指数数据是从新浪财经获取的数据,
  * 历史数据按日频率更新 限量: 单次返回具体某个指数的所有历史行情数据
  */
case class Respstock_zh_index_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_amount`: Double
)

case class stock_zh_index_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_amount`: Double
)

trait Json_stock_zh_index_dailyResponse {

  implicit val a_stock_zh_index_dailyResponse = new Decoder[stock_zh_index_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_index_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_close <- c.downField("close").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_amount <- c.downField("amount").as[Double]

      } yield {
        stock_zh_index_dailyResponse(
          p_date,
          p_open,
          p_close,
          p_high,
          p_low,
          p_amount
        )
      }
  }

}

object JsonItem_stock_zh_index_dailyResponse extends Json_stock_zh_index_dailyResponse
