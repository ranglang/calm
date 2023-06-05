package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_financial_report_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_financial_report_sina 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vFD_BalanceSheet/stockid/600004/ctrl/part/displaytype/4.phtml
  * 描述: 新浪财经-财务报表-三大报表 限量: 单次获取指定报表的所有年份数据
  */
case class Respstock_financial_report_sinaResponse(
  `p_bao4biao3ri4qi1`: String,
  `p_dan1wei4`: String,
  `p_`: String
)

case class stock_financial_report_sinaResponse(
  `p_bao4biao3ri4qi1`: String,
  `p_dan1wei4`: String,
  `p_`: String
)

trait Json_stock_financial_report_sinaResponse {

  implicit val a_stock_financial_report_sinaResponse =
    new Decoder[stock_financial_report_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_financial_report_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_bao4biao3ri4qi1 <- c.downField("报表日期").as[String]

          p_dan1wei4 <- c.downField("单位").as[String]

          p_ <- c.downField("...").as[String]

        } yield {
          stock_financial_report_sinaResponse(
            p_bao4biao3ri4qi1,
            p_dan1wei4,
            p_
          )
        }
    }

}

object JsonItem_stock_financial_report_sinaResponse extends Json_stock_financial_report_sinaResponse
