package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hsgt_board_rank_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hsgt_board_rank_em 目标地址: http://data.eastmoney.com/hsgtcg/hy.html 描述:
  * 东方财富网-数据中心-沪深港通持股-板块排行 限量: 单次获取指定 symbol 和 indicator 的所有数据
  */
case class Respstock_hsgt_board_rank_emResponse(
  `p_xu4hao4`: Integer,
  `p_ming2cheng1`: String,
  `p_zui4xin1zhang3die1fu2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3`: Double,
  `p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2`: Double,
  `p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3`: Double,
  `p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3`: Double,
  `p_jin1ri4jian3chi2zui4da4gu3shi4zhi2`: Double,
  `p_bao4gao4shi2jian1`: String
)

case class stock_hsgt_board_rank_emResponse(
  `p_xu4hao4`: Integer,
  `p_ming2cheng1`: String,
  `p_zui4xin1zhang3die1fu2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3`: Double,
  `p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3`: Double,
  `p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3`: Double,
  `p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2`: Double,
  `p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3`: Double,
  `p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3`: Double,
  `p_jin1ri4jian3chi2zui4da4gu3shi4zhi2`: Double,
  `p_bao4gao4shi2jian1`: String
)

trait Json_stock_hsgt_board_rank_emResponse {

  implicit val a_stock_hsgt_board_rank_emResponse = new Decoder[stock_hsgt_board_rank_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hsgt_board_rank_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1zhang3die1fu2 <- c.downField("最新涨跌幅").as[Double]

        p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4 <- c.downField("北向资金今日持股-股票只数").as[Double]

        p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2 <- c.downField("北向资金今日持股-市值").as[Double]

        p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3 <- c
          .downField("北向资金今日持股-占板块比")
          .as[Double]

        p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3 <- c
          .downField("北向资金今日持股-占北向资金比")
          .as[Double]

        p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4 <- c
          .downField("北向资金今日增持估计-股票只数")
          .as[Double]

        p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2 <- c.downField("北向资金今日增持估计-市值").as[Double]

        p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2 <- c
          .downField("北向资金今日增持估计-市值增幅")
          .as[Double]

        p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3 <- c
          .downField("北向资金今日增持估计-占板块比")
          .as[Double]

        p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3 <- c
          .downField("北向资金今日增持估计-占北向资金比")
          .as[Double]

        p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2 <- c.downField("今日增持最大股-市值").as[Double]

        p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3 <- c.downField("今日增持最大股-占股本比").as[Double]

        p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3 <- c.downField("今日减持最大股-占股本比").as[Double]

        p_jin1ri4jian3chi2zui4da4gu3shi4zhi2 <- c.downField("今日减持最大股-市值").as[Double]

        p_bao4gao4shi2jian1 <- c.downField("报告时间").as[String]

      } yield {
        stock_hsgt_board_rank_emResponse(
          p_xu4hao4,
          p_ming2cheng1,
          p_zui4xin1zhang3die1fu2,
          p_bei3xiang4zi1jin1jin1ri4chi2gu3gu3piao4zhi3shu4,
          p_bei3xiang4zi1jin1jin1ri4chi2gu3shi4zhi2,
          p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4ban3kuai4bi3,
          p_bei3xiang4zi1jin1jin1ri4chi2gu3zhan4bei3xiang4zi1jin1bi3,
          p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4gu3piao4zhi3shu4,
          p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2,
          p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4shi4zhi2zeng1fu2,
          p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4ban3kuai4bi3,
          p_bei3xiang4zi1jin1jin1ri4zeng1chi2gu1ji4zhan4bei3xiang4zi1jin1bi3,
          p_jin1ri4zeng1chi2zui4da4gu3shi4zhi2,
          p_jin1ri4zeng1chi2zui4da4gu3zhan4gu3ben3bi3,
          p_jin1ri4jian3chi2zui4da4gu3zhan4gu3ben3bi3,
          p_jin1ri4jian3chi2zui4da4gu3shi4zhi2,
          p_bao4gao4shi2jian1
        )
      }
  }

}

object JsonItem_stock_hsgt_board_rank_emResponse extends Json_stock_hsgt_board_rank_emResponse
