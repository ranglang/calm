package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_deal_summary_sseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_deal_summary_sse 目标地址:
  * http://bond.sse.com.cn/data/statistics/overview/turnover/ 描述: 上登债券信息网-市场数据-市场统计-市场概览-债券成交概览 限量:
  * 单次返回指定交易日的债券成交概览数据
  */
case class Respbond_deal_summary_sseResponse(
  `p_zhai4quan4lei4xing2`: String,
  `p_dang1ri4cheng2jiao1bi3shu4`: Integer,
  `p_dang1ri4cheng2jiao1jin1e2`: Double,
  `p_dang1nian2cheng2jiao1bi3shu4`: Integer,
  `p_dang1nian2cheng2jiao1jin1e2`: Double,
  `p_shu4ju4ri4qi1`: String
)

case class bond_deal_summary_sseResponse(
  `p_zhai4quan4lei4xing2`: String,
  `p_dang1ri4cheng2jiao1bi3shu4`: Integer,
  `p_dang1ri4cheng2jiao1jin1e2`: Double,
  `p_dang1nian2cheng2jiao1bi3shu4`: Integer,
  `p_dang1nian2cheng2jiao1jin1e2`: Double,
  `p_shu4ju4ri4qi1`: String
)

trait Json_bond_deal_summary_sseResponse {

  implicit val a_bond_deal_summary_sseResponse = new Decoder[bond_deal_summary_sseResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_deal_summary_sseResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhai4quan4lei4xing2 <- c.downField("债券类型").as[String]

        p_dang1ri4cheng2jiao1bi3shu4 <- c.downField("当日成交笔数").as[Integer]

        p_dang1ri4cheng2jiao1jin1e2 <- c.downField("当日成交金额").as[Double]

        p_dang1nian2cheng2jiao1bi3shu4 <- c.downField("当年成交笔数").as[Integer]

        p_dang1nian2cheng2jiao1jin1e2 <- c.downField("当年成交金额").as[Double]

        p_shu4ju4ri4qi1 <- c.downField("数据日期").as[String]

      } yield {
        bond_deal_summary_sseResponse(
          p_zhai4quan4lei4xing2,
          p_dang1ri4cheng2jiao1bi3shu4,
          p_dang1ri4cheng2jiao1jin1e2,
          p_dang1nian2cheng2jiao1bi3shu4,
          p_dang1nian2cheng2jiao1jin1e2,
          p_shu4ju4ri4qi1
        )
      }
  }

}

object JsonItem_bond_deal_summary_sseResponse extends Json_bond_deal_summary_sseResponse
