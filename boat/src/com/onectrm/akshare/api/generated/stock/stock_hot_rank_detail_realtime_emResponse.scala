package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_rank_detail_realtime_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_rank_detail_realtime_em 目标地址:
  * http://guba.eastmoney.com/rank/stock?code=000665 描述: 东方财富个股人气榜-实时变动 限量: 单次返回指定 symbol 的股票近期历史数据
  */
case class Respstock_hot_rank_detail_realtime_emResponse(
  `p_shi2jian1`: String,
  `p_pai2ming2`: Integer
)

case class stock_hot_rank_detail_realtime_emResponse(
  `p_shi2jian1`: String,
  `p_pai2ming2`: Integer
)

trait Json_stock_hot_rank_detail_realtime_emResponse {

  implicit val a_stock_hot_rank_detail_realtime_emResponse =
    new Decoder[stock_hot_rank_detail_realtime_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_hot_rank_detail_realtime_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shi2jian1 <- c.downField("时间").as[String]

          p_pai2ming2 <- c.downField("排名").as[Integer]

        } yield {
          stock_hot_rank_detail_realtime_emResponse(
            p_shi2jian1,
            p_pai2ming2
          )
        }
    }

}

object JsonItem_stock_hot_rank_detail_realtime_emResponse
    extends Json_stock_hot_rank_detail_realtime_emResponse
