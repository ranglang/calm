package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_zh_a_hist_min_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_zh_a_hist_min_em 目标地址: http://quote.eastmoney.com/center/hszs.html 描述:
  * 东方财富网-指数数据-分时行情 限量: 单次返回具体指数指定 period 从 start_date 到 end_date 的之间的近期数据，该接口不能返回所有历史数据
  */
case class Respindex_zh_a_hist_min_emResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_zui4xin1jia4`: Double
)

case class index_zh_a_hist_min_emResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_shou1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_zui4xin1jia4`: Double
)

trait Json_index_zh_a_hist_min_emResponse {

  implicit val a_index_zh_a_hist_min_emResponse = new Decoder[index_zh_a_hist_min_emResponse] {
    final def apply(c: HCursor): Decoder.Result[index_zh_a_hist_min_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

      } yield {
        index_zh_a_hist_min_emResponse(
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

object JsonItem_index_zh_a_hist_min_emResponse extends Json_index_zh_a_hist_min_emResponse
