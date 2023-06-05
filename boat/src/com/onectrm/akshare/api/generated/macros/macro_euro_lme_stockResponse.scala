package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_euro_lme_stockResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_euro_lme_stock 目标地址: https://datacenter.jin10.com/reportType/dc_lme_report
  * 描述: 获取伦敦金属交易所(LME)-库存报告, 数据区间从 20140702-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_euro_lme_stockResponse(
  `p_bu4tong2pin3zhong3de5ku4cun2zhu4ce4cang1dan1he2zhu4xiao1cang1dan1`: String
)

case class macro_euro_lme_stockResponse(
  `p_bu4tong2pin3zhong3de5ku4cun2zhu4ce4cang1dan1he2zhu4xiao1cang1dan1`: String
)

trait Json_macro_euro_lme_stockResponse {

  implicit val a_macro_euro_lme_stockResponse = new Decoder[macro_euro_lme_stockResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_euro_lme_stockResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bu4tong2pin3zhong3de5ku4cun2zhu4ce4cang1dan1he2zhu4xiao1cang1dan1 <- c
          .downField("")
          .as[String]

      } yield {
        macro_euro_lme_stockResponse(
          p_bu4tong2pin3zhong3de5ku4cun2zhu4ce4cang1dan1he2zhu4xiao1cang1dan1
        )
      }
  }

}

object JsonItem_macro_euro_lme_stockResponse extends Json_macro_euro_lme_stockResponse
