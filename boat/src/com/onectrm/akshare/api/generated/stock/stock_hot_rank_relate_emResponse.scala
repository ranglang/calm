package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_rank_relate_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_rank_relate_em 目标地址: http://guba.eastmoney.com/rank/stock?code=000665
  * 描述: 东方财富-个股人气榜-相关股票 限量: 单次返回指定 symbol 的股票近期历史数据
  */
case class Respstock_hot_rank_relate_emResponse(
  `p_shi2jian1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_xiang1guan1gu3piao4dai4ma3`: String,
  `p_zhang3die1fu2`: Double
)

case class stock_hot_rank_relate_emResponse(
  `p_shi2jian1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_xiang1guan1gu3piao4dai4ma3`: String,
  `p_zhang3die1fu2`: Double
)

trait Json_stock_hot_rank_relate_emResponse {

  implicit val a_stock_hot_rank_relate_emResponse = new Decoder[stock_hot_rank_relate_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_rank_relate_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_xiang1guan1gu3piao4dai4ma3 <- c.downField("相关股票代码").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        stock_hot_rank_relate_emResponse(
          p_shi2jian1,
          p_gu3piao4dai4ma3,
          p_xiang1guan1gu3piao4dai4ma3,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_stock_hot_rank_relate_emResponse extends Json_stock_hot_rank_relate_emResponse
