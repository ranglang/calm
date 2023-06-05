package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hsgt_north_net_flow_in_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hsgt_north_net_flow_in_em 目标地址: http://data.eastmoney.com/hsgtcg/ 描述:
  * 东方财富网-数据中心-沪深港通持股-北向概况-北向净流入; 注: 资金净流入=当日资金限额-当日资金余额; 资金净流入包含当日成交净买额和当日买入申报未成交金额;
  * 北向资金是沪股通与深股通的资金加总 限量: 单次返回指定 symbol 的所有数据
  */
case class Respstock_hsgt_north_net_flow_in_emResponse(
  `p_date`: String,
  `p_value`: Double
)

case class stock_hsgt_north_net_flow_in_emResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_stock_hsgt_north_net_flow_in_emResponse {

  implicit val a_stock_hsgt_north_net_flow_in_emResponse =
    new Decoder[stock_hsgt_north_net_flow_in_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_hsgt_north_net_flow_in_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_date <- c.downField("date").as[String]

          p_value <- c.downField("value").as[Double]

        } yield {
          stock_hsgt_north_net_flow_in_emResponse(
            p_date,
            p_value
          )
        }
    }

}

object JsonItem_stock_hsgt_north_net_flow_in_emResponse
    extends Json_stock_hsgt_north_net_flow_in_emResponse
