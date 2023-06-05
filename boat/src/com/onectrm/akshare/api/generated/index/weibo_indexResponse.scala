package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.weibo_indexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: weibo_index 目标地址: https://data.weibo.com/index/newindex 描述: 获取指定 **word** 的微博指数
  * 限量: 由于申万源问题该接口暂不能获取数据
  */
case class Respweibo_indexResponse(
  `p_stockcode`: String,
  `p_stockname`: String,
  `p_startdate`: String,
  `p_weight`: Double
)

case class weibo_indexResponse(
  `p_stockcode`: String,
  `p_stockname`: String,
  `p_startdate`: String,
  `p_weight`: Double
)

trait Json_weibo_indexResponse {

  implicit val a_weibo_indexResponse = new Decoder[weibo_indexResponse] {
    final def apply(c: HCursor): Decoder.Result[weibo_indexResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_stockcode <- c.downField("stock_code").as[String]

        p_stockname <- c.downField("stock_name").as[String]

        p_startdate <- c.downField("start_date").as[String]

        p_weight <- c.downField("weight").as[Double]

      } yield {
        weibo_indexResponse(
          p_stockcode,
          p_stockname,
          p_startdate,
          p_weight
        )
      }
  }

}

object JsonItem_weibo_indexResponse extends Json_weibo_indexResponse
