package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hk_spot_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hk_spot_em 目标地址: http://quote.eastmoney.com/center/gridlist.html#hk_stocks
  * 描述: 获取所有港股的实时行情数据; 该数据有 15 分钟延时 限量: 单次返回最近交易日的所有港股的数据
  */
case class Respstock_hk_spot_emResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: String,
  `p_zhang3die1e2`: String,
  `p_zhang3die1fu2`: String,
  `p_jin1kai1`: String,
  `p_zui4gao1`: String,
  `p_zui4di1`: String,
  `p_zuo2shou1`: String,
  `p_cheng2jiao1liang4`: String,
  `p_cheng2jiao1e2`: String
)

case class stock_hk_spot_emResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: String,
  `p_zhang3die1e2`: String,
  `p_zhang3die1fu2`: String,
  `p_jin1kai1`: String,
  `p_zui4gao1`: String,
  `p_zui4di1`: String,
  `p_zuo2shou1`: String,
  `p_cheng2jiao1liang4`: String,
  `p_cheng2jiao1e2`: String
)

trait Json_stock_hk_spot_emResponse {

  implicit val a_stock_hk_spot_emResponse = new Decoder[stock_hk_spot_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hk_spot_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[String]

        p_zhang3die1e2 <- c.downField("涨跌额").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[String]

        p_jin1kai1 <- c.downField("今开").as[String]

        p_zui4gao1 <- c.downField("最高").as[String]

        p_zui4di1 <- c.downField("最低").as[String]

        p_zuo2shou1 <- c.downField("昨收").as[String]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[String]

        p_cheng2jiao1e2 <- c.downField("成交额").as[String]

      } yield {
        stock_hk_spot_emResponse(
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

object JsonItem_stock_hk_spot_emResponse extends Json_stock_hk_spot_emResponse
