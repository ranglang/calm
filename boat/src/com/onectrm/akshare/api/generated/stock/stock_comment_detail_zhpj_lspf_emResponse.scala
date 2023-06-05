package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_comment_detail_zhpj_lspf_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_comment_detail_zhpj_lspf_em 目标地址:
  * https://data.eastmoney.com/stockcomment/stock/600000.html 描述: 东方财富网-数据中心-特色数据-千股千评-综合评价-历史评分 限量:
  * 单次获取所有数据
  */
case class Respstock_comment_detail_zhpj_lspf_emResponse(
  `p_ri4qi1`: String,
  `p_ping2fen1`: Double,
  `p_gu3jia4`: Double
)

case class stock_comment_detail_zhpj_lspf_emResponse(
  `p_ri4qi1`: String,
  `p_ping2fen1`: Double,
  `p_gu3jia4`: Double
)

trait Json_stock_comment_detail_zhpj_lspf_emResponse {

  implicit val a_stock_comment_detail_zhpj_lspf_emResponse =
    new Decoder[stock_comment_detail_zhpj_lspf_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_comment_detail_zhpj_lspf_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_ping2fen1 <- c.downField("评分").as[Double]

          p_gu3jia4 <- c.downField("股价").as[Double]

        } yield {
          stock_comment_detail_zhpj_lspf_emResponse(
            p_ri4qi1,
            p_ping2fen1,
            p_gu3jia4
          )
        }
    }

}

object JsonItem_stock_comment_detail_zhpj_lspf_emResponse
    extends Json_stock_comment_detail_zhpj_lspf_emResponse
