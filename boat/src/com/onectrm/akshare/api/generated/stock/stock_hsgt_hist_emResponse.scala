package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hsgt_hist_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hsgt_hist_em 目标地址: http://data.eastmoney.com/hsgt/index.html 描述:
  * 东方财富网-数据中心-资金流向-沪深港通资金流向-沪深港通历史数据 限量: 单次获取指定 symbol 的所有数据
  */
case class Respstock_hsgt_hist_emResponse(
  `p_ri4qi1`: String,
  `p_dang1ri4cheng2jiao1jing4mai3e2`: Integer,
  `p_mai3ru4cheng2jiao1e2`: Integer,
  `p_mai4chu1cheng2jiao1e2`: Integer,
  `p_li4shi3lei3ji4jing4mai3e2`: Double,
  `p_dang1ri4zi1jin1liu2ru4`: Integer,
  `p_dang1ri4yu2e2`: Integer,
  `p_ling3zhang3gu3`: String,
  `p_ling3zhang3gu3zhang3die1fu2`: Double,
  `p_shang4zheng4zhi3shu4`: Double,
  `p_zhang3die1fu2`: Double
)

case class stock_hsgt_hist_emResponse(
  `p_ri4qi1`: String,
  `p_dang1ri4cheng2jiao1jing4mai3e2`: Integer,
  `p_mai3ru4cheng2jiao1e2`: Integer,
  `p_mai4chu1cheng2jiao1e2`: Integer,
  `p_li4shi3lei3ji4jing4mai3e2`: Double,
  `p_dang1ri4zi1jin1liu2ru4`: Integer,
  `p_dang1ri4yu2e2`: Integer,
  `p_ling3zhang3gu3`: String,
  `p_ling3zhang3gu3zhang3die1fu2`: Double,
  `p_shang4zheng4zhi3shu4`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_stock_hsgt_hist_emResponse {

  implicit val a_stock_hsgt_hist_emResponse = new Decoder[stock_hsgt_hist_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hsgt_hist_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_dang1ri4cheng2jiao1jing4mai3e2 <- c.downField("当日成交净买额").as[Integer]

        p_mai3ru4cheng2jiao1e2 <- c.downField("买入成交额").as[Integer]

        p_mai4chu1cheng2jiao1e2 <- c.downField("卖出成交额").as[Integer]

        p_li4shi3lei3ji4jing4mai3e2 <- c.downField("历史累计净买额").as[Double]

        p_dang1ri4zi1jin1liu2ru4 <- c.downField("当日资金流入").as[Integer]

        p_dang1ri4yu2e2 <- c.downField("当日余额").as[Integer]

        p_ling3zhang3gu3 <- c.downField("领涨股").as[String]

        p_ling3zhang3gu3zhang3die1fu2 <- c.downField("领涨股涨跌幅").as[Double]

        p_shang4zheng4zhi3shu4 <- c.downField("上证指数").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        stock_hsgt_hist_emResponse(
          p_ri4qi1,
          p_dang1ri4cheng2jiao1jing4mai3e2,
          p_mai3ru4cheng2jiao1e2,
          p_mai4chu1cheng2jiao1e2,
          p_li4shi3lei3ji4jing4mai3e2,
          p_dang1ri4zi1jin1liu2ru4,
          p_dang1ri4yu2e2,
          p_ling3zhang3gu3,
          p_ling3zhang3gu3zhang3die1fu2,
          p_shang4zheng4zhi3shu4,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_stock_hsgt_hist_emResponse extends Json_stock_hsgt_hist_emResponse
