package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_member_sub_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_member_sub_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/member/index.html?primaryInvestType=private 描述:
  * 获取中国证券投资基金业协会-信息公示-私募基金管理人公示-证券公司私募基金子公司管理人信息公示 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_member_sub_infoResponse(
  `p_ji1gou4hui4yuan2ming2cheng1`: String,
  `p_hui4yuan2dai4biao3`: Double,
  `p_hui4yuan2lei4xing2`: Double,
  `p_hui4yuan2bian1hao4`: Double,
  `p_ru4hui4shi2jian1`: Double,
  `p_gong1si1lei4xing2`: Double
)

case class amac_member_sub_infoResponse(
  `p_ji1gou4hui4yuan2ming2cheng1`: String,
  `p_hui4yuan2dai4biao3`: Double,
  `p_hui4yuan2lei4xing2`: Double,
  `p_hui4yuan2bian1hao4`: Double,
  `p_ru4hui4shi2jian1`: Double,
  `p_gong1si1lei4xing2`: Double
)

trait Json_amac_member_sub_infoResponse {

  implicit val a_amac_member_sub_infoResponse = new Decoder[amac_member_sub_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_member_sub_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1gou4hui4yuan2ming2cheng1 <- c.downField("机构（会员）名称").as[String]

        p_hui4yuan2dai4biao3 <- c.downField("会员代表").as[Double]

        p_hui4yuan2lei4xing2 <- c.downField("会员类型").as[Double]

        p_hui4yuan2bian1hao4 <- c.downField("会员编号").as[Double]

        p_ru4hui4shi2jian1 <- c.downField("入会时间").as[Double]

        p_gong1si1lei4xing2 <- c.downField("公司类型").as[Double]

      } yield {
        amac_member_sub_infoResponse(
          p_ji1gou4hui4yuan2ming2cheng1,
          p_hui4yuan2dai4biao3,
          p_hui4yuan2lei4xing2,
          p_hui4yuan2bian1hao4,
          p_ru4hui4shi2jian1,
          p_gong1si1lei4xing2
        )
      }
  }

}

object JsonItem_amac_member_sub_infoResponse extends Json_amac_member_sub_infoResponse
