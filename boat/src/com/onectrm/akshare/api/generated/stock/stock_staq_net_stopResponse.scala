package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_staq_net_stopResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_staq_net_stop 目标地址:
  * http://quote.eastmoney.com/center/gridlist.html#staq_net_board 描述: 东方财富网-行情中心-沪深个股-两网及退市 限量:
  * 单次获取所有两网及退市的股票数据
  */
case class Respstock_staq_net_stopResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String
)

case class stock_staq_net_stopResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String
)

trait Json_stock_staq_net_stopResponse {

  implicit val a_stock_staq_net_stopResponse = new Decoder[stock_staq_net_stopResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_staq_net_stopResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

      } yield {
        stock_staq_net_stopResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1
        )
      }
  }

}

object JsonItem_stock_staq_net_stopResponse extends Json_stock_staq_net_stopResponse
