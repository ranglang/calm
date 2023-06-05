package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hot_rank_wcResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hot_rank_wc 目标地址: http://www.iwencai.com/unifiedwap/home/index 描述:
  * 问财-热门股票排名数据 限量: 单次返回所有股票的热门排名数据, 当前交易日的数据请在夜间访问; 请注意访问的频率
  */
case class Respstock_hot_rank_wcResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_ge4gu3re4du4`: Double,
  `p_ge4gu3re4du4pai2ming2`: String,
  `p_pai2ming2ri4qi1`: String
)

case class stock_hot_rank_wcResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_ge4gu3re4du4`: Double,
  `p_ge4gu3re4du4pai2ming2`: String,
  `p_pai2ming2ri4qi1`: String
)

trait Json_stock_hot_rank_wcResponse {

  implicit val a_stock_hot_rank_wcResponse = new Decoder[stock_hot_rank_wcResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hot_rank_wcResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_xian4jia4 <- c.downField("现价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_ge4gu3re4du4 <- c.downField("个股热度").as[Double]

        p_ge4gu3re4du4pai2ming2 <- c.downField("个股热度排名").as[String]

        p_pai2ming2ri4qi1 <- c.downField("排名日期").as[String]

      } yield {
        stock_hot_rank_wcResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_xian4jia4,
          p_zhang3die1fu2,
          p_ge4gu3re4du4,
          p_ge4gu3re4du4pai2ming2,
          p_pai2ming2ri4qi1
        )
      }
  }

}

object JsonItem_stock_hot_rank_wcResponse extends Json_stock_hot_rank_wcResponse
