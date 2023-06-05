package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lhb_hyyyb_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lhb_hyyyb_em 目标地址: https://data.eastmoney.com/stock/jgmmtj.html 描述:
  * 东方财富网-数据中心-龙虎榜单-每日活跃营业部 限量: 单次返回所有历史数据
  */
case class Respstock_lhb_hyyyb_emResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_shang4bang3ri4`: String,
  `p_mai3ru4ge4gu3shu4`: Double,
  `p_mai4chu1ge4gu3shu4`: Double,
  `p_mai3ru4zong3jin1e2`: Double,
  `p_mai4chu1zong3jin1e2`: Double,
  `p_zong3mai3mai4jing4e2`: Double,
  `p_mai3ru4gu3piao4`: String
)

case class stock_lhb_hyyyb_emResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_shang4bang3ri4`: String,
  `p_mai3ru4ge4gu3shu4`: Double,
  `p_mai4chu1ge4gu3shu4`: Double,
  `p_mai3ru4zong3jin1e2`: Double,
  `p_mai4chu1zong3jin1e2`: Double,
  `p_zong3mai3mai4jing4e2`: Double,
  `p_mai3ru4gu3piao4`: String
)

trait Json_stock_lhb_hyyyb_emResponse {

  implicit val a_stock_lhb_hyyyb_emResponse = new Decoder[stock_lhb_hyyyb_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lhb_hyyyb_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ying2ye4bu4ming2cheng1 <- c.downField("营业部名称").as[String]

        p_shang4bang3ri4 <- c.downField("上榜日").as[String]

        p_mai3ru4ge4gu3shu4 <- c.downField("买入个股数").as[Double]

        p_mai4chu1ge4gu3shu4 <- c.downField("卖出个股数").as[Double]

        p_mai3ru4zong3jin1e2 <- c.downField("买入总金额").as[Double]

        p_mai4chu1zong3jin1e2 <- c.downField("卖出总金额").as[Double]

        p_zong3mai3mai4jing4e2 <- c.downField("总买卖净额").as[Double]

        p_mai3ru4gu3piao4 <- c.downField("买入股票").as[String]

      } yield {
        stock_lhb_hyyyb_emResponse(
          p_xu4hao4,
          p_ying2ye4bu4ming2cheng1,
          p_shang4bang3ri4,
          p_mai3ru4ge4gu3shu4,
          p_mai4chu1ge4gu3shu4,
          p_mai3ru4zong3jin1e2,
          p_mai4chu1zong3jin1e2,
          p_zong3mai3mai4jing4e2,
          p_mai3ru4gu3piao4
        )
      }
  }

}

object JsonItem_stock_lhb_hyyyb_emResponse extends Json_stock_lhb_hyyyb_emResponse
