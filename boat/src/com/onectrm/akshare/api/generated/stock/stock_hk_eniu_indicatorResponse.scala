package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hk_eniu_indicatorResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hk_eniu_indicator 目标地址: https://eniu.com/gu/hk01093/roe 描述: 亿牛网-港股个股指标:
  * 市盈率, 市净率, 股息率, ROE, 市值 限量: 单次获取指定 symbol 和 indicator 的所有历史数据
  */
case class Respstock_hk_eniu_indicatorResponse(
  `p_gen1ju4indicatorer2yi4`: String
)

case class stock_hk_eniu_indicatorResponse(
  `p_gen1ju4indicatorer2yi4`: String
)

trait Json_stock_hk_eniu_indicatorResponse {

  implicit val a_stock_hk_eniu_indicatorResponse = new Decoder[stock_hk_eniu_indicatorResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hk_eniu_indicatorResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gen1ju4indicatorer2yi4 <- c.downField("").as[String]

      } yield {
        stock_hk_eniu_indicatorResponse(
          p_gen1ju4indicatorer2yi4
        )
      }
  }

}

object JsonItem_stock_hk_eniu_indicatorResponse extends Json_stock_hk_eniu_indicatorResponse
