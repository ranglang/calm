package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_current_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_current_em 目标地址: http://quote.eastmoney.com/center/qqsc.html 描述:
  * 东方财富网-行情中心-期权市场 限量: 单次返回全部合约的实时行情
  */
case class Respoption_current_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_chi2cang1liang4`: Double,
  `p_xing2quan2jia4`: Double,
  `p_sheng4yu2ri4`: Double,
  `p_ri4zeng1`: Double,
  `p_zuo2jie2`: Double,
  `p_jin1kai1`: Double
)

case class option_current_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_chi2cang1liang4`: Double,
  `p_xing2quan2jia4`: Double,
  `p_sheng4yu2ri4`: Double,
  `p_ri4zeng1`: Double,
  `p_zuo2jie2`: Double,
  `p_jin1kai1`: Double
)

trait Json_option_current_emResponse {

  implicit val a_option_current_emResponse = new Decoder[option_current_emResponse] {
    final def apply(c: HCursor): Decoder.Result[option_current_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_chi2cang1liang4 <- c.downField("持仓量").as[Double]

        p_xing2quan2jia4 <- c.downField("行权价").as[Double]

        p_sheng4yu2ri4 <- c.downField("剩余日").as[Double]

        p_ri4zeng1 <- c.downField("日增").as[Double]

        p_zuo2jie2 <- c.downField("昨结").as[Double]

        p_jin1kai1 <- c.downField("今开").as[Double]

      } yield {
        option_current_emResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_chi2cang1liang4,
          p_xing2quan2jia4,
          p_sheng4yu2ri4,
          p_ri4zeng1,
          p_zuo2jie2,
          p_jin1kai1
        )
      }
  }

}

object JsonItem_option_current_emResponse extends Json_option_current_emResponse
