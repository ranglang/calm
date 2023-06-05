package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_foreign_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_foreign_hist 目标地址: https://finance.sina.com.cn/futuremarket/ 描述:
  * 新浪财经-期货外盘历史行情数据 限量: 单次返回指定品种的历史数据
  */
case class Respfutures_foreign_histResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

case class futures_foreign_histResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

trait Json_futures_foreign_histResponse {

  implicit val a_futures_foreign_histResponse = new Decoder[futures_foreign_histResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_foreign_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Integer]

      } yield {
        futures_foreign_histResponse(
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume
        )
      }
  }

}

object JsonItem_futures_foreign_histResponse extends Json_futures_foreign_histResponse
