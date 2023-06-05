package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_money_fund_info_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_money_fund_info_em 目标地址: http://fundf10.eastmoney.com/jjjz_004186.html
  * 描述: 东方财富网-天天基金网-基金数据-货币型基金-历史净值 限量: 单次返回当前时刻所有历史数据
  */
case class Respfund_money_fund_info_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_mei3wan4fen4shou1yi4`: String,
  `p_7ri4nian2hua4shou1yi4lu4`: Double,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String
)

case class fund_money_fund_info_emResponse(
  `p_jing4zhi2ri4qi1`: String,
  `p_mei3wan4fen4shou1yi4`: String,
  `p_7ri4nian2hua4shou1yi4lu4`: Double,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String
)

trait Json_fund_money_fund_info_emResponse {

  implicit val a_fund_money_fund_info_emResponse = new Decoder[fund_money_fund_info_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_money_fund_info_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jing4zhi2ri4qi1 <- c.downField("净值日期").as[String]

        p_mei3wan4fen4shou1yi4 <- c.downField("每万份收益").as[String]

        p_7ri4nian2hua4shou1yi4lu4 <- c.downField("7日年化收益率").as[Double]

        p_shen1gou4zhuang4tai4 <- c.downField("申购状态").as[String]

        p_shu2hui2zhuang4tai4 <- c.downField("赎回状态").as[String]

      } yield {
        fund_money_fund_info_emResponse(
          p_jing4zhi2ri4qi1,
          p_mei3wan4fen4shou1yi4,
          p_7ri4nian2hua4shou1yi4lu4,
          p_shen1gou4zhuang4tai4,
          p_shu2hui2zhuang4tai4
        )
      }
  }

}

object JsonItem_fund_money_fund_info_emResponse extends Json_fund_money_fund_info_emResponse
