package com.onectrm.akshare.api.generated.option;

import com.onectrm.akshare.api.generated.option.option_finance_boardResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: option 接口: option_finance_board 目标地址: http://www.sse.com.cn/assortment/options/price/,
  * http://www.szse.cn/market/derivative/derivative_list/index.html,
  * http://www.cffex.com.cn/hs300gzqq/ 描述: 上海证券交易所、深圳证券交易所、中国金融期货交易所的金融期权行情数据 限量:
  * 单次返回当前交易日指定合约期权行情数据
  */
case class Respoption_finance_boardResponse(
  `p_ri4qi1`: String,
  `p_he2yue1jiao1yi4dai4ma3`: String,
  `p_dang1qian2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_qian2jie2jia4`: Double,
  `p_xing2quan2jia4`: Double,
  `p_shu4liang4`: Double
)

case class option_finance_boardResponse(
  `p_ri4qi1`: String,
  `p_he2yue1jiao1yi4dai4ma3`: String,
  `p_dang1qian2jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_qian2jie2jia4`: Double,
  `p_xing2quan2jia4`: Double,
  `p_shu4liang4`: Double
)

trait Json_option_finance_boardResponse {

  implicit val a_option_finance_boardResponse = new Decoder[option_finance_boardResponse] {
    final def apply(c: HCursor): Decoder.Result[option_finance_boardResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_he2yue1jiao1yi4dai4ma3 <- c.downField("合约交易代码").as[String]

        p_dang1qian2jia4 <- c.downField("当前价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_qian2jie2jia4 <- c.downField("前结价").as[Double]

        p_xing2quan2jia4 <- c.downField("行权价").as[Double]

        p_shu4liang4 <- c.downField("数量").as[Double]

      } yield {
        option_finance_boardResponse(
          p_ri4qi1,
          p_he2yue1jiao1yi4dai4ma3,
          p_dang1qian2jia4,
          p_zhang3die1fu2,
          p_qian2jie2jia4,
          p_xing2quan2jia4,
          p_shu4liang4
        )
      }
  }

}

object JsonItem_option_finance_boardResponse extends Json_option_finance_boardResponse
