package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_pre_min_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_hist_pre_min_em 目标地址:
  * http://quote.eastmoney.com/concept/sh603777.html?from=classic 描述: 东方财富-股票行情-盘前数据 限量:
  * 单次返回指定当前交易日的股票分钟数据, 包含盘前分钟数据
  */
case class Respstock_zh_a_hist_pre_min_emResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zui4xin1jia4`: Double
)

case class stock_zh_a_hist_pre_min_emResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zui4xin1jia4`: Double
)

trait Json_stock_zh_a_hist_pre_min_emResponse {

  implicit val a_stock_zh_a_hist_pre_min_emResponse =
    new Decoder[stock_zh_a_hist_pre_min_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_zh_a_hist_pre_min_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_shi2jian1 <- c.downField("时间").as[String]

          p_kai1pan2 <- c.downField("开盘").as[Double]

          p_shou1pan2 <- c.downField("收盘").as[Double]

          p_zui4gao1 <- c.downField("最高").as[Double]

          p_zui4di1 <- c.downField("最低").as[Double]

          p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

          p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        } yield {
          stock_zh_a_hist_pre_min_emResponse(
            p_shi2jian1,
            p_kai1pan2,
            p_shou1pan2,
            p_zui4gao1,
            p_zui4di1,
            p_cheng2jiao1liang4,
            p_cheng2jiao1e2,
            p_zui4xin1jia4
          )
        }
    }

}

object JsonItem_stock_zh_a_hist_pre_min_emResponse extends Json_stock_zh_a_hist_pre_min_emResponse
