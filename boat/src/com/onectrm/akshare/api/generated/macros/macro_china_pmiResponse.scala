package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_pmiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_pmi 目标地址: http://data.eastmoney.com/cjsj/pmi.html 描述: 采购经理人指数, 数据区间从
  * 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_pmiResponse(
  `p_yue4fen4`: String,
  `p_zhi4zao4ye4zhi3shu4`: Double,
  `p_zhi4zao4ye4tong2bi3zeng1zhang3`: Double,
  `p_fei1zhi4zao4ye4zhi3shu4`: Double,
  `p_fei1zhi4zao4ye4tong2bi3zeng1zhang3`: Double
)

case class macro_china_pmiResponse(
  `p_yue4fen4`: String,
  `p_zhi4zao4ye4zhi3shu4`: Double,
  `p_zhi4zao4ye4tong2bi3zeng1zhang3`: Double,
  `p_fei1zhi4zao4ye4zhi3shu4`: Double,
  `p_fei1zhi4zao4ye4tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_pmiResponse {

  implicit val a_macro_china_pmiResponse = new Decoder[macro_china_pmiResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_pmiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_zhi4zao4ye4zhi3shu4 <- c.downField("制造业-指数").as[Double]

        p_zhi4zao4ye4tong2bi3zeng1zhang3 <- c.downField("制造业-同比增长").as[Double]

        p_fei1zhi4zao4ye4zhi3shu4 <- c.downField("非制造业-指数").as[Double]

        p_fei1zhi4zao4ye4tong2bi3zeng1zhang3 <- c.downField("非制造业-同比增长").as[Double]

      } yield {
        macro_china_pmiResponse(
          p_yue4fen4,
          p_zhi4zao4ye4zhi3shu4,
          p_zhi4zao4ye4tong2bi3zeng1zhang3,
          p_fei1zhi4zao4ye4zhi3shu4,
          p_fei1zhi4zao4ye4tong2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_pmiResponse extends Json_macro_china_pmiResponse
