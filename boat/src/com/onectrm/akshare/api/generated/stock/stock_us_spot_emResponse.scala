package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_spot_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_spot_em 目标地址: http://quote.eastmoney.com/center/gridlist.html#us_stocks
  * 描述: 美股实时行情数据, 从东方财富获取; 注意数据有 15 分钟延迟 限量: 单次返回美股所有上市公司的实时行情数据
  */
case class Respstock_us_spot_emResponse(
  `p_xu4hao4`: Integer,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_zuo2shou1jia4`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_shi4ying2lu4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_dai4ma3`: String
)

case class stock_us_spot_emResponse(
  `p_xu4hao4`: Integer,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_zuo2shou1jia4`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_shi4ying2lu4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_zhen4fu2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_dai4ma3`: String
)

trait Json_stock_us_spot_emResponse {

  implicit val a_stock_us_spot_emResponse = new Decoder[stock_us_spot_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_spot_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_zuo2shou1jia4 <- c.downField("昨收价").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_shi4ying2lu4 <- c.downField("市盈率").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_zhen4fu2 <- c.downField("振幅").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_dai4ma3 <- c.downField("代码").as[String]

      } yield {
        stock_us_spot_emResponse(
          p_xu4hao4,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_kai1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_zuo2shou1jia4,
          p_zong3shi4zhi2,
          p_shi4ying2lu4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1e2,
          p_zhen4fu2,
          p_huan4shou3lu4,
          p_dai4ma3
        )
      }
  }

}

object JsonItem_stock_us_spot_emResponse extends Json_stock_us_spot_emResponse
