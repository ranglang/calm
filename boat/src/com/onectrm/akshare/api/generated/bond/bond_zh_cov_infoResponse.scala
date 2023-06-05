package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_cov_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_cov_info 目标地址: https://data.eastmoney.com/kzz/detail/123121.html 描述:
  * 东方财富网-数据中心-新股数据-可转债详情 限量: 单次返回指定 symbol 的可转债详情数据
  */
case class Respbond_zh_cov_infoResponse(
  `p_zhai4quan4dai4ma3`: String
)

case class bond_zh_cov_infoResponse(
  `p_zhai4quan4dai4ma3`: String
)

trait Json_bond_zh_cov_infoResponse {

  implicit val a_bond_zh_cov_infoResponse = new Decoder[bond_zh_cov_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_zh_cov_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhai4quan4dai4ma3 <- c.downField("债券代码").as[String]

      } yield {
        bond_zh_cov_infoResponse(
          p_zhai4quan4dai4ma3
        )
      }
  }

}

object JsonItem_bond_zh_cov_infoResponse extends Json_bond_zh_cov_infoResponse
