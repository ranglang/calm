package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.maxima_companyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: maxima_company 目标地址: https://www.itjuzi.com/chollima 描述: 获取千里马公司数据库, 该数据未更新 限量:
  * 返回所有历史数据, 该数据未更新
  */
case class Respmaxima_companyResponse(
  `p_xu4hao4`: Long,
  `p_gong1si1`: String,
  `p_xing2ye4`: String,
  `p_di4qu1`: String
)

case class maxima_companyResponse(
  `p_xu4hao4`: Long,
  `p_gong1si1`: String,
  `p_xing2ye4`: String,
  `p_di4qu1`: String
)

trait Json_maxima_companyResponse {

  implicit val a_maxima_companyResponse = new Decoder[maxima_companyResponse] {
    final def apply(c: HCursor): Decoder.Result[maxima_companyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gong1si1 <- c.downField("公司").as[String]

        p_xing2ye4 <- c.downField("行业").as[String]

        p_di4qu1 <- c.downField("地区").as[String]

      } yield {
        maxima_companyResponse(
          p_xu4hao4,
          p_gong1si1,
          p_xing2ye4,
          p_di4qu1
        )
      }
  }

}

object JsonItem_maxima_companyResponse extends Json_maxima_companyResponse
