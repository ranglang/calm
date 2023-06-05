package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_carbon_domesticResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_carbon_domestic 目标地址: http://www.tanjiaoyi.com/ 描述: 碳交易网-行情信息 限量: 返回指定
  * symbol 的所有历史数据
  */
case class Respenergy_carbon_domesticResponse(
  `p_ri4qi1`: String,
  `p_cheng2jiao1jia4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_di4dian3`: String
)

case class energy_carbon_domesticResponse(
  `p_ri4qi1`: String,
  `p_cheng2jiao1jia4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_di4dian3`: String
)

trait Json_energy_carbon_domesticResponse {

  implicit val a_energy_carbon_domesticResponse = new Decoder[energy_carbon_domesticResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_carbon_domesticResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_cheng2jiao1jia4 <- c.downField("成交价").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_di4dian3 <- c.downField("地点").as[String]

      } yield {
        energy_carbon_domesticResponse(
          p_ri4qi1,
          p_cheng2jiao1jia4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_di4dian3
        )
      }
  }

}

object JsonItem_energy_carbon_domesticResponse extends Json_energy_carbon_domesticResponse
