package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_new_found_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_new_found_em 目标地址: http://fund.eastmoney.com/data/xinfound.html 描述:
  * 天天基金网-基金数据-新发基金 限量: 单次返回所有新发基金数据
  */
case class Respfund_new_found_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_fa1xing2gong1si1`: String,
  `p_ji1jin1lei4xing2`: String,
  `p_ji2zhong1ren4gou4qi1`: String,
  `p_mu4ji2fen4e2`: Double,
  `p_cheng2li4ri4qi1`: String,
  `p_cheng2li4lai2zhang3fu2`: Double,
  `p_ji1jin1jing1li3`: String,
  `p_shen1gou4zhuang4tai4`: String,
  `p_you1hui4fei4lu4`: Double
)

case class fund_new_found_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_fa1xing2gong1si1`: String,
  `p_ji1jin1lei4xing2`: String,
  `p_ji2zhong1ren4gou4qi1`: String,
  `p_mu4ji2fen4e2`: Double,
  `p_cheng2li4ri4qi1`: String,
  `p_cheng2li4lai2zhang3fu2`: Double,
  `p_ji1jin1jing1li3`: String,
  `p_shen1gou4zhuang4tai4`: String,
  `p_you1hui4fei4lu4`: Double
)

trait Json_fund_new_found_emResponse {

  implicit val a_fund_new_found_emResponse = new Decoder[fund_new_found_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_new_found_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_fa1xing2gong1si1 <- c.downField("发行公司").as[String]

        p_ji1jin1lei4xing2 <- c.downField("基金类型").as[String]

        p_ji2zhong1ren4gou4qi1 <- c.downField("集中认购期").as[String]

        p_mu4ji2fen4e2 <- c.downField("募集份额").as[Double]

        p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

        p_cheng2li4lai2zhang3fu2 <- c.downField("成立来涨幅").as[Double]

        p_ji1jin1jing1li3 <- c.downField("基金经理").as[String]

        p_shen1gou4zhuang4tai4 <- c.downField("申购状态").as[String]

        p_you1hui4fei4lu4 <- c.downField("优惠费率").as[Double]

      } yield {
        fund_new_found_emResponse(
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_fa1xing2gong1si1,
          p_ji1jin1lei4xing2,
          p_ji2zhong1ren4gou4qi1,
          p_mu4ji2fen4e2,
          p_cheng2li4ri4qi1,
          p_cheng2li4lai2zhang3fu2,
          p_ji1jin1jing1li3,
          p_shen1gou4zhuang4tai4,
          p_you1hui4fei4lu4
        )
      }
  }

}

object JsonItem_fund_new_found_emResponse extends Json_fund_new_found_emResponse
