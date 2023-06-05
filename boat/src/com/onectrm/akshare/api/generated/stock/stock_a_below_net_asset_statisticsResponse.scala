package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_below_net_asset_statisticsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_below_net_asset_statistics 目标地址:
  * https://www.legulegu.com/stockdata/below-net-asset-statistics 描述: 乐咕乐股-A 股破净股统计数据 限量: 单次获取所有历史数据
  */
case class Respstock_a_below_net_asset_statisticsResponse(
  `p_date`: String,
  `p_belownetasset`: Double,
  `p_totalcompany`: Double,
  `p_belownetassetratio`: Double
)

case class stock_a_below_net_asset_statisticsResponse(
  `p_date`: String,
  `p_belownetasset`: Double,
  `p_totalcompany`: Double,
  `p_belownetassetratio`: Double
)

trait Json_stock_a_below_net_asset_statisticsResponse {

  implicit val a_stock_a_below_net_asset_statisticsResponse =
    new Decoder[stock_a_below_net_asset_statisticsResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_a_below_net_asset_statisticsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_date <- c.downField("date").as[String]

          p_belownetasset <- c.downField("below_net_asset").as[Double]

          p_totalcompany <- c.downField("total_company").as[Double]

          p_belownetassetratio <- c.downField("below_net_asset_ratio").as[Double]

        } yield {
          stock_a_below_net_asset_statisticsResponse(
            p_date,
            p_belownetasset,
            p_totalcompany,
            p_belownetassetratio
          )
        }
    }

}

object JsonItem_stock_a_below_net_asset_statisticsResponse
    extends Json_stock_a_below_net_asset_statisticsResponse
