package com.onectrm.akshare.api.generated.energy;

import com.onectrm.akshare.api.generated.energy.energy_carbon_euResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: energy 接口: energy_carbon_eu 目标地址: http://www.cerx.cn/dailynewsOuter/index.htm 描述:
  * 深圳碳排放交易所-国际碳情 限量: 返回从 2018-03-13 至 2020-04-29 的所有历史数据
  */
case class Respenergy_carbon_euResponse(
  `p_jiao1yi4ri4qi1`: String,
  `p_shi4chang3jiao1yi4zhi3shu4`: String,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double
)

case class energy_carbon_euResponse(
  `p_jiao1yi4ri4qi1`: String,
  `p_shi4chang3jiao1yi4zhi3shu4`: String,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double
)

trait Json_energy_carbon_euResponse {

  implicit val a_energy_carbon_euResponse = new Decoder[energy_carbon_euResponse] {
    final def apply(c: HCursor): Decoder.Result[energy_carbon_euResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_shi4chang3jiao1yi4zhi3shu4 <- c.downField("市场交易指数").as[String]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_cheng2jiao1jun1jia4 <- c.downField("成交均价").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

      } yield {
        energy_carbon_euResponse(
          p_jiao1yi4ri4qi1,
          p_shi4chang3jiao1yi4zhi3shu4,
          p_kai1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_cheng2jiao1jun1jia4,
          p_shou1pan2jia4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2
        )
      }
  }

}

object JsonItem_energy_carbon_euResponse extends Json_energy_carbon_euResponse
