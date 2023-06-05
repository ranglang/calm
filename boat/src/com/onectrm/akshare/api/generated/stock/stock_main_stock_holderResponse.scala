package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_main_stock_holderResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_main_stock_holder 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vCI_StockHolder/stockid/600004.phtml 描述:
  * 获取新浪财经-股本股东-主要股东 限量: 单次获取新浪财经-股本股东-主要股东所有历史数据
  */
case class Respstock_main_stock_holderResponse(
  `p_bian1hao4`: String,
  `p_gu3dong1ming2cheng1`: String,
  `p_chi2gu3shu4liang4gu3`: Double,
  `p_chi2gu3bi3li4`: String,
  `p_gu3ben3xing4zhi4`: String,
  `p_jie2zhi4ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_gu3dong1shuo1ming2`: String,
  `p_gu3dong1zong3shu4`: Double,
  `p_ping2jun1chi2gu3shu4`: Double
)

case class stock_main_stock_holderResponse(
  `p_bian1hao4`: String,
  `p_gu3dong1ming2cheng1`: String,
  `p_chi2gu3shu4liang4gu3`: Double,
  `p_chi2gu3bi3li4`: String,
  `p_gu3ben3xing4zhi4`: String,
  `p_jie2zhi4ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_gu3dong1shuo1ming2`: String,
  `p_gu3dong1zong3shu4`: Double,
  `p_ping2jun1chi2gu3shu4`: Double
)

trait Json_stock_main_stock_holderResponse {

  implicit val a_stock_main_stock_holderResponse = new Decoder[stock_main_stock_holderResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_main_stock_holderResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bian1hao4 <- c.downField("编号").as[String]

        p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

        p_chi2gu3shu4liang4gu3 <- c.downField("持股数量(股)").as[Double]

        p_chi2gu3bi3li4 <- c.downField("持股比例(%)").as[String]

        p_gu3ben3xing4zhi4 <- c.downField("股本性质").as[String]

        p_jie2zhi4ri4qi1 <- c.downField("截至日期").as[String]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

        p_gu3dong1shuo1ming2 <- c.downField("股东说明").as[String]

        p_gu3dong1zong3shu4 <- c.downField("股东总数").as[Double]

        p_ping2jun1chi2gu3shu4 <- c.downField("平均持股数").as[Double]

      } yield {
        stock_main_stock_holderResponse(
          p_bian1hao4,
          p_gu3dong1ming2cheng1,
          p_chi2gu3shu4liang4gu3,
          p_chi2gu3bi3li4,
          p_gu3ben3xing4zhi4,
          p_jie2zhi4ri4qi1,
          p_gong1gao4ri4qi1,
          p_gu3dong1shuo1ming2,
          p_gu3dong1zong3shu4,
          p_ping2jun1chi2gu3shu4
        )
      }
  }

}

object JsonItem_stock_main_stock_holderResponse extends Json_stock_main_stock_holderResponse
