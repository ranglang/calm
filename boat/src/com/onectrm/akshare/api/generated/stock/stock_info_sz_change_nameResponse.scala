package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_sz_change_nameResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_sz_change_name 目标地址:
  * http://www.szse.cn/market/companys/changename/index.html 描述: 获取深证证券交易所-更名公司(暂无上海交易所的数据) 限量:
  * 单次获取深证证券交易所-更名公司所有历史数据
  */
case class Respstock_info_sz_change_nameResponse(
  `p_bian4geng4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_bian4geng4qian2quan2cheng1`: String,
  `p_bian4geng4hou4quan2cheng1`: String
)

case class stock_info_sz_change_nameResponse(
  `p_bian4geng4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_bian4geng4qian2quan2cheng1`: String,
  `p_bian4geng4hou4quan2cheng1`: String
)

trait Json_stock_info_sz_change_nameResponse {

  implicit val a_stock_info_sz_change_nameResponse =
    new Decoder[stock_info_sz_change_nameResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_info_sz_change_nameResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_bian4geng4ri4qi1 <- c.downField("变更日期").as[String]

          p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_bian4geng4qian2quan2cheng1 <- c.downField("变更前全称").as[String]

          p_bian4geng4hou4quan2cheng1 <- c.downField("变更后全称").as[String]

        } yield {
          stock_info_sz_change_nameResponse(
            p_bian4geng4ri4qi1,
            p_zheng4quan4dai4ma3,
            p_zheng4quan4jian3cheng1,
            p_bian4geng4qian2quan2cheng1,
            p_bian4geng4hou4quan2cheng1
          )
        }
    }

}

object JsonItem_stock_info_sz_change_nameResponse extends Json_stock_info_sz_change_nameResponse
