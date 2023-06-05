package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_fund_flow_big_dealResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_fund_flow_big_deal 目标地址: http://data.10jqka.com.cn/funds/ddzz/### 描述:
  * 同花顺-数据中心-资金流向-大单追踪 限量: 单次获取当前时点的所有大单追踪数据
  */
case class Respstock_fund_flow_big_dealResponse(
  `p_cheng2jiao1shi2jian1`: String,
  `p_gu3piao4dai4ma3`: Integer,
  `p_gu3piao4jian3cheng1`: String,
  `p_cheng2jiao1jia4ge2`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_da4dan1xing4zhi4`: String,
  `p_zhang3die1fu2`: String,
  `p_zhang3die1e2`: String
)

case class stock_fund_flow_big_dealResponse(
  `p_cheng2jiao1shi2jian1`: String,
  `p_gu3piao4dai4ma3`: Integer,
  `p_gu3piao4jian3cheng1`: String,
  `p_cheng2jiao1jia4ge2`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double,
  `p_da4dan1xing4zhi4`: String,
  `p_zhang3die1fu2`: String,
  `p_zhang3die1e2`: String
)

trait Json_stock_fund_flow_big_dealResponse {

  implicit val a_stock_fund_flow_big_dealResponse = new Decoder[stock_fund_flow_big_dealResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_fund_flow_big_dealResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_cheng2jiao1shi2jian1 <- c.downField("成交时间").as[String]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[Integer]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_cheng2jiao1jia4ge2 <- c.downField("成交价格").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_da4dan1xing4zhi4 <- c.downField("大单性质").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[String]

        p_zhang3die1e2 <- c.downField("涨跌额").as[String]

      } yield {
        stock_fund_flow_big_dealResponse(
          p_cheng2jiao1shi2jian1,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_cheng2jiao1jia4ge2,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_da4dan1xing4zhi4,
          p_zhang3die1fu2,
          p_zhang3die1e2
        )
      }
  }

}

object JsonItem_stock_fund_flow_big_dealResponse extends Json_stock_fund_flow_big_dealResponse
