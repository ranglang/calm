package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_money_fund_daily_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_money_fund_daily_em 目标地址: http://fund.eastmoney.com/HBJJ_pjsyl.html
  * 描述: 东方财富网-天天基金网-基金数据-货币型基金收益, 此接口数据每个交易日 **16:00～23:00** 限量: 单次返回当前时刻所有历史数据
  */
case class Respfund_money_fund_daily_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_dang1qian2jiao1yi4ri47ri4nian2hua4`: Double,
  `p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2`: Double,
  `p_qian2yi1jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_qian2yi1jiao1yi4ri47ri4nian2hua4`: Double,
  `p_qian2yi1jiao1yi4ri4dan1wei4jing4zhi2`: Double,
  `p_ri4zhang3fu2`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_shou3xu4fei4`: String,
  `p_ke3gou4quan2bu4`: String
)

case class fund_money_fund_daily_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_dang1qian2jiao1yi4ri47ri4nian2hua4`: Double,
  `p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2`: Double,
  `p_qian2yi1jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_qian2yi1jiao1yi4ri47ri4nian2hua4`: Double,
  `p_qian2yi1jiao1yi4ri4dan1wei4jing4zhi2`: Double,
  `p_ri4zhang3fu2`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_shou3xu4fei4`: String,
  `p_ke3gou4quan2bu4`: String
)

trait Json_fund_money_fund_daily_emResponse {

  implicit val a_fund_money_fund_daily_emResponse = new Decoder[fund_money_fund_daily_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_money_fund_daily_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4 <- c.downField("当前交易日-万份收益").as[Double]

        p_dang1qian2jiao1yi4ri47ri4nian2hua4 <- c.downField("当前交易日-7日年化%").as[Double]

        p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2 <- c.downField("当前交易日-单位净值").as[Double]

        p_qian2yi1jiao1yi4ri4wan4fen4shou1yi4 <- c.downField("前一交易日-万份收益").as[Double]

        p_qian2yi1jiao1yi4ri47ri4nian2hua4 <- c.downField("前一交易日-7日年化%").as[Double]

        p_qian2yi1jiao1yi4ri4dan1wei4jing4zhi2 <- c.downField("前一交易日-单位净值").as[Double]

        p_ri4zhang3fu2 <- c.downField("日涨幅").as[String]

        p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

        p_ji1jin1jing1li3 <- c.downField("基金经理").as[String]

        p_shou3xu4fei4 <- c.downField("手续费").as[String]

        p_ke3gou4quan2bu4 <- c.downField("可购全部").as[String]

      } yield {
        fund_money_fund_daily_emResponse(
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4,
          p_dang1qian2jiao1yi4ri47ri4nian2hua4,
          p_dang1qian2jiao1yi4ri4dan1wei4jing4zhi2,
          p_qian2yi1jiao1yi4ri4wan4fen4shou1yi4,
          p_qian2yi1jiao1yi4ri47ri4nian2hua4,
          p_qian2yi1jiao1yi4ri4dan1wei4jing4zhi2,
          p_ri4zhang3fu2,
          p_cheng2li4ri4qi1,
          p_ji1jin1jing1li3,
          p_shou3xu4fei4,
          p_ke3gou4quan2bu4
        )
      }
  }

}

object JsonItem_fund_money_fund_daily_emResponse extends Json_fund_money_fund_daily_emResponse
