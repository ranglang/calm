package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_ah_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_ah_daily 目标地址: http://gu.qq.com/hk02359/gp(示例) 描述: A+H 股数据是从腾讯财经获取的数据,
  * 历史数据按日频率更新 限量: 单次返回所有 A+H 上市公司的历史行情数据
  */
case class Respstock_zh_ah_dailyResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double
)

case class stock_zh_ah_dailyResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double
)

trait Json_stock_zh_ah_dailyResponse {

  implicit val a_stock_zh_ah_dailyResponse = new Decoder[stock_zh_ah_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_ah_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

      } yield {
        stock_zh_ah_dailyResponse(
          p_ri4qi1,
          p_kai1pan2,
          p_shou1pan2,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4
        )
      }
  }

}

object JsonItem_stock_zh_ah_dailyResponse extends Json_stock_zh_ah_dailyResponse
