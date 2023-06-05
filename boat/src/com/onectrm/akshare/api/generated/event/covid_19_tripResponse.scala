package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_tripResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_trip 目标地址:
  * https://rl.inews.qq.com/h5/trip?from=newsapp&amp;ADTAG=tgi.wx.share.message 描述:
  * 新型肺炎确诊患者-相同行程查询工具中所有行程数据 限量: 单次返回新型肺炎确诊患者-相同行程查询工具中所有行程数据
  */
case class Respcovid_19_tripResponse(
  `p_zi4duan4guo4duo1bu4dan1lie4`: String
)

case class covid_19_tripResponse(
  `p_zi4duan4guo4duo1bu4dan1lie4`: String
)

trait Json_covid_19_tripResponse {

  implicit val a_covid_19_tripResponse = new Decoder[covid_19_tripResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_tripResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zi4duan4guo4duo1bu4dan1lie4 <- c.downField("").as[String]

      } yield {
        covid_19_tripResponse(
          p_zi4duan4guo4duo1bu4dan1lie4
        )
      }
  }

}

object JsonItem_covid_19_tripResponse extends Json_covid_19_tripResponse
