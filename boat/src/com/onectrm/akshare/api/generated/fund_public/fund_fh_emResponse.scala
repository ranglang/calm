package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_fh_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_fh_em 目标地址: http://fund.eastmoney.com/data/fundfenhong.html 描述:
  * 天天基金网-基金数据-分红送配-基金分红 限量: 单次返回所有历史数据
  */
case class Respfund_fh_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_quan2yi4deng1ji4ri4`: String,
  `p_chu2xi1ri4qi1`: String,
  `p_fen1hong2`: Double,
  `p_fen1hong2fa1fang4ri4`: String
)

case class fund_fh_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_quan2yi4deng1ji4ri4`: String,
  `p_chu2xi1ri4qi1`: String,
  `p_fen1hong2`: Double,
  `p_fen1hong2fa1fang4ri4`: String
)

trait Json_fund_fh_emResponse {

  implicit val a_fund_fh_emResponse = new Decoder[fund_fh_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_fh_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_quan2yi4deng1ji4ri4 <- c.downField("权益登记日").as[String]

        p_chu2xi1ri4qi1 <- c.downField("除息日期").as[String]

        p_fen1hong2 <- c.downField("分红").as[Double]

        p_fen1hong2fa1fang4ri4 <- c.downField("分红发放日").as[String]

      } yield {
        fund_fh_emResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_quan2yi4deng1ji4ri4,
          p_chu2xi1ri4qi1,
          p_fen1hong2,
          p_fen1hong2fa1fang4ri4
        )
      }
  }

}

object JsonItem_fund_fh_emResponse extends Json_fund_fh_emResponse
