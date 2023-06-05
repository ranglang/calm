package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.sw_index_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: sw_index_daily 目标地址:
  * http://www.swsindex.com/idx0200.aspx?columnid=8838&amp;type=Day 描述: 申万一级和二级行业历史行情数据 限量:
  * 由于申万源问题该接口暂不能获取数据
  */
case class Respsw_index_dailyResponse(
  `p_indexcode`: String,
  `p_indexname`: String,
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_vol`: Double,
  `p_amount`: Double,
  `p_changepct`: Double
)

case class sw_index_dailyResponse(
  `p_indexcode`: String,
  `p_indexname`: String,
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_vol`: Double,
  `p_amount`: Double,
  `p_changepct`: Double
)

trait Json_sw_index_dailyResponse {

  implicit val a_sw_index_dailyResponse = new Decoder[sw_index_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[sw_index_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_indexcode <- c.downField("index_code").as[String]

        p_indexname <- c.downField("index_name").as[String]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_vol <- c.downField("vol").as[Double]

        p_amount <- c.downField("amount").as[Double]

        p_changepct <- c.downField("change_pct").as[Double]

      } yield {
        sw_index_dailyResponse(
          p_indexcode,
          p_indexname,
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_vol,
          p_amount,
          p_changepct
        )
      }
  }

}

object JsonItem_sw_index_dailyResponse extends Json_sw_index_dailyResponse
