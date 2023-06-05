package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_person_bond_org_listResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_person_bond_org_list 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/person/personOrgList.html 描述:
  * 中国证券投资基金业协会-信息公示-从业人员信息-债券投资交易相关人员公示 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_person_bond_org_listResponse(
  `p_xu4hao4`: Integer,
  `p_ji1gou4lei4xing2`: String,
  `p_ji1gou4ming2cheng1`: String,
  `p_gong1shi4wang3zhi3`: String
)

case class amac_person_bond_org_listResponse(
  `p_xu4hao4`: Integer,
  `p_ji1gou4lei4xing2`: String,
  `p_ji1gou4ming2cheng1`: String,
  `p_gong1shi4wang3zhi3`: String
)

trait Json_amac_person_bond_org_listResponse {

  implicit val a_amac_person_bond_org_listResponse =
    new Decoder[amac_person_bond_org_listResponse] {
      final def apply(c: HCursor): Decoder.Result[amac_person_bond_org_listResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_ji1gou4lei4xing2 <- c.downField("机构类型").as[String]

          p_ji1gou4ming2cheng1 <- c.downField("机构名称").as[String]

          p_gong1shi4wang3zhi3 <- c.downField("公示网址").as[String]

        } yield {
          amac_person_bond_org_listResponse(
            p_xu4hao4,
            p_ji1gou4lei4xing2,
            p_ji1gou4ming2cheng1,
            p_gong1shi4wang3zhi3
          )
        }
    }

}

object JsonItem_amac_person_bond_org_listResponse extends Json_amac_person_bond_org_listResponse
