package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_to_spot_czceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_to_spot_czce 目标地址:
  * http://www.czce.com.cn/cn/jysj/qzxtj/H770311index_1.htm 描述: 郑州商品交易所-期转现统计数据 限量:
  * 单次返回指定交易日的期转现统计数据
  */
case class Respfutures_to_spot_czceResponse(
  `p_he2yue1dai4ma3`: String,
  `p_he2yue1shu4liang4`: Integer
)

case class futures_to_spot_czceResponse(
  `p_he2yue1dai4ma3`: String,
  `p_he2yue1shu4liang4`: Integer
)

trait Json_futures_to_spot_czceResponse {

  implicit val a_futures_to_spot_czceResponse = new Decoder[futures_to_spot_czceResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_to_spot_czceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_he2yue1dai4ma3 <- c.downField("合约代码").as[String]

        p_he2yue1shu4liang4 <- c.downField("合约数量").as[Integer]

      } yield {
        futures_to_spot_czceResponse(
          p_he2yue1dai4ma3,
          p_he2yue1shu4liang4
        )
      }
  }

}

object JsonItem_futures_to_spot_czceResponse extends Json_futures_to_spot_czceResponse
