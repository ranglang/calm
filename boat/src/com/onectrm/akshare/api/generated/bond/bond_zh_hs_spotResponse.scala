package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_hs_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_hs_spot 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#hs_z 描述:
  * 新浪财经-债券-沪深债券-实时行情数据 限量: 单次返回所有沪深债券的实时行情数据
  */
case class Respbond_zh_hs_spotResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_mai3ru4`: Double,
  `p_mai4chu1`: Double,
  `p_zuo2shou1`: Double,
  `p_jin1kai1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Integer
)

case class bond_zh_hs_spotResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_mai3ru4`: Double,
  `p_mai4chu1`: Double,
  `p_zuo2shou1`: Double,
  `p_jin1kai1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Integer
)

trait Json_bond_zh_hs_spotResponse {

  implicit val a_bond_zh_hs_spotResponse = new Decoder[bond_zh_hs_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_zh_hs_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_mai3ru4 <- c.downField("买入").as[Double]

        p_mai4chu1 <- c.downField("卖出").as[Double]

        p_zuo2shou1 <- c.downField("昨收").as[Double]

        p_jin1kai1 <- c.downField("今开").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Integer]

      } yield {
        bond_zh_hs_spotResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_mai3ru4,
          p_mai4chu1,
          p_zuo2shou1,
          p_jin1kai1,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2
        )
      }
  }

}

object JsonItem_bond_zh_hs_spotResponse extends Json_bond_zh_hs_spotResponse
