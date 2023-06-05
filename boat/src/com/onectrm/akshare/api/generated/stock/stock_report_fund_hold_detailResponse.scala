package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_report_fund_hold_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_report_fund_hold_detail 目标地址:
  * http://data.eastmoney.com/zlsj/ccjj/2020-12-31-008286.html 描述: 东方财富网-数据中心-主力数据-基金持仓-基金持仓明细表 限量:
  * 单次返回指定 symbol 和 date 的所有历史数据
  */
case class Respstock_report_fund_hold_detailResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_chi2gu3shu4`: Integer,
  `p_chi2gu3shi4zhi2`: Double,
  `p_zhan4zong3gu3ben3bi3li4`: Double,
  `p_zhan4liu2tong1gu3ben3bi3li4`: Double
)

case class stock_report_fund_hold_detailResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_chi2gu3shu4`: Integer,
  `p_chi2gu3shi4zhi2`: Double,
  `p_zhan4zong3gu3ben3bi3li4`: Double,
  `p_zhan4liu2tong1gu3ben3bi3li4`: Double
)

trait Json_stock_report_fund_hold_detailResponse {

  implicit val a_stock_report_fund_hold_detailResponse =
    new Decoder[stock_report_fund_hold_detailResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_report_fund_hold_detailResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_chi2gu3shu4 <- c.downField("持股数").as[Integer]

          p_chi2gu3shi4zhi2 <- c.downField("持股市值").as[Double]

          p_zhan4zong3gu3ben3bi3li4 <- c.downField("占总股本比例").as[Double]

          p_zhan4liu2tong1gu3ben3bi3li4 <- c.downField("占流通股本比例").as[Double]

        } yield {
          stock_report_fund_hold_detailResponse(
            p_xu4hao4,
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_chi2gu3shu4,
            p_chi2gu3shi4zhi2,
            p_zhan4zong3gu3ben3bi3li4,
            p_zhan4liu2tong1gu3ben3bi3li4
          )
        }
    }

}

object JsonItem_stock_report_fund_hold_detailResponse
    extends Json_stock_report_fund_hold_detailResponse
