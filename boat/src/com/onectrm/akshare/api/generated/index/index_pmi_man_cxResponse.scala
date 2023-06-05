package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_pmi_man_cxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_pmi_man_cx 目标地址: https://s.ccxe.com.cn/indices/pmi 描述: 财新数据-指数报告-财新中国
  * PMI-制造业 PMI 限量: 该接口返回所有历史数据
  */
case class Respindex_pmi_man_cxResponse(
  `p_ri4qi1`: String,
  `p_zhi4zao4ye4PMI`: Double,
  `p_bian4hua4zhi2`: Double
)

case class index_pmi_man_cxResponse(
  `p_ri4qi1`: String,
  `p_zhi4zao4ye4PMI`: Double,
  `p_bian4hua4zhi2`: Double
)

trait Json_index_pmi_man_cxResponse {

  implicit val a_index_pmi_man_cxResponse = new Decoder[index_pmi_man_cxResponse] {
    final def apply(c: HCursor): Decoder.Result[index_pmi_man_cxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhi4zao4ye4PMI <- c.downField("制造业PMI").as[Double]

        p_bian4hua4zhi2 <- c.downField("变化值").as[Double]

      } yield {
        index_pmi_man_cxResponse(
          p_ri4qi1,
          p_zhi4zao4ye4PMI,
          p_bian4hua4zhi2
        )
      }
  }

}

object JsonItem_index_pmi_man_cxResponse extends Json_index_pmi_man_cxResponse
