package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_aum_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_aum_em 目标地址: http://fund.eastmoney.com/Company/lsgm.html 描述:
  * 天天基金网-基金数据-基金规模 限量: 单次返回所有基金规模数据
  */
case class Respfund_aum_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1gong1si1`: String,
  `p_cheng2li4shi2jian1`: String,
  `p_quan2bu4guan3li3gui1mo2`: Double,
  `p_quan2bu4ji1jin1shu4`: Integer,
  `p_quan2bu4jing1li3shu4`: Integer,
  `p_geng4xin1ri4qi1`: String
)

case class fund_aum_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1gong1si1`: String,
  `p_cheng2li4shi2jian1`: String,
  `p_quan2bu4guan3li3gui1mo2`: Double,
  `p_quan2bu4ji1jin1shu4`: Integer,
  `p_quan2bu4jing1li3shu4`: Integer,
  `p_geng4xin1ri4qi1`: String
)

trait Json_fund_aum_emResponse {

  implicit val a_fund_aum_emResponse = new Decoder[fund_aum_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_aum_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1gong1si1 <- c.downField("基金公司").as[String]

        p_cheng2li4shi2jian1 <- c.downField("成立时间").as[String]

        p_quan2bu4guan3li3gui1mo2 <- c.downField("全部管理规模").as[Double]

        p_quan2bu4ji1jin1shu4 <- c.downField("全部基金数").as[Integer]

        p_quan2bu4jing1li3shu4 <- c.downField("全部经理数").as[Integer]

        p_geng4xin1ri4qi1 <- c.downField("更新日期").as[String]

      } yield {
        fund_aum_emResponse(
          p_xu4hao4,
          p_ji1jin1gong1si1,
          p_cheng2li4shi2jian1,
          p_quan2bu4guan3li3gui1mo2,
          p_quan2bu4ji1jin1shu4,
          p_quan2bu4jing1li3shu4,
          p_geng4xin1ri4qi1
        )
      }
  }

}

object JsonItem_fund_aum_emResponse extends Json_fund_aum_emResponse
