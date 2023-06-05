package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_sh_name_codeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_sh_name_code 目标地址: 上海证券交易所 描述: 上海证券交易所股票代码和简称数据 限量:
  * 单次获取所有上海证券交易所股票代码和简称数据
  */
case class Respstock_info_sh_name_codeResponse(
  `p_gong1si1dai4ma3`: String,
  `p_gong1si1jian3cheng1`: String,
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String
)

case class stock_info_sh_name_codeResponse(
  `p_gong1si1dai4ma3`: String,
  `p_gong1si1jian3cheng1`: String,
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_shang4shi4ri4qi1`: String
)

trait Json_stock_info_sh_name_codeResponse {

  implicit val a_stock_info_sh_name_codeResponse = new Decoder[stock_info_sh_name_codeResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_sh_name_codeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gong1si1dai4ma3 <- c.downField("公司代码").as[String]

        p_gong1si1jian3cheng1 <- c.downField("公司简称").as[String]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_jian3cheng1 <- c.downField("简称").as[String]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

      } yield {
        stock_info_sh_name_codeResponse(
          p_gong1si1dai4ma3,
          p_gong1si1jian3cheng1,
          p_dai4ma3,
          p_jian3cheng1,
          p_shang4shi4ri4qi1
        )
      }
  }

}

object JsonItem_stock_info_sh_name_codeResponse extends Json_stock_info_sh_name_codeResponse
