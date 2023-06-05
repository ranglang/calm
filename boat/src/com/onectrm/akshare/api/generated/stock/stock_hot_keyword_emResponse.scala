package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_keyword_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_keyword_em 目标地址: http://guba.eastmoney.com/rank/stock?code=000665 描述:
  * 东方财富-个股人气榜-关键词 限量: 单次返回指定 symbol 的最近交易日时点数据
  */
case class Respstock_hot_keyword_emResponse(
  `p_shi2jian1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_gai4nian4ming2cheng1`: String,
  `p_gai4nian4dai4ma3`: String,
  `p_re4du4`: Integer
)

case class stock_hot_keyword_emResponse(
  `p_shi2jian1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_gai4nian4ming2cheng1`: String,
  `p_gai4nian4dai4ma3`: String,
  `p_re4du4`: Integer
)

trait Json_stock_hot_keyword_emResponse {

  implicit val a_stock_hot_keyword_emResponse = new Decoder[stock_hot_keyword_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_keyword_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gai4nian4ming2cheng1 <- c.downField("概念名称").as[String]

        p_gai4nian4dai4ma3 <- c.downField("概念代码").as[String]

        p_re4du4 <- c.downField("热度").as[Integer]

      } yield {
        stock_hot_keyword_emResponse(
          p_shi2jian1,
          p_gu3piao4dai4ma3,
          p_gai4nian4ming2cheng1,
          p_gai4nian4dai4ma3,
          p_re4du4
        )
      }
  }

}

object JsonItem_stock_hot_keyword_emResponse extends Json_stock_hot_keyword_emResponse
