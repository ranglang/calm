package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_163Response
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_163 目标地址: https://news.163.com/special/epidemic/ 描述: 网易-新型冠状病毒肺炎-疫情数据
  * 限量: 单次返回指定 **indicator** 的数据
  */
case class Respcovid_19_163Response(
  `p_info`: String
)

case class covid_19_163Response(
  `p_info`: String
)

trait Json_covid_19_163Response {

  implicit val a_covid_19_163Response = new Decoder[covid_19_163Response] {
    final def apply(c: HCursor): Decoder.Result[covid_19_163Response] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_info <- c.downField("info").as[String]

      } yield {
        covid_19_163Response(
          p_info
        )
      }
  }

}

object JsonItem_covid_19_163Response extends Json_covid_19_163Response
