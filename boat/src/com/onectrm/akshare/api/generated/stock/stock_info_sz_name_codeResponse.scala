package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_info_sz_name_codeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_info_sz_name_code 目标地址:
  * http://www.szse.cn/market/product/stock/list/index.html 描述: 深证证券交易所股票代码和股票简称数据 限量:
  * 单次获取深证证券交易所股票代码和简称数据
  */
case class Respstock_info_sz_name_codeResponse(
  `p_ban3kuai4`: String,
  `p_Agu3dai4ma3`: String,
  `p_Agu3jian3cheng1`: String,
  `p_Agu3shang4shi4ri4qi1`: String,
  `p_Agu3zong3gu3ben3`: String,
  `p_Agu3liu2tong1gu3ben3`: String,
  `p_suo3shu3xing2ye4`: String
)

case class stock_info_sz_name_codeResponse(
  `p_ban3kuai4`: String,
  `p_Agu3dai4ma3`: String,
  `p_Agu3jian3cheng1`: String,
  `p_Agu3shang4shi4ri4qi1`: String,
  `p_Agu3zong3gu3ben3`: String,
  `p_Agu3liu2tong1gu3ben3`: String,
  `p_suo3shu3xing2ye4`: String
)

trait Json_stock_info_sz_name_codeResponse {

  implicit val a_stock_info_sz_name_codeResponse = new Decoder[stock_info_sz_name_codeResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_info_sz_name_codeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ban3kuai4 <- c.downField("板块").as[String]

        p_Agu3dai4ma3 <- c.downField("A股代码").as[String]

        p_Agu3jian3cheng1 <- c.downField("A股简称").as[String]

        p_Agu3shang4shi4ri4qi1 <- c.downField("A股上市日期").as[String]

        p_Agu3zong3gu3ben3 <- c.downField("A股总股本").as[String]

        p_Agu3liu2tong1gu3ben3 <- c.downField("A股流通股本").as[String]

        p_suo3shu3xing2ye4 <- c.downField("所属行业").as[String]

      } yield {
        stock_info_sz_name_codeResponse(
          p_ban3kuai4,
          p_Agu3dai4ma3,
          p_Agu3jian3cheng1,
          p_Agu3shang4shi4ri4qi1,
          p_Agu3zong3gu3ben3,
          p_Agu3liu2tong1gu3ben3,
          p_suo3shu3xing2ye4
        )
      }
  }

}

object JsonItem_stock_info_sz_name_codeResponse extends Json_stock_info_sz_name_codeResponse
