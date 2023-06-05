package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_zh_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_zh_daily 目标地址: http://stockdata.stock.hexun.com/us/NTES.shtml 描述:
  * 中国概念股日频率的历史数据 限量: 单次获取指定中概股公司的历史日频率数据, 返回最近 1000 个交易日数据, 此处建议使用新浪财经数据接口获取复权后数据使用
  */
case class Respstock_us_zh_dailyResponse(
  `p_shi2jian1`: String,
  `p_qian2shou1pan2jia4`: Double,
  `p_kai1pan2jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_cheng2jiao1liang4`: Double
)

case class stock_us_zh_dailyResponse(
  `p_shi2jian1`: String,
  `p_qian2shou1pan2jia4`: Double,
  `p_kai1pan2jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_cheng2jiao1liang4`: Double
)

trait Json_stock_us_zh_dailyResponse {

  implicit val a_stock_us_zh_dailyResponse = new Decoder[stock_us_zh_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_zh_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_qian2shou1pan2jia4 <- c.downField("前收盘价").as[Double]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

      } yield {
        stock_us_zh_dailyResponse(
          p_shi2jian1,
          p_qian2shou1pan2jia4,
          p_kai1pan2jia4,
          p_shou1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_cheng2jiao1liang4
        )
      }
  }

}

object JsonItem_stock_us_zh_dailyResponse extends Json_stock_us_zh_dailyResponse
