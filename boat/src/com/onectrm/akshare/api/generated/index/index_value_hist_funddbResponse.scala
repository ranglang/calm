package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_value_hist_funddbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_value_hist_funddb 目标地址: https://funddb.cn/site/index 描述: funddb-指数估值-估值信息
  * 限量: 该接口返回指定指数和指定指标的估值数据
  */
case class Respindex_value_hist_funddbResponse(
  `p_ri4qi1`: String,
  `p_ping2jun1zhi2`: Double,
  `p_indicator`: Double,
  `p_zui4di130`: Double,
  `p_zui4di110`: Double,
  `p_zui4gao130`: Double,
  `p_zui4gao110`: Double
)

case class index_value_hist_funddbResponse(
  `p_ri4qi1`: String,
  `p_ping2jun1zhi2`: Double,
  `p_indicator`: Double,
  `p_zui4di130`: Double,
  `p_zui4di110`: Double,
  `p_zui4gao130`: Double,
  `p_zui4gao110`: Double
)

trait Json_index_value_hist_funddbResponse {

  implicit val a_index_value_hist_funddbResponse = new Decoder[index_value_hist_funddbResponse] {
    final def apply(c: HCursor): Decoder.Result[index_value_hist_funddbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ping2jun1zhi2 <- c.downField("平均值").as[Double]

        p_indicator <- c.downField("indicator").as[Double]

        p_zui4di130 <- c.downField("最低30").as[Double]

        p_zui4di110 <- c.downField("最低10").as[Double]

        p_zui4gao130 <- c.downField("最高30").as[Double]

        p_zui4gao110 <- c.downField("最高10").as[Double]

      } yield {
        index_value_hist_funddbResponse(
          p_ri4qi1,
          p_ping2jun1zhi2,
          p_indicator,
          p_zui4di130,
          p_zui4di110,
          p_zui4gao130,
          p_zui4gao110
        )
      }
  }

}

object JsonItem_index_value_hist_funddbResponse extends Json_index_value_hist_funddbResponse
