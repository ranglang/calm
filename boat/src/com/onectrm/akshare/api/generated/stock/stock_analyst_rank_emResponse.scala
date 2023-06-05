package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_analyst_rank_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_analyst_rank_em 目标地址: http://data.eastmoney.com/invest/invest/list.html 描述:
  * 东方财富网-数据中心-研究报告-东方财富分析师指数-东方财富分析师指数最新排行 限量: 单次获取指定年份的所有数据
  */
case class Respstock_analyst_rank_emResponse(
  `p_xu4hao4`: Integer,
  `p_fen1xi1shi1ming2cheng1`: String,
  `p_fen1xi1shi1dan1wei4`: String,
  `p_nian2du4zhi3shu4`: Double,
  `p_xxxxnian2shou1yi4lu4`: Double,
  `p_3ge4yue4shou1yi4lu4`: Double,
  `p_6ge4yue4shou1yi4lu4`: Double,
  `p_12ge4yue4shou1yi4lu4`: Double,
  `p_cheng2fen1gu3ge4shu4`: Integer,
  `p_xxxxzui4xin1ge4gu3ping2ji2`: String,
  `p_fen1xi1shi1ID`: Integer
)

case class stock_analyst_rank_emResponse(
  `p_xu4hao4`: Integer,
  `p_fen1xi1shi1ming2cheng1`: String,
  `p_fen1xi1shi1dan1wei4`: String,
  `p_nian2du4zhi3shu4`: Double,
  `p_xxxxnian2shou1yi4lu4`: Double,
  `p_3ge4yue4shou1yi4lu4`: Double,
  `p_6ge4yue4shou1yi4lu4`: Double,
  `p_12ge4yue4shou1yi4lu4`: Double,
  `p_cheng2fen1gu3ge4shu4`: Integer,
  `p_xxxxzui4xin1ge4gu3ping2ji2`: String,
  `p_fen1xi1shi1ID`: Integer
)

trait Json_stock_analyst_rank_emResponse {

  implicit val a_stock_analyst_rank_emResponse = new Decoder[stock_analyst_rank_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_analyst_rank_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_fen1xi1shi1ming2cheng1 <- c.downField("分析师名称").as[String]

        p_fen1xi1shi1dan1wei4 <- c.downField("分析师单位").as[String]

        p_nian2du4zhi3shu4 <- c.downField("年度指数").as[Double]

        p_xxxxnian2shou1yi4lu4 <- c.downField("xxxx年收益率").as[Double]

        p_3ge4yue4shou1yi4lu4 <- c.downField("3个月收益率").as[Double]

        p_6ge4yue4shou1yi4lu4 <- c.downField("6个月收益率").as[Double]

        p_12ge4yue4shou1yi4lu4 <- c.downField("12个月收益率").as[Double]

        p_cheng2fen1gu3ge4shu4 <- c.downField("成分股个数").as[Integer]

        p_xxxxzui4xin1ge4gu3ping2ji2 <- c.downField("xxxx最新个股评级").as[String]

        p_fen1xi1shi1ID <- c.downField("分析师ID").as[Integer]

      } yield {
        stock_analyst_rank_emResponse(
          p_xu4hao4,
          p_fen1xi1shi1ming2cheng1,
          p_fen1xi1shi1dan1wei4,
          p_nian2du4zhi3shu4,
          p_xxxxnian2shou1yi4lu4,
          p_3ge4yue4shou1yi4lu4,
          p_6ge4yue4shou1yi4lu4,
          p_12ge4yue4shou1yi4lu4,
          p_cheng2fen1gu3ge4shu4,
          p_xxxxzui4xin1ge4gu3ping2ji2,
          p_fen1xi1shi1ID
        )
      }
  }

}

object JsonItem_stock_analyst_rank_emResponse extends Json_stock_analyst_rank_emResponse
