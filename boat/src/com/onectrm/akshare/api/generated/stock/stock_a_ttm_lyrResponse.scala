package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_ttm_lyrResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_ttm_lyr 目标地址: https://www.legulegu.com/stockdata/a-ttm-lyr 描述: 乐咕乐股-A
  * 股等权重市盈率与中位数市盈率 限量: 单次返回所有数据
  */
case class Respstock_a_ttm_lyrResponse(
  `p_date`: String,
  `p_middlePETTM`: Double,
  `p_averagePETTM`: Double,
  `p_middlePELYR`: Double,
  `p_averagePELYR`: Double,
  `p_quantileInAllHistoryMiddlePeTtm`: Double,
  `p_quantileInRecent10YearsMiddlePeTtm`: Double,
  `p_quantileInAllHistoryAveragePeTtm`: Double,
  `p_quantileInRecent10YearsAveragePeTtm`: Double,
  `p_quantileInAllHistoryMiddlePeLyr`: Double,
  `p_quantileInRecent10YearsMiddlePeLyr`: Double,
  `p_quantileInAllHistoryAveragePeLyr`: Double,
  `p_quantileInRecent10YearsAveragePeLyr`: Double,
  `p_close`: Double
)

case class stock_a_ttm_lyrResponse(
  `p_date`: String,
  `p_middlePETTM`: Double,
  `p_averagePETTM`: Double,
  `p_middlePELYR`: Double,
  `p_averagePELYR`: Double,
  `p_quantileInAllHistoryMiddlePeTtm`: Double,
  `p_quantileInRecent10YearsMiddlePeTtm`: Double,
  `p_quantileInAllHistoryAveragePeTtm`: Double,
  `p_quantileInRecent10YearsAveragePeTtm`: Double,
  `p_quantileInAllHistoryMiddlePeLyr`: Double,
  `p_quantileInRecent10YearsMiddlePeLyr`: Double,
  `p_quantileInAllHistoryAveragePeLyr`: Double,
  `p_quantileInRecent10YearsAveragePeLyr`: Double,
  `p_close`: Double
)

trait Json_stock_a_ttm_lyrResponse {

  implicit val a_stock_a_ttm_lyrResponse = new Decoder[stock_a_ttm_lyrResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_a_ttm_lyrResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_middlePETTM <- c.downField("middlePETTM").as[Double]

        p_averagePETTM <- c.downField("averagePETTM").as[Double]

        p_middlePELYR <- c.downField("middlePELYR").as[Double]

        p_averagePELYR <- c.downField("averagePELYR").as[Double]

        p_quantileInAllHistoryMiddlePeTtm <- c
          .downField("quantileInAllHistoryMiddlePeTtm")
          .as[Double]

        p_quantileInRecent10YearsMiddlePeTtm <- c
          .downField("quantileInRecent10YearsMiddlePeTtm")
          .as[Double]

        p_quantileInAllHistoryAveragePeTtm <- c
          .downField("quantileInAllHistoryAveragePeTtm")
          .as[Double]

        p_quantileInRecent10YearsAveragePeTtm <- c
          .downField("quantileInRecent10YearsAveragePeTtm")
          .as[Double]

        p_quantileInAllHistoryMiddlePeLyr <- c
          .downField("quantileInAllHistoryMiddlePeLyr")
          .as[Double]

        p_quantileInRecent10YearsMiddlePeLyr <- c
          .downField("quantileInRecent10YearsMiddlePeLyr")
          .as[Double]

        p_quantileInAllHistoryAveragePeLyr <- c
          .downField("quantileInAllHistoryAveragePeLyr")
          .as[Double]

        p_quantileInRecent10YearsAveragePeLyr <- c
          .downField("quantileInRecent10YearsAveragePeLyr")
          .as[Double]

        p_close <- c.downField("close").as[Double]

      } yield {
        stock_a_ttm_lyrResponse(
          p_date,
          p_middlePETTM,
          p_averagePETTM,
          p_middlePELYR,
          p_averagePELYR,
          p_quantileInAllHistoryMiddlePeTtm,
          p_quantileInRecent10YearsMiddlePeTtm,
          p_quantileInAllHistoryAveragePeTtm,
          p_quantileInRecent10YearsAveragePeTtm,
          p_quantileInAllHistoryMiddlePeLyr,
          p_quantileInRecent10YearsMiddlePeLyr,
          p_quantileInAllHistoryAveragePeLyr,
          p_quantileInRecent10YearsAveragePeLyr,
          p_close
        )
      }
  }

}

object JsonItem_stock_a_ttm_lyrResponse extends Json_stock_a_ttm_lyrResponse
