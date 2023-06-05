package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_lg_indicatorResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_lg_indicator 目标地址: https://www.legulegu.com/stocklist 描述: 乐咕乐股-A 股个股指标:
  * 市盈率, 市净率, 股息率 限量: 单次获取指定 symbol 的所有历史数据
  */
case class Respstock_a_lg_indicatorResponse(
  `p_tradedate`: String,
  `p_pe`: Double,
  `p_pettm`: Double,
  `p_pb`: Double,
  `p_ps`: Double,
  `p_psttm`: Double,
  `p_dvratio`: Double,
  `p_dvttm`: Double,
  `p_totalmv`: Double
)

case class stock_a_lg_indicatorResponse(
  `p_tradedate`: String,
  `p_pe`: Double,
  `p_pettm`: Double,
  `p_pb`: Double,
  `p_ps`: Double,
  `p_psttm`: Double,
  `p_dvratio`: Double,
  `p_dvttm`: Double,
  `p_totalmv`: Double
)

trait Json_stock_a_lg_indicatorResponse {

  implicit val a_stock_a_lg_indicatorResponse = new Decoder[stock_a_lg_indicatorResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_a_lg_indicatorResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_tradedate <- c.downField("trade_date").as[String]

        p_pe <- c.downField("pe").as[Double]

        p_pettm <- c.downField("pe_ttm").as[Double]

        p_pb <- c.downField("pb").as[Double]

        p_ps <- c.downField("ps").as[Double]

        p_psttm <- c.downField("ps_ttm").as[Double]

        p_dvratio <- c.downField("dv_ratio").as[Double]

        p_dvttm <- c.downField("dv_ttm").as[Double]

        p_totalmv <- c.downField("total_mv").as[Double]

      } yield {
        stock_a_lg_indicatorResponse(
          p_tradedate,
          p_pe,
          p_pettm,
          p_pb,
          p_ps,
          p_psttm,
          p_dvratio,
          p_dvttm,
          p_totalmv
        )
      }
  }

}

object JsonItem_stock_a_lg_indicatorResponse extends Json_stock_a_lg_indicatorResponse
