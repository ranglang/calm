package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_sse_daily_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_sse_daily_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 期权行情日数据 限量: 单次返回期权行情日数据
  */
case class Respoption_sse_daily_sinaResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_shou1pan2`: Double,
  `p_cheng2jiao1`: Integer
)

case class option_sse_daily_sinaResponse(
  `p_shi2jian1`: String,
  `p_kai1pan2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_shou1pan2`: Double,
  `p_cheng2jiao1`: Integer
)

trait Json_option_sse_daily_sinaResponse {

  implicit val a_option_sse_daily_sinaResponse = new Decoder[option_sse_daily_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[option_sse_daily_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_kai1pan2 <- c.downField("开盘").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_shou1pan2 <- c.downField("收盘").as[Double]

        p_cheng2jiao1 <- c.downField("成交").as[Integer]

      } yield {
        option_sse_daily_sinaResponse(
          p_shi2jian1,
          p_kai1pan2,
          p_zui4gao1,
          p_zui4di1,
          p_shou1pan2,
          p_cheng2jiao1
        )
      }
  }

}

object JsonItem_option_sse_daily_sinaResponse extends Json_option_sse_daily_sinaResponse
