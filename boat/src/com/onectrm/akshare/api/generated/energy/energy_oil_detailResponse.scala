package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_oil_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_oil_detail 目标地址: http://data.eastmoney.com/cjsj/oil_default.html 描述:
  * 东方财富-数据中心-中国油价-地区油价 限量: 返回指定调价日的全国各地区的油价的历史数据
  */
case class Respenergy_oil_detailResponse(
  `p_ri4qi1`: String,
  `p_V0`: Double,
  `p_V92`: Double,
  `p_V95`: Double,
  `p_V89`: Double,
  `p_di4qu1`: String,
  `p_ZDE0`: Double,
  `p_ZDE92`: Double,
  `p_ZDE95`: Double,
  `p_ZDE89`: Double,
  `p_QE0`: Double,
  `p_QE92`: Double,
  `p_QE95`: Double,
  `p_QE89`: Double
)

case class energy_oil_detailResponse(
  `p_ri4qi1`: String,
  `p_V0`: Double,
  `p_V92`: Double,
  `p_V95`: Double,
  `p_V89`: Double,
  `p_di4qu1`: String,
  `p_ZDE0`: Double,
  `p_ZDE92`: Double,
  `p_ZDE95`: Double,
  `p_ZDE89`: Double,
  `p_QE0`: Double,
  `p_QE92`: Double,
  `p_QE95`: Double,
  `p_QE89`: Double
)

trait Json_energy_oil_detailResponse {

  implicit val a_energy_oil_detailResponse = new Decoder[energy_oil_detailResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_oil_detailResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_V0 <- c.downField("V_0").as[Double]

        p_V92 <- c.downField("V_92").as[Double]

        p_V95 <- c.downField("V_95").as[Double]

        p_V89 <- c.downField("V_89").as[Double]

        p_di4qu1 <- c.downField("地区").as[String]

        p_ZDE0 <- c.downField("ZDE_0").as[Double]

        p_ZDE92 <- c.downField("ZDE_92").as[Double]

        p_ZDE95 <- c.downField("ZDE_95").as[Double]

        p_ZDE89 <- c.downField("ZDE_89").as[Double]

        p_QE0 <- c.downField("QE_0").as[Double]

        p_QE92 <- c.downField("QE_92").as[Double]

        p_QE95 <- c.downField("QE_95").as[Double]

        p_QE89 <- c.downField("QE_89").as[Double]

      } yield {
        energy_oil_detailResponse(
          p_ri4qi1,
          p_V0,
          p_V92,
          p_V95,
          p_V89,
          p_di4qu1,
          p_ZDE0,
          p_ZDE92,
          p_ZDE95,
          p_ZDE89,
          p_QE0,
          p_QE92,
          p_QE95,
          p_QE89
        )
      }
  }

}

object JsonItem_energy_oil_detailResponse extends Json_energy_oil_detailResponse
