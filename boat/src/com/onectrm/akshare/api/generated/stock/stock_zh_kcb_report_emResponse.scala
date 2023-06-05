package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_kcb_report_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_kcb_report_em 目标地址: http://data.eastmoney.com/notices/kcb.html 描述:
  * 东方财富-科创板报告数据 限量: 单次返回所有科创板上市公司的报告数据
  */
case class Respstock_zh_kcb_report_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_gong1gao4biao1ti2`: String,
  `p_gong1gao4lei4xing2`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_gong1gao4dai4ma3`: String
)

case class stock_zh_kcb_report_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_gong1gao4biao1ti2`: String,
  `p_gong1gao4lei4xing2`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_gong1gao4dai4ma3`: String
)

trait Json_stock_zh_kcb_report_emResponse {

  implicit val a_stock_zh_kcb_report_emResponse = new Decoder[stock_zh_kcb_report_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_kcb_report_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_gong1gao4biao1ti2 <- c.downField("公告标题").as[String]

        p_gong1gao4lei4xing2 <- c.downField("公告类型").as[String]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

        p_gong1gao4dai4ma3 <- c.downField("公告代码").as[String]

      } yield {
        stock_zh_kcb_report_emResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_gong1gao4biao1ti2,
          p_gong1gao4lei4xing2,
          p_gong1gao4ri4qi1,
          p_gong1gao4dai4ma3
        )
      }
  }

}

object JsonItem_stock_zh_kcb_report_emResponse extends Json_stock_zh_kcb_report_emResponse
