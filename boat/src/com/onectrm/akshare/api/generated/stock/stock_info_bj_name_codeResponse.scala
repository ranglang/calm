package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_bj_name_codeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_bj_name_code 目标地址: http://www.bse.cn/nq/listedcompany.html 描述:
  * 北京证券交易所股票代码和简称数据 限量: 单次获取北京证券交易所所有的股票代码和简称数据
  */
case class Respstock_info_bj_name_codeResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zong3gu3ben3`: Integer,
  `p_liu2tong1gu3ben3`: Integer,
  `p_shang4shi4ri4qi1`: String,
  `p_suo3shu3xing2ye4`: String,
  `p_di4qu1`: String,
  `p_bao4gao4ri4qi1`: String
)

case class stock_info_bj_name_codeResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zong3gu3ben3`: Integer,
  `p_liu2tong1gu3ben3`: Integer,
  `p_shang4shi4ri4qi1`: String,
  `p_suo3shu3xing2ye4`: String,
  `p_di4qu1`: String,
  `p_bao4gao4ri4qi1`: String
)

trait Json_stock_info_bj_name_codeResponse {

  implicit val a_stock_info_bj_name_codeResponse = new Decoder[stock_info_bj_name_codeResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_bj_name_codeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_zong3gu3ben3 <- c.downField("总股本").as[Integer]

        p_liu2tong1gu3ben3 <- c.downField("流通股本").as[Integer]

        p_shang4shi4ri4qi1 <- c.downField("上市日期").as[String]

        p_suo3shu3xing2ye4 <- c.downField("所属行业").as[String]

        p_di4qu1 <- c.downField("地区").as[String]

        p_bao4gao4ri4qi1 <- c.downField("报告日期").as[String]

      } yield {
        stock_info_bj_name_codeResponse(
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_zong3gu3ben3,
          p_liu2tong1gu3ben3,
          p_shang4shi4ri4qi1,
          p_suo3shu3xing2ye4,
          p_di4qu1,
          p_bao4gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_info_bj_name_codeResponse extends Json_stock_info_bj_name_codeResponse
