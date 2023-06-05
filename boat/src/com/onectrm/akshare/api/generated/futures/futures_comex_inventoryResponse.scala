package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_comex_inventoryResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_comex_inventory 目标地址: http://data.eastmoney.com/pmetal/comex/by.html
  * 描述: 东方财富网-数据中心-COMEX 库存的日数据 限量: 单次返回指定 symbol 的所有历史数据
  */
case class Respfutures_comex_inventoryResponse(
  `p_xu4hao4`: Integer,
  `p_ri4qi1`: String,
  `p_COMEXhuang2jin1ku4cun2liang41`: Double,
  `p_COMEXhuang2jin1ku4cun2liang42`: String
)

case class futures_comex_inventoryResponse(
  `p_xu4hao4`: Integer,
  `p_ri4qi1`: String,
  `p_COMEXhuang2jin1ku4cun2liang41`: Double,
  `p_COMEXhuang2jin1ku4cun2liang42`: String
)

trait Json_futures_comex_inventoryResponse {

  implicit val a_futures_comex_inventoryResponse = new Decoder[futures_comex_inventoryResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_comex_inventoryResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_COMEXhuang2jin1ku4cun2liang41 <- c.downField("COMEX黄金库存量_1").as[Double]

        p_COMEXhuang2jin1ku4cun2liang42 <- c.downField("COMEX黄金库存量_2").as[String]

      } yield {
        futures_comex_inventoryResponse(
          p_xu4hao4,
          p_ri4qi1,
          p_COMEXhuang2jin1ku4cun2liang41,
          p_COMEXhuang2jin1ku4cun2liang42
        )
      }
  }

}

object JsonItem_futures_comex_inventoryResponse extends Json_futures_comex_inventoryResponse
