package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_rank_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_rank_em 目标地址: http://guba.eastmoney.com/rank/ 描述: 东方财富网站-股票热度 限量:
  * 单次返回所有股票当前交易日的人气排名数据
  */
case class Respstock_hot_rank_emResponse(
  `p_dang1qian2pai2ming2`: Integer,
  `p_dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double
)

case class stock_hot_rank_emResponse(
  `p_dang1qian2pai2ming2`: Integer,
  `p_dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_stock_hot_rank_emResponse {

  implicit val a_stock_hot_rank_emResponse = new Decoder[stock_hot_rank_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_rank_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dang1qian2pai2ming2 <- c.downField("当前排名").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        stock_hot_rank_emResponse(
          p_dang1qian2pai2ming2,
          p_dai4ma3,
          p_gu3piao4ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_stock_hot_rank_emResponse extends Json_stock_hot_rank_emResponse
