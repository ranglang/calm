package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hk_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hk_daily 目标地址:
  * http://stock.finance.sina.com.cn/hkstock/quotes/01336.html(个例) 描述: 港股-历史行情数据,
  * 可以选择返回复权后数据,更新频率为日频 限量: 单次返回指定上市公司的历史行情数据(包括前后复权因子), 提供新浪财经拥有的该股票的所有数据(并不等于该股票从上市至今的数据)
  */
case class Respstock_hk_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

case class stock_hk_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

trait Json_stock_hk_dailyResponse {

  implicit val a_stock_hk_dailyResponse = new Decoder[stock_hk_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hk_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

      } yield {
        stock_hk_dailyResponse(
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

object JsonItem_stock_hk_dailyResponse extends Json_stock_hk_dailyResponse
