package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_pbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_pb 目标地址: https://www.legulegu.com/stockdata/market_pb 描述: 乐咕乐股网站-A 股市净率
  * 限量: 单次获取指定 symbol 的所有数据
  */
case class Respstock_a_pbResponse(
  `p_date`: String,
  `p_equalWeightAveragePB`: Double,
  `p_middlePB`: Double,
  `p_weightingAveragePB`: Double,
  `p_close`: Double
)

case class stock_a_pbResponse(
  `p_date`: String,
  `p_equalWeightAveragePB`: Double,
  `p_middlePB`: Double,
  `p_weightingAveragePB`: Double,
  `p_close`: Double
)

trait Json_stock_a_pbResponse {

  implicit val a_stock_a_pbResponse = new Decoder[stock_a_pbResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_a_pbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_equalWeightAveragePB <- c.downField("equalWeightAveragePB").as[Double]

        p_middlePB <- c.downField("middlePB").as[Double]

        p_weightingAveragePB <- c.downField("weightingAveragePB").as[Double]

        p_close <- c.downField("close").as[Double]

      } yield {
        stock_a_pbResponse(
          p_date,
          p_equalWeightAveragePB,
          p_middlePB,
          p_weightingAveragePB,
          p_close
        )
      }
  }

}

object JsonItem_stock_a_pbResponse extends Json_stock_a_pbResponse
