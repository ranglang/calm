package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_spot_quoteResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_spot_quote 目标地址: http://www.chinamoney.com.cn/chinese/mkdatabond/ 描述:
  * 中国外汇交易中心暨全国银行间同业拆借中心-市场数据-市场行情-债券市场行情-现券市场做市报价 限量: 单次返回所有数据
  */
case class Respbond_spot_quoteResponse(
  `p_bao4jia4ji1gou4`: String,
  `p_zhai4quan4jian3cheng1`: String,
  `p_mai3ru4jing4jia4`: Double,
  `p_mai4chu1jing4jia4`: Double,
  `p_mai3ru4shou1yi4lu4`: Double,
  `p_mai4chu1shou1yi4lu4`: Double
)

case class bond_spot_quoteResponse(
  `p_bao4jia4ji1gou4`: String,
  `p_zhai4quan4jian3cheng1`: String,
  `p_mai3ru4jing4jia4`: Double,
  `p_mai4chu1jing4jia4`: Double,
  `p_mai3ru4shou1yi4lu4`: Double,
  `p_mai4chu1shou1yi4lu4`: Double
)

trait Json_bond_spot_quoteResponse {

  implicit val a_bond_spot_quoteResponse = new Decoder[bond_spot_quoteResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_spot_quoteResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bao4jia4ji1gou4 <- c.downField("报价机构").as[String]

        p_zhai4quan4jian3cheng1 <- c.downField("债券简称").as[String]

        p_mai3ru4jing4jia4 <- c.downField("买入净价").as[Double]

        p_mai4chu1jing4jia4 <- c.downField("卖出净价").as[Double]

        p_mai3ru4shou1yi4lu4 <- c.downField("买入收益率").as[Double]

        p_mai4chu1shou1yi4lu4 <- c.downField("卖出收益率").as[Double]

      } yield {
        bond_spot_quoteResponse(
          p_bao4jia4ji1gou4,
          p_zhai4quan4jian3cheng1,
          p_mai3ru4jing4jia4,
          p_mai4chu1jing4jia4,
          p_mai3ru4shou1yi4lu4,
          p_mai4chu1shou1yi4lu4
        )
      }
  }

}

object JsonItem_bond_spot_quoteResponse extends Json_bond_spot_quoteResponse
