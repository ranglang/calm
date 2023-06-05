package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_investing_globalResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_investing_global 目标地址: https://cn.investing.com/rates-bonds 描述:
  * 获取全球政府债券行情与收益率; 该接口需要通过代理访问,
  * 由于涉及国家和债券多(**近1000**个债券)具体参见[国家-债券目录](https://cn.investing.com/rates-bonds/world-government-bonds?maturity_from=10&amp;maturity_to=310)
  * 限量: 单次返回某一个国家的具体某一个指数, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
  */
case class Respbond_investing_globalResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: String
)

case class bond_investing_globalResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: String
)

trait Json_bond_investing_globalResponse {

  implicit val a_bond_investing_globalResponse = new Decoder[bond_investing_globalResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_investing_globalResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_gao1 <- c.downField("高").as[Double]

        p_di1 <- c.downField("低").as[Double]

        p_jiao1yi4liang4 <- c.downField("交易量").as[String]

      } yield {
        bond_investing_globalResponse(
          p_ri4qi1,
          p_shou1pan2,
          p_kai1pan2,
          p_gao1,
          p_di1,
          p_jiao1yi4liang4
        )
      }
  }

}

object JsonItem_bond_investing_globalResponse extends Json_bond_investing_globalResponse
