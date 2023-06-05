package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_ctci_detail_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_ctci_detail_hist 目标地址: http://jgjc.ndrc.gov.cn/dmzs.aspx?clmId=741
  * 描述: 获取中国电煤价格指数-历史电煤价格指数, 具体年的历史数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_ctci_detail_histResponse(
  `p_di4qu1`: String,
  `p_`: String
)

case class macro_china_ctci_detail_histResponse(
  `p_di4qu1`: String,
  `p_`: String
)

trait Json_macro_china_ctci_detail_histResponse {

  implicit val a_macro_china_ctci_detail_histResponse =
    new Decoder[macro_china_ctci_detail_histResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_ctci_detail_histResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_di4qu1 <- c.downField("地区").as[String]

          p_ <- c.downField("---").as[String]

        } yield {
          macro_china_ctci_detail_histResponse(
            p_di4qu1,
            p_
          )
        }
    }

}

object JsonItem_macro_china_ctci_detail_histResponse
    extends Json_macro_china_ctci_detail_histResponse
