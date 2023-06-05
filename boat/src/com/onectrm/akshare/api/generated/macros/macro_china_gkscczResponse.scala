package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_gkscczResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_gksccz 目标地址: http://www.chinamoney.com.cn/chinese/yhgkscczh/ 描述:
  * 央行公开市场操作; 数据区间从 20040116 至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_gkscczResponse(
  `p_cao1zuo4ri4qi1`: String,
  `p_qi1xian4`: Double,
  `p_jiao1yi4liang4`: Double,
  `p_zhong1biao1li4lu4`: Double,
  `p_zheng4ni4hui2gou4`: String
)

case class macro_china_gkscczResponse(
  `p_cao1zuo4ri4qi1`: String,
  `p_qi1xian4`: Double,
  `p_jiao1yi4liang4`: Double,
  `p_zhong1biao1li4lu4`: Double,
  `p_zheng4ni4hui2gou4`: String
)

trait Json_macro_china_gkscczResponse {

  implicit val a_macro_china_gkscczResponse = new Decoder[macro_china_gkscczResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_gkscczResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_cao1zuo4ri4qi1 <- c.downField("操作日期").as[String]

        p_qi1xian4 <- c.downField("期限").as[Double]

        p_jiao1yi4liang4 <- c.downField("交易量").as[Double]

        p_zhong1biao1li4lu4 <- c.downField("中标利率").as[Double]

        p_zheng4ni4hui2gou4 <- c.downField("正/逆回购").as[String]

      } yield {
        macro_china_gkscczResponse(
          p_cao1zuo4ri4qi1,
          p_qi1xian4,
          p_jiao1yi4liang4,
          p_zhong1biao1li4lu4,
          p_zheng4ni4hui2gou4
        )
      }
  }

}

object JsonItem_macro_china_gkscczResponse extends Json_macro_china_gkscczResponse
