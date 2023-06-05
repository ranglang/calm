package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_market_fund_flowResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_market_fund_flow 目标地址: http://data.eastmoney.com/zjlx/dpzjlx.html 描述:
  * 获取东方财富网-数据中心-资金流向-大盘 限量: 单次获取大盘资金流向历史数据
  */
case class Respstock_market_fund_flowResponse(
  `p_ri4qi1`: String,
  `p_shang4zheng4shou1pan2jia4`: Double,
  `p_shang4zheng4zhang3die1fu2`: Double,
  `p_shen1zheng4shou1pan2jia4`: Double,
  `p_shen1zheng4zhang3die1fu2`: Double,
  `p_zhu3li4jing4liu2ru4jing4e2`: String,
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

case class stock_market_fund_flowResponse(
  `p_ri4qi1`: String,
  `p_shang4zheng4shou1pan2jia4`: Double,
  `p_shang4zheng4zhang3die1fu2`: Double,
  `p_shen1zheng4shou1pan2jia4`: Double,
  `p_shen1zheng4zhang3die1fu2`: Double,
  `p_zhu3li4jing4liu2ru4jing4e2`: String,
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

trait Json_stock_market_fund_flowResponse {

  implicit val a_stock_market_fund_flowResponse = new Decoder[stock_market_fund_flowResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_market_fund_flowResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shang4zheng4shou1pan2jia4 <- c.downField("上证-收盘价").as[Double]

        p_shang4zheng4zhang3die1fu2 <- c.downField("上证-涨跌幅").as[Double]

        p_shen1zheng4shou1pan2jia4 <- c.downField("深证-收盘价").as[Double]

        p_shen1zheng4zhang3die1fu2 <- c.downField("深证-涨跌幅").as[Double]

        p_zhu3li4jing4liu2ru4jing4e2 <- c.downField("主力净流入-净额").as[String]

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
        stock_market_fund_flowResponse(
          p_ri4qi1,
          p_shang4zheng4shou1pan2jia4,
          p_shang4zheng4zhang3die1fu2,
          p_shen1zheng4shou1pan2jia4,
          p_shen1zheng4zhang3die1fu2,
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

object JsonItem_stock_market_fund_flowResponse extends Json_stock_market_fund_flowResponse
