package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_dce_position_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_dce_position_rank 目标地址:
  * http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/rtj/rcjccpm/index.html 描述:
  * 获取大连商品交易所指定交易日的具体合约的持仓排名 限量: 单次返回所有合约的持仓排名数据, 返回以合约名字为键, 具体排名数据为值的字典
  */
case class Respfutures_dce_position_rankResponse(
  `p_longopeninterest`: String,
  `p_longopeninterestchg`: Double,
  `p_longpartyname`: Double,
  `p_rank`: Double,
  `p_shortopeninterest`: String,
  `p_shortopeninterestchg`: String,
  `p_shortpartyname`: String,
  `p_vol`: String,
  `p_volchg`: String,
  `p_volpartyname`: String,
  `p_symbol`: String,
  `p_variety`: String
)

case class futures_dce_position_rankResponse(
  `p_longopeninterest`: String,
  `p_longopeninterestchg`: Double,
  `p_longpartyname`: Double,
  `p_rank`: Double,
  `p_shortopeninterest`: String,
  `p_shortopeninterestchg`: String,
  `p_shortpartyname`: String,
  `p_vol`: String,
  `p_volchg`: String,
  `p_volpartyname`: String,
  `p_symbol`: String,
  `p_variety`: String
)

trait Json_futures_dce_position_rankResponse {

  implicit val a_futures_dce_position_rankResponse =
    new Decoder[futures_dce_position_rankResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_dce_position_rankResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_longopeninterest <- c.downField("long_open_interest").as[String]

          p_longopeninterestchg <- c.downField("long_open_interest_chg").as[Double]

          p_longpartyname <- c.downField("long_party_name").as[Double]

          p_rank <- c.downField("rank").as[Double]

          p_shortopeninterest <- c.downField("short_open_interest").as[String]

          p_shortopeninterestchg <- c.downField("short_open_interest_chg").as[String]

          p_shortpartyname <- c.downField("short_party_name").as[String]

          p_vol <- c.downField("vol").as[String]

          p_volchg <- c.downField("vol_chg").as[String]

          p_volpartyname <- c.downField("vol_party_name").as[String]

          p_symbol <- c.downField("symbol").as[String]

          p_variety <- c.downField("variety").as[String]

        } yield {
          futures_dce_position_rankResponse(
            p_longopeninterest,
            p_longopeninterestchg,
            p_longpartyname,
            p_rank,
            p_shortopeninterest,
            p_shortopeninterestchg,
            p_shortpartyname,
            p_vol,
            p_volchg,
            p_volpartyname,
            p_symbol,
            p_variety
          )
        }
    }

}

object JsonItem_futures_dce_position_rankResponse extends Json_futures_dce_position_rankResponse
