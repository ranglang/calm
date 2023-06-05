package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_sh_delistResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_sh_delist 目标地址: http://www.sse.com.cn/assortment/stock/list/delisting/
  * 描述: 上海证券交易所暂停/终止上市股票 限量: 单次获取上海证券交易所暂停/终止上市股票
  */
case class Respstock_info_sh_delistResponse(
  `p_gong1si1dai4ma3`: String,
  `p_gong1si1jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_zan4ting2shang4shi4ri4qi1`: String
)

case class stock_info_sh_delistResponse(
  `p_gong1si1dai4ma3`: String,
  `p_gong1si1jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String,
  `p_zan4ting2shang4shi4ri4qi1`: String
)

trait Json_stock_info_sh_delistResponse {

  implicit val a_stock_info_sh_delistResponse = new Decoder[stock_info_sh_delistResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_sh_delistResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gong1si1dai4ma3 <- c.downField("公司代码").as[String]

        p_gong1si1jian3cheng1 <- c.downField("公司简称").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_zan4ting2shang4shi4ri4qi1 <- c.downField("暂停上市日期").as[String]

      } yield {
        stock_info_sh_delistResponse(
          p_gong1si1dai4ma3,
          p_gong1si1jian3cheng1,
          p_shang4shi4ri4qi1,
          p_zan4ting2shang4shi4ri4qi1
        )
      }
  }

}

object JsonItem_stock_info_sh_delistResponse extends Json_stock_info_sh_delistResponse
