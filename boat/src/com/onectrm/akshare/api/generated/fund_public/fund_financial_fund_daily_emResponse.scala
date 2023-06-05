package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_financial_fund_daily_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_financial_fund_daily_em 目标地址:
  * http://fund.eastmoney.com/lcjj.html#1_1__0__ljjz,desc_1_os1 描述: 东方财富网-天天基金网-基金数据-理财型基金-实时数据,
  * 此接口数据每个交易日 **16:00～23:00** 更新 限量: 该接口由于目标网站未更新数据，暂时不能返回数据
  */
case class Respfund_financial_fund_daily_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_shang4yi1qi1nian2hua4shou1yi4lu4`: Double,
  `p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_dang1qian2jiao1yi4ri47ri4nian2hua2`: Double,
  `p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2`: Double,
  `p_feng1bi4qi1`: Double,
  `p_shen1gou4zhuang4tai4`: String
)

case class fund_financial_fund_daily_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_shang4yi1qi1nian2hua4shou1yi4lu4`: Double,
  `p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_dang1qian2jiao1yi4ri47ri4nian2hua2`: Double,
  `p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4`: Double,
  `p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2`: Double,
  `p_feng1bi4qi1`: Double,
  `p_shen1gou4zhuang4tai4`: String
)

trait Json_fund_financial_fund_daily_emResponse {

  implicit val a_fund_financial_fund_daily_emResponse =
    new Decoder[fund_financial_fund_daily_emResponse] {
      final def apply(c: HCursor): Decoder.Result[fund_financial_fund_daily_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

          p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

          p_shang4yi1qi1nian2hua4shou1yi4lu4 <- c.downField("上一期年化收益率").as[Double]

          p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4 <- c.downField("当前交易日-万份收益").as[Double]

          p_dang1qian2jiao1yi4ri47ri4nian2hua2 <- c.downField("当前交易日-7日年华").as[Double]

          p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4 <- c.downField("前一个交易日-万份收益").as[Double]

          p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2 <- c.downField("前一个交易日-7日年华").as[Double]

          p_feng1bi4qi1 <- c.downField("封闭期").as[Double]

          p_shen1gou4zhuang4tai4 <- c.downField("申购状态").as[String]

        } yield {
          fund_financial_fund_daily_emResponse(
            p_xu4hao4,
            p_ji1jin1dai4ma3,
            p_ji1jin1jian3cheng1,
            p_shang4yi1qi1nian2hua4shou1yi4lu4,
            p_dang1qian2jiao1yi4ri4wan4fen4shou1yi4,
            p_dang1qian2jiao1yi4ri47ri4nian2hua2,
            p_qian2yi1ge4jiao1yi4ri4wan4fen4shou1yi4,
            p_qian2yi1ge4jiao1yi4ri47ri4nian2hua2,
            p_feng1bi4qi1,
            p_shen1gou4zhuang4tai4
          )
        }
    }

}

object JsonItem_fund_financial_fund_daily_emResponse
    extends Json_fund_financial_fund_daily_emResponse
