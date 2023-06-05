package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_xjll_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_xjll_em 目标地址: http://data.eastmoney.com/bbsj/202003/xjll.html 描述:
  * 东方财富-数据中心-年报季报-业绩快报-现金流量表 限量: 单次获取指定 date 的现金流量表数据
  */
case class Respstock_xjll_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jing4xian4jin1liu2jing4xian4jin1liu2`: Double,
  `p_jing4xian4jin1liu2tong2bi3zeng1zhang3`: Double,
  `p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2`: Double,
  `p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3`: Double,
  `p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2`: Double,
  `p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3`: Double,
  `p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2`: Double,
  `p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3`: Double,
  `p_gong1gao4ri4qi1`: String
)

case class stock_xjll_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jing4xian4jin1liu2jing4xian4jin1liu2`: Double,
  `p_jing4xian4jin1liu2tong2bi3zeng1zhang3`: Double,
  `p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2`: Double,
  `p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3`: Double,
  `p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2`: Double,
  `p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3`: Double,
  `p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2`: Double,
  `p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3`: Double,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_xjll_emResponse {

  implicit val a_stock_xjll_emResponse = new Decoder[stock_xjll_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_xjll_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_jing4xian4jin1liu2jing4xian4jin1liu2 <- c.downField("净现金流-净现金流").as[Double]

        p_jing4xian4jin1liu2tong2bi3zeng1zhang3 <- c.downField("净现金流-同比增长").as[Double]

        p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 <- c
          .downField("经营性现金流-现金流量净额")
          .as[Double]

        p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 <- c
          .downField("经营性现金流-净现金流占比")
          .as[Double]

        p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 <- c
          .downField("投资性现金流-现金流量净额")
          .as[Double]

        p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 <- c
          .downField("投资性现金流-净现金流占比")
          .as[Double]

        p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2 <- c
          .downField("融资性现金流-现金流量净额")
          .as[Double]

        p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3 <- c
          .downField("融资性现金流-净现金流占比")
          .as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_xjll_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_jing4xian4jin1liu2jing4xian4jin1liu2,
          p_jing4xian4jin1liu2tong2bi3zeng1zhang3,
          p_jing1ying2xing4xian4jin1liu2xian4jin1liu2liang4jing4e2,
          p_jing1ying2xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3,
          p_tou2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2,
          p_tou2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3,
          p_rong2zi1xing4xian4jin1liu2xian4jin1liu2liang4jing4e2,
          p_rong2zi1xing4xian4jin1liu2jing4xian4jin1liu2zhan4bi3,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_xjll_emResponse extends Json_stock_xjll_emResponse
