package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.fx_pair_quoteResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: fx_pair_quote 目标地址: http://www.chinamoney.com.cn/chinese/mkdatapfx/ 描述: 外币对即期报价 限量:
  * 单次返回当前时点最近更新的即时数据
  */
case class Respfx_pair_quoteResponse(
  `p_huo4bi4dui4`: String,
  `p_mai3bao4jia4`: Double,
  `p_mai4bao4jia4`: Double
)

case class fx_pair_quoteResponse(
  `p_huo4bi4dui4`: String,
  `p_mai3bao4jia4`: Double,
  `p_mai4bao4jia4`: Double
)

trait Json_fx_pair_quoteResponse {

  implicit val a_fx_pair_quoteResponse = new Decoder[fx_pair_quoteResponse] {
    final def apply(c: HCursor): Decoder.Result[fx_pair_quoteResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_huo4bi4dui4 <- c.downField("货币对").as[String]

        p_mai3bao4jia4 <- c.downField("买报价").as[Double]

        p_mai4bao4jia4 <- c.downField("卖报价").as[Double]

      } yield {
        fx_pair_quoteResponse(
          p_huo4bi4dui4,
          p_mai3bao4jia4,
          p_mai4bao4jia4
        )
      }
  }

}

object JsonItem_fx_pair_quoteResponse extends Json_fx_pair_quoteResponse
