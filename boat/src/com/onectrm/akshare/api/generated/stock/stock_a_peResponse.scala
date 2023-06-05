package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_peResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_pe 目标地址: https://www.legulegu.com/stockdata/market_pe 描述: 乐咕乐股网站-A股市盈率
  * 限量: 单次获取指定 symbol 的所有数据
  */
case class Respstock_a_peResponse(
  `p_date`: String,
  `p_averagePELYR`: Double,
  `p_averagePETTM`: Double,
  `p_middlePELYR`: Double,
  `p_middlePETTM`: Double,
  `p_close`: Double
)

case class stock_a_peResponse(
  `p_date`: String,
  `p_averagePELYR`: Double,
  `p_averagePETTM`: Double,
  `p_middlePELYR`: Double,
  `p_middlePETTM`: Double,
  `p_close`: Double
)

trait Json_stock_a_peResponse {

  implicit val a_stock_a_peResponse = new Decoder[stock_a_peResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_a_peResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_averagePELYR <- c.downField("averagePELYR").as[Double]

        p_averagePETTM <- c.downField("averagePETTM").as[Double]

        p_middlePELYR <- c.downField("middlePELYR").as[Double]

        p_middlePETTM <- c.downField("middlePETTM").as[Double]

        p_close <- c.downField("close").as[Double]

      } yield {
        stock_a_peResponse(
          p_date,
          p_averagePELYR,
          p_averagePETTM,
          p_middlePELYR,
          p_middlePETTM,
          p_close
        )
      }
  }

}

object JsonItem_stock_a_peResponse extends Json_stock_a_peResponse
