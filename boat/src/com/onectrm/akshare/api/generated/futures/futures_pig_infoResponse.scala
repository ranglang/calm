package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_pig_infoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_pig_info 目标地址: https://zhujia.zhuwang.cc/ 描述: 养猪数据中心-猪肉价格信息数据 限量:
  * 单次返回指定 symbol 的所有历史数据
  */
case class Respfutures_pig_infoResponse(
  `p_date`: String,
  `p_value`: Double
)

case class futures_pig_infoResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_futures_pig_infoResponse {

  implicit val a_futures_pig_infoResponse = new Decoder[futures_pig_infoResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_pig_infoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_value <- c.downField("value").as[Double]

      } yield {
        futures_pig_infoResponse(
          p_date,
          p_value
        )
      }
  }

}

object JsonItem_futures_pig_infoResponse extends Json_futures_pig_infoResponse
