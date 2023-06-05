package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.forbes_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: forbes_rank 目标地址: https://www.forbeschina.com/lists 描述: 福布斯中国-榜单数据, 一共 87
  * 个指标的数据可以获取 限量: 单次返回指定 symbol 的数据
  */
case class Respforbes_rankResponse(
  `p_pai2ming2`: String,
  `p_gen1ju4bu4tong2de5symboler2yi4`: String
)

case class forbes_rankResponse(
  `p_pai2ming2`: String,
  `p_gen1ju4bu4tong2de5symboler2yi4`: String
)

trait Json_forbes_rankResponse {

  implicit val a_forbes_rankResponse = new Decoder[forbes_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[forbes_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2ming2 <- c.downField("排名").as[String]

        p_gen1ju4bu4tong2de5symboler2yi4 <- c.downField("").as[String]

      } yield {
        forbes_rankResponse(
          p_pai2ming2,
          p_gen1ju4bu4tong2de5symboler2yi4
        )
      }
  }

}

object JsonItem_forbes_rankResponse extends Json_forbes_rankResponse
