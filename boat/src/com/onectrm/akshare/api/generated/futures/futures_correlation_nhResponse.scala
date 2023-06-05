package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_correlation_nhResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_correlation_nh 目标地址: http://www.nanhua.net/nhzc/correltable.html 描述:
  * 南华期货-统计监控-相关系数走势 限量: 单次返回指定 date 和 period 的所有历史数据
  */
case class Respfutures_correlation_nhResponse(
  `p_pin3zhong3dai4ma31`: String,
  `p_pin3zhong3ming2cheng11`: String,
  `p_pin3zhong3dai4ma32`: String,
  `p_pin3zhong3ming2cheng12`: String,
  `p_xiang1guan1xi4shu4`: Double
)

case class futures_correlation_nhResponse(
  `p_pin3zhong3dai4ma31`: String,
  `p_pin3zhong3ming2cheng11`: String,
  `p_pin3zhong3dai4ma32`: String,
  `p_pin3zhong3ming2cheng12`: String,
  `p_xiang1guan1xi4shu4`: Double
)

trait Json_futures_correlation_nhResponse {

  implicit val a_futures_correlation_nhResponse = new Decoder[futures_correlation_nhResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_correlation_nhResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pin3zhong3dai4ma31 <- c.downField("品种代码1").as[String]

        p_pin3zhong3ming2cheng11 <- c.downField("品种名称1").as[String]

        p_pin3zhong3dai4ma32 <- c.downField("品种代码2").as[String]

        p_pin3zhong3ming2cheng12 <- c.downField("品种名称2").as[String]

        p_xiang1guan1xi4shu4 <- c.downField("相关系数").as[Double]

      } yield {
        futures_correlation_nhResponse(
          p_pin3zhong3dai4ma31,
          p_pin3zhong3ming2cheng11,
          p_pin3zhong3dai4ma32,
          p_pin3zhong3ming2cheng12,
          p_xiang1guan1xi4shu4
        )
      }
  }

}

object JsonItem_futures_correlation_nhResponse extends Json_futures_correlation_nhResponse
