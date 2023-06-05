package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_dxyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_dxy 目标地址: https://ncov.dxy.cn/ncovh5/view/pneumonia 描述:
  * 丁香园-新型冠状病毒肺炎-疫情数据 限量: 单次返回指定 **indicator** 数据
  */
case class Respcovid_19_dxyResponse(
  `p_can1jian4shu4ju4shi4li4zhong1guo2yi4qing2fen1sheng3tong3ji4xiang2qing2`: String
)

case class covid_19_dxyResponse(
  `p_can1jian4shu4ju4shi4li4zhong1guo2yi4qing2fen1sheng3tong3ji4xiang2qing2`: String
)

trait Json_covid_19_dxyResponse {

  implicit val a_covid_19_dxyResponse = new Decoder[covid_19_dxyResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_dxyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_can1jian4shu4ju4shi4li4zhong1guo2yi4qing2fen1sheng3tong3ji4xiang2qing2 <- c
          .downField("")
          .as[String]

      } yield {
        covid_19_dxyResponse(
          p_can1jian4shu4ju4shi4li4zhong1guo2yi4qing2fen1sheng3tong3ji4xiang2qing2
        )
      }
  }

}

object JsonItem_covid_19_dxyResponse extends Json_covid_19_dxyResponse
