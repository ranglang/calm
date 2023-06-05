package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_hist 目标地址: http://quote.eastmoney.com/us/ENTX.html#fullScreenChart 描述:
  * 美股历史行情日频率数据 限量: 单次返回指定上市公司的指定 adjust 后的所有历史行情数据, 当日收盘的数据需要交易日晚上 10 点后获取
  */
case class Respstock_us_histResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Long,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1e2`: Double,
  `p_huan4shou3lu4`: Double
)

case class stock_us_histResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Long,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1e2`: Double,
  `p_huan4shou3lu4`: Double
)

trait Json_stock_us_histResponse {

  implicit val a_stock_us_histResponse = new Decoder[stock_us_histResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Long]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zhen4fu2 <- c.downField("振幅").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

      } yield {
        stock_us_histResponse(
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

object JsonItem_stock_us_histResponse extends Json_stock_us_histResponse
