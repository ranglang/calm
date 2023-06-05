package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_szse_area_summaryResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_szse_area_summary 目标地址: http://www.szse.cn/market/overview/index.html 描述:
  * 深圳证券交易所-市场总貌-地区交易排序 限量: 单次返回指定 date 的市场总貌数据-地区交易排序数据
  */
case class Respstock_szse_area_summaryResponse(
  `p_xu4hao4`: Integer,
  `p_di4qu1`: String,
  `p_zong3jiao1yi4e2`: Double,
  `p_zhan4shi4chang3`: Double,
  `p_gu3piao4jiao1yi4e2`: Double,
  `p_ji1jin1jiao1yi4e2`: Double,
  `p_zhai4quan4jiao1yi4e2`: Double
)

case class stock_szse_area_summaryResponse(
  `p_xu4hao4`: Integer,
  `p_di4qu1`: String,
  `p_zong3jiao1yi4e2`: Double,
  `p_zhan4shi4chang3`: Double,
  `p_gu3piao4jiao1yi4e2`: Double,
  `p_ji1jin1jiao1yi4e2`: Double,
  `p_zhai4quan4jiao1yi4e2`: Double
)

trait Json_stock_szse_area_summaryResponse {

  implicit val a_stock_szse_area_summaryResponse = new Decoder[stock_szse_area_summaryResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_szse_area_summaryResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_di4qu1 <- c.downField("地区").as[String]

        p_zong3jiao1yi4e2 <- c.downField("总交易额").as[Double]

        p_zhan4shi4chang3 <- c.downField("占市场").as[Double]

        p_gu3piao4jiao1yi4e2 <- c.downField("股票交易额").as[Double]

        p_ji1jin1jiao1yi4e2 <- c.downField("基金交易额").as[Double]

        p_zhai4quan4jiao1yi4e2 <- c.downField("债券交易额").as[Double]

      } yield {
        stock_szse_area_summaryResponse(
          p_xu4hao4,
          p_di4qu1,
          p_zong3jiao1yi4e2,
          p_zhan4shi4chang3,
          p_gu3piao4jiao1yi4e2,
          p_ji1jin1jiao1yi4e2,
          p_zhai4quan4jiao1yi4e2
        )
      }
  }

}

object JsonItem_stock_szse_area_summaryResponse extends Json_stock_szse_area_summaryResponse
