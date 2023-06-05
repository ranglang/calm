package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.nicorn_companyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: nicorn_company 目标地址: https://www.itjuzi.com/unicorn 描述: 获取独角兽公司数据库, 该数据未更新 限量:
  * 返回所有历史数据, 该数据未更新
  */
case class Respnicorn_companyResponse(
  `p_xu4hao4`: Long,
  `p_gong1si1`: String,
  `p_di4qu1`: String,
  `p_xing2ye4`: String,
  `p_zi5xing2ye4`: String
)

case class nicorn_companyResponse(
  `p_xu4hao4`: Long,
  `p_gong1si1`: String,
  `p_di4qu1`: String,
  `p_xing2ye4`: String,
  `p_zi5xing2ye4`: String
)

trait Json_nicorn_companyResponse {

  implicit val a_nicorn_companyResponse = new Decoder[nicorn_companyResponse] {
    final def apply(c: HCursor): Decoder.Result[nicorn_companyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gong1si1 <- c.downField("公司").as[String]

        p_di4qu1 <- c.downField("地区").as[String]

        p_xing2ye4 <- c.downField("行业").as[String]

        p_zi5xing2ye4 <- c.downField("子行业").as[String]

      } yield {
        nicorn_companyResponse(
          p_xu4hao4,
          p_gong1si1,
          p_di4qu1,
          p_xing2ye4,
          p_zi5xing2ye4
        )
      }
  }

}

object JsonItem_nicorn_companyResponse extends Json_nicorn_companyResponse
