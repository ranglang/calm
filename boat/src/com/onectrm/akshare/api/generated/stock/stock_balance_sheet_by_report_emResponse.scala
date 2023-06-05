package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_balance_sheet_by_report_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_balance_sheet_by_report_em 目标地址:
  * https://emweb.securities.eastmoney.com/PC_HSF10/NewFinanceAnalysis/Index?type=web&amp;code=sh600519#lrb-0
  * 描述: 东方财富-股票-财务分析-资产负债表-按报告期 限量: 单次获取指定 symbol 的资产负债表-按报告期数据
  */
case class Respstock_balance_sheet_by_report_emResponse(
  `p_319xiang4bu4zhu2yi1lie4chu1`: String
)

case class stock_balance_sheet_by_report_emResponse(
  `p_319xiang4bu4zhu2yi1lie4chu1`: String
)

trait Json_stock_balance_sheet_by_report_emResponse {

  implicit val a_stock_balance_sheet_by_report_emResponse =
    new Decoder[stock_balance_sheet_by_report_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_balance_sheet_by_report_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_319xiang4bu4zhu2yi1lie4chu1 <- c.downField("").as[String]

        } yield {
          stock_balance_sheet_by_report_emResponse(
            p_319xiang4bu4zhu2yi1lie4chu1
          )
        }
    }

}

object JsonItem_stock_balance_sheet_by_report_emResponse
    extends Json_stock_balance_sheet_by_report_emResponse
