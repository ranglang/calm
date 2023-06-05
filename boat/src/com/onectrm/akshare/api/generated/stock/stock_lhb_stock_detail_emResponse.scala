package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lhb_stock_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lhb_stock_detail_em 目标地址: https://data.eastmoney.com/stock/lhb/600077.html
  * 描述: 东方财富网-数据中心-龙虎榜单-个股龙虎榜详情 限量: 单次返回所有历史数据
  */
case class Respstock_lhb_stock_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ying2ye4bu4ming2cheng1`: String,
  `p_mai3ru4jin1e2`: Double,
  `p_mai3ru4jin1e2zhan4zong3cheng2jiao1bi3li4`: Double,
  `p_mai4chu1jin1e2zhan4zong3cheng2jiao1bi3li4`: Double,
  `p_jing4e2`: Double,
  `p_lei4xing2`: String
)

case class stock_lhb_stock_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ying2ye4bu4ming2cheng1`: String,
  `p_mai3ru4jin1e2`: Double,
  `p_mai3ru4jin1e2zhan4zong3cheng2jiao1bi3li4`: Double,
  `p_mai4chu1jin1e2zhan4zong3cheng2jiao1bi3li4`: Double,
  `p_jing4e2`: Double,
  `p_lei4xing2`: String
)

trait Json_stock_lhb_stock_detail_emResponse {

  implicit val a_stock_lhb_stock_detail_emResponse =
    new Decoder[stock_lhb_stock_detail_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_lhb_stock_detail_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_jiao1yi4ying2ye4bu4ming2cheng1 <- c.downField("交易营业部名称").as[String]

          p_mai3ru4jin1e2 <- c.downField("买入金额").as[Double]

          p_mai3ru4jin1e2zhan4zong3cheng2jiao1bi3li4 <- c.downField("买入金额-占总成交比例").as[Double]

          p_mai4chu1jin1e2zhan4zong3cheng2jiao1bi3li4 <- c.downField("卖出金额-占总成交比例").as[Double]

          p_jing4e2 <- c.downField("净额").as[Double]

          p_lei4xing2 <- c.downField("类型").as[String]

        } yield {
          stock_lhb_stock_detail_emResponse(
            p_xu4hao4,
            p_jiao1yi4ying2ye4bu4ming2cheng1,
            p_mai3ru4jin1e2,
            p_mai3ru4jin1e2zhan4zong3cheng2jiao1bi3li4,
            p_mai4chu1jin1e2zhan4zong3cheng2jiao1bi3li4,
            p_jing4e2,
            p_lei4xing2
          )
        }
    }

}

object JsonItem_stock_lhb_stock_detail_emResponse extends Json_stock_lhb_stock_detail_emResponse
