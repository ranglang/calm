package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_cons_opec_monthResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_cons_opec_month 目标地址:
  * https://datacenter.jin10.com/reportType/dc_eurozone_sentix_investor_confidence 描述: 获取欧佩克报告,
  * 数据区间从20170118-至今 限量: 单次返回所有历史数据, 以网页数据为准.
  */
case class Respmacro_cons_opec_monthResponse(
  `p_ri4qi1`: String,
  `p_a1er3ji2li4ya4`: Double,
  `p_an1ge1la1`: Double,
  `p_e4gua1duo1er3`: Double,
  `p_jia1peng2`: Double,
  `p_yi1lang3`: Double,
  `p_yi1la1ke4`: Double,
  `p_ke1wei1te4`: Double,
  `p_li4bi3ya4`: Double,
  `p_ni2ri4li4ya4`: Double,
  `p_sha1te4`: Double,
  `p_a1lian2qiu2`: Double,
  `p_wei3nei4rui4la1`: Double,
  `p_ou1pei4ke4chan3liang4`: Double
)

case class macro_cons_opec_monthResponse(
  `p_ri4qi1`: String,
  `p_a1er3ji2li4ya4`: Double,
  `p_an1ge1la1`: Double,
  `p_e4gua1duo1er3`: Double,
  `p_jia1peng2`: Double,
  `p_yi1lang3`: Double,
  `p_yi1la1ke4`: Double,
  `p_ke1wei1te4`: Double,
  `p_li4bi3ya4`: Double,
  `p_ni2ri4li4ya4`: Double,
  `p_sha1te4`: Double,
  `p_a1lian2qiu2`: Double,
  `p_wei3nei4rui4la1`: Double,
  `p_ou1pei4ke4chan3liang4`: Double
)

trait Json_macro_cons_opec_monthResponse {

  implicit val a_macro_cons_opec_monthResponse = new Decoder[macro_cons_opec_monthResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_cons_opec_monthResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_a1er3ji2li4ya4 <- c.downField("阿尔及利亚").as[Double]

        p_an1ge1la1 <- c.downField("安哥拉").as[Double]

        p_e4gua1duo1er3 <- c.downField("厄瓜多尔").as[Double]

        p_jia1peng2 <- c.downField("加蓬").as[Double]

        p_yi1lang3 <- c.downField("伊朗").as[Double]

        p_yi1la1ke4 <- c.downField("伊拉克").as[Double]

        p_ke1wei1te4 <- c.downField("科威特").as[Double]

        p_li4bi3ya4 <- c.downField("利比亚").as[Double]

        p_ni2ri4li4ya4 <- c.downField("尼日利亚").as[Double]

        p_sha1te4 <- c.downField("沙特").as[Double]

        p_a1lian2qiu2 <- c.downField("阿联酋").as[Double]

        p_wei3nei4rui4la1 <- c.downField("委内瑞拉").as[Double]

        p_ou1pei4ke4chan3liang4 <- c.downField("欧佩克产量").as[Double]

      } yield {
        macro_cons_opec_monthResponse(
          p_ri4qi1,
          p_a1er3ji2li4ya4,
          p_an1ge1la1,
          p_e4gua1duo1er3,
          p_jia1peng2,
          p_yi1lang3,
          p_yi1la1ke4,
          p_ke1wei1te4,
          p_li4bi3ya4,
          p_ni2ri4li4ya4,
          p_sha1te4,
          p_a1lian2qiu2,
          p_wei3nei4rui4la1,
          p_ou1pei4ke4chan3liang4
        )
      }
  }

}

object JsonItem_macro_cons_opec_monthResponse extends Json_macro_cons_opec_monthResponse
