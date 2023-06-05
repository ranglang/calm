package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_changes_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_changes_em 目标地址: http://quote.eastmoney.com/changes/ 描述: 东方财富-行情中心-盘口异动数据
  * 限量: 单次指定 symbol 的最近交易日的盘口异动数据
  */
case class Respstock_changes_emResponse(
  `p_shi2jian1`: String,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_ban3kuai4`: String,
  `p_xiang1guan1xin4xi1`: String
)

case class stock_changes_emResponse(
  `p_shi2jian1`: String,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_ban3kuai4`: String,
  `p_xiang1guan1xin4xi1`: String
)

trait Json_stock_changes_emResponse {

  implicit val a_stock_changes_emResponse = new Decoder[stock_changes_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_changes_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_ban3kuai4 <- c.downField("板块").as[String]

        p_xiang1guan1xin4xi1 <- c.downField("相关信息").as[String]

      } yield {
        stock_changes_emResponse(
          p_shi2jian1,
          p_dai4ma3,
          p_ming2cheng1,
          p_ban3kuai4,
          p_xiang1guan1xin4xi1
        )
      }
  }

}

object JsonItem_stock_changes_emResponse extends Json_stock_changes_emResponse
