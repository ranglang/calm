package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_person_fund_org_listResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_person_fund_org_list 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/person/personOrgList.html 描述:
  * 中国证券投资基金业协会-信息公示-从业人员信息-基金从业人员资格注册信息 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_person_fund_org_listResponse(
  `p_xu4hao4`: Integer,
  `p_ji1gou4ming2cheng1`: String,
  `p_yuan2gong1ren2shu4`: String,
  `p_ji1jin1cong2ye4zi1ge2`: Integer,
  `p_ji1jin1xiao1shou4ye4wu4zi1ge2`: Integer,
  `p_ji1jin1jing1li3`: Integer,
  `p_tou2zi1jing1li3`: Integer
)

case class amac_person_fund_org_listResponse(
  `p_xu4hao4`: Integer,
  `p_ji1gou4ming2cheng1`: String,
  `p_yuan2gong1ren2shu4`: String,
  `p_ji1jin1cong2ye4zi1ge2`: Integer,
  `p_ji1jin1xiao1shou4ye4wu4zi1ge2`: Integer,
  `p_ji1jin1jing1li3`: Integer,
  `p_tou2zi1jing1li3`: Integer
)

trait Json_amac_person_fund_org_listResponse {

  implicit val a_amac_person_fund_org_listResponse =
    new Decoder[amac_person_fund_org_listResponse] {
      final def apply(c: HCursor): Decoder.Result[amac_person_fund_org_listResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_ji1gou4ming2cheng1 <- c.downField("机构名称").as[String]

          p_yuan2gong1ren2shu4 <- c.downField("员工人数").as[String]

          p_ji1jin1cong2ye4zi1ge2 <- c.downField("基金从业资格").as[Integer]

          p_ji1jin1xiao1shou4ye4wu4zi1ge2 <- c.downField("基金销售业务资格").as[Integer]

          p_ji1jin1jing1li3 <- c.downField("基金经理").as[Integer]

          p_tou2zi1jing1li3 <- c.downField("投资经理").as[Integer]

        } yield {
          amac_person_fund_org_listResponse(
            p_xu4hao4,
            p_ji1gou4ming2cheng1,
            p_yuan2gong1ren2shu4,
            p_ji1jin1cong2ye4zi1ge2,
            p_ji1jin1xiao1shou4ye4wu4zi1ge2,
            p_ji1jin1jing1li3,
            p_tou2zi1jing1li3
          )
        }
    }

}

object JsonItem_amac_person_fund_org_listResponse extends Json_amac_person_fund_org_listResponse
