package com.onectrm.akshare.api.generated.hf;

import com.onectrm.akshare.api.generated.hf.hf_sp_500Response
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: hf 接口: hf_sp_500 目标地址: https://github.com/FutureSharks/financial-data 描述: 获取标普 500 指数的分钟数据,
  * 由于数据量比较大, 需要等待, 由于服务器在国外, 建议使用代理访问 限量:
  */
case class Resphf_sp_500Response(
)

case class hf_sp_500Response(
)

trait Json_hf_sp_500Response {

  implicit val a_hf_sp_500Response = new Decoder[hf_sp_500Response] {
    final def apply(c: HCursor): Decoder.Result[hf_sp_500Response] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

      } yield {
        hf_sp_500Response(
        )
      }
  }

}

object JsonItem_hf_sp_500Response extends Json_hf_sp_500Response
