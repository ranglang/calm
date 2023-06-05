package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_dce_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_dce_daily 目标地址:
  * http://www.dce.com.cn/dalianshangpin/xqsj/tjsj26/rtj/rxq/index.html 描述: 大连商品交易所-商品期权数据 限量:
  * 单次返回指定 symbol 和 trade_date 的期权行情数据
  */
case class Respoption_dce_dailyResponse(
  `p_shang1pin3ming2cheng1`: String,
  `p_he2yue1ming2cheng1`: String,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_qian2jie2suan4jia4`: Double,
  `p_jie2suan4jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die11`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_chi2cang1liang4`: Double,
  `p_chi2cang1liang4bian4hua4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_xing2quan2liang4`: Double
)

case class option_dce_dailyResponse(
  `p_shang1pin3ming2cheng1`: String,
  `p_he2yue1ming2cheng1`: String,
  `p_kai1pan2jia4`: Double,
  `p_zui4gao1jia4`: Double,
  `p_zui4di1jia4`: Double,
  `p_shou1pan2jia4`: Double,
  `p_qian2jie2suan4jia4`: Double,
  `p_jie2suan4jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die11`: Double,
  `p_cheng2jiao1liang4`: Double,
  `p_chi2cang1liang4`: Double,
  `p_chi2cang1liang4bian4hua4`: Double,
  `p_cheng2jiao1e2`: Double,
  `p_xing2quan2liang4`: Double
)

trait Json_option_dce_dailyResponse {

  implicit val a_option_dce_dailyResponse = new Decoder[option_dce_dailyResponse] {
    final def apply(c: HCursor): Decoder.Result[option_dce_dailyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shang1pin3ming2cheng1 <- c.downField("商品名称").as[String]

        p_he2yue1ming2cheng1 <- c.downField("合约名称").as[String]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_zui4gao1jia4 <- c.downField("最高价").as[Double]

        p_zui4di1jia4 <- c.downField("最低价").as[Double]

        p_shou1pan2jia4 <- c.downField("收盘价").as[Double]

        p_qian2jie2suan4jia4 <- c.downField("前结算价").as[Double]

        p_jie2suan4jia4 <- c.downField("结算价").as[Double]

        p_zhang3die1 <- c.downField("涨跌").as[Double]

        p_zhang3die11 <- c.downField("涨跌1").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[Double]

        p_chi2cang1liang4 <- c.downField("持仓量").as[Double]

        p_chi2cang1liang4bian4hua4 <- c.downField("持仓量变化").as[Double]

        p_cheng2jiao1e2 <- c.downField("成交额").as[Double]

        p_xing2quan2liang4 <- c.downField("行权量").as[Double]

      } yield {
        option_dce_dailyResponse(
          p_shang1pin3ming2cheng1,
          p_he2yue1ming2cheng1,
          p_kai1pan2jia4,
          p_zui4gao1jia4,
          p_zui4di1jia4,
          p_shou1pan2jia4,
          p_qian2jie2suan4jia4,
          p_jie2suan4jia4,
          p_zhang3die1,
          p_zhang3die11,
          p_cheng2jiao1liang4,
          p_chi2cang1liang4,
          p_chi2cang1liang4bian4hua4,
          p_cheng2jiao1e2,
          p_xing2quan2liang4
        )
      }
  }

}

object JsonItem_option_dce_dailyResponse extends Json_option_dce_dailyResponse
