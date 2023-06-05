package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_delivery_shfeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_delivery_shfe 目标地址:
  * http://www.shfe.com.cn/statements/dataview.html?paramid=kx 描述: 提供上海期货交易所-交割统计 限量:
  * 单次返回指定交易月份的交割统计数据
  */
case class Respfutures_delivery_shfeResponse(
  `p_pin3zhong3`: String,
  `p_jiao1ge1liang4ben3yue4`: String,
  `p_jiao1ge1liang4bi3zhong4`: String,
  `p_jiao1ge1liang4ben3nian2lei3ji4`: String,
  `p_jiao1ge1liang4lei3ji4tong2bi3`: String
)

case class futures_delivery_shfeResponse(
  `p_pin3zhong3`: String,
  `p_jiao1ge1liang4ben3yue4`: String,
  `p_jiao1ge1liang4bi3zhong4`: String,
  `p_jiao1ge1liang4ben3nian2lei3ji4`: String,
  `p_jiao1ge1liang4lei3ji4tong2bi3`: String
)

trait Json_futures_delivery_shfeResponse {

  implicit val a_futures_delivery_shfeResponse = new Decoder[futures_delivery_shfeResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_delivery_shfeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pin3zhong3 <- c.downField("品种").as[String]

        p_jiao1ge1liang4ben3yue4 <- c.downField("交割量-本月").as[String]

        p_jiao1ge1liang4bi3zhong4 <- c.downField("交割量-比重").as[String]

        p_jiao1ge1liang4ben3nian2lei3ji4 <- c.downField("交割量-本年累计").as[String]

        p_jiao1ge1liang4lei3ji4tong2bi3 <- c.downField("交割量-累计同比").as[String]

      } yield {
        futures_delivery_shfeResponse(
          p_pin3zhong3,
          p_jiao1ge1liang4ben3yue4,
          p_jiao1ge1liang4bi3zhong4,
          p_jiao1ge1liang4ben3nian2lei3ji4,
          p_jiao1ge1liang4lei3ji4tong2bi3
        )
      }
  }

}

object JsonItem_futures_delivery_shfeResponse extends Json_futures_delivery_shfeResponse
