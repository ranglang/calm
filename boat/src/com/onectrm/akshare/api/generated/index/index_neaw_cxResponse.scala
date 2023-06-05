package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_neaw_cxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_neaw_cx 目标地址: https://s.ccxe.com.cn/indices/nei 描述: 财新指数-新经济行业入职平均工资水平 限量:
  * 该接口返回所有历史数据
  */
case class Respindex_neaw_cxResponse(
  `p_ri4qi1`: String,
  `p_xin1jing1ji4xing2ye4ru4zhi2ping2jun1gong1zi1shui3ping2`: Double,
  `p_bian4hua4zhi2`: Double
)

case class index_neaw_cxResponse(
  `p_ri4qi1`: String,
  `p_xin1jing1ji4xing2ye4ru4zhi2ping2jun1gong1zi1shui3ping2`: Double,
  `p_bian4hua4zhi2`: Double
)

trait Json_index_neaw_cxResponse {

  implicit val a_index_neaw_cxResponse = new Decoder[index_neaw_cxResponse] {
    final def apply(c: HCursor): Decoder.Result[index_neaw_cxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_xin1jing1ji4xing2ye4ru4zhi2ping2jun1gong1zi1shui3ping2 <- c
          .downField("新经济行业入职平均工资水平")
          .as[Double]

        p_bian4hua4zhi2 <- c.downField("变化值").as[Double]

      } yield {
        index_neaw_cxResponse(
          p_ri4qi1,
          p_xin1jing1ji4xing2ye4ru4zhi2ping2jun1gong1zi1shui3ping2,
          p_bian4hua4zhi2
        )
      }
  }

}

object JsonItem_index_neaw_cxResponse extends Json_index_neaw_cxResponse
