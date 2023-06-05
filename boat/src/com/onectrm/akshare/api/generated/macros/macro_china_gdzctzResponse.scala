package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_gdzctzResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_gdzctz 目标地址: http://data.eastmoney.com/cjsj/gdzctz.html 描述:
  * 获取中国城镇固定资产投资, 数据区间从 200802 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_gdzctzResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: String,
  `p_tong2bi3zeng1zhang3`: String,
  `p_huan2bi3zeng1zhang3`: String,
  `p_zi4nian2chu1lei3ji4`: String
)

case class macro_china_gdzctzResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: String,
  `p_tong2bi3zeng1zhang3`: String,
  `p_huan2bi3zeng1zhang3`: String,
  `p_zi4nian2chu1lei3ji4`: String
)

trait Json_macro_china_gdzctzResponse {

  implicit val a_macro_china_gdzctzResponse = new Decoder[macro_china_gdzctzResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_gdzctzResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_dang1yue4 <- c.downField("当月").as[String]

        p_tong2bi3zeng1zhang3 <- c.downField("同比增长").as[String]

        p_huan2bi3zeng1zhang3 <- c.downField("环比增长").as[String]

        p_zi4nian2chu1lei3ji4 <- c.downField("自年初累计").as[String]

      } yield {
        macro_china_gdzctzResponse(
          p_yue4fen4,
          p_dang1yue4,
          p_tong2bi3zeng1zhang3,
          p_huan2bi3zeng1zhang3,
          p_zi4nian2chu1lei3ji4
        )
      }
  }

}

object JsonItem_macro_china_gdzctzResponse extends Json_macro_china_gdzctzResponse
