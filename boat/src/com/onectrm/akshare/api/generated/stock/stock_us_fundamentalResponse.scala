package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_fundamentalResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_fundamental 目标地址:
  * https://www.macrotrends.net/stocks/charts/AAPL/apple/pe-ratio 描述: 美股的基本财务数据, 目前提供 PB 和 PE 的数据
  * 限量: 单次返回指定美股和指标的所有数据
  */
case class Respstock_us_fundamentalResponse(
  `p_gen1ju4symbolbian4hua4`: String
)

case class stock_us_fundamentalResponse(
  `p_gen1ju4symbolbian4hua4`: String
)

trait Json_stock_us_fundamentalResponse {

  implicit val a_stock_us_fundamentalResponse = new Decoder[stock_us_fundamentalResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_fundamentalResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gen1ju4symbolbian4hua4 <- c.downField("").as[String]

      } yield {
        stock_us_fundamentalResponse(
          p_gen1ju4symbolbian4hua4
        )
      }
  }

}

object JsonItem_stock_us_fundamentalResponse extends Json_stock_us_fundamentalResponse
