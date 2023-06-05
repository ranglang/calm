package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_main_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_main_sina 目标地址:
  * http://vip.stock.finance.sina.com.cn/quotes_service/view/qihuohangqing.html#titlePos_0 描述:
  * 新浪财经-期货-主力连续合约历史数据 限量: 单次返回单个期货品种的主力连续合约的日频历史数据
  */
case class Respfutures_main_sinaResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2jia4`: Integer,
  `p_zui4gao1jia4`: Integer,
  `p_zui4di1jia4`: Integer,
  `p_shou1pan2jia4`: Integer,
  `p_cheng2jiao1liang4`: Integer,
  `p_chi2cang1liang4`: Integer,
  `p_dong4tai4jie2suan4jia4`: Integer
)

case class futures_main_sinaResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2jia4`: Integer,
  `p_zui4gao1jia4`: Integer,
  `p_zui4di1jia4`: Integer,
  `p_shou1pan2jia4`: Integer,
  `p_cheng2jiao1liang4`: Integer,
  `p_chi2cang1liang4`: Integer,
  `p_dong4tai4jie2suan4jia4`: Integer
)

trait Json_futures_main_sinaResponse {

  implicit val a_futures_main_sinaResponse = new Decoder[futures_main_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_main_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Integer]

        p_zui4gao1jia4 <- c.downField("最高价").as[Integer]

        p_zui4di1jia4 <- c.downField("最低价").as[Integer]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Integer]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

        p_chi2cang1liang4 <- c.downField("持仓量").as[Integer]

        p_dong4tai4jie2suan4jia4 <- c.downField("动态结算价").as[Integer]

      } yield {
        futures_main_sinaResponse(
          p_ri4qi1,
          p_kai1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_shou1pan2jia4,
          p_cheng2jiao1liang4,
          p_chi2cang1liang4,
          p_dong4tai4jie2suan4jia4
        )
      }
  }

}

object JsonItem_futures_main_sinaResponse extends Json_futures_main_sinaResponse
