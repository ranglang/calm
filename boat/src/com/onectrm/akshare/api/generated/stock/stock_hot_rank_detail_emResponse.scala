package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_rank_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_rank_detail_em 目标地址: http://guba.eastmoney.com/rank/stock?code=000665
  * 描述: 东方财富网站-股票热度-历史趋势及粉丝特征 限量: 单次返回指定 symbol 的股票近期历史数据
  */
case class Respstock_hot_rank_detail_emResponse(
  `p_shi2jian1`: String,
  `p_pai2ming2`: Integer,
  `p_zheng4quan4dai4ma3`: String,
  `p_xin1jin4fen3si1`: Double,
  `p_tie3gan1fen3si1`: Double
)

case class stock_hot_rank_detail_emResponse(
  `p_shi2jian1`: String,
  `p_pai2ming2`: Integer,
  `p_zheng4quan4dai4ma3`: String,
  `p_xin1jin4fen3si1`: Double,
  `p_tie3gan1fen3si1`: Double
)

trait Json_stock_hot_rank_detail_emResponse {

  implicit val a_stock_hot_rank_detail_emResponse = new Decoder[stock_hot_rank_detail_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_rank_detail_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_pai2ming2 <- c.downField("排名").as[Integer]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_xin1jin4fen3si1 <- c.downField("新晋粉丝").as[Double]

        p_tie3gan1fen3si1 <- c.downField("铁杆粉丝").as[Double]

      } yield {
        stock_hot_rank_detail_emResponse(
          p_shi2jian1,
          p_pai2ming2,
          p_zheng4quan4dai4ma3,
          p_xin1jin4fen3si1,
          p_tie3gan1fen3si1
        )
      }
  }

}

object JsonItem_stock_hot_rank_detail_emResponse extends Json_stock_hot_rank_detail_emResponse
