package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_market_activity_leguResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_market_activity_legu 目标地址:
  * https://www.legulegu.com/stockdata/market-activity 描述: 乐咕乐股网-赚钱效应分析数据 限量: 单次返回当前赚钱效应分析数据
  */
case class Respstock_market_activity_leguResponse(
  `p_item`: String,
  `p_value`: String
)

case class stock_market_activity_leguResponse(
  `p_item`: String,
  `p_value`: String
)

trait Json_stock_market_activity_leguResponse {

  implicit val a_stock_market_activity_leguResponse =
    new Decoder[stock_market_activity_leguResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_market_activity_leguResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_item <- c.downField("item").as[String]

          p_value <- c.downField("value").as[String]

        } yield {
          stock_market_activity_leguResponse(
            p_item,
            p_value
          )
        }
    }

}

object JsonItem_stock_market_activity_leguResponse extends Json_stock_market_activity_leguResponse
