package com

package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.Bstock_individual_info_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_individual_info_em 目标地址:
  * http://quote.eastmoney.com/concept/sh603777.html?from=classic 描述: 东方财富-个股-股票信息 限量: 单次返回指定 symbol
  * 的个股信息
  */
case class Bstock_individual_info_emResponse(
  `p_item`: String,
  `p_value`: String
)

object Bstock_individual_info_emResponse {

  implicit val eitherDoubleOrString: Decoder[Either[Double, String]] =
    Decoder[Double].map(Left(_)).or(Decoder[String].map(Right(_)))

  implicit val a_Bstock_individual_info_emResponse =
    new Decoder[Bstock_individual_info_emResponse] {
      final def apply(c: HCursor): Decoder.Result[Bstock_individual_info_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_item <- c.downField("item").as[String]

          p_value <- c.downField("value").as[Either[Double, String]]
          dddd = p_value match {
            case Right(s) => s.toString
            case Left(s)  => s.toString
          }

        } yield {
          Bstock_individual_info_emResponse(
            p_item,
            dddd
          )
        }
    }

}
