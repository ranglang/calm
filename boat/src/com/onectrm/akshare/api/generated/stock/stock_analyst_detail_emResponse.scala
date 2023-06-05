package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_analyst_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_analyst_detail_em 目标地址:
  * https://data.eastmoney.com/invest/invest/11000257131.html 描述: 东方财富网-数据中心-研究报告-东方财富分析师指数-分析师详情
  * 限量: 单次获取指定 indicator 指定的数据
  */
case class Respstock_analyst_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_diao4ru4ri4qi1`: String,
  `p_zui4xin1ping2ji2ri4qi1`: String,
  `p_dang1qian2ping2ji2ming2cheng1`: String,
  `p_cheng2jiao1jia4ge2qian2fu4quan2`: Double,
  `p_zui4xin1jia4ge2`: Double,
  `p_jie1duan4zhang3die1fu2`: Double
)

case class stock_analyst_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_diao4ru4ri4qi1`: String,
  `p_zui4xin1ping2ji2ri4qi1`: String,
  `p_dang1qian2ping2ji2ming2cheng1`: String,
  `p_cheng2jiao1jia4ge2qian2fu4quan2`: Double,
  `p_zui4xin1jia4ge2`: Double,
  `p_jie1duan4zhang3die1fu2`: Double
)

trait Json_stock_analyst_detail_emResponse {

  implicit val a_stock_analyst_detail_emResponse = new Decoder[stock_analyst_detail_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_analyst_detail_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_diao4ru4ri4qi1 <- c.downField("调入日期").as[String]

        p_zui4xin1ping2ji2ri4qi1 <- c.downField("最新评级日期").as[String]

        p_dang1qian2ping2ji2ming2cheng1 <- c.downField("当前评级名称").as[String]

        p_cheng2jiao1jia4ge2qian2fu4quan2 <- c.downField("成交价格(前复权)").as[Double]

        p_zui4xin1jia4ge2 <- c.downField("最新价格").as[Double]

        p_jie1duan4zhang3die1fu2 <- c.downField("阶段涨跌幅").as[Double]

      } yield {
        stock_analyst_detail_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4ming2cheng1,
          p_diao4ru4ri4qi1,
          p_zui4xin1ping2ji2ri4qi1,
          p_dang1qian2ping2ji2ming2cheng1,
          p_cheng2jiao1jia4ge2qian2fu4quan2,
          p_zui4xin1jia4ge2,
          p_jie1duan4zhang3die1fu2
        )
      }
  }

}

object JsonItem_stock_analyst_detail_emResponse extends Json_stock_analyst_detail_emResponse
