package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_national_tax_receiptsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_national_tax_receipts 目标地址:
  * http://data.eastmoney.com/cjsj/nationaltaxreceipts.aspx 描述: 中国全国税收收入数据, 数据区间从 2005 一季度-至今 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_china_national_tax_receiptsResponse(
  `p_ji4du4`: String,
  `p_shui4shou1shou1ru4he2ji4`: Double,
  `p_jiao4shang4nian2tong2qi1`: Double,
  `p_ji4du4huan2bi3`: Double
)

case class macro_china_national_tax_receiptsResponse(
  `p_ji4du4`: String,
  `p_shui4shou1shou1ru4he2ji4`: Double,
  `p_jiao4shang4nian2tong2qi1`: Double,
  `p_ji4du4huan2bi3`: Double
)

trait Json_macro_china_national_tax_receiptsResponse {

  implicit val a_macro_china_national_tax_receiptsResponse =
    new Decoder[macro_china_national_tax_receiptsResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_national_tax_receiptsResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ji4du4 <- c.downField("季度").as[String]

          p_shui4shou1shou1ru4he2ji4 <- c.downField("税收收入合计").as[Double]

          p_jiao4shang4nian2tong2qi1 <- c.downField("较上年同期").as[Double]

          p_ji4du4huan2bi3 <- c.downField("季度环比").as[Double]

        } yield {
          macro_china_national_tax_receiptsResponse(
            p_ji4du4,
            p_shui4shou1shou1ru4he2ji4,
            p_jiao4shang4nian2tong2qi1,
            p_ji4du4huan2bi3
          )
        }
    }

}

object JsonItem_macro_china_national_tax_receiptsResponse
    extends Json_macro_china_national_tax_receiptsResponse
