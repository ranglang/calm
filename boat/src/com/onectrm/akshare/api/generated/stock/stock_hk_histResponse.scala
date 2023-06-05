package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hk_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hk_hist 目标地址: http://quote.eastmoney.com/hk/08367.html 描述: 港股-历史行情数据,
  * 可以选择返回复权后数据, 更新频率为日频 限量: 单次返回指定上市公司的历史行情数据
  */
case class Respstock_hk_histResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1e2`: Double,
  `p_huan4shou3lu4`: Double
)

case class stock_hk_histResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1e2`: Double,
  `p_huan4shou3lu4`: Double
)

trait Json_stock_hk_histResponse {

  implicit val a_stock_hk_histResponse = new Decoder[stock_hk_histResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hk_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zhen4fu2 <- c.downField("振幅").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

      } yield {
        stock_hk_histResponse(
          p_ri4qi1,
          p_kai1pan2,
          p_shou1pan2,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_zhen4fu2,
          p_zhang3die1fu2,
          p_zhang3die1e2,
          p_huan4shou3lu4
        )
      }
  }

}

object JsonItem_stock_hk_histResponse extends Json_stock_hk_histResponse
