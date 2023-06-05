package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.currency_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: currency_hist 目标地址: https://cn.investing.com/currencies/ 描述: 获取指定外币对指定时间的历史数据,
  * 此接口需要使用代理访问 限量: 单次返回指定时间的所有历史数据
  */
case class Respcurrency_histResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_zhang3die1fu2`: Double
)

case class currency_histResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_currency_histResponse {

  implicit val a_currency_histResponse = new Decoder[currency_histResponse] {
    final def apply(c: HCursor): Decoder.Result[currency_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_gao1 <- c.downField("高").as[Double]

        p_di1 <- c.downField("低").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        currency_histResponse(
          p_ri4qi1,
          p_shou1pan2,
          p_kai1pan2,
          p_gao1,
          p_di1,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_currency_histResponse extends Json_currency_histResponse
