package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.sw_index_daily_indicatorResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: sw_index_daily_indicator 目标地址:
  * http://www.swsindex.com/idx0200.aspx?columnid=8838&amp;type=Day 描述: 申万一级和二级行业历史行情指标数据 限量:
  * 由于申万源问题该接口暂不能获取数据
  */
case class Respsw_index_daily_indicatorResponse(
  `p_indexcode`: String,
  `p_indexname`: String,
  `p_date`: String,
  `p_close`: Double,
  `p_volume`: Double,
  `p_chgpct`: Double,
  `p_turnrate`: Double,
  `p_pe`: Double,
  `p_pb`: Double,
  `p_vwap`: Double,
  `p_floatmv`: Double,
  `p_avgfloatmv`: Double,
  `p_dividendyieldratio`: Double,
  `p_turnoverpct`: Double
)

case class sw_index_daily_indicatorResponse(
  `p_indexcode`: String,
  `p_indexname`: String,
  `p_date`: String,
  `p_close`: Double,
  `p_volume`: Double,
  `p_chgpct`: Double,
  `p_turnrate`: Double,
  `p_pe`: Double,
  `p_pb`: Double,
  `p_vwap`: Double,
  `p_floatmv`: Double,
  `p_avgfloatmv`: Double,
  `p_dividendyieldratio`: Double,
  `p_turnoverpct`: Double
)

trait Json_sw_index_daily_indicatorResponse {

  implicit val a_sw_index_daily_indicatorResponse = new Decoder[sw_index_daily_indicatorResponse] {
    final def apply(c: HCursor): Decoder.Result[sw_index_daily_indicatorResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_indexcode <- c.downField("index_code").as[String]

        p_indexname <- c.downField("index_name").as[String]

        p_date <- c.downField("date").as[String]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Double]

        p_chgpct <- c.downField("chg_pct").as[Double]

        p_turnrate <- c.downField("turn_rate").as[Double]

        p_pe <- c.downField("pe").as[Double]

        p_pb <- c.downField("pb").as[Double]

        p_vwap <- c.downField("vwap").as[Double]

        p_floatmv <- c.downField("float_mv").as[Double]

        p_avgfloatmv <- c.downField("avg_float_mv").as[Double]

        p_dividendyieldratio <- c.downField("dividend_yield_ratio").as[Double]

        p_turnoverpct <- c.downField("turnover_pct").as[Double]

      } yield {
        sw_index_daily_indicatorResponse(
          p_indexcode,
          p_indexname,
          p_date,
          p_close,
          p_volume,
          p_chgpct,
          p_turnrate,
          p_pe,
          p_pb,
          p_vwap,
          p_floatmv,
          p_avgfloatmv,
          p_dividendyieldratio,
          p_turnoverpct
        )
      }
  }

}

object JsonItem_sw_index_daily_indicatorResponse extends Json_sw_index_daily_indicatorResponse
