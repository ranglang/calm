package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_daily 目标地址:
  * https://finance.sina.com.cn/realstock/company/sh600006/nc.shtml(示例) 描述: 新浪财经-沪深京 A 股的数据,
  * 历史数据按日频率更新; 注意其中的 **sh689009** 为 CDR, 请 限量: 单次返回指定沪深京 A 股上市公司指定日期间的历史行情日频率数据, 多次获取容易封禁 IP
  */
case class Respstock_zh_a_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double,
  `p_outstandingshare`: Double,
  `p_turnover`: Double
)

case class stock_zh_a_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double,
  `p_outstandingshare`: Double,
  `p_turnover`: Double
)

trait Json_stock_zh_a_dailyResponse {

  implicit val a_stock_zh_a_dailyResponse = new Decoder[stock_zh_a_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

        p_outstandingshare <- c.downField("outstanding_share").as[Double]

        p_turnover <- c.downField("turnover").as[Double]

      } yield {
        stock_zh_a_dailyResponse(
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume,
          p_outstandingshare,
          p_turnover
        )
      }
  }

}

object JsonItem_stock_zh_a_dailyResponse extends Json_stock_zh_a_dailyResponse
