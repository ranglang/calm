package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.news_economic_baiduResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: news_economic_baidu 目标地址: https://gushitong.baidu.com/calendar 描述: 全球宏观指标重大事件 限量:
  * 单次返回指定 date 的所有历史数据
  */
case class Respnews_economic_baiduResponse(
  `p_ri4qi1`: String,
  `p_shi2jian1`: String,
  `p_di4qu1`: String,
  `p_shi4jian4`: String,
  `p_gong1bu4`: Double,
  `p_yu4qi1`: Double,
  `p_qian2zhi2`: Double,
  `p_zhong4yao4xing4`: Double
)

case class news_economic_baiduResponse(
  `p_ri4qi1`: String,
  `p_shi2jian1`: String,
  `p_di4qu1`: String,
  `p_shi4jian4`: String,
  `p_gong1bu4`: Double,
  `p_yu4qi1`: Double,
  `p_qian2zhi2`: Double,
  `p_zhong4yao4xing4`: Double
)

trait Json_news_economic_baiduResponse {

  implicit val a_news_economic_baiduResponse = new Decoder[news_economic_baiduResponse] {
    final def apply(c: HCursor): Decoder.Result[news_economic_baiduResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shi2jian1 <- c.downField("时间").as[String]

        p_di4qu1 <- c.downField("地区").as[String]

        p_shi4jian4 <- c.downField("事件").as[String]

        p_gong1bu4 <- c.downField("公布").as[Double]

        p_yu4qi1 <- c.downField("预期").as[Double]

        p_qian2zhi2 <- c.downField("前值").as[Double]

        p_zhong4yao4xing4 <- c.downField("重要性").as[Double]

      } yield {
        news_economic_baiduResponse(
          p_ri4qi1,
          p_shi2jian1,
          p_di4qu1,
          p_shi4jian4,
          p_gong1bu4,
          p_yu4qi1,
          p_qian2zhi2,
          p_zhong4yao4xing4
        )
      }
  }

}

object JsonItem_news_economic_baiduResponse extends Json_news_economic_baiduResponse
