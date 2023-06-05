package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_board_industry_cons_thsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_board_industry_cons_ths 目标地址: http://q.10jqka.com.cn/thshy/ 描述:
  * 同花顺-板块-行业板块-成份股数据 限量: 单次返回当前时刻所有成份股, 调用 **ak.stock_board_industry_info_ths()** 返回该板块信息
  */
case class Respstock_board_industry_cons_thsResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: Integer,
  `p_ming2cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3su4`: Double,
  `p_huan4shou3`: Double,
  `p_liang4bi3`: Double,
  `p_zhen4fu2`: Double,
  `p_cheng2jiao1e2`: String,
  `p_liu2tong1gu3`: String,
  `p_liu2tong1shi4zhi2`: String,
  `p_shi4ying2lu4`: String
)

case class stock_board_industry_cons_thsResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: Integer,
  `p_ming2cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3su4`: Double,
  `p_huan4shou3`: Double,
  `p_liang4bi3`: Double,
  `p_zhen4fu2`: Double,
  `p_cheng2jiao1e2`: String,
  `p_liu2tong1gu3`: String,
  `p_liu2tong1shi4zhi2`: String,
  `p_shi4ying2lu4`: String
)

trait Json_stock_board_industry_cons_thsResponse {

  implicit val a_stock_board_industry_cons_thsResponse =
    new Decoder[stock_board_industry_cons_thsResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_board_industry_cons_thsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_dai4ma3 <- c.downField("代码").as[Integer]

          p_ming2cheng1 <- c.downField("名称").as[String]

          p_xian4jia4 <- c.downField("现价").as[Double]

          p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

          p_zhang3die1 <- c.downField("涨跌").as[Double]

          p_zhang3su4 <- c.downField("涨速").as[Double]

          p_huan4shou3 <- c.downField("换手").as[Double]

          p_liang4bi3 <- c.downField("量比").as[Double]

          p_zhen4fu2 <- c.downField("振幅").as[Double]

          p_cheng2jiao1e2 <- c.downField("成交额").as[String]

          p_liu2tong1gu3 <- c.downField("流通股").as[String]

          p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[String]

          p_shi4ying2lu4 <- c.downField("市盈率").as[String]

        } yield {
          stock_board_industry_cons_thsResponse(
            p_xu4hao4,
            p_dai4ma3,
            p_ming2cheng1,
            p_xian4jia4,
            p_zhang3die1fu2,
            p_zhang3die1,
            p_zhang3su4,
            p_huan4shou3,
            p_liang4bi3,
            p_zhen4fu2,
            p_cheng2jiao1e2,
            p_liu2tong1gu3,
            p_liu2tong1shi4zhi2,
            p_shi4ying2lu4
          )
        }
    }

}

object JsonItem_stock_board_industry_cons_thsResponse
    extends Json_stock_board_industry_cons_thsResponse
