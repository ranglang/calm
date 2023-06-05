package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lh_yyb_capitalResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lh_yyb_capital 目标地址: http://data.10jqka.com.cn/market/longhu/ 描述:
  * 龙虎榜-营业部排行-资金实力最强 限量: 单次返回所有历史数据
  */
case class Respstock_lh_yyb_capitalResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_jin1ri4zui4gao1cao1zuo4`: Integer,
  `p_jin1ri4zui4gao1jin1e2`: String,
  `p_jin1ri4zui4gao1mai3ru4jin1e2`: String,
  `p_lei3ji4can1yu3jin1e2`: String,
  `p_lei3ji4mai3ru4jin1e2`: String
)

case class stock_lh_yyb_capitalResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_jin1ri4zui4gao1cao1zuo4`: Integer,
  `p_jin1ri4zui4gao1jin1e2`: String,
  `p_jin1ri4zui4gao1mai3ru4jin1e2`: String,
  `p_lei3ji4can1yu3jin1e2`: String,
  `p_lei3ji4mai3ru4jin1e2`: String
)

trait Json_stock_lh_yyb_capitalResponse {

  implicit val a_stock_lh_yyb_capitalResponse = new Decoder[stock_lh_yyb_capitalResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lh_yyb_capitalResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ying2ye4bu4ming2cheng1 <- c.downField("营业部名称").as[String]

        p_jin1ri4zui4gao1cao1zuo4 <- c.downField("今日最高操作").as[Integer]

        p_jin1ri4zui4gao1jin1e2 <- c.downField("今日最高金额").as[String]

        p_jin1ri4zui4gao1mai3ru4jin1e2 <- c.downField("今日最高买入金额").as[String]

        p_lei3ji4can1yu3jin1e2 <- c.downField("累计参与金额").as[String]

        p_lei3ji4mai3ru4jin1e2 <- c.downField("累计买入金额").as[String]

      } yield {
        stock_lh_yyb_capitalResponse(
          p_xu4hao4,
          p_ying2ye4bu4ming2cheng1,
          p_jin1ri4zui4gao1cao1zuo4,
          p_jin1ri4zui4gao1jin1e2,
          p_jin1ri4zui4gao1mai3ru4jin1e2,
          p_lei3ji4can1yu3jin1e2,
          p_lei3ji4mai3ru4jin1e2
        )
      }
  }

}

object JsonItem_stock_lh_yyb_capitalResponse extends Json_stock_lh_yyb_capitalResponse
