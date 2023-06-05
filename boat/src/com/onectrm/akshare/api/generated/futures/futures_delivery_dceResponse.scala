package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_delivery_dceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_delivery_dce 目标地址:
  * http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/jgsj/index.html 描述: 提供大连商品交易所-交割统计 限量:
  * 单次返回指定交易月份的交割统计数据
  */
case class Respfutures_delivery_dceResponse(
  `p_pin3zhong3`: String,
  `p_he2yue1`: String,
  `p_jiao1ge1ri4qi1`: String,
  `p_jiao1ge1liang4`: String,
  `p_jiao1ge1jin1e2`: String
)

case class futures_delivery_dceResponse(
  `p_pin3zhong3`: String,
  `p_he2yue1`: String,
  `p_jiao1ge1ri4qi1`: String,
  `p_jiao1ge1liang4`: String,
  `p_jiao1ge1jin1e2`: String
)

trait Json_futures_delivery_dceResponse {

  implicit val a_futures_delivery_dceResponse = new Decoder[futures_delivery_dceResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_delivery_dceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pin3zhong3 <- c.downField("品种").as[String]

        p_he2yue1 <- c.downField("合约").as[String]

        p_jiao1ge1ri4qi1 <- c.downField("交割日期").as[String]

        p_jiao1ge1liang4 <- c.downField("交割量").as[String]

        p_jiao1ge1jin1e2 <- c.downField("交割金额").as[String]

      } yield {
        futures_delivery_dceResponse(
          p_pin3zhong3,
          p_he2yue1,
          p_jiao1ge1ri4qi1,
          p_jiao1ge1liang4,
          p_jiao1ge1jin1e2
        )
      }
  }

}

object JsonItem_futures_delivery_dceResponse extends Json_futures_delivery_dceResponse
