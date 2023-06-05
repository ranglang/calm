package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_cf_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_cf_em 目标地址: http://fund.eastmoney.com/data/fundchaifen.html 描述:
  * 天天基金网-基金数据-分红送配-基金拆分 限量: 单次返回所有历史数据
  */
case class Respfund_cf_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_chai1fen1zhe2suan4ri4`: String,
  `p_chai1fen1lei4xing2`: String,
  `p_chai1fen1zhe2suan4`: Double
)

case class fund_cf_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_chai1fen1zhe2suan4ri4`: String,
  `p_chai1fen1lei4xing2`: String,
  `p_chai1fen1zhe2suan4`: Double
)

trait Json_fund_cf_emResponse {

  implicit val a_fund_cf_emResponse = new Decoder[fund_cf_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_cf_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_chai1fen1zhe2suan4ri4 <- c.downField("拆分折算日").as[String]

        p_chai1fen1lei4xing2 <- c.downField("拆分类型").as[String]

        p_chai1fen1zhe2suan4 <- c.downField("拆分折算").as[Double]

      } yield {
        fund_cf_emResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_chai1fen1zhe2suan4ri4,
          p_chai1fen1lei4xing2,
          p_chai1fen1zhe2suan4
        )
      }
  }

}

object JsonItem_fund_cf_emResponse extends Json_fund_cf_emResponse
