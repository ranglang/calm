package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_scale_structured_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_scale_structured_sina 目标地址:
  * http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf 描述: 基金数据中心-基金规模-分级子基金 限量:
  * 单次返回所有分级子基金的基金规模数据
  */
case class Respfund_scale_structured_sinaResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_zong3mu4ji2gui1mo2`: Double,
  `p_zui4jin4zong3fen4e2`: Double,
  `p_cheng2li4ri4qi1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_geng4xin1ri4qi1`: String
)

case class fund_scale_structured_sinaResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_zong3mu4ji2gui1mo2`: Double,
  `p_zui4jin4zong3fen4e2`: Double,
  `p_cheng2li4ri4qi1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_geng4xin1ri4qi1`: String
)

trait Json_fund_scale_structured_sinaResponse {

  implicit val a_fund_scale_structured_sinaResponse =
    new Decoder[fund_scale_structured_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[fund_scale_structured_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

          p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

          p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

          p_zong3mu4ji2gui1mo2 <- c.downField("总募集规模").as[Double]

          p_zui4jin4zong3fen4e2 <- c.downField("最近总份额").as[Double]

          p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

          p_ji1jin1jing1li3 <- c.downField("基金经理").as[String]

          p_geng4xin1ri4qi1 <- c.downField("更新日期").as[String]

        } yield {
          fund_scale_structured_sinaResponse(
            p_xu4hao4,
            p_ji1jin1dai4ma3,
            p_ji1jin1jian3cheng1,
            p_dan1wei4jing4zhi2,
            p_zong3mu4ji2gui1mo2,
            p_zui4jin4zong3fen4e2,
            p_cheng2li4ri4qi1,
            p_ji1jin1jing1li3,
            p_geng4xin1ri4qi1
          )
        }
    }

}

object JsonItem_fund_scale_structured_sinaResponse extends Json_fund_scale_structured_sinaResponse
