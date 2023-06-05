package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_zh_hs_cov_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_zh_hs_cov_spot 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#hskzz_z 描述:
  * 新浪财经-沪深可转债数据 限量: 单次返回所有沪深可转债的实时行情数据
  */
case class Respbond_zh_hs_cov_spotResponse(
  `p_bu4zhu2yi1lie4chu1`: String
)

case class bond_zh_hs_cov_spotResponse(
  `p_bu4zhu2yi1lie4chu1`: String
)

trait Json_bond_zh_hs_cov_spotResponse {

  implicit val a_bond_zh_hs_cov_spotResponse = new Decoder[bond_zh_hs_cov_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_zh_hs_cov_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bu4zhu2yi1lie4chu1 <- c.downField("").as[String]

      } yield {
        bond_zh_hs_cov_spotResponse(
          p_bu4zhu2yi1lie4chu1
        )
      }
  }

}

object JsonItem_bond_zh_hs_cov_spotResponse extends Json_bond_zh_hs_cov_spotResponse
