package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_etf_hist_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_etf_hist_sina 目标地址:
  * http://vip.stock.finance.sina.com.cn/fund_center/index.html#jjhqetf 描述: 新浪财经-基金行情的日频率行情数据 限量:
  * 单次返回指定基金的所有数据
  */
case class Respfund_etf_hist_sinaResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

case class fund_etf_hist_sinaResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

trait Json_fund_etf_hist_sinaResponse {

  implicit val a_fund_etf_hist_sinaResponse = new Decoder[fund_etf_hist_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_etf_hist_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_open <- c.downField("open").as[Double]

        p_high <- c.downField("high").as[Double]

        p_low <- c.downField("low").as[Double]

        p_close <- c.downField("close").as[Double]

        p_volume <- c.downField("volume").as[Integer]

      } yield {
        fund_etf_hist_sinaResponse(
          p_date,
          p_open,
          p_high,
          p_low,
          p_close,
          p_volume
        )
      }
  }

}

object JsonItem_fund_etf_hist_sinaResponse extends Json_fund_etf_hist_sinaResponse
