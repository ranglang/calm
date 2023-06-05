package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dzjy_mrtjResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dzjy_mrtj 目标地址: http://data.eastmoney.com/dzjy/dzjy_mrtj.aspx 描述:
  * 东方财富网-数据中心-大宗交易-每日统计 限量: 单次返回所有历史数据
  */
case class Respstock_dzjy_mrtjResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_zhe2yi4lu4`: Double,
  `p_cheng2jiao1bi3shu4`: Integer,
  `p_cheng2jiao1zong3liang4`: Double,
  `p_cheng2jiao1zong3e2`: Double,
  `p_cheng2jiao1zong3e2liu2tong1shi4zhi2`: Double
)

case class stock_dzjy_mrtjResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_zhe2yi4lu4`: Double,
  `p_cheng2jiao1bi3shu4`: Integer,
  `p_cheng2jiao1zong3liang4`: Double,
  `p_cheng2jiao1zong3e2`: Double,
  `p_cheng2jiao1zong3e2liu2tong1shi4zhi2`: Double
)

trait Json_stock_dzjy_mrtjResponse {

  implicit val a_stock_dzjy_mrtjResponse = new Decoder[stock_dzjy_mrtjResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dzjy_mrtjResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_cheng2jiao1jun1jia4 <- c.downField("成交均价").as[Double]

        p_zhe2yi4lu4 <- c.downField("折溢率").as[Double]

        p_cheng2jiao1bi3shu4 <- c.downField("成交笔数").as[Integer]

        p_cheng2jiao1zong3liang4 <- c.downField("成交总量").as[Double]

        p_cheng2jiao1zong3e2 <- c.downField("成交总额").as[Double]

        p_cheng2jiao1zong3e2liu2tong1shi4zhi2 <- c.downField("成交总额/流通市值").as[Double]

      } yield {
        stock_dzjy_mrtjResponse(
          p_xu4hao4,
          p_jiao1yi4ri4qi1,
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_zhang3die1fu2,
          p_shou1pan2jia4,
          p_cheng2jiao1jun1jia4,
          p_zhe2yi4lu4,
          p_cheng2jiao1bi3shu4,
          p_cheng2jiao1zong3liang4,
          p_cheng2jiao1zong3e2,
          p_cheng2jiao1zong3e2liu2tong1shi4zhi2
        )
      }
  }

}

object JsonItem_stock_dzjy_mrtjResponse extends Json_stock_dzjy_mrtjResponse
