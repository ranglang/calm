package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_risk_areaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_risk_area 目标地址: http://bmfw.www.gov.cn/yqfxdjcx/risk.html 描述:
  * 卫生健康委-疫情风险等级查询 限量: 单次返回当前时刻所有数据
  */
case class Respcovid_19_risk_areaResponse(
  `p_province`: String,
  `p_city`: String,
  `p_county`: String,
  `p_areaname`: String,
  `p_communitys`: String,
  `p_grade`: String,
  `p_reportdate`: String,
  `p_number`: Integer
)

case class covid_19_risk_areaResponse(
  `p_province`: String,
  `p_city`: String,
  `p_county`: String,
  `p_areaname`: String,
  `p_communitys`: String,
  `p_grade`: String,
  `p_reportdate`: String,
  `p_number`: Integer
)

trait Json_covid_19_risk_areaResponse {

  implicit val a_covid_19_risk_areaResponse = new Decoder[covid_19_risk_areaResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_risk_areaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_province <- c.downField("province").as[String]

        p_city <- c.downField("city").as[String]

        p_county <- c.downField("county").as[String]

        p_areaname <- c.downField("area_name").as[String]

        p_communitys <- c.downField("communitys").as[String]

        p_grade <- c.downField("grade").as[String]

        p_reportdate <- c.downField("report_date").as[String]

        p_number <- c.downField("number").as[Integer]

      } yield {
        covid_19_risk_areaResponse(
          p_province,
          p_city,
          p_county,
          p_areaname,
          p_communitys,
          p_grade,
          p_reportdate,
          p_number
        )
      }
  }

}

object JsonItem_covid_19_risk_areaResponse extends Json_covid_19_risk_areaResponse
