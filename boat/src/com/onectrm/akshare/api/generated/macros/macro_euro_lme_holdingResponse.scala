package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_euro_lme_holdingResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_euro_lme_holding 目标地址:
  * https://datacenter.jin10.com/reportType/dc_lme_traders_report 描述: 获取伦敦金属交易所(LME)-持仓报告, 数据区间从
  * 20151022-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_euro_lme_holdingResponse(
  `p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4`: String
)

case class macro_euro_lme_holdingResponse(
  `p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4`: String
)

trait Json_macro_euro_lme_holdingResponse {

  implicit val a_macro_euro_lme_holdingResponse = new Decoder[macro_euro_lme_holdingResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_euro_lme_holdingResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4 <- c
          .downField("")
          .as[String]

      } yield {
        macro_euro_lme_holdingResponse(
          p_bu4tong2pin3zhong3de5duo1tou2cang1wei4kong1tou2cang1wei4he2jing4cang1wei4
        )
      }
  }

}

object JsonItem_macro_euro_lme_holdingResponse extends Json_macro_euro_lme_holdingResponse
