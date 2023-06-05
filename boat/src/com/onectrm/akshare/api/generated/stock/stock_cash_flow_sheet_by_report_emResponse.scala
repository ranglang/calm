package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_cash_flow_sheet_by_report_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_cash_flow_sheet_by_report_em 目标地址:
  * https://emweb.securities.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&amp;code=sh600519#lrb-0
  * 描述: 东方财富-股票-财务分析-现金流量表-按报告期 限量: 单次获取指定 symbol 的现金流量表-按报告期数据
  */
case class Respstock_cash_flow_sheet_by_report_emResponse(
  `p_204xiang4bu4zhu2yi1lie4chu1`: String
)

case class stock_cash_flow_sheet_by_report_emResponse(
  `p_204xiang4bu4zhu2yi1lie4chu1`: String
)

trait Json_stock_cash_flow_sheet_by_report_emResponse {

  implicit val a_stock_cash_flow_sheet_by_report_emResponse =
    new Decoder[stock_cash_flow_sheet_by_report_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_cash_flow_sheet_by_report_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_204xiang4bu4zhu2yi1lie4chu1 <- c.downField("").as[String]

        } yield {
          stock_cash_flow_sheet_by_report_emResponse(
            p_204xiang4bu4zhu2yi1lie4chu1
          )
        }
    }

}

object JsonItem_stock_cash_flow_sheet_by_report_emResponse
    extends Json_stock_cash_flow_sheet_by_report_emResponse
