package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_hbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_hb 目标地址: http://www.chinamoney.com.cn/chinese/hb/ 描述: 央行币净投放与净回笼,
  * 数据区间从 19970310 至今, 周或则月频率 限量: 单次返回指定 symbol 的所有历史数据
  */
case class Respmacro_china_hbResponse(
  `p_ri4qi1`: String,
  `p_kai1shi3ri4qi1`: String,
  `p_jie2shu4ri4qi1`: String,
  `p_tou2fang4liang4`: Double,
  `p_hui2long3liang4`: Double,
  `p_jing4tou2fang4`: Double
)

case class macro_china_hbResponse(
  `p_ri4qi1`: String,
  `p_kai1shi3ri4qi1`: String,
  `p_jie2shu4ri4qi1`: String,
  `p_tou2fang4liang4`: Double,
  `p_hui2long3liang4`: Double,
  `p_jing4tou2fang4`: Double
)

trait Json_macro_china_hbResponse {

  implicit val a_macro_china_hbResponse = new Decoder[macro_china_hbResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_hbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_kai1shi3ri4qi1 <- c.downField("开始日期").as[String]

        p_jie2shu4ri4qi1 <- c.downField("结束日期").as[String]

        p_tou2fang4liang4 <- c.downField("投放量").as[Double]

        p_hui2long3liang4 <- c.downField("回笼量").as[Double]

        p_jing4tou2fang4 <- c.downField("净投放").as[Double]

      } yield {
        macro_china_hbResponse(
          p_ri4qi1,
          p_kai1shi3ri4qi1,
          p_jie2shu4ri4qi1,
          p_tou2fang4liang4,
          p_hui2long3liang4,
          p_jing4tou2fang4
        )
      }
  }

}

object JsonItem_macro_china_hbResponse extends Json_macro_china_hbResponse
