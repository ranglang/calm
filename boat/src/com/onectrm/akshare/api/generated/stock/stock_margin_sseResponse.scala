package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_margin_sseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_margin_sse 目标地址: http://www.sse.com.cn/market/othersdata/margin/sum/ 描述:
  * 获取上海证券交易所-融资融券数据-融资融券汇总数据 限量: 单次返回指定时间段内的所有历史数据
  */
case class Respstock_margin_sseResponse(
  `p_xin4yong4jiao1yi4ri4qi1`: String,
  `p_rong2zi1yu2e2`: Double,
  `p_rong2zi1mai3ru4e2`: Double,
  `p_rong2quan4yu2liang4`: Double,
  `p_rong2quan4yu2liang4jin1e2`: Double,
  `p_rong2quan4mai4chu1liang4`: Double,
  `p_rong2zi1rong2quan4yu2e2`: Double
)

case class stock_margin_sseResponse(
  `p_xin4yong4jiao1yi4ri4qi1`: String,
  `p_rong2zi1yu2e2`: Double,
  `p_rong2zi1mai3ru4e2`: Double,
  `p_rong2quan4yu2liang4`: Double,
  `p_rong2quan4yu2liang4jin1e2`: Double,
  `p_rong2quan4mai4chu1liang4`: Double,
  `p_rong2zi1rong2quan4yu2e2`: Double
)

trait Json_stock_margin_sseResponse {

  implicit val a_stock_margin_sseResponse = new Decoder[stock_margin_sseResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_margin_sseResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xin4yong4jiao1yi4ri4qi1 <- c.downField("信用交易日期").as[String]

        p_rong2zi1yu2e2 <- c.downField("融资余额").as[Double]

        p_rong2zi1mai3ru4e2 <- c.downField("融资买入额").as[Double]

        p_rong2quan4yu2liang4 <- c.downField("融券余量").as[Double]

        p_rong2quan4yu2liang4jin1e2 <- c.downField("融券余量金额").as[Double]

        p_rong2quan4mai4chu1liang4 <- c.downField("融券卖出量").as[Double]

        p_rong2zi1rong2quan4yu2e2 <- c.downField("融资融券余额").as[Double]

      } yield {
        stock_margin_sseResponse(
          p_xin4yong4jiao1yi4ri4qi1,
          p_rong2zi1yu2e2,
          p_rong2zi1mai3ru4e2,
          p_rong2quan4yu2liang4,
          p_rong2quan4yu2liang4jin1e2,
          p_rong2quan4mai4chu1liang4,
          p_rong2zi1rong2quan4yu2e2
        )
      }
  }

}

object JsonItem_stock_margin_sseResponse extends Json_stock_margin_sseResponse
