package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_real_estateResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_real_estate 目标地址:
  * http://data.eastmoney.com/cjsj/hyzs_list_EMM00121987.html 描述: 国家统计局-国房景气指数 限量: 单次返回所有历史数据
  */
case class Respmacro_china_real_estateResponse(
)

case class macro_china_real_estateResponse(
)

trait Json_macro_china_real_estateResponse {

  implicit val a_macro_china_real_estateResponse = new Decoder[macro_china_real_estateResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_real_estateResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

      } yield {
        macro_china_real_estateResponse(
        )
      }
  }

}

object JsonItem_macro_china_real_estateResponse extends Json_macro_china_real_estateResponse
