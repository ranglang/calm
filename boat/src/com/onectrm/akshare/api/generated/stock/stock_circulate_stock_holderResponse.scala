package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_circulate_stock_holderResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_circulate_stock_holder 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vCI_CirculateStockHolder/stockid/600000.phtml
  * 描述: 新浪财经-股东股本-流通股东 限量: 单次获取流通股东数据
  */
case class Respstock_circulate_stock_holderResponse(
  `p_jie2zhi3ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_bian1hao4`: String,
  `p_gu3dong1ming2cheng1`: String,
  `p_chi2gu3shu4liang4gu3`: Double,
  `p_zhan4liu2tong1gu3bi3li4`: Double,
  `p_gu3ben3xing4zhi4`: String
)

case class stock_circulate_stock_holderResponse(
  `p_jie2zhi3ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_bian1hao4`: String,
  `p_gu3dong1ming2cheng1`: String,
  `p_chi2gu3shu4liang4gu3`: Double,
  `p_zhan4liu2tong1gu3bi3li4`: Double,
  `p_gu3ben3xing4zhi4`: String
)

trait Json_stock_circulate_stock_holderResponse {

  implicit val a_stock_circulate_stock_holderResponse =
    new Decoder[stock_circulate_stock_holderResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_circulate_stock_holderResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

          p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

          p_bian1hao4 <- c.downField("编号").as[String]

          p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

          p_chi2gu3shu4liang4gu3 <- c.downField("持股数量(股)").as[Double]

          p_zhan4liu2tong1gu3bi3li4 <- c.downField("占流通股比例(%)").as[Double]

          p_gu3ben3xing4zhi4 <- c.downField("股本性质").as[String]

        } yield {
          stock_circulate_stock_holderResponse(
            p_jie2zhi3ri4qi1,
            p_gong1gao4ri4qi1,
            p_bian1hao4,
            p_gu3dong1ming2cheng1,
            p_chi2gu3shu4liang4gu3,
            p_zhan4liu2tong1gu3bi3li4,
            p_gu3ben3xing4zhi4
          )
        }
    }

}

object JsonItem_stock_circulate_stock_holderResponse
    extends Json_stock_circulate_stock_holderResponse
