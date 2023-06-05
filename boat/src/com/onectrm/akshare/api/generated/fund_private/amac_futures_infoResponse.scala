package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_futures_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_futures_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/pof/futures/index.html 描述:
  * 获取中国证券投资基金业协会-信息公示-基金产品公示-期货公司集合资管产品公示 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_futures_infoResponse(
  `p_chan3pin3ming2cheng1`: String,
  `p_chan3pin3bian1ma3`: String,
  `p_guan3li3ren2ming2cheng1`: String,
  `p_tuo1guan3ren2ming2cheng1`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_tou2zi1lei4xing2`: String,
  `p_shi4fou3fen1ji2`: String,
  `p_bei4an4ri4qi1`: String,
  `p_dao4qi1ri4`: String,
  `p_yun4zuo4zhuang4tai4`: String
)

case class amac_futures_infoResponse(
  `p_chan3pin3ming2cheng1`: String,
  `p_chan3pin3bian1ma3`: String,
  `p_guan3li3ren2ming2cheng1`: String,
  `p_tuo1guan3ren2ming2cheng1`: String,
  `p_cheng2li4ri4qi1`: String,
  `p_tou2zi1lei4xing2`: String,
  `p_shi4fou3fen1ji2`: String,
  `p_bei4an4ri4qi1`: String,
  `p_dao4qi1ri4`: String,
  `p_yun4zuo4zhuang4tai4`: String
)

trait Json_amac_futures_infoResponse {

  implicit val a_amac_futures_infoResponse = new Decoder[amac_futures_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_futures_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_chan3pin3ming2cheng1 <- c.downField("产品名称").as[String]

        p_chan3pin3bian1ma3 <- c.downField("产品编码").as[String]

        p_guan3li3ren2ming2cheng1 <- c.downField("管理人名称").as[String]

        p_tuo1guan3ren2ming2cheng1 <- c.downField("托管人名称").as[String]

        p_cheng2li4ri4qi1 <- c.downField("成立日期").as[String]

        p_tou2zi1lei4xing2 <- c.downField("投资类型").as[String]

        p_shi4fou3fen1ji2 <- c.downField("是否分级").as[String]

        p_bei4an4ri4qi1 <- c.downField("备案日期").as[String]

        p_dao4qi1ri4 <- c.downField("到期日").as[String]

        p_yun4zuo4zhuang4tai4 <- c.downField("运作状态").as[String]

      } yield {
        amac_futures_infoResponse(
          p_chan3pin3ming2cheng1,
          p_chan3pin3bian1ma3,
          p_guan3li3ren2ming2cheng1,
          p_tuo1guan3ren2ming2cheng1,
          p_cheng2li4ri4qi1,
          p_tou2zi1lei4xing2,
          p_shi4fou3fen1ji2,
          p_bei4an4ri4qi1,
          p_dao4qi1ri4,
          p_yun4zuo4zhuang4tai4
        )
      }
  }

}

object JsonItem_amac_futures_infoResponse extends Json_amac_futures_infoResponse
