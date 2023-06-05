package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_czce_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_czce_daily 目标地址: http://www.czce.com.cn/cn/jysj/mrhq/H770301index_1.htm
  * 描述: 郑州商品交易所-商品期权数据 限量: 单次返回指定 symbol 和 trade_date 的期权行情数据
  */
case class Respoption_czce_dailyResponse(
  `p_pin3zhong3dai4ma3`: String,
  `p_zuo2jie2suan4`: Double,
  `p_jin1kai1pan2`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_jin1shou1pan2`: Double,
  `p_jin1jie2suan4`: Double,
  `p_zhang3die11`: Double,
  `p_zhang3die12`: Double,
  `p_cheng2jiao1liang4shou3`: Double,
  `p_kong1pan2liang4`: Double,
  `p_zeng1jian3liang4`: Double,
  `p_cheng2jiao1e2wan4yuan2`: Double,
  `p_DELTA`: Double,
  `p_yin3han2bo1dong4lu4`: Double,
  `p_xing2quan2liang4`: Double
)

case class option_czce_dailyResponse(
  `p_pin3zhong3dai4ma3`: String,
  `p_zuo2jie2suan4`: Double,
  `p_jin1kai1pan2`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_jin1shou1pan2`: Double,
  `p_jin1jie2suan4`: Double,
  `p_zhang3die11`: Double,
  `p_zhang3die12`: Double,
  `p_cheng2jiao1liang4shou3`: Double,
  `p_kong1pan2liang4`: Double,
  `p_zeng1jian3liang4`: Double,
  `p_cheng2jiao1e2wan4yuan2`: Double,
  `p_DELTA`: Double,
  `p_yin3han2bo1dong4lu4`: Double,
  `p_xing2quan2liang4`: Double
)

trait Json_option_czce_dailyResponse {

  implicit val a_option_czce_dailyResponse = new Decoder[option_czce_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[option_czce_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pin3zhong3dai4ma3 <- c.downField("品种代码").as[String]

        p_zuo2jie2suan4 <- c.downField("昨结算").as[Double]

        p_jin1kai1pan2 <- c.downField("今开盘").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_jin1shou1pan2 <- c.downField("今收盘").as[Double]

        p_jin1jie2suan4 <- c.downField("今结算").as[Double]

        p_zhang3die11 <- c.downField("涨跌1").as[Double]

        p_zhang3die12 <- c.downField("涨跌2").as[Double]

        p_cheng2jiao1liang4shou3 <- c.downField("成交量(手)").as[Double]

        p_kong1pan2liang4 <- c.downField("空盘量").as[Double]

        p_zeng1jian3liang4 <- c.downField("增减量").as[Double]

        p_cheng2jiao1e2wan4yuan2 <- c.downField("成交额(万元)").as[Double]

        p_DELTA <- c.downField("DELTA").as[Double]

        p_yin3han2bo1dong4lu4 <- c.downField("隐含波动率").as[Double]

        p_xing2quan2liang4 <- c.downField("行权量").as[Double]

      } yield {
        option_czce_dailyResponse(
          p_pin3zhong3dai4ma3,
          p_zuo2jie2suan4,
          p_jin1kai1pan2,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_jin1shou1pan2,
          p_jin1jie2suan4,
          p_zhang3die11,
          p_zhang3die12,
          p_cheng2jiao1liang4shou3,
          p_kong1pan2liang4,
          p_zeng1jian3liang4,
          p_cheng2jiao1e2wan4yuan2,
          p_DELTA,
          p_yin3han2bo1dong4lu4,
          p_xing2quan2liang4
        )
      }
  }

}

object JsonItem_option_czce_dailyResponse extends Json_option_czce_dailyResponse
