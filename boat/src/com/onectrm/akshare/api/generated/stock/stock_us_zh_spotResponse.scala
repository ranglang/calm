package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_zh_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_zh_spot 目标地址: http://quote.hexun.com/default.html#ustock_0 描述:
  * 获取中国概念股实时行情数据 限量: 单次获取所有中概股公司的实时行情数据
  */
case class Respstock_us_zh_spotResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_zuo2shou1`: Double,
  `p_cheng2jiao1liang4`: Double
)

case class stock_us_zh_spotResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_zuo2shou1`: Double,
  `p_cheng2jiao1liang4`: Double
)

trait Json_stock_us_zh_spotResponse {

  implicit val a_stock_us_zh_spotResponse = new Decoder[stock_us_zh_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_zh_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_zuo2shou1 <- c.downField("昨收").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

      } yield {
        stock_us_zh_spotResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_zui4gao1,
          p_zui4di1,
          p_zuo2shou1,
          p_cheng2jiao1liang4
        )
      }
  }

}

object JsonItem_stock_us_zh_spotResponse extends Json_stock_us_zh_spotResponse
