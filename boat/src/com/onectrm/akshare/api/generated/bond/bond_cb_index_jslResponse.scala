package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_cb_index_jslResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_cb_index_jsl 目标地址: https://www.jisilu.cn/data/cbnew/cb_index/ 描述:
  * 可转债-集思录可转债等权指数 限量: 单次返回所有历史数据数据
  */
case class Respbond_cb_index_jslResponse(
  `p_date`: String,
  `p_price`: Double
)

case class bond_cb_index_jslResponse(
  `p_date`: String,
  `p_price`: Double
)

trait Json_bond_cb_index_jslResponse {

  implicit val a_bond_cb_index_jslResponse = new Decoder[bond_cb_index_jslResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_cb_index_jslResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_price <- c.downField("price").as[Double]

      } yield {
        bond_cb_index_jslResponse(
          p_date,
          p_price
        )
      }
  }

}

object JsonItem_bond_cb_index_jslResponse extends Json_bond_cb_index_jslResponse
