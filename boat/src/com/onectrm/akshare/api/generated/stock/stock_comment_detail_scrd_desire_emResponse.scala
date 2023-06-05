package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_desire_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_comment_detail_scrd_desire_em 目标地址:
  * https://data.eastmoney.com/stockcomment/stock/600000.html 描述: 东方财富网-数据中心-特色数据-千股千评-市场热度-市场参与意愿
  * 限量: 单次获取所有数据
  */
case class Respstock_comment_detail_scrd_desire_emResponse(
  `p_ri4qi1shi2jian1`: String,
  `p_da4hu4`: Double,
  `p_quan2bu4`: Double,
  `p_san4hu4`: Double
)

case class stock_comment_detail_scrd_desire_emResponse(
  `p_ri4qi1shi2jian1`: String,
  `p_da4hu4`: Double,
  `p_quan2bu4`: Double,
  `p_san4hu4`: Double
)

trait Json_stock_comment_detail_scrd_desire_emResponse {

  implicit val a_stock_comment_detail_scrd_desire_emResponse =
    new Decoder[stock_comment_detail_scrd_desire_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_comment_detail_scrd_desire_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1shi2jian1 <- c.downField("日期时间").as[String]

          p_da4hu4 <- c.downField("大户").as[Double]

          p_quan2bu4 <- c.downField("全部").as[Double]

          p_san4hu4 <- c.downField("散户").as[Double]

        } yield {
          stock_comment_detail_scrd_desire_emResponse(
            p_ri4qi1shi2jian1,
            p_da4hu4,
            p_quan2bu4,
            p_san4hu4
          )
        }
    }

}

object JsonItem_stock_comment_detail_scrd_desire_emResponse
    extends Json_stock_comment_detail_scrd_desire_emResponse
