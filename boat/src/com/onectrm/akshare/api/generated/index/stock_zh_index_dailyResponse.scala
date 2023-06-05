package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.stock_zh_index_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: stock_zh_index_daily 目标地址:
  * https://finance.sina.com.cn/realstock/company/sz399552/nc.shtml(示例) 描述: 股票指数的历史数据按日频率更新 限量:
  * 单次返回指定指数的所有历史行情数据
  */
case class Respstock_zh_index_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

case class stock_zh_index_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

trait Json_stock_zh_index_dailyResponse {

  implicit val a_stock_zh_index_dailyResponse = new Decoder[stock_zh_index_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_index_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Integer]

      } yield {
        stock_zh_index_dailyResponse(
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

object JsonItem_stock_zh_index_dailyResponse extends Json_stock_zh_index_dailyResponse
