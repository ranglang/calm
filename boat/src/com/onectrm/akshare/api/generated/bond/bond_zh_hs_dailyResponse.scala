package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_hs_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_hs_daily 目标地址:
  * http://money.finance.sina.com.cn/bond/quotes/sh019315.html(示例) 描述: 新浪财经-债券-沪深债券-历史行情数据,
  * 历史数据按日频率更新 限量: 单次返回具体某个沪深转债的所有历史行情数据
  */
case class Respbond_zh_hs_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

case class bond_zh_hs_dailyResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Double
)

trait Json_bond_zh_hs_dailyResponse {

  implicit val a_bond_zh_hs_dailyResponse = new Decoder[bond_zh_hs_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_zh_hs_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

      } yield {
        bond_zh_hs_dailyResponse(
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume
        )
      }
  }

}

object JsonItem_bond_zh_hs_dailyResponse extends Json_bond_zh_hs_dailyResponse
