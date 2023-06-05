package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.air_quality_hebeiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: air_quality_hebei 目标地址: http://110.249.223.67/publish/ 描述: 河北省指定 symbol 的最近 6
  * 天空气质量数据 限量: 单次指定 symbol 的最近 6 天的数据
  */
case class Respair_quality_hebeiResponse(
  `p_city`: String,
  `p_date`: String,
  `p_pollutant`: String,
  `p_minaqi`: Integer,
  `p_maxaqi`: Integer,
  `p_level`: String
)

case class air_quality_hebeiResponse(
  `p_city`: String,
  `p_date`: String,
  `p_pollutant`: String,
  `p_minaqi`: Integer,
  `p_maxaqi`: Integer,
  `p_level`: String
)

trait Json_air_quality_hebeiResponse {

  implicit val a_air_quality_hebeiResponse = new Decoder[air_quality_hebeiResponse] {
    final def apply(c: HCursor): Decoder.Result[air_quality_hebeiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_city <- c.downField("city").as[String]

        p_date <- c.downField("date").as[String]

        p_pollutant <- c.downField("pollutant").as[String]

        p_minaqi <- c.downField("minaqi").as[Integer]

        p_maxaqi <- c.downField("maxaqi").as[Integer]

        p_level <- c.downField("level").as[String]

      } yield {
        air_quality_hebeiResponse(
          p_city,
          p_date,
          p_pollutant,
          p_minaqi,
          p_maxaqi,
          p_level
        )
      }
  }

}

object JsonItem_air_quality_hebeiResponse extends Json_air_quality_hebeiResponse
