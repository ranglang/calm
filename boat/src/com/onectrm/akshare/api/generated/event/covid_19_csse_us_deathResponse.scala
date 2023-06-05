package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_csse_us_deathResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_csse_us_death 目标地址: https://github.com/CSSEGISandData/COVID-19 描述:
  * 获取美国死亡数据所有历史数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取 限量: 单次返回所有历史数据，每日更新
  */
case class Respcovid_19_csse_us_deathResponse(
  `p_ProvinceState`: String,
  `p_CountryRegion`: String,
  `p_LatandLong`: Double,
  `p_Datefields`: String
)

case class covid_19_csse_us_deathResponse(
  `p_ProvinceState`: String,
  `p_CountryRegion`: String,
  `p_LatandLong`: Double,
  `p_Datefields`: String
)

trait Json_covid_19_csse_us_deathResponse {

  implicit val a_covid_19_csse_us_deathResponse = new Decoder[covid_19_csse_us_deathResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_csse_us_deathResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ProvinceState <- c.downField("Province/State").as[String]

        p_CountryRegion <- c.downField("Country/Region").as[String]

        p_LatandLong <- c.downField("Lat and Long").as[Double]

        p_Datefields <- c.downField("Date fields").as[String]

      } yield {
        covid_19_csse_us_deathResponse(
          p_ProvinceState,
          p_CountryRegion,
          p_LatandLong,
          p_Datefields
        )
      }
  }

}

object JsonItem_covid_19_csse_us_deathResponse extends Json_covid_19_csse_us_deathResponse
