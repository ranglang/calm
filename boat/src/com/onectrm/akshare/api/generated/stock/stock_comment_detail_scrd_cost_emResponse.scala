package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_cost_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_comment_detail_scrd_cost_em 目标地址:
  * https://data.eastmoney.com/stockcomment/stock/600000.html 描述: 东方财富网-数据中心-特色数据-千股千评-市场热度-市场成本 限量:
  * 单次获取所有数据
  */
case class Respstock_comment_detail_scrd_cost_emResponse(
  `p_ri4qi1`: String,
  `p_shi4chang3cheng2ben3`: Double,
  `p_5ri4shi4chang3cheng2ben3`: Double
)

case class stock_comment_detail_scrd_cost_emResponse(
  `p_ri4qi1`: String,
  `p_shi4chang3cheng2ben3`: Double,
  `p_5ri4shi4chang3cheng2ben3`: Double
)

trait Json_stock_comment_detail_scrd_cost_emResponse {

  implicit val a_stock_comment_detail_scrd_cost_emResponse =
    new Decoder[stock_comment_detail_scrd_cost_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_comment_detail_scrd_cost_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_shi4chang3cheng2ben3 <- c.downField("市场成本").as[Double]

          p_5ri4shi4chang3cheng2ben3 <- c.downField("5日市场成本").as[Double]

        } yield {
          stock_comment_detail_scrd_cost_emResponse(
            p_ri4qi1,
            p_shi4chang3cheng2ben3,
            p_5ri4shi4chang3cheng2ben3
          )
        }
    }

}

object JsonItem_stock_comment_detail_scrd_cost_emResponse
    extends Json_stock_comment_detail_scrd_cost_emResponse
