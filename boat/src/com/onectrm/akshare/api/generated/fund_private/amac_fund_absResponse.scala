package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_fund_absResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_fund_abs 目标地址:
  * https://gs.amac.org.cn/amac-infodisc/res/fund/abs/index.html 描述: 中国证券投资基金业协会-信息公示-产品公示-资产支持专项计划
  * 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_fund_absResponse(
  `p_bian1hao4`: Integer,
  `p_bei4an4bian1hao4`: String,
  `p_zhuan1xiang4ji4hua4quan2cheng1`: String,
  `p_guan3li3ren2`: String,
  `p_tuo1guan3ren2`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_yu4qi1dao4qi1shi2jian1`: String,
  `p_bei4an4tong1guo4shi2jian1`: String
)

case class amac_fund_absResponse(
  `p_bian1hao4`: Integer,
  `p_bei4an4bian1hao4`: String,
  `p_zhuan1xiang4ji4hua4quan2cheng1`: String,
  `p_guan3li3ren2`: String,
  `p_tuo1guan3ren2`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_yu4qi1dao4qi1shi2jian1`: String,
  `p_bei4an4tong1guo4shi2jian1`: String
)

trait Json_amac_fund_absResponse {

  implicit val a_amac_fund_absResponse = new Decoder[amac_fund_absResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_fund_absResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bian1hao4 <- c.downField("编号").as[Integer]

        p_bei4an4bian1hao4 <- c.downField("备案编号").as[String]

        p_zhuan1xiang4ji4hua4quan2cheng1 <- c.downField("专项计划全称").as[String]

        p_guan3li3ren2 <- c.downField("管理人").as[String]

        p_tuo1guan3ren2 <- c.downField("托管人").as[String]

        p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

        p_yu4qi1dao4qi1shi2jian1 <- c.downField("预期到期时间").as[String]

        p_bei4an4tong1guo4shi2jian1 <- c.downField("备案通过时间").as[String]

      } yield {
        amac_fund_absResponse(
          p_bian1hao4,
          p_bei4an4bian1hao4,
          p_zhuan1xiang4ji4hua4quan2cheng1,
          p_guan3li3ren2,
          p_tuo1guan3ren2,
          p_cheng2li4ri4qi1,
          p_yu4qi1dao4qi1shi2jian1,
          p_bei4an4tong1guo4shi2jian1
        )
      }
  }

}

object JsonItem_amac_fund_absResponse extends Json_amac_fund_absResponse
