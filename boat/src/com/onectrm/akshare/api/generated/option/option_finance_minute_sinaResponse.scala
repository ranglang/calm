package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_finance_minute_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_finance_minute_sina 目标地址:
  * https://stock.finance.sina.com.cn/option/quotes.html 描述: 新浪财经-股票期权分时行情数据 限量: 单次返回指定期权的分时行情数据
  */
case class Respoption_finance_minute_sinaResponse(
  `p_date`: String,
  `p_time`: String,
  `p_price`: Double,
  `p_averageprice`: Double,
  `p_volume`: Integer
)

case class option_finance_minute_sinaResponse(
  `p_date`: String,
  `p_time`: String,
  `p_price`: Double,
  `p_averageprice`: Double,
  `p_volume`: Integer
)

trait Json_option_finance_minute_sinaResponse {

  implicit val a_option_finance_minute_sinaResponse =
    new Decoder[option_finance_minute_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_finance_minute_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_date <- c.downField("date").as[String]

          p_time <- c.downField("time").as[String]

          p_price <- c.downField("price").as[Double]

          p_averageprice <- c.downField("average_price").as[Double]

          p_volume <- c.downField("volume").as[Integer]

        } yield {
          option_finance_minute_sinaResponse(
            p_date,
            p_time,
            p_price,
            p_averageprice,
            p_volume
          )
        }
    }

}

object JsonItem_option_finance_minute_sinaResponse extends Json_option_finance_minute_sinaResponse
