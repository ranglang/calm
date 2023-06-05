package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_board_industry_index_thsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_board_industry_index_ths 目标地址:
  * http://q.10jqka.com.cn/gn/detail/code/301558/ 描述: 同花顺-板块-行业板块-指数日频率数据 限量: 单次返回所有日频指数数据
  */
case class Respstock_board_industry_index_thsResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double
)

case class stock_board_industry_index_thsResponse(
  `p_ri4qi1`: String,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_cheng2jiao1liang4`: Integer,
  `p_cheng2jiao1e2`: Double
)

trait Json_stock_board_industry_index_thsResponse {

  implicit val a_stock_board_industry_index_thsResponse =
    new Decoder[stock_board_industry_index_thsResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_board_industry_index_thsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

          p_zui4gao1jia4 <- c.downField("最高价").as[Double]

          p_zui4di1jia4 <- c.downField("最低价").as[Double]

          p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

          p_cheng2jiao1liang4 <- c.downField("成交量").as[Integer]

          p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        } yield {
          stock_board_industry_index_thsResponse(
            p_ri4qi1,
            p_kai1pan2jia4,
            p_zui4gao1jia4,
            p_zui4di1jia4,
            p_shou1pan2jia4,
            p_cheng2jiao1liang4,
            p_cheng2jiao1e2
          )
        }
    }

}

object JsonItem_stock_board_industry_index_thsResponse
    extends Json_stock_board_industry_index_thsResponse
