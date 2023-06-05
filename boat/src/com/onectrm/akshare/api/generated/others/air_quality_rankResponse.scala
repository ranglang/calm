package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.air_quality_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: air_quality_rank 目标地址: https://www.zq12369.com/environment.php 描述: 获取指定 date
  * 时间点上所有城市(168个)的空气质量数据 限量: 单次返回所有的数据
  */
case class Respair_quality_rankResponse(
  `p_jiang4xu4`: String,
  `p_sheng3fen4`: String,
  `p_cheng2shi4`: String,
  `p_AQI`: Double,
  `p_kong1qi4zhi4liang4`: String,
  `p_PM25nong2du4`: String,
  `p_shou3yao4wu1ran3wu4`: String
)

case class air_quality_rankResponse(
  `p_jiang4xu4`: String,
  `p_sheng3fen4`: String,
  `p_cheng2shi4`: String,
  `p_AQI`: Double,
  `p_kong1qi4zhi4liang4`: String,
  `p_PM25nong2du4`: String,
  `p_shou3yao4wu1ran3wu4`: String
)

trait Json_air_quality_rankResponse {

  implicit val a_air_quality_rankResponse = new Decoder[air_quality_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[air_quality_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiang4xu4 <- c.downField("降序").as[String]

        p_sheng3fen4 <- c.downField("省份").as[String]

        p_cheng2shi4 <- c.downField("城市").as[String]

        p_AQI <- c.downField("AQI").as[Double]

        p_kong1qi4zhi4liang4 <- c.downField("空气质量").as[String]

        p_PM25nong2du4 <- c.downField("PM2.5浓度").as[String]

        p_shou3yao4wu1ran3wu4 <- c.downField("首要污染物").as[String]

      } yield {
        air_quality_rankResponse(
          p_jiang4xu4,
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

object JsonItem_air_quality_rankResponse extends Json_air_quality_rankResponse
