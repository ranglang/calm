package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_notice_reportResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_notice_report 目标地址: http://data.eastmoney.com/notices/hsa/5.html 描述:
  * 东方财富网-数据中心-公告大全-沪深 A 股公告 限量: 单次获取指定 symbol 和 date 的数据
  */
case class Respstock_notice_reportResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_gong1gao4biao1ti2`: String,
  `p_gong1gao4lei4xing2`: String,
  `p_gong1gao4ri4qi1`: String
)

case class stock_notice_reportResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_gong1gao4biao1ti2`: String,
  `p_gong1gao4lei4xing2`: String,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_notice_reportResponse {

  implicit val a_stock_notice_reportResponse = new Decoder[stock_notice_reportResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_notice_reportResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_gong1gao4biao1ti2 <- c.downField("公告标题").as[String]

        p_gong1gao4lei4xing2 <- c.downField("公告类型").as[String]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_notice_reportResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_gong1gao4biao1ti2,
          p_gong1gao4lei4xing2,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_notice_reportResponse extends Json_stock_notice_reportResponse
