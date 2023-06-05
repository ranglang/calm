package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_hist_fuResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_hist_fu 目标地址: https://www.futunn.com/stock/HON-US 描述: 美股历史行情日频率数据 限量:
  * 单次返回指定上市公司的所有历史行情数据; 该行情数据为表明是否复权，请谨慎使用
  */
case class Respstock_us_hist_fuResponse(
  `p_ri4qi1`: String,
  `p_jin1kai1`: Double,
  `p_jin1shou1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_zuo2shou1`: Double
)

case class stock_us_hist_fuResponse(
  `p_ri4qi1`: String,
  `p_jin1kai1`: Double,
  `p_jin1shou1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_zuo2shou1`: Double
)

trait Json_stock_us_hist_fuResponse {

  implicit val a_stock_us_hist_fuResponse = new Decoder[stock_us_hist_fuResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_hist_fuResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_jin1kai1 <- c.downField("今开").as[Double]

        p_jin1shou1 <- c.downField("今收").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_zuo2shou1 <- c.downField("昨收").as[Double]

      } yield {
        stock_us_hist_fuResponse(
          p_ri4qi1,
          p_jin1kai1,
          p_jin1shou1,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_huan4shou3lu4,
          p_zuo2shou1
        )
      }
  }

}

object JsonItem_stock_us_hist_fuResponse extends Json_stock_us_hist_fuResponse
