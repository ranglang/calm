package com.onectrm.akshare.api.generated.spot;

import com.onectrm.akshare.api.generated.spot.spot_hist_sgeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: spot 接口: spot_hist_sge 目标地址: https://www.sge.com.cn/sjzx/mrhq 描述: 上海黄金交易所-数据资讯-行情走势-历史数据
  * 限量: 单次返回指定 symbol 的所有历史数据
  */
case class Respspot_hist_sgeResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double
)

case class spot_hist_sgeResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_close`: Double,
  `p_high`: Double,
  `p_low`: Double
)

trait Json_spot_hist_sgeResponse {

  implicit val a_spot_hist_sgeResponse = new Decoder[spot_hist_sgeResponse] {
    final def apply(c: HCursor): Decoder.Result[spot_hist_sgeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_close <- c.downField("close").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

      } yield {
        spot_hist_sgeResponse(
          p_date,
          p_open,
          p_close,
          p_high,
          p_low
        )
      }
  }

}

object JsonItem_spot_hist_sgeResponse extends Json_spot_hist_sgeResponse
