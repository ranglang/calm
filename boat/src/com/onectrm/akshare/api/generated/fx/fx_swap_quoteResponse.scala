package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.fx_swap_quoteResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: fx_swap_quote 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/ 描述: 人民币外汇远掉报价
  * 限量: 单次返回实时行情数据
  */
case class Respfx_swap_quoteResponse(
  `p_huo4bi4dui4`: String,
  `p_1zhou1`: String,
  `p_1yue4`: String,
  `p_3yue4`: String,
  `p_6yue4`: String,
  `p_9yue4`: String,
  `p_1nian2`: String
)

case class fx_swap_quoteResponse(
  `p_huo4bi4dui4`: String,
  `p_1zhou1`: String,
  `p_1yue4`: String,
  `p_3yue4`: String,
  `p_6yue4`: String,
  `p_9yue4`: String,
  `p_1nian2`: String
)

trait Json_fx_swap_quoteResponse {

  implicit val a_fx_swap_quoteResponse = new Decoder[fx_swap_quoteResponse] {
    final def apply(c: HCursor): Decoder.Result[fx_swap_quoteResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_huo4bi4dui4 <- c.downField("货币对").as[String]

        p_1zhou1 <- c.downField("1周").as[String]

        p_1yue4 <- c.downField("1月").as[String]

        p_3yue4 <- c.downField("3月").as[String]

        p_6yue4 <- c.downField("6月").as[String]

        p_9yue4 <- c.downField("9月").as[String]

        p_1nian2 <- c.downField("1年").as[String]

      } yield {
        fx_swap_quoteResponse(
          p_huo4bi4dui4,
          p_1zhou1,
          p_1yue4,
          p_3yue4,
          p_6yue4,
          p_9yue4,
          p_1nian2
        )
      }
  }

}

object JsonItem_fx_swap_quoteResponse extends Json_fx_swap_quoteResponse
