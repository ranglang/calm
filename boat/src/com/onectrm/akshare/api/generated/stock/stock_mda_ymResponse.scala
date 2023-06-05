package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_mda_ymResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_mda_ym 目标地址: http://f10.emoney.cn/f10/zbyz/1000001 描述: 益盟-F10-管理层讨论与分析 限量:
  * 单次返回所有历史数据
  */
case class Respstock_mda_ymResponse(
  `p_bao4gao4qi1`: String,
  `p_nei4rong2`: String
)

case class stock_mda_ymResponse(
  `p_bao4gao4qi1`: String,
  `p_nei4rong2`: String
)

trait Json_stock_mda_ymResponse {

  implicit val a_stock_mda_ymResponse = new Decoder[stock_mda_ymResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_mda_ymResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bao4gao4qi1 <- c.downField("报告期").as[String]

        p_nei4rong2 <- c.downField("内容").as[String]

      } yield {
        stock_mda_ymResponse(
          p_bao4gao4qi1,
          p_nei4rong2
        )
      }
  }

}

object JsonItem_stock_mda_ymResponse extends Json_stock_mda_ymResponse
