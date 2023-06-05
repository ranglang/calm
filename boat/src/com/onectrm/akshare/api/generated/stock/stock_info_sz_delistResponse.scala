package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_sz_delistResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_sz_delist 目标地址: http://www.szse.cn/market/stock/suspend/index.html 描述:
  * 获取深证证券交易所终止(暂停)上市股票 限量: 单次获取深证证券交易所终止(暂停)上市股票
  */
case class Respstock_info_sz_delistResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_zhong1zhi3shang4shi4ri4qi1`: String
)

case class stock_info_sz_delistResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_zhong1zhi3shang4shi4ri4qi1`: String
)

trait Json_stock_info_sz_delistResponse {

  implicit val a_stock_info_sz_delistResponse = new Decoder[stock_info_sz_delistResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_sz_delistResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_zhong1zhi3shang4shi4ri4qi1 <- c.downField("终止上市日期").as[String]

      } yield {
        stock_info_sz_delistResponse(
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_shang4shi4ri4qi1,
          p_zhong1zhi3shang4shi4ri4qi1
        )
      }
  }

}

object JsonItem_stock_info_sz_delistResponse extends Json_stock_info_sz_delistResponse
