package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.air_quality_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: air_quality_hist 目标地址: https://www.zq12369.com/ 描述: 指定城市和数据频率下并且在指定时间段内的空气质量数据
  * 限量: 单次返回所有的数据, 在提取一小时频率数据时请注意时间跨度不宜过长, 提取日频率数据的早年数据请分段提取
  */
case class Respair_quality_histResponse(
  `p_time`: String,
  `p_aqi`: String,
  `p_pm25`: Double,
  `p_pm10`: String,
  `p_co`: Double,
  `p_no2`: String,
  `p_o3`: String,
  `p_so2`: String,
  `p_complexindex`: String,
  `p_rank`: String,
  `p_primarypollutant`: String,
  `p_temp`: String,
  `p_humi`: String,
  `p_windlevel`: String,
  `p_winddirection`: String,
  `p_weather`: String
)

case class air_quality_histResponse(
  `p_time`: String,
  `p_aqi`: String,
  `p_pm25`: Double,
  `p_pm10`: String,
  `p_co`: Double,
  `p_no2`: String,
  `p_o3`: String,
  `p_so2`: String,
  `p_complexindex`: String,
  `p_rank`: String,
  `p_primarypollutant`: String,
  `p_temp`: String,
  `p_humi`: String,
  `p_windlevel`: String,
  `p_winddirection`: String,
  `p_weather`: String
)

trait Json_air_quality_histResponse {

  implicit val a_air_quality_histResponse = new Decoder[air_quality_histResponse] {
    final def apply(c: HCursor): Decoder.Result[air_quality_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_time <- c.downField("time").as[String]

        p_aqi <- c.downField("aqi").as[String]

        p_pm25 <- c.downField("pm2_5").as[Double]

        p_pm10 <- c.downField("pm10").as[String]

        p_co <- c.downField("co").as[Double]

        p_no2 <- c.downField("no2").as[String]

        p_o3 <- c.downField("o3").as[String]

        p_so2 <- c.downField("so2").as[String]

        p_complexindex <- c.downField("complexindex").as[String]

        p_rank <- c.downField("rank").as[String]

        p_primarypollutant <- c.downField("primary_pollutant").as[String]

        p_temp <- c.downField("temp").as[String]

        p_humi <- c.downField("humi").as[String]

        p_windlevel <- c.downField("windlevel").as[String]

        p_winddirection <- c.downField("winddirection").as[String]

        p_weather <- c.downField("weather").as[String]

      } yield {
        air_quality_histResponse(
          p_time,
          p_aqi,
          p_pm25,
          p_pm10,
          p_co,
          p_no2,
          p_o3,
          p_so2,
          p_complexindex,
          p_rank,
          p_primarypollutant,
          p_temp,
          p_humi,
          p_windlevel,
          p_winddirection,
          p_weather
        )
      }
  }

}

object JsonItem_air_quality_histResponse extends Json_air_quality_histResponse
