package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_comment_detail_scrd_desire_daily_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_comment_detail_scrd_desire_daily_em 目标地址:
  * https://data.eastmoney.com/stockcomment/stock/600000.html 描述: 东方财富网-数据中心-特色数据-千股千评-市场热度-日度市场参与意愿
  * 限量: 单次获取所有数据
  */
case class Respstock_comment_detail_scrd_desire_daily_emResponse(
  `p_ri4qi1`: String,
  `p_dang1ri4yi4yuan4xia4jiang4`: Double,
  `p_wu3ri4lei3ji4yi4yuan4`: Double
)

case class stock_comment_detail_scrd_desire_daily_emResponse(
  `p_ri4qi1`: String,
  `p_dang1ri4yi4yuan4xia4jiang4`: Double,
  `p_wu3ri4lei3ji4yi4yuan4`: Double
)

trait Json_stock_comment_detail_scrd_desire_daily_emResponse {

  implicit val a_stock_comment_detail_scrd_desire_daily_emResponse =
    new Decoder[stock_comment_detail_scrd_desire_daily_emResponse] {
      final def apply(
        c: HCursor
      ): Decoder.Result[stock_comment_detail_scrd_desire_daily_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_dang1ri4yi4yuan4xia4jiang4 <- c.downField("当日意愿下降").as[Double]

          p_wu3ri4lei3ji4yi4yuan4 <- c.downField("五日累计意愿").as[Double]

        } yield {
          stock_comment_detail_scrd_desire_daily_emResponse(
            p_ri4qi1,
            p_dang1ri4yi4yuan4xia4jiang4,
            p_wu3ri4lei3ji4yi4yuan4
          )
        }
    }

}

object JsonItem_stock_comment_detail_scrd_desire_daily_emResponse
    extends Json_stock_comment_detail_scrd_desire_daily_emResponse
