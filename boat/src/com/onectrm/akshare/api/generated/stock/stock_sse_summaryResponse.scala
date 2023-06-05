package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sse_summaryResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sse_summary 目标地址: http://www.sse.com.cn/market/stockdata/statistic/ 描述:
  * 上海证券交易所-股票数据总貌 限量: 单次返回最近交易日的股票数据总貌(当前交易日的数据需要交易所收盘后统计)
  */
case class Respstock_sse_summaryResponse(
  `p_xiang4mu4`: String,
  `p_gu3piao4`: String,
  `p_ke1chuang4ban3`: String,
  `p_zhu3ban3`: String
)

case class stock_sse_summaryResponse(
  `p_xiang4mu4`: String,
  `p_gu3piao4`: String,
  `p_ke1chuang4ban3`: String,
  `p_zhu3ban3`: String
)

trait Json_stock_sse_summaryResponse {

  implicit val a_stock_sse_summaryResponse = new Decoder[stock_sse_summaryResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_sse_summaryResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xiang4mu4 <- c.downField("项目").as[String]

        p_gu3piao4 <- c.downField("股票").as[String]

        p_ke1chuang4ban3 <- c.downField("科创板").as[String]

        p_zhu3ban3 <- c.downField("主板").as[String]

      } yield {
        stock_sse_summaryResponse(
          p_xiang4mu4,
          p_gu3piao4,
          p_ke1chuang4ban3,
          p_zhu3ban3
        )
      }
  }

}

object JsonItem_stock_sse_summaryResponse extends Json_stock_sse_summaryResponse
