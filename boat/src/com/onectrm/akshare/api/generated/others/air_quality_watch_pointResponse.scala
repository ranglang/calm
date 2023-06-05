package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.air_quality_watch_pointResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: air_quality_watch_point 目标地址: https://www.zq12369.com/environment.php 描述:
  * 获取每个城市的所有空气质量监测点的数据 限量: 单次返回指定城市指定日期区间的所有监测点的空气质量数据
  */
case class Respair_quality_watch_pointResponse(
  `p_pointname`: String,
  `p_aqi`: Double,
  `p_pm25`: Double,
  `p_pm10`: Double,
  `p_no2`: Double,
  `p_so2`: Double,
  `p_o3`: Double,
  `p_co`: Double
)

case class air_quality_watch_pointResponse(
  `p_pointname`: String,
  `p_aqi`: Double,
  `p_pm25`: Double,
  `p_pm10`: Double,
  `p_no2`: Double,
  `p_so2`: Double,
  `p_o3`: Double,
  `p_co`: Double
)

trait Json_air_quality_watch_pointResponse {

  implicit val a_air_quality_watch_pointResponse = new Decoder[air_quality_watch_pointResponse] {
    final def apply(c: HCursor): Decoder.Result[air_quality_watch_pointResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pointname <- c.downField("pointname").as[String]

        p_aqi <- c.downField("aqi").as[Double]

        p_pm25 <- c.downField("pm2_5").as[Double]

        p_pm10 <- c.downField("pm10").as[Double]

        p_no2 <- c.downField("no2").as[Double]

        p_so2 <- c.downField("so2").as[Double]

        p_o3 <- c.downField("o3").as[Double]

        p_co <- c.downField("co").as[Double]

      } yield {
        air_quality_watch_pointResponse(
          p_pointname,
          p_aqi,
          p_pm25,
          p_pm10,
          p_no2,
          p_so2,
          p_o3,
          p_co
        )
      }
  }

}

object JsonItem_air_quality_watch_pointResponse extends Json_air_quality_watch_pointResponse
