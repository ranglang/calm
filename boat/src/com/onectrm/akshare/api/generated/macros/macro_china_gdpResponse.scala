package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_gdpResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_gdp 目标地址: http://data.eastmoney.com/cjsj/gdp.html 描述: 获取中国国内生产总值,
  * 数据区间从 200601 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_gdpResponse(
  `p_ji4du4`: String,
  `p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2`: Double,
  `p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3`: Double,
  `p_di4yi1chan3ye4jue2dui4zhi2`: Double,
  `p_di4yi1chan3ye4tong2bi3zeng1zhang3`: Double,
  `p_di4er4chan3ye4jue2dui4zhi2`: Double,
  `p_di4er4chan3ye4tong2bi3zeng1zhang3`: Double,
  `p_di4san1chan3ye4jue2dui4zhi2`: Double,
  `p_di4san1chan3ye4tong2bi3zeng1zhang3`: Double
)

case class macro_china_gdpResponse(
  `p_ji4du4`: String,
  `p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2`: Double,
  `p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3`: Double,
  `p_di4yi1chan3ye4jue2dui4zhi2`: Double,
  `p_di4yi1chan3ye4tong2bi3zeng1zhang3`: Double,
  `p_di4er4chan3ye4jue2dui4zhi2`: Double,
  `p_di4er4chan3ye4tong2bi3zeng1zhang3`: Double,
  `p_di4san1chan3ye4jue2dui4zhi2`: Double,
  `p_di4san1chan3ye4tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_gdpResponse {

  implicit val a_macro_china_gdpResponse = new Decoder[macro_china_gdpResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_gdpResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji4du4 <- c.downField("季度").as[String]

        p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2 <- c.downField("国内生产总值-绝对值").as[Double]

        p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3 <- c.downField("国内生产总值-同比增长").as[Double]

        p_di4yi1chan3ye4jue2dui4zhi2 <- c.downField("第一产业-绝对值").as[Double]

        p_di4yi1chan3ye4tong2bi3zeng1zhang3 <- c.downField("第一产业-同比增长").as[Double]

        p_di4er4chan3ye4jue2dui4zhi2 <- c.downField("第二产业-绝对值").as[Double]

        p_di4er4chan3ye4tong2bi3zeng1zhang3 <- c.downField("第二产业-同比增长").as[Double]

        p_di4san1chan3ye4jue2dui4zhi2 <- c.downField("第三产业-绝对值").as[Double]

        p_di4san1chan3ye4tong2bi3zeng1zhang3 <- c.downField("第三产业-同比增长").as[Double]

      } yield {
        macro_china_gdpResponse(
          p_ji4du4,
          p_guo2nei4sheng1chan3zong3zhi2jue2dui4zhi2,
          p_guo2nei4sheng1chan3zong3zhi2tong2bi3zeng1zhang3,
          p_di4yi1chan3ye4jue2dui4zhi2,
          p_di4yi1chan3ye4tong2bi3zeng1zhang3,
          p_di4er4chan3ye4jue2dui4zhi2,
          p_di4er4chan3ye4tong2bi3zeng1zhang3,
          p_di4san1chan3ye4jue2dui4zhi2,
          p_di4san1chan3ye4tong2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_gdpResponse extends Json_macro_china_gdpResponse
