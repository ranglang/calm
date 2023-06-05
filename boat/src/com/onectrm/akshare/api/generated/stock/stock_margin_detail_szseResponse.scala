package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_margin_detail_szseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_margin_detail_szse 目标地址:
  * http://www.szse.cn/disclosure/margin/margin/index.html 描述: 深证证券交易所-融资融券数据-融资融券交易明细数据 限量: 单次返回指定
  * date 的所有历史数据
  */
case class Respstock_margin_detail_szseResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_rong2zi1mai3ru4e2`: Integer,
  `p_rong2zi1yu2e2`: Integer,
  `p_rong2quan4mai4chu1liang4`: Integer,
  `p_rong2quan4yu2liang4`: Integer,
  `p_rong2quan4yu2e2`: Integer,
  `p_rong2zi1rong2quan4yu2e2`: Integer
)

case class stock_margin_detail_szseResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_rong2zi1mai3ru4e2`: Integer,
  `p_rong2zi1yu2e2`: Integer,
  `p_rong2quan4mai4chu1liang4`: Integer,
  `p_rong2quan4yu2liang4`: Integer,
  `p_rong2quan4yu2e2`: Integer,
  `p_rong2zi1rong2quan4yu2e2`: Integer
)

trait Json_stock_margin_detail_szseResponse {

  implicit val a_stock_margin_detail_szseResponse = new Decoder[stock_margin_detail_szseResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_margin_detail_szseResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_rong2zi1mai3ru4e2 <- c.downField("融资买入额").as[Integer]

        p_rong2zi1yu2e2 <- c.downField("融资余额").as[Integer]

        p_rong2quan4mai4chu1liang4 <- c.downField("融券卖出量").as[Integer]

        p_rong2quan4yu2liang4 <- c.downField("融券余量").as[Integer]

        p_rong2quan4yu2e2 <- c.downField("融券余额").as[Integer]

        p_rong2zi1rong2quan4yu2e2 <- c.downField("融资融券余额").as[Integer]

      } yield {
        stock_margin_detail_szseResponse(
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_rong2zi1mai3ru4e2,
          p_rong2zi1yu2e2,
          p_rong2quan4mai4chu1liang4,
          p_rong2quan4yu2liang4,
          p_rong2quan4yu2e2,
          p_rong2zi1rong2quan4yu2e2
        )
      }
  }

}

object JsonItem_stock_margin_detail_szseResponse extends Json_stock_margin_detail_szseResponse
