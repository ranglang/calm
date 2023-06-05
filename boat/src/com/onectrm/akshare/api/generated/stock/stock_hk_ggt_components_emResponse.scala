package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hk_ggt_components_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hk_ggt_components_em 目标地址:
  * https://quote.eastmoney.com/center/gridlist.html#hk_components 描述: 东方财富网-行情中心-港股市场-港股通成份股 限量:
  * 单次获取所有港股通成份股数据
  */
case class Respstock_hk_ggt_components_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_jin1kai1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_zuo2shou1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double
)

case class stock_hk_ggt_components_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_jin1kai1`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_zuo2shou1`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double
)

trait Json_stock_hk_ggt_components_emResponse {

  implicit val a_stock_hk_ggt_components_emResponse =
    new Decoder[stock_hk_ggt_components_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_hk_ggt_components_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_dai4ma3 <- c.downField("代码").as[String]

          p_ming2cheng1 <- c.downField("名称").as[String]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

          p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_jin1kai1 <- c.downField("今开").as[Double]

          p_zui4gao1 <- c.downField("最高").as[Double]

          p_zui4di1 <- c.downField("最低").as[Double]

          p_zuo2shou1 <- c.downField("昨收").as[Double]

          p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

          p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        } yield {
          stock_hk_ggt_components_emResponse(
            p_xu4hao4,
            p_dai4ma3,
            p_ming2cheng1,
            p_zui4xin1jia4,
            p_zhang3die1e2,
            p_zhang3die1fu2,
            p_jin1kai1,
            p_zui4gao1,
            p_zui4di1,
            p_zuo2shou1,
            p_cheng2jiao1liang4,
            p_cheng2jiao1e2
          )
        }
    }

}

object JsonItem_stock_hk_ggt_components_emResponse extends Json_stock_hk_ggt_components_emResponse
