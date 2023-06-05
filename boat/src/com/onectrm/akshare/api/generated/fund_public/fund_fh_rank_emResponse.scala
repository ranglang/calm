package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_fh_rank_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_fh_rank_em 目标地址: http://fund.eastmoney.com/data/fundleijifenhong.html
  * 描述: 天天基金网-基金数据-分红送配-基金分红排行 限量: 单次返回所有历史数据
  */
case class Respfund_fh_rank_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_lei3ji4fen1hong2`: Double,
  `p_lei3ji4ci4shu4`: Integer,
  `p_cheng2li4ri4qi1`: String
)

case class fund_fh_rank_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_lei3ji4fen1hong2`: Double,
  `p_lei3ji4ci4shu4`: Integer,
  `p_cheng2li4ri4qi1`: String
)

trait Json_fund_fh_rank_emResponse {

  implicit val a_fund_fh_rank_emResponse = new Decoder[fund_fh_rank_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_fh_rank_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_lei3ji4fen1hong2 <- c.downField("累计分红").as[Double]

        p_lei3ji4ci4shu4 <- c.downField("累计次数").as[Integer]

        p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

      } yield {
        fund_fh_rank_emResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_lei3ji4fen1hong2,
          p_lei3ji4ci4shu4,
          p_cheng2li4ri4qi1
        )
      }
  }

}

object JsonItem_fund_fh_rank_emResponse extends Json_fund_fh_rank_emResponse
