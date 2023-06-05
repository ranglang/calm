package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_kcb_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_kcb_spot 目标地址: http://vip.stock.finance.sina.com.cn/mkt/#kcb 描述:
  * 新浪财经-科创板股票实时行情数据 限量: 单次返回所有科创板上市公司的实时行情数据; 请控制采集的频率, 大量抓取容易封IP
  */
case class Respstock_zh_kcb_spotResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_mai3ru4`: Double,
  `p_mai4chu1`: Double,
  `p_zuo2shou1`: Double,
  `p_jin1kai1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_shi2dian3`: String,
  `p_shi4ying2lu4`: Double,
  `p_shi4jing4lu4`: Double,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_huan4shou3lu4`: Double
)

case class stock_zh_kcb_spotResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_mai3ru4`: Double,
  `p_mai4chu1`: Double,
  `p_zuo2shou1`: Double,
  `p_jin1kai1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_shi2dian3`: String,
  `p_shi4ying2lu4`: Double,
  `p_shi4jing4lu4`: Double,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_huan4shou3lu4`: Double
)

trait Json_stock_zh_kcb_spotResponse {

  implicit val a_stock_zh_kcb_spotResponse = new Decoder[stock_zh_kcb_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_kcb_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_mai3ru4 <- c.downField("买入").as[Double]

        p_mai4chu1 <- c.downField("卖出").as[Double]

        p_zuo2shou1 <- c.downField("昨收").as[Double]

        p_jin1kai1 <- c.downField("今开").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_shi2dian3 <- c.downField("时点").as[String]

        p_shi4ying2lu4 <- c.downField("市盈率").as[Double]

        p_shi4jing4lu4 <- c.downField("市净率").as[Double]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

      } yield {
        stock_zh_kcb_spotResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_mai3ru4,
          p_mai4chu1,
          p_zuo2shou1,
          p_jin1kai1,
          p_zui4gao1,
          p_zui4di1,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_shi2dian3,
          p_shi4ying2lu4,
          p_shi4jing4lu4,
          p_liu2tong1shi4zhi2,
          p_zong3shi4zhi2,
          p_huan4shou3lu4
        )
      }
  }

}

object JsonItem_stock_zh_kcb_spotResponse extends Json_stock_zh_kcb_spotResponse
