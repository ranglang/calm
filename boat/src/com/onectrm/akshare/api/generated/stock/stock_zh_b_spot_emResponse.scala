package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_b_spot_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_b_spot_em 目标地址:
  * http://quote.eastmoney.com/center/gridlist.html#hs_b_board 描述: 东方财富网-实时行情数据 限量: 单次返回所有 B
  * 股上市公司的实时行情数据
  */
case class Respstock_zh_b_spot_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1e2`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_jin1kai1`: Double,
  `p_zuo2shou1`: Double,
  `p_liang4bi3`: Double,
  `p_huan4shou3lu4`: Double,
  `p_shi4ying2lu4dong4tai4`: Double,
  `p_shi4jing4lu4`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zhang3su4`: Double,
  `p_5fen1zhong1zhang3die1`: Double,
  `p_60ri4zhang3die1fu2`: Double,
  `p_nian2chu1zhi4jin1zhang3die1fu2`: Double
)

case class stock_zh_b_spot_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_zhang3die1e2`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_zui4gao1`: Double,
  `p_zui4di1`: Double,
  `p_jin1kai1`: Double,
  `p_zuo2shou1`: Double,
  `p_liang4bi3`: Double,
  `p_huan4shou3lu4`: Double,
  `p_shi4ying2lu4dong4tai4`: Double,
  `p_shi4jing4lu4`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_liu2tong1shi4zhi2`: Double,
  `p_zhang3su4`: Double,
  `p_5fen1zhong1zhang3die1`: Double,
  `p_60ri4zhang3die1fu2`: Double,
  `p_nian2chu1zhi4jin1zhang3die1fu2`: Double
)

trait Json_stock_zh_b_spot_emResponse {

  implicit val a_stock_zh_b_spot_emResponse = new Decoder[stock_zh_b_spot_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_b_spot_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zhen4fu2 <- c.downField("振幅").as[Double]

        p_zui4gao1 <- c.downField("最高").as[Double]

        p_zui4di1 <- c.downField("最低").as[Double]

        p_jin1kai1 <- c.downField("今开").as[Double]

        p_zuo2shou1 <- c.downField("昨收").as[Double]

        p_liang4bi3 <- c.downField("量比").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_shi4ying2lu4dong4tai4 <- c.downField("市盈率-动态").as[Double]

        p_shi4jing4lu4 <- c.downField("市净率").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

        p_zhang3su4 <- c.downField("涨速").as[Double]

        p_5fen1zhong1zhang3die1 <- c.downField("5分钟涨跌").as[Double]

        p_60ri4zhang3die1fu2 <- c.downField("60日涨跌幅").as[Double]

        p_nian2chu1zhi4jin1zhang3die1fu2 <- c.downField("年初至今涨跌幅").as[Double]

      } yield {
        stock_zh_b_spot_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_zhang3die1e2,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_zhen4fu2,
          p_zui4gao1,
          p_zui4di1,
          p_jin1kai1,
          p_zuo2shou1,
          p_liang4bi3,
          p_huan4shou3lu4,
          p_shi4ying2lu4dong4tai4,
          p_shi4jing4lu4,
          p_zong3shi4zhi2,
          p_liu2tong1shi4zhi2,
          p_zhang3su4,
          p_5fen1zhong1zhang3die1,
          p_60ri4zhang3die1fu2,
          p_nian2chu1zhi4jin1zhang3die1fu2
        )
      }
  }

}

object JsonItem_stock_zh_b_spot_emResponse extends Json_stock_zh_b_spot_emResponse
