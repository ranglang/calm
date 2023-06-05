package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_rank_latest_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_rank_latest_em 目标地址: http://guba.eastmoney.com/rank/stock?code=000665
  * 描述: 东方财富-个股人气榜-最新排名 限量: 单次返回指定 symbol 的股票近期历史数据
  */
case class Respstock_hot_rank_latest_emResponse(
  `p_item`: String,
  `p_value`: String
)

case class stock_hot_rank_latest_emResponse(
  `p_item`: String,
  `p_value`: String
)

trait Json_stock_hot_rank_latest_emResponse {

  implicit val a_stock_hot_rank_latest_emResponse = new Decoder[stock_hot_rank_latest_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_rank_latest_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_item <- c.downField("item").as[String]

        p_value <- c.downField("value").as[String]

      } yield {
        stock_hot_rank_latest_emResponse(
          p_item,
          p_value
        )
      }
  }

}

object JsonItem_stock_hot_rank_latest_emResponse extends Json_stock_hot_rank_latest_emResponse
