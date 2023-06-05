package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_usa_rig_countResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_usa_rig_count 目标地址:
  * https://datacenter.jin10.com/reportType/dc_rig_count_summary 描述: 获取贝克休斯钻井报告, 数据区间从19870717-至今
  * 限量: 单次返回所有历史数据
  */
case class Respmacro_usa_rig_countResponse(
  `p_ri4qi1`: String,
  `p_zuan4jing3zong3shu4zuan4jing3shu4`: Double,
  `p_zuan4jing3zong3shu4bian4hua4`: Double,
  `p_mei3guo2shi2you2zuan4jing3zuan4jing3shu4`: Double,
  `p_mei3guo2shi2you2zuan4jing3bian4hua4`: Double,
  `p_hun4he2zuan4jing3zuan4jing3shu4`: Double,
  `p_hun4he2zuan4jing3bian4hua4`: Double,
  `p_mei3guo2tian1ran2qi4zuan4jing3zuan4jing3shu4`: Double,
  `p_mei3guo2tian1ran2qi4zuan4jing3bian4hua4`: Double
)

case class macro_usa_rig_countResponse(
  `p_ri4qi1`: String,
  `p_zuan4jing3zong3shu4zuan4jing3shu4`: Double,
  `p_zuan4jing3zong3shu4bian4hua4`: Double,
  `p_mei3guo2shi2you2zuan4jing3zuan4jing3shu4`: Double,
  `p_mei3guo2shi2you2zuan4jing3bian4hua4`: Double,
  `p_hun4he2zuan4jing3zuan4jing3shu4`: Double,
  `p_hun4he2zuan4jing3bian4hua4`: Double,
  `p_mei3guo2tian1ran2qi4zuan4jing3zuan4jing3shu4`: Double,
  `p_mei3guo2tian1ran2qi4zuan4jing3bian4hua4`: Double
)

trait Json_macro_usa_rig_countResponse {

  implicit val a_macro_usa_rig_countResponse = new Decoder[macro_usa_rig_countResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_usa_rig_countResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zuan4jing3zong3shu4zuan4jing3shu4 <- c.downField("钻井总数_钻井数").as[Double]

        p_zuan4jing3zong3shu4bian4hua4 <- c.downField("钻井总数_变化").as[Double]

        p_mei3guo2shi2you2zuan4jing3zuan4jing3shu4 <- c.downField("美国石油钻井_钻井数").as[Double]

        p_mei3guo2shi2you2zuan4jing3bian4hua4 <- c.downField("美国石油钻井_变化").as[Double]

        p_hun4he2zuan4jing3zuan4jing3shu4 <- c.downField("混合钻井_钻井数").as[Double]

        p_hun4he2zuan4jing3bian4hua4 <- c.downField("混合钻井_变化").as[Double]

        p_mei3guo2tian1ran2qi4zuan4jing3zuan4jing3shu4 <- c.downField("美国天然气钻井_钻井数").as[Double]

        p_mei3guo2tian1ran2qi4zuan4jing3bian4hua4 <- c.downField("美国天然气钻井_变化").as[Double]

      } yield {
        macro_usa_rig_countResponse(
          p_ri4qi1,
          p_zuan4jing3zong3shu4zuan4jing3shu4,
          p_zuan4jing3zong3shu4bian4hua4,
          p_mei3guo2shi2you2zuan4jing3zuan4jing3shu4,
          p_mei3guo2shi2you2zuan4jing3bian4hua4,
          p_hun4he2zuan4jing3zuan4jing3shu4,
          p_hun4he2zuan4jing3bian4hua4,
          p_mei3guo2tian1ran2qi4zuan4jing3zuan4jing3shu4,
          p_mei3guo2tian1ran2qi4zuan4jing3bian4hua4
        )
      }
  }

}

object JsonItem_macro_usa_rig_countResponse extends Json_macro_usa_rig_countResponse
