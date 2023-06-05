package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_tgbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_tgb 目标地址: https://www.taoguba.com.cn/stock/moreHotStock 描述: 淘股吧-热门股票
  * 限量: 单次返回排名前 20 股票
  */
case class Respstock_hot_tgbResponse(
  `p_ge4gu3dai4ma3`: String,
  `p_ge4gu3ming2cheng1`: String
)

case class stock_hot_tgbResponse(
  `p_ge4gu3dai4ma3`: String,
  `p_ge4gu3ming2cheng1`: String
)

trait Json_stock_hot_tgbResponse {

  implicit val a_stock_hot_tgbResponse = new Decoder[stock_hot_tgbResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_tgbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ge4gu3dai4ma3 <- c.downField("个股代码").as[String]

        p_ge4gu3ming2cheng1 <- c.downField("个股名称").as[String]

      } yield {
        stock_hot_tgbResponse(
          p_ge4gu3dai4ma3,
          p_ge4gu3ming2cheng1
        )
      }
  }

}

object JsonItem_stock_hot_tgbResponse extends Json_stock_hot_tgbResponse
