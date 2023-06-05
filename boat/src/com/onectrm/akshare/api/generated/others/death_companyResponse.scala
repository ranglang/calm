package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.death_companyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: death_company 目标地址: https://www.itjuzi.com/deathCompany 描述: 新经济死亡公司数据库 限量:
  * 返回所有历史数据
  */
case class Respdeath_companyResponse(
  `p_gong1si1jian3cheng1`: String,
  `p_cheng2li4shi2jian1`: String,
  `p_guan1bi4shi2jian1`: String,
  `p_cun2huo2tian1shu4`: Integer,
  `p_rong2zi1gui1mo2`: Double,
  `p_xing2ye4`: String,
  `p_di4dian3`: String
)

case class death_companyResponse(
  `p_gong1si1jian3cheng1`: String,
  `p_cheng2li4shi2jian1`: String,
  `p_guan1bi4shi2jian1`: String,
  `p_cun2huo2tian1shu4`: Integer,
  `p_rong2zi1gui1mo2`: Double,
  `p_xing2ye4`: String,
  `p_di4dian3`: String
)

trait Json_death_companyResponse {

  implicit val a_death_companyResponse = new Decoder[death_companyResponse] {
    final def apply(c: HCursor): Decoder.Result[death_companyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gong1si1jian3cheng1 <- c.downField("公司简称").as[String]

        p_cheng2li4shi2jian1 <- c.downField("成立时间").as[String]

        p_guan1bi4shi2jian1 <- c.downField("关闭时间").as[String]

        p_cun2huo2tian1shu4 <- c.downField("存活天数").as[Integer]

        p_rong2zi1gui1mo2 <- c.downField("融资规模").as[Double]

        p_xing2ye4 <- c.downField("行业").as[String]

        p_di4dian3 <- c.downField("地点").as[String]

      } yield {
        death_companyResponse(
          p_gong1si1jian3cheng1,
          p_cheng2li4shi2jian1,
          p_guan1bi4shi2jian1,
          p_cun2huo2tian1shu4,
          p_rong2zi1gui1mo2,
          p_xing2ye4,
          p_di4dian3
        )
      }
  }

}

object JsonItem_death_companyResponse extends Json_death_companyResponse
