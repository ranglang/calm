package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_financial_hk_analysis_indicator_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_financial_hk_analysis_indicator_em 目标地址:
  * https://emweb.securities.eastmoney.com/PC_HKF10/NewFinancialAnalysis/index?type=web&amp;code=00700
  * 描述: 东方财富-港股-财务分析-主要指标 限量: 单次获取财务指标所有历史数据
  */
case class Respstock_financial_hk_analysis_indicator_emResponse(
  `p_zhou1qi1`: String,
  `p_ji1ben3mei3gu3shou1yi4yuan2`: String,
  `p_xi1shi4mei3gu3shou1yi4yuan2`: String,
  `p_TTMmei3gu3shou1yi4yuan2`: String,
  `p_`: String
)

case class stock_financial_hk_analysis_indicator_emResponse(
  `p_zhou1qi1`: String,
  `p_ji1ben3mei3gu3shou1yi4yuan2`: String,
  `p_xi1shi4mei3gu3shou1yi4yuan2`: String,
  `p_TTMmei3gu3shou1yi4yuan2`: String,
  `p_`: String
)

trait Json_stock_financial_hk_analysis_indicator_emResponse {

  implicit val a_stock_financial_hk_analysis_indicator_emResponse =
    new Decoder[stock_financial_hk_analysis_indicator_emResponse] {
      final def apply(
        c: HCursor
      ): Decoder.Result[stock_financial_hk_analysis_indicator_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zhou1qi1 <- c.downField("周期").as[String]

          p_ji1ben3mei3gu3shou1yi4yuan2 <- c.downField("基本每股收益(元)").as[String]

          p_xi1shi4mei3gu3shou1yi4yuan2 <- c.downField("稀释每股收益(元)").as[String]

          p_TTMmei3gu3shou1yi4yuan2 <- c.downField("TTM每股收益(元)").as[String]

          p_ <- c.downField("...").as[String]

        } yield {
          stock_financial_hk_analysis_indicator_emResponse(
            p_zhou1qi1,
            p_ji1ben3mei3gu3shou1yi4yuan2,
            p_xi1shi4mei3gu3shou1yi4yuan2,
            p_TTMmei3gu3shou1yi4yuan2,
            p_
          )
        }
    }

}

object JsonItem_stock_financial_hk_analysis_indicator_emResponse
    extends Json_stock_financial_hk_analysis_indicator_emResponse
