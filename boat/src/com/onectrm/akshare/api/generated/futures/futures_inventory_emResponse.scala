package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_inventory_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_inventory_em 目标地址: http://data.eastmoney.com/ifdata/kcsj.html 描述:
  * 东方财富网-期货数据-库存数据; 近 20 个交易日的期货库存日频率数据 限量: 返回指定交易所指定品种的期货库存数据, 仓单日报数据
  */
case class Respfutures_inventory_emResponse(
  `p_ri4qi1`: String,
  `p_ku4cun2`: Integer,
  `p_zeng1jian3`: Integer
)

case class futures_inventory_emResponse(
  `p_ri4qi1`: String,
  `p_ku4cun2`: Integer,
  `p_zeng1jian3`: Integer
)

trait Json_futures_inventory_emResponse {

  implicit val a_futures_inventory_emResponse = new Decoder[futures_inventory_emResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_inventory_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ku4cun2 <- c.downField("库存").as[Integer]

        p_zeng1jian3 <- c.downField("增减").as[Integer]

      } yield {
        futures_inventory_emResponse(
          p_ri4qi1,
          p_ku4cun2,
          p_zeng1jian3
        )
      }
  }

}

object JsonItem_futures_inventory_emResponse extends Json_futures_inventory_emResponse
