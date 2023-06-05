package com.onectrm.akshare.api.generated.fund_private;

import com.onectrm.akshare.api.generated.fund_private.amac_aoin_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_private 接口: amac_aoin_info 目标地址:
  * http://gs.amac.org.cn/amac-infodisc/res/aoin/product/index.html 描述:
  * 获取中国证券投资基金业协会-信息公示-基金产品公示-证券公司直投基金 限量: 单次返回当前时刻所有历史数据
  */
case class Respamac_aoin_infoResponse(
  `p_chan3pin3bian1ma3`: String,
  `p_chan3pin3ming2cheng1`: Double,
  `p_zhi2tou2zi5gong1si1`: Double,
  `p_guan3li3ji1gou4`: Double,
  `p_she4li4ri4qi1`: String
)

case class amac_aoin_infoResponse(
  `p_chan3pin3bian1ma3`: String,
  `p_chan3pin3ming2cheng1`: Double,
  `p_zhi2tou2zi5gong1si1`: Double,
  `p_guan3li3ji1gou4`: Double,
  `p_she4li4ri4qi1`: String
)

trait Json_amac_aoin_infoResponse {

  implicit val a_amac_aoin_infoResponse = new Decoder[amac_aoin_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[amac_aoin_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_chan3pin3bian1ma3 <- c.downField("产品编码").as[String]

        p_chan3pin3ming2cheng1 <- c.downField("产品名称").as[Double]

        p_zhi2tou2zi5gong1si1 <- c.downField("直投子公司").as[Double]

        p_guan3li3ji1gou4 <- c.downField("管理机构").as[Double]

        p_she4li4ri4qi1 <- c.downField("设立日期").as[String]

      } yield {
        amac_aoin_infoResponse(
          p_chan3pin3bian1ma3,
          p_chan3pin3ming2cheng1,
          p_zhi2tou2zi5gong1si1,
          p_guan3li3ji1gou4,
          p_she4li4ri4qi1
        )
      }
  }

}

object JsonItem_amac_aoin_infoResponse extends Json_amac_aoin_infoResponse
