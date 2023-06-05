package com.onectrm.akshare.api.generated.nlp;

import com.onectrm.akshare.api.generated.nlp.nlp_answerResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: nlp 接口: nlp_answer 目标地址: https://ownthink.com/robot.html 描述: 获取思知-对话机器人的接口, 以此来进行智能问答 限量:
  * 单次返回查询的数据结果
  */
case class Respnlp_answerResponse(
  `p_da2an4`: String
)

case class nlp_answerResponse(
  `p_da2an4`: String
)

trait Json_nlp_answerResponse {

  implicit val a_nlp_answerResponse = new Decoder[nlp_answerResponse] {
    final def apply(c: HCursor): Decoder.Result[nlp_answerResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_da2an4 <- c.downField("答案").as[String]

      } yield {
        nlp_answerResponse(
          p_da2an4
        )
      }
  }

}

object JsonItem_nlp_answerResponse extends Json_nlp_answerResponse
