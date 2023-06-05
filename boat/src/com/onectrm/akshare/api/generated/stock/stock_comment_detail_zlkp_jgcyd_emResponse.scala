package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_comment_detail_zlkp_jgcyd_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_comment_detail_zlkp_jgcyd_em 目标地址:
  * https://data.eastmoney.com/stockcomment/stock/600000.html 描述: 东方财富网-数据中心-特色数据-千股千评-主力控盘-机构参与度
  * 限量: 单次获取所有数据
  */
case class Respstock_comment_detail_zlkp_jgcyd_emResponse(
  `p_date`: String,
  `p_value`: Double
)

case class stock_comment_detail_zlkp_jgcyd_emResponse(
  `p_date`: String,
  `p_value`: Double
)

trait Json_stock_comment_detail_zlkp_jgcyd_emResponse {

  implicit val a_stock_comment_detail_zlkp_jgcyd_emResponse =
    new Decoder[stock_comment_detail_zlkp_jgcyd_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_comment_detail_zlkp_jgcyd_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_date <- c.downField("date").as[String]

          p_value <- c.downField("value").as[Double]

        } yield {
          stock_comment_detail_zlkp_jgcyd_emResponse(
            p_date,
            p_value
          )
        }
    }

}

object JsonItem_stock_comment_detail_zlkp_jgcyd_emResponse
    extends Json_stock_comment_detail_zlkp_jgcyd_emResponse
