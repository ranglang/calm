package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_sgx_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_sgx_daily 目标地址:
  * https://www.sgx.com/zh-hans/research-education/derivatives 描述:
  * 主要提供开盘价、最高价、最低价、收盘价、结算价、成交量及未平仓合约数据, 数据于下个工作日新加坡时间下午 2 点起提供 限量: 单次获取指定交易日前指定交易日天数的数据, 由于国内网络限制,
  * 请使用代理访问
  */
case class Respfutures_sgx_dailyResponse(
  `p_DATE`: String,
  `p_COM`: Double,
  `p_COMMM`: Double,
  `p_COMYY`: Double,
  `p_OPEN`: Double,
  `p_HIGH`: String,
  `p_LOW`: String,
  `p_CLOSE`: String,
  `p_SETTLE`: String,
  `p_VOLUME`: String,
  `p_OINT`: String,
  `p_SERIES`: String
)

case class futures_sgx_dailyResponse(
  `p_DATE`: String,
  `p_COM`: Double,
  `p_COMMM`: Double,
  `p_COMYY`: Double,
  `p_OPEN`: Double,
  `p_HIGH`: String,
  `p_LOW`: String,
  `p_CLOSE`: String,
  `p_SETTLE`: String,
  `p_VOLUME`: String,
  `p_OINT`: String,
  `p_SERIES`: String
)

trait Json_futures_sgx_dailyResponse {

  implicit val a_futures_sgx_dailyResponse = new Decoder[futures_sgx_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_sgx_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_DATE <- c.downField("DATE").as[String]

        p_COM <- c.downField("COM").as[Double]

        p_COMMM <- c.downField("COM_MM").as[Double]

        p_COMYY <- c.downField("COM_YY").as[Double]

        p_OPEN <- c.downField("OPEN").as[Double]

        p_HIGH <- c.downField("HIGH").as[String]

        p_LOW <- c.downField("LOW").as[String]

        p_CLOSE <- c.downField("CLOSE").as[String]

        p_SETTLE <- c.downField("SETTLE").as[String]

        p_VOLUME <- c.downField("VOLUME").as[String]

        p_OINT <- c.downField("OINT").as[String]

        p_SERIES <- c.downField("SERIES").as[String]

      } yield {
        futures_sgx_dailyResponse(
          p_DATE,
          p_COM,
          p_COMMM,
          p_COMYY,
          p_OPEN,
          p_HIGH,
          p_LOW,
          p_CLOSE,
          p_SETTLE,
          p_VOLUME,
          p_OINT,
          p_SERIES
        )
      }
  }

}

object JsonItem_futures_sgx_dailyResponse extends Json_futures_sgx_dailyResponse
