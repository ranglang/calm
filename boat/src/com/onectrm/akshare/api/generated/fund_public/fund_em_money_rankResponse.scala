package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_em_money_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_em_money_rank 目标地址: http://fund.eastmoney.com/data/hbxfundranking.html
  * 描述: 东方财富网-数据中心-货币型基金排行 限量: 单次返回当前时刻所有数据, 每个交易日 17 点后更新, 货币基金的单位净值均为 1.0000 元，最新一年期定存利率: 1.50%
  */
case class Respfund_em_money_rankResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_ri4qi1`: String,
  `p_wan4fen4shou1yi4`: Double,
  `p_nian2hua4shou1yi4lu47ri4`: Double,
  `p_nian2hua4shou1yi4lu414ri4`: Double,
  `p_nian2hua4shou1yi4lu428ri4`: Double,
  `p_jin41yue4`: Double,
  `p_jin43yue4`: Double,
  `p_jin46yue4`: Double,
  `p_jin41nian2`: Double,
  `p_jin42nian2`: Double,
  `p_jin43nian2`: Double,
  `p_jin45nian2`: Double,
  `p_jin1nian2lai2`: Double,
  `p_cheng2li4lai2`: Double,
  `p_shou3xu4fei4`: Double
)

case class fund_em_money_rankResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_ri4qi1`: String,
  `p_wan4fen4shou1yi4`: Double,
  `p_nian2hua4shou1yi4lu47ri4`: Double,
  `p_nian2hua4shou1yi4lu414ri4`: Double,
  `p_nian2hua4shou1yi4lu428ri4`: Double,
  `p_jin41yue4`: Double,
  `p_jin43yue4`: Double,
  `p_jin46yue4`: Double,
  `p_jin41nian2`: Double,
  `p_jin42nian2`: Double,
  `p_jin43nian2`: Double,
  `p_jin45nian2`: Double,
  `p_jin1nian2lai2`: Double,
  `p_cheng2li4lai2`: Double,
  `p_shou3xu4fei4`: Double
)

trait Json_fund_em_money_rankResponse {

  implicit val a_fund_em_money_rankResponse = new Decoder[fund_em_money_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_em_money_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_wan4fen4shou1yi4 <- c.downField("万份收益").as[Double]

        p_nian2hua4shou1yi4lu47ri4 <- c.downField("年化收益率7日").as[Double]

        p_nian2hua4shou1yi4lu414ri4 <- c.downField("年化收益率14日").as[Double]

        p_nian2hua4shou1yi4lu428ri4 <- c.downField("年化收益率28日").as[Double]

        p_jin41yue4 <- c.downField("近1月").as[Double]

        p_jin43yue4 <- c.downField("近3月").as[Double]

        p_jin46yue4 <- c.downField("近6月").as[Double]

        p_jin41nian2 <- c.downField("近1年").as[Double]

        p_jin42nian2 <- c.downField("近2年").as[Double]

        p_jin43nian2 <- c.downField("近3年").as[Double]

        p_jin45nian2 <- c.downField("近5年").as[Double]

        p_jin1nian2lai2 <- c.downField("今年来").as[Double]

        p_cheng2li4lai2 <- c.downField("成立来").as[Double]

        p_shou3xu4fei4 <- c.downField("手续费").as[Double]

      } yield {
        fund_em_money_rankResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_ri4qi1,
          p_wan4fen4shou1yi4,
          p_nian2hua4shou1yi4lu47ri4,
          p_nian2hua4shou1yi4lu414ri4,
          p_nian2hua4shou1yi4lu428ri4,
          p_jin41yue4,
          p_jin43yue4,
          p_jin46yue4,
          p_jin41nian2,
          p_jin42nian2,
          p_jin43nian2,
          p_jin45nian2,
          p_jin1nian2lai2,
          p_cheng2li4lai2,
          p_shou3xu4fei4
        )
      }
  }

}

object JsonItem_fund_em_money_rankResponse extends Json_fund_em_money_rankResponse
