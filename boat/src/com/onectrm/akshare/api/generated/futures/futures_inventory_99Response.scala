package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_inventory_99Response
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_inventory_99 目标地址: http://www.99qh.com/d/store.aspx 描述: 99
  * 期货网-大宗商品库存数据; 周频率 限量: 单次返回指定 exchange 和指定 symbol 的具体品种的期货库存数据, 仓单日报数据
  */
case class Respfutures_inventory_99Response(
  `p_ri4qi1`: String,
  `p_ku4cun2`: Double,
  `p_zeng1jian3`: Double
)

case class futures_inventory_99Response(
  `p_ri4qi1`: String,
  `p_ku4cun2`: Double,
  `p_zeng1jian3`: Double
)

trait Json_futures_inventory_99Response {

  implicit val a_futures_inventory_99Response = new Decoder[futures_inventory_99Response] {
    final def apply(c: HCursor): Decoder.Result[futures_inventory_99Response] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ku4cun2 <- c.downField("库存").as[Double]

        p_zeng1jian3 <- c.downField("增减").as[Double]

      } yield {
        futures_inventory_99Response(
          p_ri4qi1,
          p_ku4cun2,
          p_zeng1jian3
        )
      }
  }

}

object JsonItem_futures_inventory_99Response extends Json_futures_inventory_99Response
