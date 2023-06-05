package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_fund_stock_holderResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_fund_stock_holder 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vCI_FundStockHolder/stockid/600004.phtml 描述:
  * 获取新浪财经-股本股东-基金持股 限量: 单次获取新浪财经-股本股东-基金持股所有历史数据
  */
case class Respstock_fund_stock_holderResponse(
  `p_ji1jin1ming2cheng1`: String,
  `p_ji1jin1dai4ma3`: String,
  `p_chi2cang1shu4liang4gu3`: String,
  `p_zhan4liu2tong1gu3bi3li4`: String,
  `p_chi2gu3shi4zhi2yuan2`: String,
  `p_jie2zhi3ri4qi1`: String
)

case class stock_fund_stock_holderResponse(
  `p_ji1jin1ming2cheng1`: String,
  `p_ji1jin1dai4ma3`: String,
  `p_chi2cang1shu4liang4gu3`: String,
  `p_zhan4liu2tong1gu3bi3li4`: String,
  `p_chi2gu3shi4zhi2yuan2`: String,
  `p_jie2zhi3ri4qi1`: String
)

trait Json_stock_fund_stock_holderResponse {

  implicit val a_stock_fund_stock_holderResponse = new Decoder[stock_fund_stock_holderResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_fund_stock_holderResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1ming2cheng1 <- c.downField("基金名称").as[String]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_chi2cang1shu4liang4gu3 <- c.downField("持仓数量(股)").as[String]

        p_zhan4liu2tong1gu3bi3li4 <- c.downField("占流通股比例(%)").as[String]

        p_chi2gu3shi4zhi2yuan2 <- c.downField("持股市值（元）").as[String]

        p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

      } yield {
        stock_fund_stock_holderResponse(
          p_ji1jin1ming2cheng1,
          p_ji1jin1dai4ma3,
          p_chi2cang1shu4liang4gu3,
          p_zhan4liu2tong1gu3bi3li4,
          p_chi2gu3shi4zhi2yuan2,
          p_jie2zhi3ri4qi1
        )
      }
  }

}

object JsonItem_stock_fund_stock_holderResponse extends Json_stock_fund_stock_holderResponse
