package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_margin_underlying_info_szseResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_margin_underlying_info_szse 目标地址:
  * http://www.szse.cn/disclosure/margin/object/index.html 描述: 深圳证券交易所-融资融券数据-标的证券信息 限量:
  * 单次返回交易日的所有历史数据
  */
case class Respstock_margin_underlying_info_szseResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_rong2zi1biao1de5`: String,
  `p_rong2quan4biao1de5`: String,
  `p_dang1ri4ke3rong2zi1`: String,
  `p_dang1ri4ke3rong2quan4`: String,
  `p_rong2quan4mai4chu1jia4ge2xian4zhi4`: String,
  `p_zhang3die1fu2xian4zhi4`: String
)

case class stock_margin_underlying_info_szseResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_rong2zi1biao1de5`: String,
  `p_rong2quan4biao1de5`: String,
  `p_dang1ri4ke3rong2zi1`: String,
  `p_dang1ri4ke3rong2quan4`: String,
  `p_rong2quan4mai4chu1jia4ge2xian4zhi4`: String,
  `p_zhang3die1fu2xian4zhi4`: String
)

trait Json_stock_margin_underlying_info_szseResponse {

  implicit val a_stock_margin_underlying_info_szseResponse =
    new Decoder[stock_margin_underlying_info_szseResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_margin_underlying_info_szseResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_rong2zi1biao1de5 <- c.downField("融资标的").as[String]

          p_rong2quan4biao1de5 <- c.downField("融券标的").as[String]

          p_dang1ri4ke3rong2zi1 <- c.downField("当日可融资").as[String]

          p_dang1ri4ke3rong2quan4 <- c.downField("当日可融券").as[String]

          p_rong2quan4mai4chu1jia4ge2xian4zhi4 <- c.downField("融券卖出价格限制").as[String]

          p_zhang3die1fu2xian4zhi4 <- c.downField("涨跌幅限制").as[String]

        } yield {
          stock_margin_underlying_info_szseResponse(
            p_zheng4quan4dai4ma3,
            p_zheng4quan4jian3cheng1,
            p_rong2zi1biao1de5,
            p_rong2quan4biao1de5,
            p_dang1ri4ke3rong2zi1,
            p_dang1ri4ke3rong2quan4,
            p_rong2quan4mai4chu1jia4ge2xian4zhi4,
            p_zhang3die1fu2xian4zhi4
          )
        }
    }

}

object JsonItem_stock_margin_underlying_info_szseResponse
    extends Json_stock_margin_underlying_info_szseResponse
