package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_treasure_issue_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_treasure_issue_cninfo 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
  * 描述: 巨潮资讯-数据中心-专题统计-债券报表-债券发行-国债发行 限量:
  */
case class Respbond_treasure_issue_cninfoResponse(
)

case class bond_treasure_issue_cninfoResponse(
)

trait Json_bond_treasure_issue_cninfoResponse {

  implicit val a_bond_treasure_issue_cninfoResponse =
    new Decoder[bond_treasure_issue_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[bond_treasure_issue_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

        } yield {
          bond_treasure_issue_cninfoResponse(
          )
        }
    }

}

object JsonItem_bond_treasure_issue_cninfoResponse extends Json_bond_treasure_issue_cninfoResponse
