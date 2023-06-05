package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gdfx_top_10_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gdfx_top_10_em 目标地址:
  * https://emweb.securities.eastmoney.com/PC_HSF10/ShareholderResearch/Index?type=web&amp;code=SH688686#sdltgd-0
  * 描述: 东方财富网-个股-十大股东 限量: 单次返回指定 symbol 和 date 的所有数据
  */
case class Respstock_gdfx_top_10_emResponse(
  `p_ming2ci4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3fen4lei4xing2`: String,
  `p_chi2gu3shu4`: Integer,
  `p_zhan4zong3gu3ben3chi2gu3bi3li4`: Double,
  `p_zeng1jian3`: String,
  `p_bian4dong4bi3lu4`: Double
)

case class stock_gdfx_top_10_emResponse(
  `p_ming2ci4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3fen4lei4xing2`: String,
  `p_chi2gu3shu4`: Integer,
  `p_zhan4zong3gu3ben3chi2gu3bi3li4`: Double,
  `p_zeng1jian3`: String,
  `p_bian4dong4bi3lu4`: Double
)

trait Json_stock_gdfx_top_10_emResponse {

  implicit val a_stock_gdfx_top_10_emResponse = new Decoder[stock_gdfx_top_10_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_gdfx_top_10_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ming2ci4 <- c.downField("名次").as[Integer]

        p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

        p_gu3fen4lei4xing2 <- c.downField("股份类型").as[String]

        p_chi2gu3shu4 <- c.downField("持股数").as[Integer]

        p_zhan4zong3gu3ben3chi2gu3bi3li4 <- c.downField("占总股本持股比例").as[Double]

        p_zeng1jian3 <- c.downField("增减").as[String]

        p_bian4dong4bi3lu4 <- c.downField("变动比率").as[Double]

      } yield {
        stock_gdfx_top_10_emResponse(
          p_ming2ci4,
          p_gu3dong1ming2cheng1,
          p_gu3fen4lei4xing2,
          p_chi2gu3shu4,
          p_zhan4zong3gu3ben3chi2gu3bi3li4,
          p_zeng1jian3,
          p_bian4dong4bi3lu4
        )
      }
  }

}

object JsonItem_stock_gdfx_top_10_emResponse extends Json_stock_gdfx_top_10_emResponse
