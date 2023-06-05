package com.onectrm.akshare.api.generated.nlp;

import com.onectrm.akshare.api.generated.nlp.nlp_ownthinkResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: nlp 接口: nlp_ownthink 目标地址: https://ownthink.com/ 描述: 获取思知-知识图谱的接口, 以此来查询知识图谱数据 限量:
  * 单次返回查询的数据结果
  */
case class Respnlp_ownthinkResponse(
  `p_str`: String
)

case class nlp_ownthinkResponse(
  `p_str`: String
)

trait Json_nlp_ownthinkResponse {

  implicit val a_nlp_ownthinkResponse = new Decoder[nlp_ownthinkResponse] {
    final def apply(c: HCursor): Decoder.Result[nlp_ownthinkResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_str <- c.downField("").as[String]

      } yield {
        nlp_ownthinkResponse(
          p_str
        )
      }
  }

}

object JsonItem_nlp_ownthinkResponse extends Json_nlp_ownthinkResponse
