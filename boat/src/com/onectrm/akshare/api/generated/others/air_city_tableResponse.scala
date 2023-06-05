package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.air_city_tableResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: air_city_table 目标地址: https://www.aqistudy.cn/ 描述: 所有能获取空气质量数据的城市表 限量:
  * 单次返回所有可以获取的城市表数据
  */
case class Respair_city_tableResponse(
  `p_xu4hao4`: Integer,
  `p_sheng3fen4`: String,
  `p_cheng2shi4`: String,
  `p_AQI`: Double,
  `p_kong1qi4zhi4liang4`: String,
  `p_PM25nong2du4`: String,
  `p_shou3yao4wu1ran3wu4`: String
)

case class air_city_tableResponse(
  `p_xu4hao4`: Integer,
  `p_sheng3fen4`: String,
  `p_cheng2shi4`: String,
  `p_AQI`: Double,
  `p_kong1qi4zhi4liang4`: String,
  `p_PM25nong2du4`: String,
  `p_shou3yao4wu1ran3wu4`: String
)

trait Json_air_city_tableResponse {

  implicit val a_air_city_tableResponse = new Decoder[air_city_tableResponse] {
    final def apply(c: HCursor): Decoder.Result[air_city_tableResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_sheng3fen4 <- c.downField("省份").as[String]

        p_cheng2shi4 <- c.downField("城市").as[String]

        p_AQI <- c.downField("AQI").as[Double]

        p_kong1qi4zhi4liang4 <- c.downField("空气质量").as[String]

        p_PM25nong2du4 <- c.downField("PM2.5浓度").as[String]

        p_shou3yao4wu1ran3wu4 <- c.downField("首要污染物").as[String]

      } yield {
        air_city_tableResponse(
          p_xu4hao4,
          p_sheng3fen4,
          p_cheng2shi4,
          p_AQI,
          p_kong1qi4zhi4liang4,
          p_PM25nong2du4,
          p_shou3yao4wu1ran3wu4
        )
      }
  }

}

object JsonItem_air_city_tableResponse extends Json_air_city_tableResponse
