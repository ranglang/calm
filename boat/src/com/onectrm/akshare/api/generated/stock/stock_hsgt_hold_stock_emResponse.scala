package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hsgt_hold_stock_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hsgt_hold_stock_em 目标地址: http://data.eastmoney.com/hsgtcg/list.html 描述:
  * 东方财富网-数据中心-沪深港通持股-个股排行 限量: 单次获取指定 market 和 indicator 的所有数据
  */
case class Respstock_hsgt_hold_stock_emResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_jin1ri4shou1pan2jia4`: Double,
  `p_jin1ri4zhang3die1fu2`: Double,
  `p_jin1ri4chi2gu3gu3shu4`: Double,
  `p_jin1ri4chi2gu3shi4zhi2`: Double,
  `p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3`: Double,
  `p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3`: Double,
  `p_zeng1chi2gu1ji4gu3shu4`: Double,
  `p_zeng1chi2gu1ji4shi4zhi2`: Double,
  `p_zeng1chi2gu1ji4shi4zhi2zeng1fu2`: String,
  `p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3`: Double,
  `p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3`: Double,
  `p_suo3shu3ban3kuai4`: String,
  `p_ri4qi1`: String
)

case class stock_hsgt_hold_stock_emResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_jin1ri4shou1pan2jia4`: Double,
  `p_jin1ri4zhang3die1fu2`: Double,
  `p_jin1ri4chi2gu3gu3shu4`: Double,
  `p_jin1ri4chi2gu3shi4zhi2`: Double,
  `p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3`: Double,
  `p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3`: Double,
  `p_zeng1chi2gu1ji4gu3shu4`: Double,
  `p_zeng1chi2gu1ji4shi4zhi2`: Double,
  `p_zeng1chi2gu1ji4shi4zhi2zeng1fu2`: String,
  `p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3`: Double,
  `p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3`: Double,
  `p_suo3shu3ban3kuai4`: String,
  `p_ri4qi1`: String
)

trait Json_stock_hsgt_hold_stock_emResponse {

  implicit val a_stock_hsgt_hold_stock_emResponse = new Decoder[stock_hsgt_hold_stock_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hsgt_hold_stock_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_jin1ri4shou1pan2jia4 <- c.downField("今日收盘价").as[Double]

        p_jin1ri4zhang3die1fu2 <- c.downField("今日涨跌幅").as[Double]

        p_jin1ri4chi2gu3gu3shu4 <- c.downField("今日持股-股数").as[Double]

        p_jin1ri4chi2gu3shi4zhi2 <- c.downField("今日持股-市值").as[Double]

        p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3 <- c.downField("今日持股-占流通股比").as[Double]

        p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3 <- c.downField("今日持股-占总股本比").as[Double]

        p_zeng1chi2gu1ji4gu3shu4 <- c.downField("增持估计-股数").as[Double]

        p_zeng1chi2gu1ji4shi4zhi2 <- c.downField("增持估计-市值").as[Double]

        p_zeng1chi2gu1ji4shi4zhi2zeng1fu2 <- c.downField("增持估计-市值增幅").as[String]

        p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3 <- c.downField("增持估计-占流通股比").as[Double]

        p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3 <- c.downField("增持估计-占总股本比").as[Double]

        p_suo3shu3ban3kuai4 <- c.downField("所属板块").as[String]

        p_ri4qi1 <- c.downField("日期").as[String]

      } yield {
        stock_hsgt_hold_stock_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_jin1ri4shou1pan2jia4,
          p_jin1ri4zhang3die1fu2,
          p_jin1ri4chi2gu3gu3shu4,
          p_jin1ri4chi2gu3shi4zhi2,
          p_jin1ri4chi2gu3zhan4liu2tong1gu3bi3,
          p_jin1ri4chi2gu3zhan4zong3gu3ben3bi3,
          p_zeng1chi2gu1ji4gu3shu4,
          p_zeng1chi2gu1ji4shi4zhi2,
          p_zeng1chi2gu1ji4shi4zhi2zeng1fu2,
          p_zeng1chi2gu1ji4zhan4liu2tong1gu3bi3,
          p_zeng1chi2gu1ji4zhan4zong3gu3ben3bi3,
          p_suo3shu3ban3kuai4,
          p_ri4qi1
        )
      }
  }

}

object JsonItem_stock_hsgt_hold_stock_emResponse extends Json_stock_hsgt_hold_stock_emResponse
