package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_global_commodity_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_global_commodity_hist 目标地址: https://cn.investing.com/commodities 描述:
  * 主要提供全球能源、农业、金属、商品指数历史数据, 此处请注意调取数据的时间长度; 该接口需要通过代理访问 限量: 单次最大 5000 行, 建议用 for 获取行数据
  */
case class Respfutures_global_commodity_histResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_zhang3die1fu2`: Double
)

case class futures_global_commodity_histResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_futures_global_commodity_histResponse {

  implicit val a_futures_global_commodity_histResponse =
    new Decoder[futures_global_commodity_histResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_global_commodity_histResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_shou1pan2 <- c.downField("收盘").as[Double]

          p_kai1pan2 <- c.downField("开盘").as[Double]

          p_gao1 <- c.downField("高").as[Double]

          p_di1 <- c.downField("低").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        } yield {
          futures_global_commodity_histResponse(
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

object JsonItem_futures_global_commodity_histResponse
    extends Json_futures_global_commodity_histResponse
