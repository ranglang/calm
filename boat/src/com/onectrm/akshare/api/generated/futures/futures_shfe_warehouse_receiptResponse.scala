package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_shfe_warehouse_receiptResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_shfe_warehouse_receipt 目标地址:
  * http://www.shfe.com.cn/statements/dataview.html?paramid=dailystock&amp;paramdate=20200703 描述:
  * 提供上海期货交易所指定交割仓库期货仓单日报 限量: 单次返回当前交易日的所有仓单日报数据
  */
case class Respfutures_shfe_warehouse_receiptResponse(
  `p_jian4zhi2dui4zi4dian3`: String
)

case class futures_shfe_warehouse_receiptResponse(
  `p_jian4zhi2dui4zi4dian3`: String
)

trait Json_futures_shfe_warehouse_receiptResponse {

  implicit val a_futures_shfe_warehouse_receiptResponse =
    new Decoder[futures_shfe_warehouse_receiptResponse] {
      final def apply(c: HCursor): Decoder.Result[futures_shfe_warehouse_receiptResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_jian4zhi2dui4zi4dian3 <- c.downField("键值对字典").as[String]

        } yield {
          futures_shfe_warehouse_receiptResponse(
            p_jian4zhi2dui4zi4dian3
          )
        }
    }

}

object JsonItem_futures_shfe_warehouse_receiptResponse
    extends Json_futures_shfe_warehouse_receiptResponse
