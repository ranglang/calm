package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_a_pe_and_pbResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_a_pe_and_pb 目标地址: https://legulegu.com/stockdata/hs300-ttm-lyr
  * https://legulegu.com/stockdata/hs300-pb 描述:
  * 乐咕乐股-指定市场的A股的市盈率和市净率，包括等权和加权。目标的两个网页分别展示市盈率和市净率，但实际上是来自同一个API的数据 限量: 单次获取指定 market 的所有数据
  */
case class Respstock_a_pe_and_pbResponse(
  `p_date`: String,
  `p_addTtmPe`: Double,
  `p_middleAddTtmPe`: Double,
  `p_addLyrPe`: Double,
  `p_middleAddLyrPe`: Double,
  `p_addPb`: Double,
  `p_averageTtmPe`: Double,
  `p_averageLyrPe`: Double,
  `p_averagePb`: Double,
  `p_middleAveragePb`: Double,
  `p_close`: Double
)

case class stock_a_pe_and_pbResponse(
  `p_date`: String,
  `p_addTtmPe`: Double,
  `p_middleAddTtmPe`: Double,
  `p_addLyrPe`: Double,
  `p_middleAddLyrPe`: Double,
  `p_addPb`: Double,
  `p_averageTtmPe`: Double,
  `p_averageLyrPe`: Double,
  `p_averagePb`: Double,
  `p_middleAveragePb`: Double,
  `p_close`: Double
)

trait Json_stock_a_pe_and_pbResponse {

  implicit val a_stock_a_pe_and_pbResponse = new Decoder[stock_a_pe_and_pbResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_a_pe_and_pbResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_addTtmPe <- c.downField("addTtmPe").as[Double]

        p_middleAddTtmPe <- c.downField("middleAddTtmPe").as[Double]

        p_addLyrPe <- c.downField("addLyrPe").as[Double]

        p_middleAddLyrPe <- c.downField("middleAddLyrPe").as[Double]

        p_addPb <- c.downField("addPb").as[Double]

        p_averageTtmPe <- c.downField("averageTtmPe").as[Double]

        p_averageLyrPe <- c.downField("averageLyrPe").as[Double]

        p_averagePb <- c.downField("averagePb").as[Double]

        p_middleAveragePb <- c.downField("middleAveragePb").as[Double]

        p_close <- c.downField("close").as[Double]

      } yield {
        stock_a_pe_and_pbResponse(
          p_date,
          p_addTtmPe,
          p_middleAddTtmPe,
          p_addLyrPe,
          p_middleAddLyrPe,
          p_addPb,
          p_averageTtmPe,
          p_averageLyrPe,
          p_averagePb,
          p_middleAveragePb,
          p_close
        )
      }
  }

}

object JsonItem_stock_a_pe_and_pbResponse extends Json_stock_a_pe_and_pbResponse
