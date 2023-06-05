package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_cffex_hs300_spot_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_cffex_hs300_spot_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsCffexDP.php 描述: 新浪财经-中金所-沪深300指数-指定合约-实时行情
  * 限量: 单次返回指定合约的实时行情
  */
case class Respoption_cffex_hs300_spot_sinaResponse(
  `p_kan4zhang3he2yue1mai3liang4`: Integer,
  `p_kan4zhang3he2yue1mai3jia4`: Double,
  `p_kan4zhang3he2yue1zui4xin1jia4`: Double,
  `p_kan4zhang3he2yue1mai4jia4`: Double,
  `p_kan4zhang3he2yue1mai4liang4`: Integer,
  `p_kan4zhang3he2yue1chi2cang1liang4`: Integer,
  `p_kan4zhang3he2yue1zhang3die1`: Double,
  `p_xing2quan2jia4`: Integer,
  `p_kan4zhang3he2yue1biao1shi1`: String,
  `p_kan4die1he2yue1mai3liang4`: Integer,
  `p_kan4die1he2yue1mai3jia4`: Double,
  `p_kan4die1he2yue1zui4xin1jia4`: Double,
  `p_kan4die1he2yue1mai4jia4`: Double,
  `p_kan4die1he2yue1mai4liang4`: Integer,
  `p_kan4die1he2yue1chi2cang1liang4`: Integer,
  `p_kan4die1he2yue1zhang3die1`: Double,
  `p_kan4die1he2yue1biao1shi1`: String
)

case class option_cffex_hs300_spot_sinaResponse(
  `p_kan4zhang3he2yue1mai3liang4`: Integer,
  `p_kan4zhang3he2yue1mai3jia4`: Double,
  `p_kan4zhang3he2yue1zui4xin1jia4`: Double,
  `p_kan4zhang3he2yue1mai4jia4`: Double,
  `p_kan4zhang3he2yue1mai4liang4`: Integer,
  `p_kan4zhang3he2yue1chi2cang1liang4`: Integer,
  `p_kan4zhang3he2yue1zhang3die1`: Double,
  `p_xing2quan2jia4`: Integer,
  `p_kan4zhang3he2yue1biao1shi1`: String,
  `p_kan4die1he2yue1mai3liang4`: Integer,
  `p_kan4die1he2yue1mai3jia4`: Double,
  `p_kan4die1he2yue1zui4xin1jia4`: Double,
  `p_kan4die1he2yue1mai4jia4`: Double,
  `p_kan4die1he2yue1mai4liang4`: Integer,
  `p_kan4die1he2yue1chi2cang1liang4`: Integer,
  `p_kan4die1he2yue1zhang3die1`: Double,
  `p_kan4die1he2yue1biao1shi1`: String
)

trait Json_option_cffex_hs300_spot_sinaResponse {

  implicit val a_option_cffex_hs300_spot_sinaResponse =
    new Decoder[option_cffex_hs300_spot_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_cffex_hs300_spot_sinaResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_kan4zhang3he2yue1mai3liang4 <- c.downField("看涨合约-买量").as[Integer]

          p_kan4zhang3he2yue1mai3jia4 <- c.downField("看涨合约-买价").as[Double]

          p_kan4zhang3he2yue1zui4xin1jia4 <- c.downField("看涨合约-最新价").as[Double]

          p_kan4zhang3he2yue1mai4jia4 <- c.downField("看涨合约-卖价").as[Double]

          p_kan4zhang3he2yue1mai4liang4 <- c.downField("看涨合约-卖量").as[Integer]

          p_kan4zhang3he2yue1chi2cang1liang4 <- c.downField("看涨合约-持仓量").as[Integer]

          p_kan4zhang3he2yue1zhang3die1 <- c.downField("看涨合约-涨跌").as[Double]

          p_xing2quan2jia4 <- c.downField("行权价").as[Integer]

          p_kan4zhang3he2yue1biao1shi1 <- c.downField("看涨合约-标识").as[String]

          p_kan4die1he2yue1mai3liang4 <- c.downField("看跌合约-买量").as[Integer]

          p_kan4die1he2yue1mai3jia4 <- c.downField("看跌合约-买价").as[Double]

          p_kan4die1he2yue1zui4xin1jia4 <- c.downField("看跌合约-最新价").as[Double]

          p_kan4die1he2yue1mai4jia4 <- c.downField("看跌合约-卖价").as[Double]

          p_kan4die1he2yue1mai4liang4 <- c.downField("看跌合约-卖量").as[Integer]

          p_kan4die1he2yue1chi2cang1liang4 <- c.downField("看跌合约-持仓量").as[Integer]

          p_kan4die1he2yue1zhang3die1 <- c.downField("看跌合约-涨跌").as[Double]

          p_kan4die1he2yue1biao1shi1 <- c.downField("看跌合约-标识").as[String]

        } yield {
          option_cffex_hs300_spot_sinaResponse(
            p_kan4zhang3he2yue1mai3liang4,
            p_kan4zhang3he2yue1mai3jia4,
            p_kan4zhang3he2yue1zui4xin1jia4,
            p_kan4zhang3he2yue1mai4jia4,
            p_kan4zhang3he2yue1mai4liang4,
            p_kan4zhang3he2yue1chi2cang1liang4,
            p_kan4zhang3he2yue1zhang3die1,
            p_xing2quan2jia4,
            p_kan4zhang3he2yue1biao1shi1,
            p_kan4die1he2yue1mai3liang4,
            p_kan4die1he2yue1mai3jia4,
            p_kan4die1he2yue1zui4xin1jia4,
            p_kan4die1he2yue1mai4jia4,
            p_kan4die1he2yue1mai4liang4,
            p_kan4die1he2yue1chi2cang1liang4,
            p_kan4die1he2yue1zhang3die1,
            p_kan4die1he2yue1biao1shi1
          )
        }
    }

}

object JsonItem_option_cffex_hs300_spot_sinaResponse
    extends Json_option_cffex_hs300_spot_sinaResponse
