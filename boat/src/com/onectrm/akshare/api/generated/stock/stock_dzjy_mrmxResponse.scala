package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dzjy_mrmxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dzjy_mrmx 目标地址: http://data.eastmoney.com/dzjy/dzjy_mrmxa.aspx 描述:
  * 东方财富网-数据中心-大宗交易-每日明细 限量: 单次返回所有历史数据
  */
case class Respstock_dzjy_mrmxResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1jia4`: Double,
  `p_zhe2yi4lu4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_cheng2jiao1e2liu2tong1shi4zhi2`: Double,
  `p_mai3fang1ying2ye4bu4`: String,
  `p_mai4fang1ying2ye4bu4`: String
)

case class stock_dzjy_mrmxResponse(
  `p_xu4hao4`: Integer,
  `p_jiao1yi4ri4qi1`: String,
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1jia4`: Double,
  `p_zhe2yi4lu4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_cheng2jiao1e2liu2tong1shi4zhi2`: Double,
  `p_mai3fang1ying2ye4bu4`: String,
  `p_mai4fang1ying2ye4bu4`: String
)

trait Json_stock_dzjy_mrmxResponse {

  implicit val a_stock_dzjy_mrmxResponse = new Decoder[stock_dzjy_mrmxResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dzjy_mrmxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_cheng2jiao1jia4 <- c.downField("成交价").as[Double]

        p_zhe2yi4lu4 <- c.downField("折溢率").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_cheng2jiao1e2liu2tong1shi4zhi2 <- c.downField("成交额/流通市值").as[Double]

        p_mai3fang1ying2ye4bu4 <- c.downField("买方营业部").as[String]

        p_mai4fang1ying2ye4bu4 <- c.downField("卖方营业部").as[String]

      } yield {
        stock_dzjy_mrmxResponse(
          p_xu4hao4,
          p_jiao1yi4ri4qi1,
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_zhang3die1fu2,
          p_shou1pan2jia4,
          p_cheng2jiao1jia4,
          p_zhe2yi4lu4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_cheng2jiao1e2liu2tong1shi4zhi2,
          p_mai3fang1ying2ye4bu4,
          p_mai4fang1ying2ye4bu4
        )
      }
  }

}

object JsonItem_stock_dzjy_mrmxResponse extends Json_stock_dzjy_mrmxResponse
