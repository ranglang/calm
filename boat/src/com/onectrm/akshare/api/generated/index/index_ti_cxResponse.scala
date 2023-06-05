package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_ti_cxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_ti_cx 目标地址: https://s.ccxe.com.cn/indices/nei 描述: 财新指数-科技投入指数 限量:
  * 该接口返回所有历史数据
  */
case class Respindex_ti_cxResponse(
  `p_ri4qi1`: String,
  `p_ke1ji4tou2ru4zhi3shu4`: Double,
  `p_bian4hua4zhi2`: Double
)

case class index_ti_cxResponse(
  `p_ri4qi1`: String,
  `p_ke1ji4tou2ru4zhi3shu4`: Double,
  `p_bian4hua4zhi2`: Double
)

trait Json_index_ti_cxResponse {

  implicit val a_index_ti_cxResponse = new Decoder[index_ti_cxResponse] {
    final def apply(c: HCursor): Decoder.Result[index_ti_cxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ke1ji4tou2ru4zhi3shu4 <- c.downField("科技投入指数").as[Double]

        p_bian4hua4zhi2 <- c.downField("变化值").as[Double]

      } yield {
        index_ti_cxResponse(
          p_ri4qi1,
          p_ke1ji4tou2ru4zhi3shu4,
          p_bian4hua4zhi2
        )
      }
  }

}

object JsonItem_index_ti_cxResponse extends Json_index_ti_cxResponse
