package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_foreign_commodity_realtimeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_foreign_commodity_realtime 目标地址:
  * https://finance.sina.com.cn/money/future/hf.html 描述: 新浪财经-外盘商品期货数据 限量: 单次返回当前交易日的订阅的所有期货品种的数据
  */
case class Respfutures_foreign_commodity_realtimeResponse(
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_ren2min2bi4bao4jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_zuo2ri4jie2suan4jia4`: Double,
  `p_chi2cang1liang4`: Double,
  `p_mai3jia4`: Double,
  `p_mai4jia4`: Double,
  `p_xing2qing2shi2jian1`: String,
  `p_ri4qi1`: String
)

case class futures_foreign_commodity_realtimeResponse(
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_ren2min2bi4bao4jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_zuo2ri4jie2suan4jia4`: Double,
  `p_chi2cang1liang4`: Double,
  `p_mai3jia4`: Double,
  `p_mai4jia4`: Double,
  `p_xing2qing2shi2jian1`: String,
  `p_ri4qi1`: String
)

trait Json_futures_foreign_commodity_realtimeResponse {

  implicit val a_futures_foreign_commodity_realtimeResponse =
    new Decoder[futures_foreign_commodity_realtimeResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_foreign_commodity_realtimeResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ming2cheng1 <- c.downField("名称").as[String]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

          p_ren2min2bi4bao4jia4 <- c.downField("人民币报价").as[Double]

          p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

          p_zui4gao1jia4 <- c.downField("最高价").as[Double]

          p_zui4di1jia4 <- c.downField("最低价").as[Double]

          p_zuo2ri4jie2suan4jia4 <- c.downField("昨日结算价").as[Double]

          p_chi2cang1liang4 <- c.downField("持仓量").as[Double]

          p_mai3jia4 <- c.downField("买价").as[Double]

          p_mai4jia4 <- c.downField("卖价").as[Double]

          p_xing2qing2shi2jian1 <- c.downField("行情时间").as[String]

          p_ri4qi1 <- c.downField("日期").as[String]

        } yield {
          futures_foreign_commodity_realtimeResponse(
            p_ming2cheng1,
            p_zui4xin1jia4,
            p_ren2min2bi4bao4jia4,
            p_zhang3die1e2,
            p_zhang3die1fu2,
            p_kai1pan2jia4,
            p_zui4gao1jia4,
            p_zui4di1jia4,
            p_zuo2ri4jie2suan4jia4,
            p_chi2cang1liang4,
            p_mai3jia4,
            p_mai4jia4,
            p_xing2qing2shi2jian1,
            p_ri4qi1
          )
        }
    }

}

object JsonItem_futures_foreign_commodity_realtimeResponse
    extends Json_futures_foreign_commodity_realtimeResponse
