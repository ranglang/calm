package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_daily 目标地址: http://finance.sina.com.cn/stock/usstock/sector.shtml 描述:
  * 美股历史行情数据，设定 adjust=&quot;qfq&quot; 则返回前复权后的数据，默认 adjust=&quot;&quot;, 则返回未复权的数据，历史数据按日频率更新 限量:
  * 单次返回指定上市公司的指定 adjust 后的所有历史行情数据
  */
case class Respstock_us_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

case class stock_us_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

trait Json_stock_us_dailyResponse {

  implicit val a_stock_us_dailyResponse = new Decoder[stock_us_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

      } yield {
        stock_us_dailyResponse(
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

object JsonItem_stock_us_dailyResponse extends Json_stock_us_dailyResponse
