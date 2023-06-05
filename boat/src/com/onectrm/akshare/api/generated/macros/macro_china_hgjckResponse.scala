package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_hgjckResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_hgjck 目标地址: http://data.eastmoney.com/cjsj/hgjck.html 描述:
  * 获取中国海关进出口增减情况一览表, 数据区间从 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_hgjckResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4chu1kou3e2jin1e2`: Double,
  `p_dang1yue4chu1kou3e2tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4chu1kou3e2huan2bi3zeng1zhang3`: Double,
  `p_dang1yue4jin4kou3e2jin1e2`: Double,
  `p_dang1yue4jin4kou3e2tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4jin4kou3e2huan2bi3zeng1zhang3`: Double,
  `p_lei3ji4chu1kou3e2jin1e2`: Double,
  `p_lei3ji4chu1kou3e2tong2bi3zeng1zhang3`: Double,
  `p_lei3ji4jin4kou3e2jin1e2`: Integer,
  `p_lei3ji4jin4kou3e2tong2bi3zeng1zhang3`: Double
)

case class macro_china_hgjckResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4chu1kou3e2jin1e2`: Double,
  `p_dang1yue4chu1kou3e2tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4chu1kou3e2huan2bi3zeng1zhang3`: Double,
  `p_dang1yue4jin4kou3e2jin1e2`: Double,
  `p_dang1yue4jin4kou3e2tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4jin4kou3e2huan2bi3zeng1zhang3`: Double,
  `p_lei3ji4chu1kou3e2jin1e2`: Double,
  `p_lei3ji4chu1kou3e2tong2bi3zeng1zhang3`: Double,
  `p_lei3ji4jin4kou3e2jin1e2`: Integer,
  `p_lei3ji4jin4kou3e2tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_hgjckResponse {

  implicit val a_macro_china_hgjckResponse = new Decoder[macro_china_hgjckResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_hgjckResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_dang1yue4chu1kou3e2jin1e2 <- c.downField("当月出口额-金额").as[Double]

        p_dang1yue4chu1kou3e2tong2bi3zeng1zhang3 <- c.downField("当月出口额-同比增长").as[Double]

        p_dang1yue4chu1kou3e2huan2bi3zeng1zhang3 <- c.downField("当月出口额-环比增长").as[Double]

        p_dang1yue4jin4kou3e2jin1e2 <- c.downField("当月进口额-金额").as[Double]

        p_dang1yue4jin4kou3e2tong2bi3zeng1zhang3 <- c.downField("当月进口额-同比增长").as[Double]

        p_dang1yue4jin4kou3e2huan2bi3zeng1zhang3 <- c.downField("当月进口额-环比增长").as[Double]

        p_lei3ji4chu1kou3e2jin1e2 <- c.downField("累计出口额-金额").as[Double]

        p_lei3ji4chu1kou3e2tong2bi3zeng1zhang3 <- c.downField("累计出口额-同比增长").as[Double]

        p_lei3ji4jin4kou3e2jin1e2 <- c.downField("累计进口额-金额").as[Integer]

        p_lei3ji4jin4kou3e2tong2bi3zeng1zhang3 <- c.downField("累计进口额-同比增长").as[Double]

      } yield {
        macro_china_hgjckResponse(
          p_yue4fen4,
          p_dang1yue4chu1kou3e2jin1e2,
          p_dang1yue4chu1kou3e2tong2bi3zeng1zhang3,
          p_dang1yue4chu1kou3e2huan2bi3zeng1zhang3,
          p_dang1yue4jin4kou3e2jin1e2,
          p_dang1yue4jin4kou3e2tong2bi3zeng1zhang3,
          p_dang1yue4jin4kou3e2huan2bi3zeng1zhang3,
          p_lei3ji4chu1kou3e2jin1e2,
          p_lei3ji4chu1kou3e2tong2bi3zeng1zhang3,
          p_lei3ji4jin4kou3e2jin1e2,
          p_lei3ji4jin4kou3e2tong2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_hgjckResponse extends Json_macro_china_hgjckResponse
