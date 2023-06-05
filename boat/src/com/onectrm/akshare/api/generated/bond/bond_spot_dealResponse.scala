package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_spot_dealResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_spot_deal 目标地址: http://www.chinamoney.com.cn/chinese/mkdatabond/ 描述:
  * 中国外汇交易中心暨全国银行间同业拆借中心-市场数据-市场行情-债券市场行情-现券市场成交行情 限量: 单次返回所有即期数据
  */
case class Respbond_spot_dealResponse(
  `p_zhai4quan4jian3cheng1`: String,
  `p_cheng2jiao1jing4jia4`: Double,
  `p_zui4xin1shou1yi4lu4`: Double,
  `p_zhang3die1`: Double,
  `p_jia1quan2shou1yi4lu4`: Double,
  `p_jiao1yi4liang4`: Double
)

case class bond_spot_dealResponse(
  `p_zhai4quan4jian3cheng1`: String,
  `p_cheng2jiao1jing4jia4`: Double,
  `p_zui4xin1shou1yi4lu4`: Double,
  `p_zhang3die1`: Double,
  `p_jia1quan2shou1yi4lu4`: Double,
  `p_jiao1yi4liang4`: Double
)

trait Json_bond_spot_dealResponse {

  implicit val a_bond_spot_dealResponse = new Decoder[bond_spot_dealResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_spot_dealResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhai4quan4jian3cheng1 <- c.downField("债券简称").as[String]

        p_cheng2jiao1jing4jia4 <- c.downField("成交净价").as[Double]

        p_zui4xin1shou1yi4lu4 <- c.downField("最新收益率").as[Double]

        p_zhang3die1 <- c.downField("涨跌").as[Double]

        p_jia1quan2shou1yi4lu4 <- c.downField("加权收益率").as[Double]

        p_jiao1yi4liang4 <- c.downField("交易量").as[Double]

      } yield {
        bond_spot_dealResponse(
          p_zhai4quan4jian3cheng1,
          p_cheng2jiao1jing4jia4,
          p_zui4xin1shou1yi4lu4,
          p_zhang3die1,
          p_jia1quan2shou1yi4lu4,
          p_jiao1yi4liang4
        )
      }
  }

}

object JsonItem_bond_spot_dealResponse extends Json_bond_spot_dealResponse
