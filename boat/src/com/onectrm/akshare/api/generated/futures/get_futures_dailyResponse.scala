package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.get_futures_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: get_futures_daily 目标地址: 各交易所网站 描述: 提供各交易所各品种的网站的历史行情数据, 其中 20040625, 20070604,
  * 20081226, 20090119 原网页数据缺失 限量: 单次返回指定时间段指定交易所的所有期货品种历史数据
  */
case class Respget_futures_dailyResponse(
  `p_symbol`: String,
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: String,
  `p_volume`: String,
  `p_openinterest`: String,
  `p_turnover`: Double,
  `p_settle`: Double,
  `p_presettle`: Double,
  `p_variety`: String
)

case class get_futures_dailyResponse(
  `p_symbol`: String,
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: String,
  `p_volume`: String,
  `p_openinterest`: String,
  `p_turnover`: Double,
  `p_settle`: Double,
  `p_presettle`: Double,
  `p_variety`: String
)

trait Json_get_futures_dailyResponse {

  implicit val a_get_futures_dailyResponse = new Decoder[get_futures_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[get_futures_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_symbol <- c.downField("symbol").as[String]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[String]

        p_volume <- c.downField("volume").as[String]

        p_openinterest <- c.downField("open_interest").as[String]

        p_turnover <- c.downField("turnover").as[Double]

        p_settle <- c.downField("settle").as[Double]

        p_presettle <- c.downField("pre_settle").as[Double]

        p_variety <- c.downField("variety").as[String]

      } yield {
        get_futures_dailyResponse(
          p_symbol,
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume,
          p_openinterest,
          p_turnover,
          p_settle,
          p_presettle,
          p_variety
        )
      }
  }

}

object JsonItem_get_futures_dailyResponse extends Json_get_futures_dailyResponse
