package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_manager_classify_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_manager_classify_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/manager/managerList.html 描述:
  * 获取中国证券投资基金业协会-信息公示-私募基金管理人公示-私募基金管理人分类公示 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_manager_classify_infoResponse(
  `p_si1mu4ji1jin1guan3li3ren2ming2cheng1`: String,
  `p_fa3ding4dai4biao3ren2zhi2xing2shi4wu4he2huo3ren2wei3pai4dai4biao3xing4ming2`: Double,
  `p_ji1gou4lei4xing2`: Double,
  `p_zhu4ce4di4`: Double,
  `p_deng1ji4bian1hao4`: Double,
  `p_cheng2li4shi2jian1`: Double,
  `p_deng1ji4shi2jian1`: Double
)

case class amac_manager_classify_infoResponse(
  `p_si1mu4ji1jin1guan3li3ren2ming2cheng1`: String,
  `p_fa3ding4dai4biao3ren2zhi2xing2shi4wu4he2huo3ren2wei3pai4dai4biao3xing4ming2`: Double,
  `p_ji1gou4lei4xing2`: Double,
  `p_zhu4ce4di4`: Double,
  `p_deng1ji4bian1hao4`: Double,
  `p_cheng2li4shi2jian1`: Double,
  `p_deng1ji4shi2jian1`: Double
)

trait Json_amac_manager_classify_infoResponse {

  implicit val a_amac_manager_classify_infoResponse =
    new Decoder[amac_manager_classify_infoResponse] {
      final def apply(c: HCursor): Decoder.Result[amac_manager_classify_infoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_si1mu4ji1jin1guan3li3ren2ming2cheng1 <- c.downField("私募基金管理人名称").as[String]

          p_fa3ding4dai4biao3ren2zhi2xing2shi4wu4he2huo3ren2wei3pai4dai4biao3xing4ming2 <- c
            .downField("法定代表人/执行事务合伙人(委派代表)姓名")
            .as[Double]

          p_ji1gou4lei4xing2 <- c.downField("机构类型").as[Double]

          p_zhu4ce4di4 <- c.downField("注册地").as[Double]

          p_deng1ji4bian1hao4 <- c.downField("登记编号").as[Double]

          p_cheng2li4shi2jian1 <- c.downField("成立时间").as[Double]

          p_deng1ji4shi2jian1 <- c.downField("登记时间").as[Double]

        } yield {
          amac_manager_classify_infoResponse(
            p_si1mu4ji1jin1guan3li3ren2ming2cheng1,
            p_fa3ding4dai4biao3ren2zhi2xing2shi4wu4he2huo3ren2wei3pai4dai4biao3xing4ming2,
            p_ji1gou4lei4xing2,
            p_zhu4ce4di4,
            p_deng1ji4bian1hao4,
            p_cheng2li4shi2jian1,
            p_deng1ji4shi2jian1
          )
        }
    }

}

object JsonItem_amac_manager_classify_infoResponse extends Json_amac_manager_classify_infoResponse
