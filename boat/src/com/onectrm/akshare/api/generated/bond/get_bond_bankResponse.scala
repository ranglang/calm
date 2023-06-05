package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.get_bond_bankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: get_bond_bank 目标地址: http://zhuce.nafmii.org.cn/fans/publicQuery/manager 描述:
  * 银行间债券市场数据 限量: 单次最大 20 行, 建议用循环获取数据
  */
case class Respget_bond_bankResponse(
  `p_firstIssueAmount`: String,
  `p_isReg`: String,
  `p_regFileName`: String,
  `p_regPrdtType`: String,
  `p_releaseTime`: Double,
  `p_projPhase`: Double
)

case class get_bond_bankResponse(
  `p_firstIssueAmount`: String,
  `p_isReg`: String,
  `p_regFileName`: String,
  `p_regPrdtType`: String,
  `p_releaseTime`: Double,
  `p_projPhase`: Double
)

trait Json_get_bond_bankResponse {

  implicit val a_get_bond_bankResponse = new Decoder[get_bond_bankResponse] {
    final def apply(c: HCursor): Decoder.Result[get_bond_bankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_firstIssueAmount <- c.downField("firstIssueAmount").as[String]

        p_isReg <- c.downField("isReg").as[String]

        p_regFileName <- c.downField("regFileName").as[String]

        p_regPrdtType <- c.downField("regPrdtType").as[String]

        p_releaseTime <- c.downField("releaseTime").as[Double]

        p_projPhase <- c.downField("projPhase").as[Double]

      } yield {
        get_bond_bankResponse(
          p_firstIssueAmount,
          p_isReg,
          p_regFileName,
          p_regPrdtType,
          p_releaseTime,
          p_projPhase
        )
      }
  }

}

object JsonItem_get_bond_bankResponse extends Json_get_bond_bankResponse
