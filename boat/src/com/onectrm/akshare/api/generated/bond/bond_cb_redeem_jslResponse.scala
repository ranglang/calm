package com.onectrm.akshare.api.generated.bond;

import com.onectrm.akshare.api.generated.bond.bond_cb_redeem_jslResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: bond 接口: bond_cb_redeem_jsl 目标地址: https://www.jisilu.cn/data/cbnew/#redeem 描述: 集思录可转债-强赎
  * 限量: 单次返回所有数据
  */
case class Respbond_cb_redeem_jslResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3ming2cheng1`: String,
  `p_gui1mo2`: Double,
  `p_sheng4yu2gui1mo2`: Double,
  `p_zhuan3gu3qi3shi3ri4`: String,
  `p_zhuan3gu3jia4`: Double,
  `p_qiang2shu2chu4fa1bi3`: Integer,
  `p_qiang2shu2chu4fa1jia4`: Double,
  `p_zheng4gu3jia4`: Double,
  `p_qiang2shu2jia4`: Double,
  `p_qiang2shu2tian1ji4shu4`: String,
  `p_qiang2shu2tiao2kuan3`: String,
  `p_qiang2shu2zhuang4tai4`: String
)

case class bond_cb_redeem_jslResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zheng4gu3dai4ma3`: String,
  `p_zheng4gu3ming2cheng1`: String,
  `p_gui1mo2`: Double,
  `p_sheng4yu2gui1mo2`: Double,
  `p_zhuan3gu3qi3shi3ri4`: String,
  `p_zhuan3gu3jia4`: Double,
  `p_qiang2shu2chu4fa1bi3`: Integer,
  `p_qiang2shu2chu4fa1jia4`: Double,
  `p_zheng4gu3jia4`: Double,
  `p_qiang2shu2jia4`: Double,
  `p_qiang2shu2tian1ji4shu4`: String,
  `p_qiang2shu2tiao2kuan3`: String,
  `p_qiang2shu2zhuang4tai4`: String
)

trait Json_bond_cb_redeem_jslResponse {

  implicit val a_bond_cb_redeem_jslResponse = new Decoder[bond_cb_redeem_jslResponse] {
    final def apply(c: HCursor): Decoder.Result[bond_cb_redeem_jslResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_xian4jia4 <- c.downField("现价").as[Double]

        p_zheng4gu3dai4ma3 <- c.downField("正股代码").as[String]

        p_zheng4gu3ming2cheng1 <- c.downField("正股名称").as[String]

        p_gui1mo2 <- c.downField("规模").as[Double]

        p_sheng4yu2gui1mo2 <- c.downField("剩余规模").as[Double]

        p_zhuan3gu3qi3shi3ri4 <- c.downField("转股起始日").as[String]

        p_zhuan3gu3jia4 <- c.downField("转股价").as[Double]

        p_qiang2shu2chu4fa1bi3 <- c.downField("强赎触发比").as[Integer]

        p_qiang2shu2chu4fa1jia4 <- c.downField("强赎触发价").as[Double]

        p_zheng4gu3jia4 <- c.downField("正股价").as[Double]

        p_qiang2shu2jia4 <- c.downField("强赎价").as[Double]

        p_qiang2shu2tian1ji4shu4 <- c.downField("强赎天计数").as[String]

        p_qiang2shu2tiao2kuan3 <- c.downField("强赎条款").as[String]

        p_qiang2shu2zhuang4tai4 <- c.downField("强赎状态").as[String]

      } yield {
        bond_cb_redeem_jslResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_xian4jia4,
          p_zheng4gu3dai4ma3,
          p_zheng4gu3ming2cheng1,
          p_gui1mo2,
          p_sheng4yu2gui1mo2,
          p_zhuan3gu3qi3shi3ri4,
          p_zhuan3gu3jia4,
          p_qiang2shu2chu4fa1bi3,
          p_qiang2shu2chu4fa1jia4,
          p_zheng4gu3jia4,
          p_qiang2shu2jia4,
          p_qiang2shu2tian1ji4shu4,
          p_qiang2shu2tiao2kuan3,
          p_qiang2shu2zhuang4tai4
        )
      }
  }

}

object JsonItem_bond_cb_redeem_jslResponse extends Json_bond_cb_redeem_jslResponse
