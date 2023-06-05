package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_minResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_hs_cov_min 目标地址: https://quote.eastmoney.com/concept/sz128039.html 描述:
  * 东方财富网-可转债-分时行情 限量: 单次返回指定可转债、指定频率、复权调整和时间区间的分时数据, 其中 1 分钟数据只返回近 1 个交易日数据且不复权
  */
case class Respbond_zh_hs_cov_minResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zui4xin1jia4`: Double
)

case class bond_zh_hs_cov_minResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zui4xin1jia4`: Double
)

trait Json_bond_zh_hs_cov_minResponse {

  implicit val a_bond_zh_hs_cov_minResponse = new Decoder[bond_zh_hs_cov_minResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_zh_hs_cov_minResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

      } yield {
        bond_zh_hs_cov_minResponse(
          p_shi2jian1,
          p_kai1pan2,
          p_shou1pan2,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_zui4xin1jia4
        )
      }
  }

}

object JsonItem_bond_zh_hs_cov_minResponse extends Json_bond_zh_hs_cov_minResponse
