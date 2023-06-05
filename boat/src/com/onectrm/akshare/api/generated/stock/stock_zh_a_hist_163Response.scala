package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_hist_163Response
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_hist_163 目标地址:
  * http://quotes.money.163.com/trade/lsjysj_601318.html?year=2022&amp;season=2 描述: 网易财经-行情首页-沪深 A
  * 股-每日行情; 该接口主要用户获取流通市值、总市值等指标 限量: 单次返回指定沪深 A 股（不包含北交所）上市公司指定日期间的历史行情日频率数据, 该接口只返回未复权数据
  */
case class Respstock_zh_a_hist_163Response(
  `p_ri4qi1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_kai1pan2jia4`: Double,
  `p_qian2shou1pan2`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1jin1e2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_liu2tong1shi4zhi2`: Double
)

case class stock_zh_a_hist_163Response(
  `p_ri4qi1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_shou1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_kai1pan2jia4`: Double,
  `p_qian2shou1pan2`: Double,
  `p_zhang3die1e2`: Double,
  `p_zhang3die1fu2`: Double,
  `p_huan4shou3lu4`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_cheng2jiao1jin1e2`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_liu2tong1shi4zhi2`: Double
)

trait Json_stock_zh_a_hist_163Response {

  implicit val a_stock_zh_a_hist_163Response = new Decoder[stock_zh_a_hist_163Response] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_hist_163Response] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_qian2shou1pan2 <- c.downField("前收盘").as[Double]

        p_zhang3die1e2 <- c.downField("涨跌额").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_huan4shou3lu4 <- c.downField("换手率").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_cheng2jiao1jin1e2 <- c.downField("成交金额").as[Double]

        p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

        p_liu2tong1shi4zhi2 <- c.downField("流通市值").as[Double]

      } yield {
        stock_zh_a_hist_163Response(
          p_ri4qi1,
          p_gu3piao4dai4ma3,
          p_ming2cheng1,
          p_shou1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_kai1pan2jia4,
          p_qian2shou1pan2,
          p_zhang3die1e2,
          p_zhang3die1fu2,
          p_huan4shou3lu4,
          p_cheng2jiao1liang4,
          p_cheng2jiao1jin1e2,
          p_zong3shi4zhi2,
          p_liu2tong1shi4zhi2
        )
      }
  }

}

object JsonItem_stock_zh_a_hist_163Response extends Json_stock_zh_a_hist_163Response
