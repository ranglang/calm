package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_sse_spot_price_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_sse_spot_price_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 期权实时数据 限量: 单次返回期权实时数据
  */
case class Respoption_sse_spot_price_sinaResponse(
  `p_zi4duan4`: String,
  `p_zhi2`: String
)

case class option_sse_spot_price_sinaResponse(
  `p_zi4duan4`: String,
  `p_zhi2`: String
)

trait Json_option_sse_spot_price_sinaResponse {

  implicit val a_option_sse_spot_price_sinaResponse =
    new Decoder[option_sse_spot_price_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_sse_spot_price_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zi4duan4 <- c.downField("字段").as[String]

          p_zhi2 <- c.downField("值").as[String]

        } yield {
          option_sse_spot_price_sinaResponse(
            p_zi4duan4,
            p_zhi2
          )
        }
    }

}

object JsonItem_option_sse_spot_price_sinaResponse extends Json_option_sse_spot_price_sinaResponse
