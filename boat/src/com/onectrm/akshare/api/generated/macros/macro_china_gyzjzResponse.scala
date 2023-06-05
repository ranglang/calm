package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_gyzjzResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_gyzjz 目标地址: https://data.eastmoney.com/cjsj/gyzjz.html 描述:
  * 东方财富-中国工业增加值增长, 数据区间从 2008 - 至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_gyzjzResponse(
  `p_yue4fen4`: String,
  `p_tong2bi3zeng1zhang3`: Double,
  `p_lei3ji4zeng1zhang3`: Double
)

case class macro_china_gyzjzResponse(
  `p_yue4fen4`: String,
  `p_tong2bi3zeng1zhang3`: Double,
  `p_lei3ji4zeng1zhang3`: Double
)

trait Json_macro_china_gyzjzResponse {

  implicit val a_macro_china_gyzjzResponse = new Decoder[macro_china_gyzjzResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_gyzjzResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_tong2bi3zeng1zhang3 <- c.downField("同比增长").as[Double]

        p_lei3ji4zeng1zhang3 <- c.downField("累计增长").as[Double]

      } yield {
        macro_china_gyzjzResponse(
          p_yue4fen4,
          p_tong2bi3zeng1zhang3,
          p_lei3ji4zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_gyzjzResponse extends Json_macro_china_gyzjzResponse
