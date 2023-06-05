package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_ppiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_ppi 目标地址: http://data.eastmoney.com/cjsj/ppi.html 描述: 工业品出厂价格指数,
  * 数据区间从 200601 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_ppiResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: String,
  `p_dang1yue4tong2bi3zeng1zhang3`: String,
  `p_lei3ji4`: String
)

case class macro_china_ppiResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: String,
  `p_dang1yue4tong2bi3zeng1zhang3`: String,
  `p_lei3ji4`: String
)

trait Json_macro_china_ppiResponse {

  implicit val a_macro_china_ppiResponse = new Decoder[macro_china_ppiResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_ppiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_dang1yue4 <- c.downField("当月").as[String]

        p_dang1yue4tong2bi3zeng1zhang3 <- c.downField("当月同比增长").as[String]

        p_lei3ji4 <- c.downField("累计").as[String]

      } yield {
        macro_china_ppiResponse(
          p_yue4fen4,
          p_dang1yue4,
          p_dang1yue4tong2bi3zeng1zhang3,
          p_lei3ji4
        )
      }
  }

}

object JsonItem_macro_china_ppiResponse extends Json_macro_china_ppiResponse
