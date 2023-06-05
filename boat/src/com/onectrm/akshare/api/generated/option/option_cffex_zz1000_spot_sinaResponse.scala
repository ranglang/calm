package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_cffex_zz1000_spot_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_cffex_zz1000_spot_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 中金所-中证1000指数-指定合约-日频行情 限量:
  * 单次返回指定合约的日频行情
  */
case class Respoption_cffex_zz1000_spot_sinaResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

case class option_cffex_zz1000_spot_sinaResponse(
  `p_date`: String,
  `p_open`: Double,
  `p_high`: Double,
  `p_low`: Double,
  `p_close`: Double,
  `p_volume`: Integer
)

trait Json_option_cffex_zz1000_spot_sinaResponse {

  implicit val a_option_cffex_zz1000_spot_sinaResponse =
    new Decoder[option_cffex_zz1000_spot_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_cffex_zz1000_spot_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_date <- c.downField("date").as[String]

          p_open <- c.downField("open").as[Double]

          p_high <- c.downField("high").as[Double]

          p_low <- c.downField("low").as[Double]

          p_close <- c.downField("close").as[Double]

          p_volume <- c.downField("volume").as[Integer]

        } yield {
          option_cffex_zz1000_spot_sinaResponse(
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

object JsonItem_option_cffex_zz1000_spot_sinaResponse
    extends Json_option_cffex_zz1000_spot_sinaResponse
