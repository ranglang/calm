package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_bdti_indexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_bdti_index 目标地址:
  * https://data.eastmoney.com/cjsj/hyzs_list_EMI00107668.html 描述: 原油运输指数数据, 数据区间从 20011227-至今 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_china_bdti_indexResponse(
  `p_ri4qi1`: String,
  `p_zui4xin1zhi2`: Integer,
  `p_zhang3die1fu2`: Double,
  `p_jin43yue4zhang3die1fu2`: Double,
  `p_jin46yue4zhang3die1fu2`: Double,
  `p_jin41nian2zhang3die1fu2`: Double,
  `p_jin42nian2zhang3die1fu2`: Double,
  `p_jin43nian2zhang3die1fu2`: Double
)

case class macro_china_bdti_indexResponse(
  `p_ri4qi1`: String,
  `p_zui4xin1zhi2`: Integer,
  `p_zhang3die1fu2`: Double,
  `p_jin43yue4zhang3die1fu2`: Double,
  `p_jin46yue4zhang3die1fu2`: Double,
  `p_jin41nian2zhang3die1fu2`: Double,
  `p_jin42nian2zhang3die1fu2`: Double,
  `p_jin43nian2zhang3die1fu2`: Double
)

trait Json_macro_china_bdti_indexResponse {

  implicit val a_macro_china_bdti_indexResponse = new Decoder[macro_china_bdti_indexResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_bdti_indexResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zui4xin1zhi2 <- c.downField("最新值").as[Integer]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_jin43yue4zhang3die1fu2 <- c.downField("近3月涨跌幅").as[Double]

        p_jin46yue4zhang3die1fu2 <- c.downField("近6月涨跌幅").as[Double]

        p_jin41nian2zhang3die1fu2 <- c.downField("近1年涨跌幅").as[Double]

        p_jin42nian2zhang3die1fu2 <- c.downField("近2年涨跌幅").as[Double]

        p_jin43nian2zhang3die1fu2 <- c.downField("近3年涨跌幅").as[Double]

      } yield {
        macro_china_bdti_indexResponse(
          p_ri4qi1,
          p_zui4xin1zhi2,
          p_zhang3die1fu2,
          p_jin43yue4zhang3die1fu2,
          p_jin46yue4zhang3die1fu2,
          p_jin41nian2zhang3die1fu2,
          p_jin42nian2zhang3die1fu2,
          p_jin43nian2zhang3die1fu2
        )
      }
  }

}

object JsonItem_macro_china_bdti_indexResponse extends Json_macro_china_bdti_indexResponse
