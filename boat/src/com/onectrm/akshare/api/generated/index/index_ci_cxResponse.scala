package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_ci_cxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_ci_cx 目标地址: https://s.ccxe.com.cn/indices/nei 描述: 财新指数-资本投入指数 限量:
  * 该接口返回所有历史数据
  */
case class Respindex_ci_cxResponse(
  `p_ri4qi1`: String,
  `p_zi1ben3tou2ru4zhi3shu4`: Double,
  `p_bian4hua4zhi2`: Double
)

case class index_ci_cxResponse(
  `p_ri4qi1`: String,
  `p_zi1ben3tou2ru4zhi3shu4`: Double,
  `p_bian4hua4zhi2`: Double
)

trait Json_index_ci_cxResponse {

  implicit val a_index_ci_cxResponse = new Decoder[index_ci_cxResponse] {
    final def apply(c: HCursor): Decoder.Result[index_ci_cxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zi1ben3tou2ru4zhi3shu4 <- c.downField("资本投入指数").as[Double]

        p_bian4hua4zhi2 <- c.downField("变化值").as[Double]

      } yield {
        index_ci_cxResponse(
          p_ri4qi1,
          p_zi1ben3tou2ru4zhi3shu4,
          p_bian4hua4zhi2
        )
      }
  }

}

object JsonItem_index_ci_cxResponse extends Json_index_ci_cxResponse
