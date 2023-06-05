package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_foreign_exchange_goldResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_foreign_exchange_gold 目标地址:
  * http://finance.sina.com.cn/mac/#fininfo-5-0-31-2 描述: 国家统计局-央行黄金和外汇储备, 比东财接口数据时间长 限量: 单次返回所有历史数据
  */
case class Respmacro_china_foreign_exchange_goldResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_huang2jin1chu3bei4`: String,
  `p_guo2jia1wai4hui4chu3bei4`: String
)

case class macro_china_foreign_exchange_goldResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_huang2jin1chu3bei4`: String,
  `p_guo2jia1wai4hui4chu3bei4`: String
)

trait Json_macro_china_foreign_exchange_goldResponse {

  implicit val a_macro_china_foreign_exchange_goldResponse =
    new Decoder[macro_china_foreign_exchange_goldResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_foreign_exchange_goldResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

          p_huang2jin1chu3bei4 <- c.downField("黄金储备").as[String]

          p_guo2jia1wai4hui4chu3bei4 <- c.downField("国家外汇储备").as[String]

        } yield {
          macro_china_foreign_exchange_goldResponse(
            p_tong3ji4shi2jian1,
            p_huang2jin1chu3bei4,
            p_guo2jia1wai4hui4chu3bei4
          )
        }
    }

}

object JsonItem_macro_china_foreign_exchange_goldResponse
    extends Json_macro_china_foreign_exchange_goldResponse
