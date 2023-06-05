package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_ctci_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_ctci_detail 目标地址: http://jgjc.ndrc.gov.cn/dmzs.aspx?clmId=741 描述:
  * 获取中国电煤价格指数-各价区电煤价格指数, 具体年具体月的历史数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_ctci_detailResponse(
  `p_huan2bi3`: String,
  `p_shang4qi1`: Double,
  `p_tong2bi3`: Double,
  `p_ben3qi1`: Double
)

case class macro_china_ctci_detailResponse(
  `p_huan2bi3`: String,
  `p_shang4qi1`: Double,
  `p_tong2bi3`: Double,
  `p_ben3qi1`: Double
)

trait Json_macro_china_ctci_detailResponse {

  implicit val a_macro_china_ctci_detailResponse = new Decoder[macro_china_ctci_detailResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_ctci_detailResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_huan2bi3 <- c.downField("环比").as[String]

        p_shang4qi1 <- c.downField("上期").as[Double]

        p_tong2bi3 <- c.downField("同比").as[Double]

        p_ben3qi1 <- c.downField("本期").as[Double]

      } yield {
        macro_china_ctci_detailResponse(
          p_huan2bi3,
          p_shang4qi1,
          p_tong2bi3,
          p_ben3qi1
        )
      }
  }

}

object JsonItem_macro_china_ctci_detailResponse extends Json_macro_china_ctci_detailResponse
