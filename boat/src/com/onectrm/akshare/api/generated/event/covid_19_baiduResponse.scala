package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_baiduResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_baidu 目标地址:
  * https://voice.baidu.com/act/newpneumonia/newpneumonia/?from=osari_pc_1 描述:
  * 获取百度-新型冠状病毒肺炎-疫情实时大数据报告 限量: 单次返回所有数据
  */
case class Respcovid_19_baiduResponse(
  `p_bjhna`: String,
  `p_eventDescription`: String,
  `p_eventTime`: String,
  `p_eventUrl`: String,
  `p_homepageUrl`: String,
  `p_itemavatar`: String,
  `p_siteName`: String
)

case class covid_19_baiduResponse(
  `p_bjhna`: String,
  `p_eventDescription`: String,
  `p_eventTime`: String,
  `p_eventUrl`: String,
  `p_homepageUrl`: String,
  `p_itemavatar`: String,
  `p_siteName`: String
)

trait Json_covid_19_baiduResponse {

  implicit val a_covid_19_baiduResponse = new Decoder[covid_19_baiduResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_baiduResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bjhna <- c.downField("bjh_na").as[String]

        p_eventDescription <- c.downField("eventDescription").as[String]

        p_eventTime <- c.downField("eventTime").as[String]

        p_eventUrl <- c.downField("eventUrl").as[String]

        p_homepageUrl <- c.downField("homepageUrl").as[String]

        p_itemavatar <- c.downField("item_avatar").as[String]

        p_siteName <- c.downField("siteName").as[String]

      } yield {
        covid_19_baiduResponse(
          p_bjhna,
          p_eventDescription,
          p_eventTime,
          p_eventUrl,
          p_homepageUrl,
          p_itemavatar,
          p_siteName
        )
      }
  }

}

object JsonItem_covid_19_baiduResponse extends Json_covid_19_baiduResponse
