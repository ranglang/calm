package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_sse_codes_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_sse_codes_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 新浪期权-看涨看跌合约合约的代码 限量:
  * 单次返回指定 symbol 合约的代码
  */
case class Respoption_sse_codes_sinaResponse(
  `p_xu4hao4`: Integer,
  `p_qi1quan2dai4ma3`: String
)

case class option_sse_codes_sinaResponse(
  `p_xu4hao4`: Integer,
  `p_qi1quan2dai4ma3`: String
)

trait Json_option_sse_codes_sinaResponse {

  implicit val a_option_sse_codes_sinaResponse = new Decoder[option_sse_codes_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[option_sse_codes_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_qi1quan2dai4ma3 <- c.downField("期权代码").as[String]

      } yield {
        option_sse_codes_sinaResponse(
          p_xu4hao4,
          p_qi1quan2dai4ma3
        )
      }
  }

}

object JsonItem_option_sse_codes_sinaResponse extends Json_option_sse_codes_sinaResponse
