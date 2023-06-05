package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.covid_19_traceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: covid_19_trace 目标地址: https://news.qq.com/hdh5/hebeicomeon.htm#/?ADTAG=yqi 描述:
  * 腾讯新闻-疫情-病患轨迹的数据 限量: 单次返回所有省份的数据
  */
case class Respcovid_19_traceResponse(
  `p_di4zhi3`: String,
  `p_cheng2shi4`: String,
  `p_qu1`: String,
  `p_sheng3fen4`: String,
  `p_biao1ti2`: String,
  `p_geng4xin1shi2jian1`: String,
  `p_feng1xian3deng3ji2`: String,
  `p_tong3ji4shi2jian1`: String
)

case class covid_19_traceResponse(
  `p_di4zhi3`: String,
  `p_cheng2shi4`: String,
  `p_qu1`: String,
  `p_sheng3fen4`: String,
  `p_biao1ti2`: String,
  `p_geng4xin1shi2jian1`: String,
  `p_feng1xian3deng3ji2`: String,
  `p_tong3ji4shi2jian1`: String
)

trait Json_covid_19_traceResponse {

  implicit val a_covid_19_traceResponse = new Decoder[covid_19_traceResponse] {
    final def apply(c: HCursor): Decoder.Result[covid_19_traceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_di4zhi3 <- c.downField("地址").as[String]

        p_cheng2shi4 <- c.downField("城市").as[String]

        p_qu1 <- c.downField("区").as[String]

        p_sheng3fen4 <- c.downField("省份").as[String]

        p_biao1ti2 <- c.downField("标题").as[String]

        p_geng4xin1shi2jian1 <- c.downField("更新时间").as[String]

        p_feng1xian3deng3ji2 <- c.downField("风险等级").as[String]

        p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

      } yield {
        covid_19_traceResponse(
          p_di4zhi3,
          p_cheng2shi4,
          p_qu1,
          p_sheng3fen4,
          p_biao1ti2,
          p_geng4xin1shi2jian1,
          p_feng1xian3deng3ji2,
          p_tong3ji4shi2jian1
        )
      }
  }

}

object JsonItem_covid_19_traceResponse extends Json_covid_19_traceResponse
