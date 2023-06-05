package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_ipo_benefit_thsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_ipo_benefit_ths 目标地址: http://data.10jqka.com.cn/ipo/syg/ 描述:
  * 同花顺-数据中心-新股数据-IPO受益股 限量: 单次返回当前交易日的所有数据; 该数据每周更新一次, 返回最近一周的数据
  */
case class Respstock_ipo_benefit_thsResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_shi4zhi2`: String,
  `p_can1gu3jia1shu4`: Integer,
  `p_tou2zi1zong3e2`: String,
  `p_tou2zi1zhan4shi4zhi2bi3`: Double,
  `p_can1gu3dui4xiang4`: String
)

case class stock_ipo_benefit_thsResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_shi4zhi2`: String,
  `p_can1gu3jia1shu4`: Integer,
  `p_tou2zi1zong3e2`: String,
  `p_tou2zi1zhan4shi4zhi2bi3`: Double,
  `p_can1gu3dui4xiang4`: String
)

trait Json_stock_ipo_benefit_thsResponse {

  implicit val a_stock_ipo_benefit_thsResponse = new Decoder[stock_ipo_benefit_thsResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_ipo_benefit_thsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_shi4zhi2 <- c.downField("市值").as[String]

        p_can1gu3jia1shu4 <- c.downField("参股家数").as[Integer]

        p_tou2zi1zong3e2 <- c.downField("投资总额").as[String]

        p_tou2zi1zhan4shi4zhi2bi3 <- c.downField("投资占市值比").as[Double]

        p_can1gu3dui4xiang4 <- c.downField("参股对象").as[String]

      } yield {
        stock_ipo_benefit_thsResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_shou1pan2jia4,
          p_zhang3die1fu2,
          p_shi4zhi2,
          p_can1gu3jia1shu4,
          p_tou2zi1zong3e2,
          p_tou2zi1zhan4shi4zhi2bi3,
          p_can1gu3dui4xiang4
        )
      }
  }

}

object JsonItem_stock_ipo_benefit_thsResponse extends Json_stock_ipo_benefit_thsResponse
