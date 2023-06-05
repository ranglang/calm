package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_delivery_match_czceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_delivery_match_czce 目标地址:
  * http://www.czce.com.cn/cn/jysj/jgpd/H770308index_1.htm 描述: 郑州商品交易所-交割配对 限量: 单次返回指定品种的的交割配对数据
  */
case class Respfutures_delivery_match_czceResponse(
  `p_mai4fang1hui4yuan2`: String,
  `p_mai4fang1hui4yuan2hui4yuan2jian3cheng1`: String,
  `p_mai3fang1hui4yuan2`: String,
  `p_mai3fang1hui4yuan2hui4yuan2jian3cheng1`: String,
  `p_jiao1ge1liang4`: Double,
  `p_pei4dui4ri4qi1`: String,
  `p_he2yue1dai4ma3`: String
)

case class futures_delivery_match_czceResponse(
  `p_mai4fang1hui4yuan2`: String,
  `p_mai4fang1hui4yuan2hui4yuan2jian3cheng1`: String,
  `p_mai3fang1hui4yuan2`: String,
  `p_mai3fang1hui4yuan2hui4yuan2jian3cheng1`: String,
  `p_jiao1ge1liang4`: Double,
  `p_pei4dui4ri4qi1`: String,
  `p_he2yue1dai4ma3`: String
)

trait Json_futures_delivery_match_czceResponse {

  implicit val a_futures_delivery_match_czceResponse =
    new Decoder[futures_delivery_match_czceResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_delivery_match_czceResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_mai4fang1hui4yuan2 <- c.downField("卖方会员").as[String]

          p_mai4fang1hui4yuan2hui4yuan2jian3cheng1 <- c.downField("卖方会员-会员简称").as[String]

          p_mai3fang1hui4yuan2 <- c.downField("买方会员").as[String]

          p_mai3fang1hui4yuan2hui4yuan2jian3cheng1 <- c.downField("买方会员-会员简称").as[String]

          p_jiao1ge1liang4 <- c.downField("交割量").as[Double]

          p_pei4dui4ri4qi1 <- c.downField("配对日期").as[String]

          p_he2yue1dai4ma3 <- c.downField("合约代码").as[String]

        } yield {
          futures_delivery_match_czceResponse(
            p_mai4fang1hui4yuan2,
            p_mai4fang1hui4yuan2hui4yuan2jian3cheng1,
            p_mai3fang1hui4yuan2,
            p_mai3fang1hui4yuan2hui4yuan2jian3cheng1,
            p_jiao1ge1liang4,
            p_pei4dui4ri4qi1,
            p_he2yue1dai4ma3
          )
        }
    }

}

object JsonItem_futures_delivery_match_czceResponse extends Json_futures_delivery_match_czceResponse
