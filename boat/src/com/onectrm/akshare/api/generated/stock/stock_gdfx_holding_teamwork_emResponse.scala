package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_teamwork_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gdfx_holding_teamwork_em 目标地址:
  * https://data.eastmoney.com/gdfx/HoldingAnalyse.html 描述: 东方财富网-数据中心-股东分析-股东协同-十大股东 限量: 单次返回所有数据
  */
case class Respstock_gdfx_holding_teamwork_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_xie2tong2gu3dong1ming2cheng1`: String,
  `p_xie2tong2gu3dong1lei4xing2`: String,
  `p_xie2tong2ci4shu4`: Integer,
  `p_ge4gu3xiang2qing2`: String
)

case class stock_gdfx_holding_teamwork_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_xie2tong2gu3dong1ming2cheng1`: String,
  `p_xie2tong2gu3dong1lei4xing2`: String,
  `p_xie2tong2ci4shu4`: Integer,
  `p_ge4gu3xiang2qing2`: String
)

trait Json_stock_gdfx_holding_teamwork_emResponse {

  implicit val a_stock_gdfx_holding_teamwork_emResponse =
    new Decoder[stock_gdfx_holding_teamwork_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gdfx_holding_teamwork_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

          p_gu3dong1lei4xing2 <- c.downField("股东类型").as[String]

          p_xie2tong2gu3dong1ming2cheng1 <- c.downField("协同股东名称").as[String]

          p_xie2tong2gu3dong1lei4xing2 <- c.downField("协同股东类型").as[String]

          p_xie2tong2ci4shu4 <- c.downField("协同次数").as[Integer]

          p_ge4gu3xiang2qing2 <- c.downField("个股详情").as[String]

        } yield {
          stock_gdfx_holding_teamwork_emResponse(
            p_xu4hao4,
            p_gu3dong1ming2cheng1,
            p_gu3dong1lei4xing2,
            p_xie2tong2gu3dong1ming2cheng1,
            p_xie2tong2gu3dong1lei4xing2,
            p_xie2tong2ci4shu4,
            p_ge4gu3xiang2qing2
          )
        }
    }

}

object JsonItem_stock_gdfx_holding_teamwork_emResponse
    extends Json_stock_gdfx_holding_teamwork_emResponse
