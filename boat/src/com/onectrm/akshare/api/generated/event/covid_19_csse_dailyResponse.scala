package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_csse_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_csse_daily 目标地址: https://github.com/CSSEGISandData/COVID-19 描述: 获取
  * **COVID-19** 每个自然日的全球统计数据, 如本地无法读取数据，请参考 **[答疑专栏]** 问题 12 修改本地 host 后获取 限量: 单次返回指定 **date**
  * 的所有历史数据
  */
case class Respcovid_19_csse_dailyResponse(
  `p_ProvinceState`: String,
  `p_CountryRegion`: String,
  `p_LastUpdate`: String,
  `p_Confirmed`: Double,
  `p_Deaths`: Double,
  `p_Recovered`: Double
)

case class covid_19_csse_dailyResponse(
  `p_ProvinceState`: String,
  `p_CountryRegion`: String,
  `p_LastUpdate`: String,
  `p_Confirmed`: Double,
  `p_Deaths`: Double,
  `p_Recovered`: Double
)

trait Json_covid_19_csse_dailyResponse {

  implicit val a_covid_19_csse_dailyResponse = new Decoder[covid_19_csse_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_csse_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ProvinceState <- c.downField("Province/State").as[String]

        p_CountryRegion <- c.downField("Country/Region").as[String]

        p_LastUpdate <- c.downField("Last Update").as[String]

        p_Confirmed <- c.downField("Confirmed").as[Double]

        p_Deaths <- c.downField("Deaths").as[Double]

        p_Recovered <- c.downField("Recovered").as[Double]

      } yield {
        covid_19_csse_dailyResponse(
          p_ProvinceState,
          p_CountryRegion,
          p_LastUpdate,
          p_Confirmed,
          p_Deaths,
          p_Recovered
        )
      }
  }

}

object JsonItem_covid_19_csse_dailyResponse extends Json_covid_19_csse_dailyResponse
