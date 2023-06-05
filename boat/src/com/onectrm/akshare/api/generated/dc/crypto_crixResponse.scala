package com.onectrm.akshare.api.generated.dc;

import com.onectrm.akshare.api.generated.dc.crypto_crixResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: dc 接口: crypto_crix 目标地址: https://thecrix.de/ 描述: 获取加密货币全球市场指数 限量: 单次返回指定 symbol 的历史数据
  */
case class Respcrypto_crixResponse(
  `p_date`: String,
  `p_value`: Double
)

case class crypto_crixResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_crypto_crixResponse {

  implicit val a_crypto_crixResponse = new Decoder[crypto_crixResponse] {
    final def apply(c: HCursor): Decoder.Result[crypto_crixResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        crypto_crixResponse(
          p_date,
          p_value
        )
      }
  }

}

object JsonItem_crypto_crixResponse extends Json_crypto_crixResponse
