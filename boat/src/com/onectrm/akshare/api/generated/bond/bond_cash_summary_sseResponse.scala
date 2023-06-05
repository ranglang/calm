package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_cash_summary_sseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_cash_summary_sse 目标地址:
  * http://bond.sse.com.cn/data/statistics/overview/bondow/ 描述: 上登债券信息网-市场数据-市场统计-市场概览-债券现券市场概览 限量:
  * 单次返回指定交易日的债券现券市场概览数据
  */
case class Respbond_cash_summary_sseResponse(
  `p_zhai4quan4xian4huo4`: String,
  `p_tuo1guan3zhi3shu4`: Integer,
  `p_tuo1guan3shi4zhi2`: Double,
  `p_tuo1guan3mian4zhi2`: Double,
  `p_shu4ju4ri4qi1`: String
)

case class bond_cash_summary_sseResponse(
  `p_zhai4quan4xian4huo4`: String,
  `p_tuo1guan3zhi3shu4`: Integer,
  `p_tuo1guan3shi4zhi2`: Double,
  `p_tuo1guan3mian4zhi2`: Double,
  `p_shu4ju4ri4qi1`: String
)

trait Json_bond_cash_summary_sseResponse {

  implicit val a_bond_cash_summary_sseResponse = new Decoder[bond_cash_summary_sseResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_cash_summary_sseResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhai4quan4xian4huo4 <- c.downField("债券现货").as[String]

        p_tuo1guan3zhi3shu4 <- c.downField("托管只数").as[Integer]

        p_tuo1guan3shi4zhi2 <- c.downField("托管市值").as[Double]

        p_tuo1guan3mian4zhi2 <- c.downField("托管面值").as[Double]

        p_shu4ju4ri4qi1 <- c.downField("数据日期").as[String]

      } yield {
        bond_cash_summary_sseResponse(
          p_zhai4quan4xian4huo4,
          p_tuo1guan3zhi3shu4,
          p_tuo1guan3shi4zhi2,
          p_tuo1guan3mian4zhi2,
          p_shu4ju4ri4qi1
        )
      }
  }

}

object JsonItem_bond_cash_summary_sseResponse extends Json_bond_cash_summary_sseResponse
