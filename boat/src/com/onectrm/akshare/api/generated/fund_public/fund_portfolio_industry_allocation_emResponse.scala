package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_portfolio_industry_allocation_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_portfolio_industry_allocation_em 目标地址:
  * http://fundf10.eastmoney.com/hytz_000001.html 描述: 天天基金网-基金档案-投资组合-行业配置 限量: 单次返回指定 symbol 和 date
  * 的所有持仓数据
  */
case class Respfund_portfolio_industry_allocation_emResponse(
  `p_xu4hao4`: Integer,
  `p_xing2ye4lei4bie2`: String,
  `p_zhan4jing4zhi2bi3li4`: Double,
  `p_shi4zhi2`: Double,
  `p_jie2zhi3shi2jian1`: String
)

case class fund_portfolio_industry_allocation_emResponse(
  `p_xu4hao4`: Integer,
  `p_xing2ye4lei4bie2`: String,
  `p_zhan4jing4zhi2bi3li4`: Double,
  `p_shi4zhi2`: Double,
  `p_jie2zhi3shi2jian1`: String
)

trait Json_fund_portfolio_industry_allocation_emResponse {

  implicit val a_fund_portfolio_industry_allocation_emResponse =
    new Decoder[fund_portfolio_industry_allocation_emResponse] {
      final def apply(c: HCursor): Decoder.Result[fund_portfolio_industry_allocation_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_xing2ye4lei4bie2 <- c.downField("行业类别").as[String]

          p_zhan4jing4zhi2bi3li4 <- c.downField("占净值比例").as[Double]

          p_shi4zhi2 <- c.downField("市值").as[Double]

          p_jie2zhi3shi2jian1 <- c.downField("截止时间").as[String]

        } yield {
          fund_portfolio_industry_allocation_emResponse(
            p_xu4hao4,
            p_xing2ye4lei4bie2,
            p_zhan4jing4zhi2bi3li4,
            p_shi4zhi2,
            p_jie2zhi3shi2jian1
          )
        }
    }

}

object JsonItem_fund_portfolio_industry_allocation_emResponse
    extends Json_fund_portfolio_industry_allocation_emResponse
