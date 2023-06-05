package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hsgt_individual_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hsgt_individual_detail_em 目标地址:
  * http://data.eastmoney.com/hsgtcg/StockHdStatistics/002008.html(示例) 描述:
  * 东方财富网-数据中心-沪深港通-沪深港通持股-具体股票-个股详情 限量: 单次获取指定 symbol 的在 start_date 和 end_date 之间的所有数据; 注意只能返回 90
  * 个交易日内的数据
  */
case class Respstock_hsgt_individual_detail_emResponse(
  `p_chi2gu3ri4qi1`: String,
  `p_dang1ri4shou1pan2jia4`: Double,
  `p_dang1ri4zhang3die1fu2`: Double,
  `p_ji1gou4ming2cheng1`: String,
  `p_chi2gu3shu4liang4`: Integer,
  `p_chi2gu3shi4zhi2`: Double,
  `p_chi2gu3shu4liang4zhan4Agu3bai3fen1bi3`: Double,
  `p_chi2gu3shi4zhi2bian4hua41ri4`: Double,
  `p_chi2gu3shi4zhi2bian4hua45ri4`: Double,
  `p_chi2gu3shi4zhi2bian4hua410ri4`: Double
)

case class stock_hsgt_individual_detail_emResponse(
  `p_chi2gu3ri4qi1`: String,
  `p_dang1ri4shou1pan2jia4`: Double,
  `p_dang1ri4zhang3die1fu2`: Double,
  `p_ji1gou4ming2cheng1`: String,
  `p_chi2gu3shu4liang4`: Integer,
  `p_chi2gu3shi4zhi2`: Double,
  `p_chi2gu3shu4liang4zhan4Agu3bai3fen1bi3`: Double,
  `p_chi2gu3shi4zhi2bian4hua41ri4`: Double,
  `p_chi2gu3shi4zhi2bian4hua45ri4`: Double,
  `p_chi2gu3shi4zhi2bian4hua410ri4`: Double
)

trait Json_stock_hsgt_individual_detail_emResponse {

  implicit val a_stock_hsgt_individual_detail_emResponse =
    new Decoder[stock_hsgt_individual_detail_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_hsgt_individual_detail_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_chi2gu3ri4qi1 <- c.downField("持股日期").as[String]

          p_dang1ri4shou1pan2jia4 <- c.downField("当日收盘价").as[Double]

          p_dang1ri4zhang3die1fu2 <- c.downField("当日涨跌幅").as[Double]

          p_ji1gou4ming2cheng1 <- c.downField("机构名称").as[String]

          p_chi2gu3shu4liang4 <- c.downField("持股数量").as[Integer]

          p_chi2gu3shi4zhi2 <- c.downField("持股市值").as[Double]

          p_chi2gu3shu4liang4zhan4Agu3bai3fen1bi3 <- c.downField("持股数量占A股百分比").as[Double]

          p_chi2gu3shi4zhi2bian4hua41ri4 <- c.downField("持股市值变化-1日").as[Double]

          p_chi2gu3shi4zhi2bian4hua45ri4 <- c.downField("持股市值变化-5日").as[Double]

          p_chi2gu3shi4zhi2bian4hua410ri4 <- c.downField("持股市值变化-10日").as[Double]

        } yield {
          stock_hsgt_individual_detail_emResponse(
            p_chi2gu3ri4qi1,
            p_dang1ri4shou1pan2jia4,
            p_dang1ri4zhang3die1fu2,
            p_ji1gou4ming2cheng1,
            p_chi2gu3shu4liang4,
            p_chi2gu3shi4zhi2,
            p_chi2gu3shu4liang4zhan4Agu3bai3fen1bi3,
            p_chi2gu3shi4zhi2bian4hua41ri4,
            p_chi2gu3shi4zhi2bian4hua45ri4,
            p_chi2gu3shi4zhi2bian4hua410ri4
          )
        }
    }

}

object JsonItem_stock_hsgt_individual_detail_emResponse
    extends Json_stock_hsgt_individual_detail_emResponse
