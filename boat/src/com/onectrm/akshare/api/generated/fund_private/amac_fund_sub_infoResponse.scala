package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_fund_sub_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_fund_sub_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/subfund/index.html 描述:
  * 获取中国证券投资基金业协会-信息公示-基金产品公示-证券公司私募投资基金 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_fund_sub_infoResponse(
  `p_chan3pin3bian1ma3`: String,
  `p_chan3pin3ming2cheng1`: String,
  `p_si1mu4ji1jin1guan3li3ren2ming2cheng1`: String,
  `p_tuo1guan3ren2ming2cheng1`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_bei4an4ri4qi1`: String
)

case class amac_fund_sub_infoResponse(
  `p_chan3pin3bian1ma3`: String,
  `p_chan3pin3ming2cheng1`: String,
  `p_si1mu4ji1jin1guan3li3ren2ming2cheng1`: String,
  `p_tuo1guan3ren2ming2cheng1`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_bei4an4ri4qi1`: String
)

trait Json_amac_fund_sub_infoResponse {

  implicit val a_amac_fund_sub_infoResponse = new Decoder[amac_fund_sub_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_fund_sub_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_chan3pin3bian1ma3 <- c.downField("产品编码").as[String]

        p_chan3pin3ming2cheng1 <- c.downField("产品名称").as[String]

        p_si1mu4ji1jin1guan3li3ren2ming2cheng1 <- c.downField("私募基金管理人名称").as[String]

        p_tuo1guan3ren2ming2cheng1 <- c.downField("托管人名称").as[String]

        p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

        p_bei4an4ri4qi1 <- c.downField("备案日期").as[String]

      } yield {
        amac_fund_sub_infoResponse(
          p_chan3pin3bian1ma3,
          p_chan3pin3ming2cheng1,
          p_si1mu4ji1jin1guan3li3ren2ming2cheng1,
          p_tuo1guan3ren2ming2cheng1,
          p_cheng2li4ri4qi1,
          p_bei4an4ri4qi1
        )
      }
  }

}

object JsonItem_amac_fund_sub_infoResponse extends Json_amac_fund_sub_infoResponse
