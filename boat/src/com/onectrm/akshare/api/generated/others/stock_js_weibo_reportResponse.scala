package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.stock_js_weibo_reportResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: stock_js_weibo_report 目标地址: https://datacenter.jin10.com/market 描述:
  * 微博舆情报告中近期受关注的股票 限量: 单次返回指定时间内微博舆情报告中近期受关注的股票
  */
case class Respstock_js_weibo_reportResponse(
  `p_name`: String,
  `p_rate`: String
)

case class stock_js_weibo_reportResponse(
  `p_name`: String,
  `p_rate`: String
)

trait Json_stock_js_weibo_reportResponse {

  implicit val a_stock_js_weibo_reportResponse = new Decoder[stock_js_weibo_reportResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_js_weibo_reportResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_name <- c.downField("name").as[String]

        p_rate <- c.downField("rate").as[String]

      } yield {
        stock_js_weibo_reportResponse(
          p_name,
          p_rate
        )
      }
  }

}

object JsonItem_stock_js_weibo_reportResponse extends Json_stock_js_weibo_reportResponse
