package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_delivery_match_dceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_delivery_match_dce 目标地址:
  * http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/jgtj/jgsj/index.html 描述: 提供大连商品交易所-交割配对 限量:
  * 单次返回指定品种的的交割配对数据
  */
case class Respfutures_delivery_match_dceResponse(
  `p_he2yue1hao4`: String,
  `p_pei4dui4ri4qi1`: String,
  `p_mai3hui4yuan2hao4`: String,
  `p_pei4dui4shou3shu4`: String,
  `p_mai4hui4yuan2hao4`: String,
  `p_jiao1ge1jie2suan4jia4`: String
)

case class futures_delivery_match_dceResponse(
  `p_he2yue1hao4`: String,
  `p_pei4dui4ri4qi1`: String,
  `p_mai3hui4yuan2hao4`: String,
  `p_pei4dui4shou3shu4`: String,
  `p_mai4hui4yuan2hao4`: String,
  `p_jiao1ge1jie2suan4jia4`: String
)

trait Json_futures_delivery_match_dceResponse {

  implicit val a_futures_delivery_match_dceResponse =
    new Decoder[futures_delivery_match_dceResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_delivery_match_dceResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_he2yue1hao4 <- c.downField("合约号").as[String]

          p_pei4dui4ri4qi1 <- c.downField("配对日期").as[String]

          p_mai3hui4yuan2hao4 <- c.downField("买会员号").as[String]

          p_pei4dui4shou3shu4 <- c.downField("配对手数").as[String]

          p_mai4hui4yuan2hao4 <- c.downField("卖会员号").as[String]

          p_jiao1ge1jie2suan4jia4 <- c.downField("交割结算价").as[String]

        } yield {
          futures_delivery_match_dceResponse(
            p_he2yue1hao4,
            p_pei4dui4ri4qi1,
            p_mai3hui4yuan2hao4,
            p_pei4dui4shou3shu4,
            p_mai4hui4yuan2hao4,
            p_jiao1ge1jie2suan4jia4
          )
        }
    }

}

object JsonItem_futures_delivery_match_dceResponse extends Json_futures_delivery_match_dceResponse
