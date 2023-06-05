package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_delivery_czceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_delivery_czce 目标地址:
  * http://www.czce.com.cn/cn/jysj/ydjgcx/H770316index_1.htm 描述: 郑州商品交易所-交割统计 限量: 单次返回指定交易月份的交割统计数据
  */
case class Respfutures_delivery_czceResponse(
  `p_pin3zhong3`: String,
  `p_jiao1ge1shu4liang4`: Integer,
  `p_jiao1ge1e2`: Integer
)

case class futures_delivery_czceResponse(
  `p_pin3zhong3`: String,
  `p_jiao1ge1shu4liang4`: Integer,
  `p_jiao1ge1e2`: Integer
)

trait Json_futures_delivery_czceResponse {

  implicit val a_futures_delivery_czceResponse = new Decoder[futures_delivery_czceResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_delivery_czceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pin3zhong3 <- c.downField("品种").as[String]

        p_jiao1ge1shu4liang4 <- c.downField("交割数量").as[Integer]

        p_jiao1ge1e2 <- c.downField("交割额").as[Integer]

      } yield {
        futures_delivery_czceResponse(
          p_pin3zhong3,
          p_jiao1ge1shu4liang4,
          p_jiao1ge1e2
        )
      }
  }

}

object JsonItem_futures_delivery_czceResponse extends Json_futures_delivery_czceResponse
