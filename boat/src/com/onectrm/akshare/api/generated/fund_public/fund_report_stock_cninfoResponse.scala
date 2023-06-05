package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_report_stock_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_report_stock_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics 描述: 巨潮资讯-数据中心-专题统计-基金报表-基金重仓股 限量: 返回指定 date
  * 的所有数据; date 从 2017 年开始
  */
case class Respfund_report_stock_cninfoResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_bao4gao4qi1`: String,
  `p_ji1jin1fu4gai4jia1shu4`: Integer,
  `p_chi2gu3zong3shu4`: String,
  `p_chi2gu3zong3shi4zhi2`: String
)

case class fund_report_stock_cninfoResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_bao4gao4qi1`: String,
  `p_ji1jin1fu4gai4jia1shu4`: Integer,
  `p_chi2gu3zong3shu4`: String,
  `p_chi2gu3zong3shi4zhi2`: String
)

trait Json_fund_report_stock_cninfoResponse {

  implicit val a_fund_report_stock_cninfoResponse = new Decoder[fund_report_stock_cninfoResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_report_stock_cninfoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_bao4gao4qi1 <- c.downField("报告期").as[String]

        p_ji1jin1fu4gai4jia1shu4 <- c.downField("基金覆盖家数").as[Integer]

        p_chi2gu3zong3shu4 <- c.downField("持股总数").as[String]

        p_chi2gu3zong3shi4zhi2 <- c.downField("持股总市值").as[String]

      } yield {
        fund_report_stock_cninfoResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_bao4gao4qi1,
          p_ji1jin1fu4gai4jia1shu4,
          p_chi2gu3zong3shu4,
          p_chi2gu3zong3shi4zhi2
        )
      }
  }

}

object JsonItem_fund_report_stock_cninfoResponse extends Json_fund_report_stock_cninfoResponse
