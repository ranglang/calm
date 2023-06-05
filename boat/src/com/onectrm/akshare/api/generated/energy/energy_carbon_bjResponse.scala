package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_carbon_bjResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_carbon_bj 目标地址: https://www.bjets.com.cn/article/jyxx/ 描述:
  * 北京市碳排放权电子交易平台-北京市碳排放权公开交易行情 限量: 全部历史数据
  */
case class Respenergy_carbon_bjResponse(
  `p_ri4qi1`: String,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_cheng2jiao1dan1wei4`: String
)

case class energy_carbon_bjResponse(
  `p_ri4qi1`: String,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_cheng2jiao1dan1wei4`: String
)

trait Json_energy_carbon_bjResponse {

  implicit val a_energy_carbon_bjResponse = new Decoder[energy_carbon_bjResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_carbon_bjResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1jun1jia4 <- c.downField("成交均价").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_cheng2jiao1dan1wei4 <- c.downField("成交单位").as[String]

      } yield {
        energy_carbon_bjResponse(
          p_ri4qi1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1jun1jia4,
          p_cheng2jiao1e2,
          p_cheng2jiao1dan1wei4
        )
      }
  }

}

object JsonItem_energy_carbon_bjResponse extends Json_energy_carbon_bjResponse
