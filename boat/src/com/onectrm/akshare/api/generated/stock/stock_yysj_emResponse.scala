package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_yysj_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_yysj_em 目标地址: http://data.eastmoney.com/bbsj/202003/yysj.html 描述:
  * 东方财富-数据中心-年报季报-预约披露时间 限量: 单次获取指定 symbol 和 date 的预约披露时间数据
  */
case class Respstock_yysj_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shou3ci4yu4yue1shi2jian1`: String,
  `p_yi1ci4bian4geng4ri4qi1`: String,
  `p_er4ci4bian4geng4ri4qi1`: String,
  `p_san1ci4bian4geng4ri4qi1`: String,
  `p_shi2ji4pi1lu4shi2jian1`: String
)

case class stock_yysj_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shou3ci4yu4yue1shi2jian1`: String,
  `p_yi1ci4bian4geng4ri4qi1`: String,
  `p_er4ci4bian4geng4ri4qi1`: String,
  `p_san1ci4bian4geng4ri4qi1`: String,
  `p_shi2ji4pi1lu4shi2jian1`: String
)

trait Json_stock_yysj_emResponse {

  implicit val a_stock_yysj_emResponse = new Decoder[stock_yysj_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_yysj_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_shou3ci4yu4yue1shi2jian1 <- c.downField("首次预约时间").as[String]

        p_yi1ci4bian4geng4ri4qi1 <- c.downField("一次变更日期").as[String]

        p_er4ci4bian4geng4ri4qi1 <- c.downField("二次变更日期").as[String]

        p_san1ci4bian4geng4ri4qi1 <- c.downField("三次变更日期").as[String]

        p_shi2ji4pi1lu4shi2jian1 <- c.downField("实际披露时间").as[String]

      } yield {
        stock_yysj_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_shou3ci4yu4yue1shi2jian1,
          p_yi1ci4bian4geng4ri4qi1,
          p_er4ci4bian4geng4ri4qi1,
          p_san1ci4bian4geng4ri4qi1,
          p_shi2ji4pi1lu4shi2jian1
        )
      }
  }

}

object JsonItem_stock_yysj_emResponse extends Json_stock_yysj_emResponse
