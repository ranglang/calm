package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_hold_structure_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_hold_structure_em 目标地址: http://fund.eastmoney.com/data/cyrjglist.html
  * 描述: 天天基金网-基金数据-规模份额-持有人结构 限量: 返回所有持有人结构数据
  */
case class Respfund_hold_structure_emResponse(
  `p_xu4hao4`: Integer,
  `p_jie2zhi3ri4qi1`: String,
  `p_ji1jin1jia1shu4`: Integer,
  `p_ji1gou4chi2you3bi3lie4`: Double,
  `p_ge4ren2chi2you3bi3lie4`: Double,
  `p_nei4bu4chi2you3bi3lie4`: Double,
  `p_zong3fen4e2`: Double
)

case class fund_hold_structure_emResponse(
  `p_xu4hao4`: Integer,
  `p_jie2zhi3ri4qi1`: String,
  `p_ji1jin1jia1shu4`: Integer,
  `p_ji1gou4chi2you3bi3lie4`: Double,
  `p_ge4ren2chi2you3bi3lie4`: Double,
  `p_nei4bu4chi2you3bi3lie4`: Double,
  `p_zong3fen4e2`: Double
)

trait Json_fund_hold_structure_emResponse {

  implicit val a_fund_hold_structure_emResponse = new Decoder[fund_hold_structure_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_hold_structure_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

        p_ji1jin1jia1shu4 <- c.downField("基金家数").as[Integer]

        p_ji1gou4chi2you3bi3lie4 <- c.downField("机构持有比列").as[Double]

        p_ge4ren2chi2you3bi3lie4 <- c.downField("个人持有比列").as[Double]

        p_nei4bu4chi2you3bi3lie4 <- c.downField("内部持有比列").as[Double]

        p_zong3fen4e2 <- c.downField("总份额").as[Double]

      } yield {
        fund_hold_structure_emResponse(
          p_xu4hao4,
          p_jie2zhi3ri4qi1,
          p_ji1jin1jia1shu4,
          p_ji1gou4chi2you3bi3lie4,
          p_ge4ren2chi2you3bi3lie4,
          p_nei4bu4chi2you3bi3lie4,
          p_zong3fen4e2
        )
      }
  }

}

object JsonItem_fund_hold_structure_emResponse extends Json_fund_hold_structure_emResponse
