package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_member_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_member_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/member/index.html 描述:
  * 获取中国证券投资基金业协会-信息公示-会员信息-会员机构综合查询 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_member_infoResponse(
  `p_ji1gou4hui4yuan2ming2cheng1`: String,
  `p_hui4yuan2dai4biao3`: String,
  `p_hui4yuan2lei4xing2`: String,
  `p_hui4yuan2bian1hao4`: String,
  `p_ru4hui4shi2jian1`: String,
  `p_ji1gou4lei4xing2`: String,
  `p_shi4fou3xing1biao1`: String
)

case class amac_member_infoResponse(
  `p_ji1gou4hui4yuan2ming2cheng1`: String,
  `p_hui4yuan2dai4biao3`: String,
  `p_hui4yuan2lei4xing2`: String,
  `p_hui4yuan2bian1hao4`: String,
  `p_ru4hui4shi2jian1`: String,
  `p_ji1gou4lei4xing2`: String,
  `p_shi4fou3xing1biao1`: String
)

trait Json_amac_member_infoResponse {

  implicit val a_amac_member_infoResponse = new Decoder[amac_member_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_member_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1gou4hui4yuan2ming2cheng1 <- c.downField("机构（会员）名称").as[String]

        p_hui4yuan2dai4biao3 <- c.downField("会员代表").as[String]

        p_hui4yuan2lei4xing2 <- c.downField("会员类型").as[String]

        p_hui4yuan2bian1hao4 <- c.downField("会员编号").as[String]

        p_ru4hui4shi2jian1 <- c.downField("入会时间").as[String]

        p_ji1gou4lei4xing2 <- c.downField("机构类型").as[String]

        p_shi4fou3xing1biao1 <- c.downField("是否星标").as[String]

      } yield {
        amac_member_infoResponse(
          p_ji1gou4hui4yuan2ming2cheng1,
          p_hui4yuan2dai4biao3,
          p_hui4yuan2lei4xing2,
          p_hui4yuan2bian1hao4,
          p_ru4hui4shi2jian1,
          p_ji1gou4lei4xing2,
          p_shi4fou3xing1biao1
        )
      }
  }

}

object JsonItem_amac_member_infoResponse extends Json_amac_member_infoResponse
