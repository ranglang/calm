package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_manager_cancelled_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_manager_cancelled_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/cancelled/manager/index.html 描述:
  * 获取中国证券投资基金业协会-信息公示-诚信信息-已注销私募基金管理人名单 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_manager_cancelled_infoResponse(
  `p_guan3li3ren2ming2cheng1`: String,
  `p_tong3yi1she4hui4xin4yong4dai4ma3`: String,
  `p_deng1ji4shi2jian1`: String,
  `p_zhu4xiao1shi2jian1`: String,
  `p_zhu4xiao1lei4xing2`: String
)

case class amac_manager_cancelled_infoResponse(
  `p_guan3li3ren2ming2cheng1`: String,
  `p_tong3yi1she4hui4xin4yong4dai4ma3`: String,
  `p_deng1ji4shi2jian1`: String,
  `p_zhu4xiao1shi2jian1`: String,
  `p_zhu4xiao1lei4xing2`: String
)

trait Json_amac_manager_cancelled_infoResponse {

  implicit val a_amac_manager_cancelled_infoResponse =
    new Decoder[amac_manager_cancelled_infoResponse] {
      final def apply(c: HCursor): Decoder.Result[amac_manager_cancelled_infoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_guan3li3ren2ming2cheng1 <- c.downField("管理人名称").as[String]

          p_tong3yi1she4hui4xin4yong4dai4ma3 <- c.downField("统一社会信用代码").as[String]

          p_deng1ji4shi2jian1 <- c.downField("登记时间").as[String]

          p_zhu4xiao1shi2jian1 <- c.downField("注销时间").as[String]

          p_zhu4xiao1lei4xing2 <- c.downField("注销类型").as[String]

        } yield {
          amac_manager_cancelled_infoResponse(
            p_guan3li3ren2ming2cheng1,
            p_tong3yi1she4hui4xin4yong4dai4ma3,
            p_deng1ji4shi2jian1,
            p_zhu4xiao1shi2jian1,
            p_zhu4xiao1lei4xing2
          )
        }
    }

}

object JsonItem_amac_manager_cancelled_infoResponse extends Json_amac_manager_cancelled_infoResponse
