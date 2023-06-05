package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_scale_change_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_scale_change_em 目标地址: http://fund.eastmoney.com/data/gmbdlist.html 描述:
  * 天天基金网-基金数据-规模份额-规模变动 限量: 返回所有规模变动数据
  */
case class Respfund_scale_change_emResponse(
  `p_xu4hao4`: Integer,
  `p_jie2zhi3ri4qi1`: String,
  `p_ji1jin1jia1shu4`: Integer,
  `p_qi1jian1shen1gou4`: Double,
  `p_qi1jian1shu2hui2`: Double,
  `p_qi1mo4zong3fen4e2`: Double,
  `p_qi1mo4jing4zi1chan3`: Double
)

case class fund_scale_change_emResponse(
  `p_xu4hao4`: Integer,
  `p_jie2zhi3ri4qi1`: String,
  `p_ji1jin1jia1shu4`: Integer,
  `p_qi1jian1shen1gou4`: Double,
  `p_qi1jian1shu2hui2`: Double,
  `p_qi1mo4zong3fen4e2`: Double,
  `p_qi1mo4jing4zi1chan3`: Double
)

trait Json_fund_scale_change_emResponse {

  implicit val a_fund_scale_change_emResponse = new Decoder[fund_scale_change_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_scale_change_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

        p_ji1jin1jia1shu4 <- c.downField("基金家数").as[Integer]

        p_qi1jian1shen1gou4 <- c.downField("期间申购").as[Double]

        p_qi1jian1shu2hui2 <- c.downField("期间赎回").as[Double]

        p_qi1mo4zong3fen4e2 <- c.downField("期末总份额").as[Double]

        p_qi1mo4jing4zi1chan3 <- c.downField("期末净资产").as[Double]

      } yield {
        fund_scale_change_emResponse(
          p_xu4hao4,
          p_jie2zhi3ri4qi1,
          p_ji1jin1jia1shu4,
          p_qi1jian1shen1gou4,
          p_qi1jian1shu2hui2,
          p_qi1mo4zong3fen4e2,
          p_qi1mo4jing4zi1chan3
        )
      }
  }

}

object JsonItem_fund_scale_change_emResponse extends Json_fund_scale_change_emResponse
