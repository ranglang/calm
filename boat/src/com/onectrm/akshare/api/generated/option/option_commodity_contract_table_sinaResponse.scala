package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_commodity_contract_table_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_commodity_contract_table_sina 目标地址:
  * https://stock.finance.sina.com.cn/futures/view/optionsDP.php 描述: 新浪财经-商品期权的 T 型报价表 限量: 单次返回指定
  * symbol 和 contract 的所有数据
  */
case class Respoption_commodity_contract_table_sinaResponse(
  `p_kan4zhang3he2yue1mai3liang4`: Integer,
  `p_kan4zhang3he2yue1mai3jia4`: Double,
  `p_kan4zhang3he2yue1zui4xin1jia4`: Double,
  `p_kan4zhang3he2yue1mai4jia4`: Double,
  `p_kan4zhang3he2yue1mai4liang4`: Integer,
  `p_kan4zhang3he2yue1chi2cang1liang4`: Integer,
  `p_kan4zhang3he2yue1zhang3die1`: Double,
  `p_xing2quan2jia4`: Integer,
  `p_kan4zhang3he2yue1kan4zhang3qi1quan2he2yue1`: String,
  `p_kan4die1he2yue1mai3liang4`: Integer,
  `p_kan4die1he2yue1mai3jia4`: Double,
  `p_kan4die1he2yue1zui4xin1jia4`: Double,
  `p_kan4die1he2yue1mai4jia4`: Double,
  `p_kan4die1he2yue1mai4liang4`: Integer,
  `p_kan4die1he2yue1chi2cang1liang4`: Integer,
  `p_kan4die1he2yue1zhang3die1`: Double,
  `p_kan4die1he2yue1kan4die1qi1quan2he2yue1`: String
)

case class option_commodity_contract_table_sinaResponse(
  `p_kan4zhang3he2yue1mai3liang4`: Integer,
  `p_kan4zhang3he2yue1mai3jia4`: Double,
  `p_kan4zhang3he2yue1zui4xin1jia4`: Double,
  `p_kan4zhang3he2yue1mai4jia4`: Double,
  `p_kan4zhang3he2yue1mai4liang4`: Integer,
  `p_kan4zhang3he2yue1chi2cang1liang4`: Integer,
  `p_kan4zhang3he2yue1zhang3die1`: Double,
  `p_xing2quan2jia4`: Integer,
  `p_kan4zhang3he2yue1kan4zhang3qi1quan2he2yue1`: String,
  `p_kan4die1he2yue1mai3liang4`: Integer,
  `p_kan4die1he2yue1mai3jia4`: Double,
  `p_kan4die1he2yue1zui4xin1jia4`: Double,
  `p_kan4die1he2yue1mai4jia4`: Double,
  `p_kan4die1he2yue1mai4liang4`: Integer,
  `p_kan4die1he2yue1chi2cang1liang4`: Integer,
  `p_kan4die1he2yue1zhang3die1`: Double,
  `p_kan4die1he2yue1kan4die1qi1quan2he2yue1`: String
)

trait Json_option_commodity_contract_table_sinaResponse {

  implicit val a_option_commodity_contract_table_sinaResponse =
    new Decoder[option_commodity_contract_table_sinaResponse] {
      final def apply(c: HCursor): Decoder.Result[option_commodity_contract_table_sinaResponse] =
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

          p_kan4zhang3he2yue1kan4zhang3qi1quan2he2yue1 <- c.downField("看涨合约-看涨期权合约").as[String]

          p_kan4die1he2yue1mai3liang4 <- c.downField("看跌合约-买量").as[Integer]

          p_kan4die1he2yue1mai3jia4 <- c.downField("看跌合约-买价").as[Double]

          p_kan4die1he2yue1zui4xin1jia4 <- c.downField("看跌合约-最新价").as[Double]

          p_kan4die1he2yue1mai4jia4 <- c.downField("看跌合约-卖价").as[Double]

          p_kan4die1he2yue1mai4liang4 <- c.downField("看跌合约-卖量").as[Integer]

          p_kan4die1he2yue1chi2cang1liang4 <- c.downField("看跌合约-持仓量").as[Integer]

          p_kan4die1he2yue1zhang3die1 <- c.downField("看跌合约-涨跌").as[Double]

          p_kan4die1he2yue1kan4die1qi1quan2he2yue1 <- c.downField("看跌合约-看跌期权合约").as[String]

        } yield {
          option_commodity_contract_table_sinaResponse(
            p_kan4zhang3he2yue1mai3liang4,
            p_kan4zhang3he2yue1mai3jia4,
            p_kan4zhang3he2yue1zui4xin1jia4,
            p_kan4zhang3he2yue1mai4jia4,
            p_kan4zhang3he2yue1mai4liang4,
            p_kan4zhang3he2yue1chi2cang1liang4,
            p_kan4zhang3he2yue1zhang3die1,
            p_xing2quan2jia4,
            p_kan4zhang3he2yue1kan4zhang3qi1quan2he2yue1,
            p_kan4die1he2yue1mai3liang4,
            p_kan4die1he2yue1mai3jia4,
            p_kan4die1he2yue1zui4xin1jia4,
            p_kan4die1he2yue1mai4jia4,
            p_kan4die1he2yue1mai4liang4,
            p_kan4die1he2yue1chi2cang1liang4,
            p_kan4die1he2yue1zhang3die1,
            p_kan4die1he2yue1kan4die1qi1quan2he2yue1
          )
        }
    }

}

object JsonItem_option_commodity_contract_table_sinaResponse
    extends Json_option_commodity_contract_table_sinaResponse
