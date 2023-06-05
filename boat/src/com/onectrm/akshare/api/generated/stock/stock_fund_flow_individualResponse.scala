package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_fund_flow_individualResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_fund_flow_individual 目标地址:
  * http://data.10jqka.com.cn/funds/ggzjl/#refCountId=data_55f13c2c_254 描述: 同花顺-数据中心-资金流向-个股资金流 限量:
  * 单次获取指定 symbol 的概念资金流数据
  */
case class Respstock_fund_flow_individualResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: Integer,
  `p_gu3piao4jian3cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: String,
  `p_huan4shou3lu4`: String,
  `p_liu2ru4zi1jin1`: String,
  `p_liu2chu1zi1jin1`: String,
  `p_jing4e2`: String,
  `p_cheng2jiao1e2`: String,
  `p_da4dan1liu2ru4`: String
)

case class stock_fund_flow_individualResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: Integer,
  `p_gu3piao4jian3cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: String,
  `p_huan4shou3lu4`: String,
  `p_liu2ru4zi1jin1`: String,
  `p_liu2chu1zi1jin1`: String,
  `p_jing4e2`: String,
  `p_cheng2jiao1e2`: String,
  `p_da4dan1liu2ru4`: String
)

trait Json_stock_fund_flow_individualResponse {

  implicit val a_stock_fund_flow_individualResponse =
    new Decoder[stock_fund_flow_individualResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_fund_flow_individualResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Long]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[Integer]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[String]

          p_huan4shou3lu4 <- c.downField("换手率").as[String]

          p_liu2ru4zi1jin1 <- c.downField("流入资金").as[String]

          p_liu2chu1zi1jin1 <- c.downField("流出资金").as[String]

          p_jing4e2 <- c.downField("净额").as[String]

          p_cheng2jiao1e2 <- c.downField("成交额").as[String]

          p_da4dan1liu2ru4 <- c.downField("大单流入").as[String]

        } yield {
          stock_fund_flow_individualResponse(
            p_xu4hao4,
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_zui4xin1jia4,
            p_zhang3die1fu2,
            p_huan4shou3lu4,
            p_liu2ru4zi1jin1,
            p_liu2chu1zi1jin1,
            p_jing4e2,
            p_cheng2jiao1e2,
            p_da4dan1liu2ru4
          )
        }
    }

}

object JsonItem_stock_fund_flow_individualResponse extends Json_stock_fund_flow_individualResponse
