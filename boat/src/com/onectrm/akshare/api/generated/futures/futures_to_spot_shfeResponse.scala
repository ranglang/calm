package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_to_spot_shfeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_to_spot_shfe 目标地址:
  * http://www.shfe.com.cn/statements/dataview.html?paramid=kx 描述: 提供上海期货交易所-期转现数据 限量:
  * 单次返回指定交易月份的期转现数据
  */
case class Respfutures_to_spot_shfeResponse(
  `p_ri4qi1`: String,
  `p_he2yue1`: String,
  `p_jiao1ge1liang4`: String,
  `p_qi1zhuan3xian4liang4`: String
)

case class futures_to_spot_shfeResponse(
  `p_ri4qi1`: String,
  `p_he2yue1`: String,
  `p_jiao1ge1liang4`: String,
  `p_qi1zhuan3xian4liang4`: String
)

trait Json_futures_to_spot_shfeResponse {

  implicit val a_futures_to_spot_shfeResponse = new Decoder[futures_to_spot_shfeResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_to_spot_shfeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_he2yue1 <- c.downField("合约").as[String]

        p_jiao1ge1liang4 <- c.downField("交割量").as[String]

        p_qi1zhuan3xian4liang4 <- c.downField("期转现量").as[String]

      } yield {
        futures_to_spot_shfeResponse(
          p_ri4qi1,
          p_he2yue1,
          p_jiao1ge1liang4,
          p_qi1zhuan3xian4liang4
        )
      }
  }

}

object JsonItem_futures_to_spot_shfeResponse extends Json_futures_to_spot_shfeResponse
