package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_individual_fund_flowResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_individual_fund_flow 目标地址: http://data.eastmoney.com/zjlx/detail.html 描述:
  * 东方财富网-数据中心-个股资金流向 限量: 单次获取指定市场和股票的近 100 个交易日的资金流数据
  */
case class Respstock_individual_fund_flowResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhu3li4jing4liu2ru4jing4e2`: Double,
  `p_zhu3li4jing4liu2ru4jing4zhan4bi3`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4e2`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_da4dan1jing4liu2ru4jing4e2`: Double,
  `p_da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_zhong1dan1jing4liu2ru4jing4e2`: Double,
  `p_zhong1dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_xiao3dan1jing4liu2ru4jing4e2`: Double,
  `p_xiao3dan1jing4liu2ru4jing4zhan4bi3`: Double
)

case class stock_individual_fund_flowResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhu3li4jing4liu2ru4jing4e2`: Double,
  `p_zhu3li4jing4liu2ru4jing4zhan4bi3`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4e2`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_da4dan1jing4liu2ru4jing4e2`: Double,
  `p_da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_zhong1dan1jing4liu2ru4jing4e2`: Double,
  `p_zhong1dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_xiao3dan1jing4liu2ru4jing4e2`: Double,
  `p_xiao3dan1jing4liu2ru4jing4zhan4bi3`: Double
)

trait Json_stock_individual_fund_flowResponse {

  implicit val a_stock_individual_fund_flowResponse =
    new Decoder[stock_individual_fund_flowResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_individual_fund_flowResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_zhu3li4jing4liu2ru4jing4e2 <- c.downField("主力净流入-净额").as[Double]

          p_zhu3li4jing4liu2ru4jing4zhan4bi3 <- c.downField("主力净流入-净占比").as[Double]

          p_chao1da4dan1jing4liu2ru4jing4e2 <- c.downField("超大单净流入-净额").as[Double]

          p_chao1da4dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("超大单净流入-净占比").as[Double]

          p_da4dan1jing4liu2ru4jing4e2 <- c.downField("大单净流入-净额").as[Double]

          p_da4dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("大单净流入-净占比").as[Double]

          p_zhong1dan1jing4liu2ru4jing4e2 <- c.downField("中单净流入-净额").as[Double]

          p_zhong1dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("中单净流入-净占比").as[Double]

          p_xiao3dan1jing4liu2ru4jing4e2 <- c.downField("小单净流入-净额").as[Double]

          p_xiao3dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("小单净流入-净占比").as[Double]

        } yield {
          stock_individual_fund_flowResponse(
            p_ri4qi1,
            p_shou1pan2jia4,
            p_zhang3die1fu2,
            p_zhu3li4jing4liu2ru4jing4e2,
            p_zhu3li4jing4liu2ru4jing4zhan4bi3,
            p_chao1da4dan1jing4liu2ru4jing4e2,
            p_chao1da4dan1jing4liu2ru4jing4zhan4bi3,
            p_da4dan1jing4liu2ru4jing4e2,
            p_da4dan1jing4liu2ru4jing4zhan4bi3,
            p_zhong1dan1jing4liu2ru4jing4e2,
            p_zhong1dan1jing4liu2ru4jing4zhan4bi3,
            p_xiao3dan1jing4liu2ru4jing4e2,
            p_xiao3dan1jing4liu2ru4jing4zhan4bi3
          )
        }
    }

}

object JsonItem_stock_individual_fund_flowResponse extends Json_stock_individual_fund_flowResponse
