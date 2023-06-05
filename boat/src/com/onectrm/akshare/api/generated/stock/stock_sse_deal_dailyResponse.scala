package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sse_deal_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sse_deal_daily 目标地址: http://www.sse.com.cn/market/stockdata/overview/day/
  * 描述: 上海证券交易所-数据-股票数据-成交概况-股票成交概况-每日股票情况 限量: 单次返回指定日期的每日概况数据, 当前交易日数据需要在收盘后获取; 注意在
  * 20211227（包含）之后输出格式变化
  */
case class Respstock_sse_deal_dailyResponse(
  `p_dan1ri4qing2kuang4`: String,
  `p_gu3piao4`: Double,
  `p_zhu3ban3A`: Double,
  `p_zhu3ban3B`: Double,
  `p_ke1chuang4ban3`: Double,
  `p_gu3piao4hui2gou4`: Double
)

case class stock_sse_deal_dailyResponse(
  `p_dan1ri4qing2kuang4`: String,
  `p_gu3piao4`: Double,
  `p_zhu3ban3A`: Double,
  `p_zhu3ban3B`: Double,
  `p_ke1chuang4ban3`: Double,
  `p_gu3piao4hui2gou4`: Double
)

trait Json_stock_sse_deal_dailyResponse {

  implicit val a_stock_sse_deal_dailyResponse = new Decoder[stock_sse_deal_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_sse_deal_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dan1ri4qing2kuang4 <- c.downField("单日情况").as[String]

        p_gu3piao4 <- c.downField("股票").as[Double]

        p_zhu3ban3A <- c.downField("主板A").as[Double]

        p_zhu3ban3B <- c.downField("主板B").as[Double]

        p_ke1chuang4ban3 <- c.downField("科创板").as[Double]

        p_gu3piao4hui2gou4 <- c.downField("股票回购").as[Double]

      } yield {
        stock_sse_deal_dailyResponse(
          p_dan1ri4qing2kuang4,
          p_gu3piao4,
          p_zhu3ban3A,
          p_zhu3ban3B,
          p_ke1chuang4ban3,
          p_gu3piao4hui2gou4
        )
      }
  }

}

object JsonItem_stock_sse_deal_dailyResponse extends Json_stock_sse_deal_dailyResponse
