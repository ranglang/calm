package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_price_jsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_price_js 目标地址: https://www.ushknews.com/report.html 描述: 美港电讯-美港目标价数据 限量:
  * 单次获取所有数据, 数据从 2019-至今
  */
case class Respstock_price_jsResponse(
  `p_ri4qi1`: String,
  `p_ge4gu3ming2cheng1`: String,
  `p_ping2ji2`: String,
  `p_xian1qian2mu4biao1jia4`: Double,
  `p_zui4xin1mu4biao1jia4`: Double,
  `p_ji1gou4ming2cheng1`: String
)

case class stock_price_jsResponse(
  `p_ri4qi1`: String,
  `p_ge4gu3ming2cheng1`: String,
  `p_ping2ji2`: String,
  `p_xian1qian2mu4biao1jia4`: Double,
  `p_zui4xin1mu4biao1jia4`: Double,
  `p_ji1gou4ming2cheng1`: String
)

trait Json_stock_price_jsResponse {

  implicit val a_stock_price_jsResponse = new Decoder[stock_price_jsResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_price_jsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ge4gu3ming2cheng1 <- c.downField("个股名称").as[String]

        p_ping2ji2 <- c.downField("评级").as[String]

        p_xian1qian2mu4biao1jia4 <- c.downField("先前目标价").as[Double]

        p_zui4xin1mu4biao1jia4 <- c.downField("最新目标价").as[Double]

        p_ji1gou4ming2cheng1 <- c.downField("机构名称").as[String]

      } yield {
        stock_price_jsResponse(
          p_ri4qi1,
          p_ge4gu3ming2cheng1,
          p_ping2ji2,
          p_xian1qian2mu4biao1jia4,
          p_zui4xin1mu4biao1jia4,
          p_ji1gou4ming2cheng1
        )
      }
  }

}

object JsonItem_stock_price_jsResponse extends Json_stock_price_jsResponse
