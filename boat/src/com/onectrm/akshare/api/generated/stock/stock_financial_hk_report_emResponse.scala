package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_financial_hk_report_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_financial_hk_report_em 目标地址:
  * https://emweb.securities.eastmoney.com/PC_HKF10/FinancialAnalysis/index?type=web&amp;code=00700
  * 描述: 东方财富-港股-财务报表-三大报表 限量: 单次获取指定报表的所有年份数据
  */
case class Respstock_financial_hk_report_emResponse(
)

case class stock_financial_hk_report_emResponse(
)

trait Json_stock_financial_hk_report_emResponse {

  implicit val a_stock_financial_hk_report_emResponse =
    new Decoder[stock_financial_hk_report_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_financial_hk_report_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

        } yield {
          stock_financial_hk_report_emResponse(
          )
        }
    }

}

object JsonItem_stock_financial_hk_report_emResponse
    extends Json_stock_financial_hk_report_emResponse
