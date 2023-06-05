package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_report_fund_holdResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_report_fund_hold 目标地址: http://data.eastmoney.com/zlsj/2020-06-30-1-2.html
  * 描述: 东方财富网-数据中心-主力数据-基金持仓 限量: 单次返回指定 symbol 和 date 的所有历史数据
  */
case class Respstock_report_fund_holdResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_chi2you3ji1jin1jia1shu4`: Integer,
  `p_chi2gu3zong3shu4`: Integer,
  `p_chi2gu3shi4zhi2`: Double,
  `p_chi2gu3bian4hua4`: String,
  `p_chi2gu3bian4dong4shu4zhi2`: Integer,
  `p_chi2gu3bian4dong4bi3li4`: Double
)

case class stock_report_fund_holdResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_chi2you3ji1jin1jia1shu4`: Integer,
  `p_chi2gu3zong3shu4`: Integer,
  `p_chi2gu3shi4zhi2`: Double,
  `p_chi2gu3bian4hua4`: String,
  `p_chi2gu3bian4dong4shu4zhi2`: Integer,
  `p_chi2gu3bian4dong4bi3li4`: Double
)

trait Json_stock_report_fund_holdResponse {

  implicit val a_stock_report_fund_holdResponse = new Decoder[stock_report_fund_holdResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_report_fund_holdResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_chi2you3ji1jin1jia1shu4 <- c.downField("持有基金家数").as[Integer]

        p_chi2gu3zong3shu4 <- c.downField("持股总数").as[Integer]

        p_chi2gu3shi4zhi2 <- c.downField("持股市值").as[Double]

        p_chi2gu3bian4hua4 <- c.downField("持股变化").as[String]

        p_chi2gu3bian4dong4shu4zhi2 <- c.downField("持股变动数值").as[Integer]

        p_chi2gu3bian4dong4bi3li4 <- c.downField("持股变动比例").as[Double]

      } yield {
        stock_report_fund_holdResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_chi2you3ji1jin1jia1shu4,
          p_chi2gu3zong3shu4,
          p_chi2gu3shi4zhi2,
          p_chi2gu3bian4hua4,
          p_chi2gu3bian4dong4shu4zhi2,
          p_chi2gu3bian4dong4bi3li4
        )
      }
  }

}

object JsonItem_stock_report_fund_holdResponse extends Json_stock_report_fund_holdResponse
