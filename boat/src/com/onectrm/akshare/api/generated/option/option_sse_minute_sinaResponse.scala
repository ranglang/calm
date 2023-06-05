package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_sse_minute_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_sse_minute_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 期权行情分钟数据, 只能返还当天的分钟数据 限量:
  * 单次返回期权行情分钟数据
  */
case class Respoption_sse_minute_sinaResponse(
  `p_ri4qi1`: String,
  `p_shi2jian1`: String,
  `p_jia4ge2`: Double,
  `p_cheng2jiao1`: Integer,
  `p_chi2cang1`: Integer,
  `p_jun1jia4`: Double
)

case class option_sse_minute_sinaResponse(
  `p_ri4qi1`: String,
  `p_shi2jian1`: String,
  `p_jia4ge2`: Double,
  `p_cheng2jiao1`: Integer,
  `p_chi2cang1`: Integer,
  `p_jun1jia4`: Double
)

trait Json_option_sse_minute_sinaResponse {

  implicit val a_option_sse_minute_sinaResponse = new Decoder[option_sse_minute_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[option_sse_minute_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_jia4ge2 <- c.downField("价格").as[Double]

        p_cheng2jiao1 <- c.downField("成交").as[Integer]

        p_chi2cang1 <- c.downField("持仓").as[Integer]

        p_jun1jia4 <- c.downField("均价").as[Double]

      } yield {
        option_sse_minute_sinaResponse(
          p_ri4qi1,
          p_shi2jian1,
          p_jia4ge2,
          p_cheng2jiao1,
          p_chi2cang1,
          p_jun1jia4
        )
      }
  }

}

object JsonItem_option_sse_minute_sinaResponse extends Json_option_sse_minute_sinaResponse
