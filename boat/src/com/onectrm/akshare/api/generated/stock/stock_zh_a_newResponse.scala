package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_newResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_new 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#new_stock 描述:
  * 新浪财经-行情中心-沪深股市-次新股 限量: 单次返回所有次新股行情数据, 由于次新股名单随着交易日变化而变化，只能获取最近交易日的数据
  */
case class Respstock_zh_a_newResponse(
  `p_symbol`: String,
  `p_code`: String,
  `p_name`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Integer,
  `p_amount`: Integer,
  `p_mktcap`: Double,
  `p_turnoverratio`: Double
)

case class stock_zh_a_newResponse(
  `p_symbol`: String,
  `p_code`: String,
  `p_name`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_volume`: Integer,
  `p_amount`: Integer,
  `p_mktcap`: Double,
  `p_turnoverratio`: Double
)

trait Json_stock_zh_a_newResponse {

  implicit val a_stock_zh_a_newResponse = new Decoder[stock_zh_a_newResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_newResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_symbol <- c.downField("symbol").as[String]

        p_code <- c.downField("code").as[String]

        p_name <- c.downField("name").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_volume <- c.downField("volume").as[Integer]

        p_amount <- c.downField("amount").as[Integer]

        p_mktcap <- c.downField("mktcap").as[Double]

        p_turnoverratio <- c.downField("turnoverratio").as[Double]

      } yield {
        stock_zh_a_newResponse(
          p_symbol,
          p_code,
          p_name,
          p_open,
          p_high,
          p_low,
          p_volume,
          p_amount,
          p_mktcap,
          p_turnoverratio
        )
      }
  }

}

object JsonItem_stock_zh_a_newResponse extends Json_stock_zh_a_newResponse
