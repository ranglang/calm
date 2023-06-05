package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_portfolio_hold_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_portfolio_hold_em 目标地址: http://fundf10.eastmoney.com/ccmx_000001.html
  * 描述: 天天基金网-基金档案-投资组合-基金持仓 限量: 单次返回指定 symbol 和 date 的所有持仓数据
  */
case class Respfund_portfolio_hold_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_zhan4jing4zhi2bi3li4`: Double,
  `p_chi2gu3shu4`: Double,
  `p_chi2cang1shi4zhi2`: Double,
  `p_ji4du4`: String
)

case class fund_portfolio_hold_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_zhan4jing4zhi2bi3li4`: Double,
  `p_chi2gu3shu4`: Double,
  `p_chi2cang1shi4zhi2`: Double,
  `p_ji4du4`: String
)

trait Json_fund_portfolio_hold_emResponse {

  implicit val a_fund_portfolio_hold_emResponse = new Decoder[fund_portfolio_hold_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_portfolio_hold_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_zhan4jing4zhi2bi3li4 <- c.downField("占净值比例").as[Double]

        p_chi2gu3shu4 <- c.downField("持股数").as[Double]

        p_chi2cang1shi4zhi2 <- c.downField("持仓市值").as[Double]

        p_ji4du4 <- c.downField("季度").as[String]

      } yield {
        fund_portfolio_hold_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4ming2cheng1,
          p_zhan4jing4zhi2bi3li4,
          p_chi2gu3shu4,
          p_chi2cang1shi4zhi2,
          p_ji4du4
        )
      }
  }

}

object JsonItem_fund_portfolio_hold_emResponse extends Json_fund_portfolio_hold_emResponse
