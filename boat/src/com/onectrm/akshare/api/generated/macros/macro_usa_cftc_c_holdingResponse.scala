package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_usa_cftc_c_holdingResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_usa_cftc_c_holding 目标地址:
  * https://datacenter.jin10.com/reportType/dc_cftc_c_report 描述: 获取美国商品期货交易委员会CFTC商品类非商业持仓报告, 数据区间从
  * 19830107-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_usa_cftc_c_holdingResponse(
  `p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4`: String
)

case class macro_usa_cftc_c_holdingResponse(
  `p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4`: String
)

trait Json_macro_usa_cftc_c_holdingResponse {

  implicit val a_macro_usa_cftc_c_holdingResponse = new Decoder[macro_usa_cftc_c_holdingResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_usa_cftc_c_holdingResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4 <- c
          .downField("")
          .as[String]

      } yield {
        macro_usa_cftc_c_holdingResponse(
          p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4
        )
      }
  }

}

object JsonItem_macro_usa_cftc_c_holdingResponse extends Json_macro_usa_cftc_c_holdingResponse
