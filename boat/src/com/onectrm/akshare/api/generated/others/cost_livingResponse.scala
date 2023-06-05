package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.cost_livingResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: cost_living 目标地址: https://expatistan.com/cost-of-living/index 描述: 世界各大城市生活成本数据
  * 限量: 返回当前时点所有数据
  */
case class Respcost_livingResponse(
  `p_rank`: String,
  `p_city`: String,
  `p_index`: String
)

case class cost_livingResponse(
  `p_rank`: String,
  `p_city`: String,
  `p_index`: String
)

trait Json_cost_livingResponse {

  implicit val a_cost_livingResponse = new Decoder[cost_livingResponse] {
    final def apply(c: HCursor): Decoder.Result[cost_livingResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_rank <- c.downField("rank").as[String]

        p_city <- c.downField("city").as[String]

        p_index <- c.downField("index").as[String]

      } yield {
        cost_livingResponse(
          p_rank,
          p_city,
          p_index
        )
      }
  }

}

object JsonItem_cost_livingResponse extends Json_cost_livingResponse
