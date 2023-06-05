package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_name_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_name_em 目标地址: http://fund.eastmoney.com/fund.html 描述:
  * 东方财富网-天天基金网-基金数据-所有基金的基本信息数据 限量: 单次返回当前时刻所有历史数据
  */
case class Respfund_name_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_pin1yin1suo1xie3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_ji1jin1lei4xing2`: String,
  `p_pin1yin1quan2cheng1`: String
)

case class fund_name_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_pin1yin1suo1xie3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_ji1jin1lei4xing2`: String,
  `p_pin1yin1quan2cheng1`: String
)

trait Json_fund_name_emResponse {

  implicit val a_fund_name_emResponse = new Decoder[fund_name_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_name_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_pin1yin1suo1xie3 <- c.downField("拼音缩写").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_ji1jin1lei4xing2 <- c.downField("基金类型").as[String]

        p_pin1yin1quan2cheng1 <- c.downField("拼音全称").as[String]

      } yield {
        fund_name_emResponse(
          p_ji1jin1dai4ma3,
          p_pin1yin1suo1xie3,
          p_ji1jin1jian3cheng1,
          p_ji1jin1lei4xing2,
          p_pin1yin1quan2cheng1
        )
      }
  }

}

object JsonItem_fund_name_emResponse extends Json_fund_name_emResponse
