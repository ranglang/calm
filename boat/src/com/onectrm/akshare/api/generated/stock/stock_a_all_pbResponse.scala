package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_all_pbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_all_pb 目标地址: https://www.legulegu.com/stockdata/all-pb 描述: 乐咕乐股-A
  * 股等权重与中位数市净率 限量: 单次返回所有数据
  */
case class Respstock_a_all_pbResponse(
  `p_date`: String,
  `p_middlePB`: Double,
  `p_equalWeightAveragePB`: Double,
  `p_close`: Double,
  `p_quantileInAllHistoryMiddlePB`: Double,
  `p_quantileInRecent10YearsMiddlePB`: Double,
  `p_quantileInAllHistoryEqualWeightAveragePB`: Double,
  `p_quantileInRecent10YearsEqualWeightAveragePB`: Double
)

case class stock_a_all_pbResponse(
  `p_date`: String,
  `p_middlePB`: Double,
  `p_equalWeightAveragePB`: Double,
  `p_close`: Double,
  `p_quantileInAllHistoryMiddlePB`: Double,
  `p_quantileInRecent10YearsMiddlePB`: Double,
  `p_quantileInAllHistoryEqualWeightAveragePB`: Double,
  `p_quantileInRecent10YearsEqualWeightAveragePB`: Double
)

trait Json_stock_a_all_pbResponse {

  implicit val a_stock_a_all_pbResponse = new Decoder[stock_a_all_pbResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_a_all_pbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_middlePB <- c.downField("middlePB").as[Double]

        p_equalWeightAveragePB <- c.downField("equalWeightAveragePB").as[Double]

        p_close <- c.downField("close").as[Double]

        p_quantileInAllHistoryMiddlePB <- c.downField("quantileInAllHistoryMiddlePB").as[Double]

        p_quantileInRecent10YearsMiddlePB <- c
          .downField("quantileInRecent10YearsMiddlePB")
          .as[Double]

        p_quantileInAllHistoryEqualWeightAveragePB <- c
          .downField("quantileInAllHistoryEqualWeightAveragePB")
          .as[Double]

        p_quantileInRecent10YearsEqualWeightAveragePB <- c
          .downField("quantileInRecent10YearsEqualWeightAveragePB")
          .as[Double]

      } yield {
        stock_a_all_pbResponse(
          p_date,
          p_middlePB,
          p_equalWeightAveragePB,
          p_close,
          p_quantileInAllHistoryMiddlePB,
          p_quantileInRecent10YearsMiddlePB,
          p_quantileInAllHistoryEqualWeightAveragePB,
          p_quantileInRecent10YearsEqualWeightAveragePB
        )
      }
  }

}

object JsonItem_stock_a_all_pbResponse extends Json_stock_a_all_pbResponse
