package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_hist_cityResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_hist_city 目标地址: https://github.com/norratek/Ncov2020HistoryData 描述: 获取
  * **COVID-19** 数据, 统计数据细化到地市, 该接口需要通过代理访问 限量: 单次返回指定 **city** 的所有数据
  */
case class Respcovid_19_hist_cityResponse(
  `p_date`: String,
  `p_country`: String,
  `p_countryCode`: Double,
  `p_province`: Double,
  `p_provinceCode`: Double,
  `p_city`: Double,
  `p_cityCode`: Double,
  `p_confirmed`: String,
  `p_suspected`: String,
  `p_cured`: String,
  `p_dead`: String
)

case class covid_19_hist_cityResponse(
  `p_date`: String,
  `p_country`: String,
  `p_countryCode`: Double,
  `p_province`: Double,
  `p_provinceCode`: Double,
  `p_city`: Double,
  `p_cityCode`: Double,
  `p_confirmed`: String,
  `p_suspected`: String,
  `p_cured`: String,
  `p_dead`: String
)

trait Json_covid_19_hist_cityResponse {

  implicit val a_covid_19_hist_cityResponse = new Decoder[covid_19_hist_cityResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_hist_cityResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_country <- c.downField("country").as[String]

        p_countryCode <- c.downField("countryCode").as[Double]

        p_province <- c.downField("province").as[Double]

        p_provinceCode <- c.downField("provinceCode").as[Double]

        p_city <- c.downField("city").as[Double]

        p_cityCode <- c.downField("cityCode").as[Double]

        p_confirmed <- c.downField("confirmed").as[String]

        p_suspected <- c.downField("suspected").as[String]

        p_cured <- c.downField("cured").as[String]

        p_dead <- c.downField("dead").as[String]

      } yield {
        covid_19_hist_cityResponse(
          p_date,
          p_country,
          p_countryCode,
          p_province,
          p_provinceCode,
          p_city,
          p_cityCode,
          p_confirmed,
          p_suspected,
          p_cured,
          p_dead
        )
      }
  }

}

object JsonItem_covid_19_hist_cityResponse extends Json_covid_19_hist_cityResponse
