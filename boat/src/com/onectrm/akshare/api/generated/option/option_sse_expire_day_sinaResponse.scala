package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_sse_expire_day_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_sse_expire_day_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 获取指定到期月份指定品种的剩余到期时间 限量:
  * 单次返回指定品种的品种的剩余到期时间
  */
case class Respoption_sse_expire_day_sinaResponse(
)

case class option_sse_expire_day_sinaResponse(
)

trait Json_option_sse_expire_day_sinaResponse {

  implicit val a_option_sse_expire_day_sinaResponse =
    new Decoder[option_sse_expire_day_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_sse_expire_day_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

        } yield {
          option_sse_expire_day_sinaResponse(
          )
        }
    }

}

object JsonItem_option_sse_expire_day_sinaResponse extends Json_option_sse_expire_day_sinaResponse
