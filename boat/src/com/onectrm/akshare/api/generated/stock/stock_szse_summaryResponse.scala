package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_szse_summaryResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_szse_summary 目标地址: http://www.szse.cn/market/overview/index.html 描述:
  * 深圳证券交易所-市场总貌-证券类别统计 限量: 单次返回指定 date 的市场总貌数据-证券类别统计(当前交易日的数据需要交易所收盘后统计)
  */
case class Respstock_szse_summaryResponse(
  `p_zheng4quan4lei4bie2`: String,
  `p_shu4liang4`: Integer,
  `p_cheng2jiao1jin1e2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_liu2tong1shi4zhi2`: Double
)

case class stock_szse_summaryResponse(
  `p_zheng4quan4lei4bie2`: String,
  `p_shu4liang4`: Integer,
  `p_cheng2jiao1jin1e2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_liu2tong1shi4zhi2`: Double
)

trait Json_stock_szse_summaryResponse {

  implicit val a_stock_szse_summaryResponse = new Decoder[stock_szse_summaryResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_szse_summaryResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4quan4lei4bie2 <- c.downField("证券类别").as[String]

        p_shu4liang4 <- c.downField("数量").as[Integer]

        p_cheng2jiao1jin1e2 <- c.downField("成交金额").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

      } yield {
        stock_szse_summaryResponse(
          p_zheng4quan4lei4bie2,
          p_shu4liang4,
          p_cheng2jiao1jin1e2,
          p_zong3shi4zhi2,
          p_liu2tong1shi4zhi2
        )
      }
  }

}

object JsonItem_stock_szse_summaryResponse extends Json_stock_szse_summaryResponse
