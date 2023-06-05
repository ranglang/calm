package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_awpr_cxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_awpr_cx 目标地址: https://s.ccxe.com.cn/indices/nei 描述: 财新指数-新经济入职工资溢价水平 限量:
  * 该接口返回所有历史数据
  */
case class Respindex_awpr_cxResponse(
  `p_ri4qi1`: String,
  `p_xin1jing1ji4ru4zhi2gong1zi1yi4jia4shui3ping2`: Double,
  `p_bian4hua4zhi2`: Double
)

case class index_awpr_cxResponse(
  `p_ri4qi1`: String,
  `p_xin1jing1ji4ru4zhi2gong1zi1yi4jia4shui3ping2`: Double,
  `p_bian4hua4zhi2`: Double
)

trait Json_index_awpr_cxResponse {

  implicit val a_index_awpr_cxResponse = new Decoder[index_awpr_cxResponse] {
    final def apply(c: HCursor): Decoder.Result[index_awpr_cxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_xin1jing1ji4ru4zhi2gong1zi1yi4jia4shui3ping2 <- c.downField("新经济入职工资溢价水平").as[Double]

        p_bian4hua4zhi2 <- c.downField("变化值").as[Double]

      } yield {
        index_awpr_cxResponse(
          p_ri4qi1,
          p_xin1jing1ji4ru4zhi2gong1zi1yi4jia4shui3ping2,
          p_bian4hua4zhi2
        )
      }
  }

}

object JsonItem_index_awpr_cxResponse extends Json_index_awpr_cxResponse
