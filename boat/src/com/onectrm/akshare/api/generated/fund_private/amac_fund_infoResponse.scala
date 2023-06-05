package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_fund_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_fund_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/fund/index.html 描述:
  * 中国证券投资基金业协会-信息公示-基金产品公示-私募基金管理人基金产品 限量: 单次返回指定页码之间的所有历史数据, 其中与每页 100 条的目标网站对应; 默认返回所有数据
  */
case class Respamac_fund_infoResponse(
  `p_ji1jin1ming2cheng1`: String,
  `p_si1mu4ji1jin1guan3li3ren2ming2cheng1`: Double,
  `p_si1mu4ji1jin1guan3li3ren2lei4xing2`: Double,
  `p_yun4xing2zhuang4tai4`: Double,
  `p_bei4an4shi2jian1`: Double,
  `p_jian4li4shi2jian1`: Double,
  `p_tuo1guan3ren2ming2cheng1`: Double
)

case class amac_fund_infoResponse(
  `p_ji1jin1ming2cheng1`: String,
  `p_si1mu4ji1jin1guan3li3ren2ming2cheng1`: Double,
  `p_si1mu4ji1jin1guan3li3ren2lei4xing2`: Double,
  `p_yun4xing2zhuang4tai4`: Double,
  `p_bei4an4shi2jian1`: Double,
  `p_jian4li4shi2jian1`: Double,
  `p_tuo1guan3ren2ming2cheng1`: Double
)

trait Json_amac_fund_infoResponse {

  implicit val a_amac_fund_infoResponse = new Decoder[amac_fund_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_fund_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1ming2cheng1 <- c.downField("基金名称").as[String]

        p_si1mu4ji1jin1guan3li3ren2ming2cheng1 <- c.downField("私募基金管理人名称").as[Double]

        p_si1mu4ji1jin1guan3li3ren2lei4xing2 <- c.downField("私募基金管理人类型").as[Double]

        p_yun4xing2zhuang4tai4 <- c.downField("运行状态").as[Double]

        p_bei4an4shi2jian1 <- c.downField("备案时间").as[Double]

        p_jian4li4shi2jian1 <- c.downField("建立时间").as[Double]

        p_tuo1guan3ren2ming2cheng1 <- c.downField("托管人名称").as[Double]

      } yield {
        amac_fund_infoResponse(
          p_ji1jin1ming2cheng1,
          p_si1mu4ji1jin1guan3li3ren2ming2cheng1,
          p_si1mu4ji1jin1guan3li3ren2lei4xing2,
          p_yun4xing2zhuang4tai4,
          p_bei4an4shi2jian1,
          p_jian4li4shi2jian1,
          p_tuo1guan3ren2ming2cheng1
        )
      }
  }

}

object JsonItem_amac_fund_infoResponse extends Json_amac_fund_infoResponse
