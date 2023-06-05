package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_ah_nameResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_ah_name 目标地址:
  * http://stockapp.finance.qq.com/mstats/#mod=list&amp;id=hk_ah&amp;module=HK&amp;type=AH 描述: A+H
  * 股数据是从腾讯财经获取的数据, 历史数据按日频率更新 限量: 单次返回所有 A+H 上市公司的代码和名称字典
  */
case class Respstock_zh_ah_nameResponse(
  `p_zi4dian3`: String
)

case class stock_zh_ah_nameResponse(
  `p_zi4dian3`: String
)

trait Json_stock_zh_ah_nameResponse {

  implicit val a_stock_zh_ah_nameResponse = new Decoder[stock_zh_ah_nameResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_ah_nameResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zi4dian3 <- c.downField("字典").as[String]

      } yield {
        stock_zh_ah_nameResponse(
          p_zi4dian3
        )
      }
  }

}

object JsonItem_stock_zh_ah_nameResponse extends Json_stock_zh_ah_nameResponse
