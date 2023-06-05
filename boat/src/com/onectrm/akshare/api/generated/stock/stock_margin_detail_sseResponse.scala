package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_margin_detail_sseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_margin_detail_sse 目标地址:
  * http://www.sse.com.cn/market/othersdata/margin/detail/ 描述: 上海证券交易所-融资融券数据-融资融券明细数据 限量:
  * 单次返回交易日的所有历史数据
  */
case class Respstock_margin_detail_sseResponse(
  `p_xin4yong4jiao1yi4ri4qi1`: String,
  `p_biao1de5zheng4quan4dai4ma3`: String,
  `p_biao1de5zheng4quan4jian3cheng1`: String,
  `p_rong2zi1yu2e2`: Double,
  `p_rong2zi1mai3ru4e2`: Double,
  `p_rong2zi1chang2hai2e2`: Double,
  `p_rong2quan4yu2liang4`: Double,
  `p_rong2quan4mai4chu1liang4`: Double,
  `p_rong2quan4chang2hai2liang4`: Double
)

case class stock_margin_detail_sseResponse(
  `p_xin4yong4jiao1yi4ri4qi1`: String,
  `p_biao1de5zheng4quan4dai4ma3`: String,
  `p_biao1de5zheng4quan4jian3cheng1`: String,
  `p_rong2zi1yu2e2`: Double,
  `p_rong2zi1mai3ru4e2`: Double,
  `p_rong2zi1chang2hai2e2`: Double,
  `p_rong2quan4yu2liang4`: Double,
  `p_rong2quan4mai4chu1liang4`: Double,
  `p_rong2quan4chang2hai2liang4`: Double
)

trait Json_stock_margin_detail_sseResponse {

  implicit val a_stock_margin_detail_sseResponse = new Decoder[stock_margin_detail_sseResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_margin_detail_sseResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xin4yong4jiao1yi4ri4qi1 <- c.downField("信用交易日期").as[String]

        p_biao1de5zheng4quan4dai4ma3 <- c.downField("标的证券代码").as[String]

        p_biao1de5zheng4quan4jian3cheng1 <- c.downField("标的证券简称").as[String]

        p_rong2zi1yu2e2 <- c.downField("融资余额").as[Double]

        p_rong2zi1mai3ru4e2 <- c.downField("融资买入额").as[Double]

        p_rong2zi1chang2hai2e2 <- c.downField("融资偿还额").as[Double]

        p_rong2quan4yu2liang4 <- c.downField("融券余量").as[Double]

        p_rong2quan4mai4chu1liang4 <- c.downField("融券卖出量").as[Double]

        p_rong2quan4chang2hai2liang4 <- c.downField("融券偿还量").as[Double]

      } yield {
        stock_margin_detail_sseResponse(
          p_xin4yong4jiao1yi4ri4qi1,
          p_biao1de5zheng4quan4dai4ma3,
          p_biao1de5zheng4quan4jian3cheng1,
          p_rong2zi1yu2e2,
          p_rong2zi1mai3ru4e2,
          p_rong2zi1chang2hai2e2,
          p_rong2quan4yu2liang4,
          p_rong2quan4mai4chu1liang4,
          p_rong2quan4chang2hai2liang4
        )
      }
  }

}

object JsonItem_stock_margin_detail_sseResponse extends Json_stock_margin_detail_sseResponse
