package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_oil_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_oil_hist 目标地址: http://data.eastmoney.com/cjsj/oil_default.html 描述:
  * 东方财富-数据中心-中国油价-汽柴油历史调价信息 限量: 单次返回中国油价的所有历史数据
  */
case class Respenergy_oil_histResponse(
  `p_diao4zheng3ri4qi1`: String,
  `p_qi4you2jia4ge2`: Integer,
  `p_chai2you2jia4ge2`: Integer,
  `p_qi4you2zhang3fu2`: Double,
  `p_chai2you2zhang3fu2`: Double
)

case class energy_oil_histResponse(
  `p_diao4zheng3ri4qi1`: String,
  `p_qi4you2jia4ge2`: Integer,
  `p_chai2you2jia4ge2`: Integer,
  `p_qi4you2zhang3fu2`: Double,
  `p_chai2you2zhang3fu2`: Double
)

trait Json_energy_oil_histResponse {

  implicit val a_energy_oil_histResponse = new Decoder[energy_oil_histResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_oil_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_diao4zheng3ri4qi1 <- c.downField("调整日期").as[String]

        p_qi4you2jia4ge2 <- c.downField("汽油价格").as[Integer]

        p_chai2you2jia4ge2 <- c.downField("柴油价格").as[Integer]

        p_qi4you2zhang3fu2 <- c.downField("汽油涨幅").as[Double]

        p_chai2you2zhang3fu2 <- c.downField("柴油涨幅").as[Double]

      } yield {
        energy_oil_histResponse(
          p_diao4zheng3ri4qi1,
          p_qi4you2jia4ge2,
          p_chai2you2jia4ge2,
          p_qi4you2zhang3fu2,
          p_chai2you2zhang3fu2
        )
      }
  }

}

object JsonItem_energy_oil_histResponse extends Json_energy_oil_histResponse
