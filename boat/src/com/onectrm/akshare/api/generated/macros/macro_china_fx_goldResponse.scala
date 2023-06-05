package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_fx_goldResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_fx_gold 目标地址: http://data.eastmoney.com/cjsj/hjwh.html 描述:
  * 获取中国外汇和黄金储备, 数据区间从 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_fx_goldResponse(
  `p_yue4fen4`: String,
  `p_guo2jia1wai4hui4chu3bei4shu4zhi2`: String,
  `p_guo2jia1wai4hui4chu3bei4tong2bi3`: String,
  `p_guo2jia1wai4hui4chu3bei4huan2bi3`: String,
  `p_huang2jin1chu3bei4shu4zhi2`: String,
  `p_huang2jin1chu3bei4tong2bi3`: String,
  `p_huang2jin1chu3bei4huan2bi3`: String
)

case class macro_china_fx_goldResponse(
  `p_yue4fen4`: String,
  `p_guo2jia1wai4hui4chu3bei4shu4zhi2`: String,
  `p_guo2jia1wai4hui4chu3bei4tong2bi3`: String,
  `p_guo2jia1wai4hui4chu3bei4huan2bi3`: String,
  `p_huang2jin1chu3bei4shu4zhi2`: String,
  `p_huang2jin1chu3bei4tong2bi3`: String,
  `p_huang2jin1chu3bei4huan2bi3`: String
)

trait Json_macro_china_fx_goldResponse {

  implicit val a_macro_china_fx_goldResponse = new Decoder[macro_china_fx_goldResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_fx_goldResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_guo2jia1wai4hui4chu3bei4shu4zhi2 <- c.downField("国家外汇储备-数值").as[String]

        p_guo2jia1wai4hui4chu3bei4tong2bi3 <- c.downField("国家外汇储备-同比").as[String]

        p_guo2jia1wai4hui4chu3bei4huan2bi3 <- c.downField("国家外汇储备-环比").as[String]

        p_huang2jin1chu3bei4shu4zhi2 <- c.downField("黄金储备-数值").as[String]

        p_huang2jin1chu3bei4tong2bi3 <- c.downField("黄金储备-同比").as[String]

        p_huang2jin1chu3bei4huan2bi3 <- c.downField("黄金储备-环比").as[String]

      } yield {
        macro_china_fx_goldResponse(
          p_yue4fen4,
          p_guo2jia1wai4hui4chu3bei4shu4zhi2,
          p_guo2jia1wai4hui4chu3bei4tong2bi3,
          p_guo2jia1wai4hui4chu3bei4huan2bi3,
          p_huang2jin1chu3bei4shu4zhi2,
          p_huang2jin1chu3bei4tong2bi3,
          p_huang2jin1chu3bei4huan2bi3
        )
      }
  }

}

object JsonItem_macro_china_fx_goldResponse extends Json_macro_china_fx_goldResponse
