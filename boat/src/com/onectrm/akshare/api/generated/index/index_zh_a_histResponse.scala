package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_zh_a_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_zh_a_hist 目标地址: http://quote.eastmoney.com/center/hszs.html 描述:
  * 东方财富网-中国股票指数-行情数据 限量: 单次返回具体指数指定 period 从 start_date 到 end_date 的之间的近期数据
  */
case class Respindex_zh_a_histResponse(
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

case class index_zh_a_histResponse(
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

trait Json_index_zh_a_histResponse {

  implicit val a_index_zh_a_histResponse = new Decoder[index_zh_a_histResponse] {
    final def apply(c: HCursor): Decoder.Result[index_zh_a_histResponse] =
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
        index_zh_a_histResponse(
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

object JsonItem_index_zh_a_histResponse extends Json_index_zh_a_histResponse
