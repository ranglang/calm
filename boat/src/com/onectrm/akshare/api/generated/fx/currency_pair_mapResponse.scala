package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.currency_pair_mapResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: currency_pair_map 目标地址: https://cn.investing.com/currencies/cny-jmd 描述:
  * 获取指定币种的所有能够获取到的货币对信息，历史数据可以调用 **currency_history** 获取 限量: 单次返回指定币种的所有能获取数据的货币对
  */
case class Respcurrency_pair_mapResponse(
  `p_name`: String,
  `p_code`: Double
)

case class currency_pair_mapResponse(
  `p_name`: String,
  `p_code`: Double
)

trait Json_currency_pair_mapResponse {

  implicit val a_currency_pair_mapResponse = new Decoder[currency_pair_mapResponse] {
    final def apply(c: HCursor): Decoder.Result[currency_pair_mapResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_name <- c.downField("name").as[String]

        p_code <- c.downField("code").as[Double]

      } yield {
        currency_pair_mapResponse(
          p_name,
          p_code
        )
      }
  }

}

object JsonItem_currency_pair_mapResponse extends Json_currency_pair_mapResponse
