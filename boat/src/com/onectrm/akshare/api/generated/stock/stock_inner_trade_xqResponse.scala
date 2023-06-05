package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_inner_trade_xqResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_inner_trade_xq 目标地址: https://xueqiu.com/hq/insider 描述: 雪球-行情中心-沪深股市-内部交易
  * 限量: 单次返回所有历史数据
  */
case class Respstock_inner_trade_xqResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_bian4dong4ren2`: String,
  `p_bian4dong4gu3shu4`: Integer,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_bian4dong4hou4chi2gu3shu4`: Double,
  `p_yu3dong3jian1gao1guan1xi4`: String,
  `p_dong3jian1gao1zhi2wu4`: String
)

case class stock_inner_trade_xqResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_bian4dong4ren2`: String,
  `p_bian4dong4gu3shu4`: Integer,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_bian4dong4hou4chi2gu3shu4`: Double,
  `p_yu3dong3jian1gao1guan1xi4`: String,
  `p_dong3jian1gao1zhi2wu4`: String
)

trait Json_stock_inner_trade_xqResponse {

  implicit val a_stock_inner_trade_xqResponse = new Decoder[stock_inner_trade_xqResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_inner_trade_xqResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_bian4dong4ri4qi1 <- c.downField("变动日期").as[String]

        p_bian4dong4ren2 <- c.downField("变动人").as[String]

        p_bian4dong4gu3shu4 <- c.downField("变动股数").as[Integer]

        p_cheng2jiao1jun1jia4 <- c.downField("成交均价").as[Double]

        p_bian4dong4hou4chi2gu3shu4 <- c.downField("变动后持股数").as[Double]

        p_yu3dong3jian1gao1guan1xi4 <- c.downField("与董监高关系").as[String]

        p_dong3jian1gao1zhi2wu4 <- c.downField("董监高职务").as[String]

      } yield {
        stock_inner_trade_xqResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4ming2cheng1,
          p_bian4dong4ri4qi1,
          p_bian4dong4ren2,
          p_bian4dong4gu3shu4,
          p_cheng2jiao1jun1jia4,
          p_bian4dong4hou4chi2gu3shu4,
          p_yu3dong3jian1gao1guan1xi4,
          p_dong3jian1gao1zhi2wu4
        )
      }
  }

}

object JsonItem_stock_inner_trade_xqResponse extends Json_stock_inner_trade_xqResponse
