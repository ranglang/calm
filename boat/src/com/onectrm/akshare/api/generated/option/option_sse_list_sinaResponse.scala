package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_sse_list_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_sse_list_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 获取期权-上交所-50ETF-合约到期月份列表
  * 限量: 单次返回指定品种的到期月份列表
  */
case class Respoption_sse_list_sinaResponse(
)

case class option_sse_list_sinaResponse(
)

trait Json_option_sse_list_sinaResponse {

  implicit val a_option_sse_list_sinaResponse = new Decoder[option_sse_list_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[option_sse_list_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

      } yield {
        option_sse_list_sinaResponse(
        )
      }
  }

}

object JsonItem_option_sse_list_sinaResponse extends Json_option_sse_list_sinaResponse
