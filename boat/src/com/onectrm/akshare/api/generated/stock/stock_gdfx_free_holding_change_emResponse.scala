package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_change_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gdfx_free_holding_change_em 目标地址:
  * https://data.eastmoney.com/gdfx/HoldingAnalyse.html 描述: 东方财富网-数据中心-股东分析-股东持股变动统计-十大流通股东 限量:
  * 单次返回指定 date 的所有数据
  */
case class Respstock_gdfx_free_holding_change_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4zong3chi2you3`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4xin1jin4`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4zeng1jia1`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4bu4bian4`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4jian3shao3`: Double,
  `p_liu2tong1shi4zhi2tong3ji4`: Double,
  `p_chi2you3ge4gu3`: String
)

case class stock_gdfx_free_holding_change_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4zong3chi2you3`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4xin1jin4`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4zeng1jia1`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4bu4bian4`: Double,
  `p_qi1mo4chi2gu3zhi3shu4tong3ji4jian3shao3`: Double,
  `p_liu2tong1shi4zhi2tong3ji4`: Double,
  `p_chi2you3ge4gu3`: String
)

trait Json_stock_gdfx_free_holding_change_emResponse {

  implicit val a_stock_gdfx_free_holding_change_emResponse =
    new Decoder[stock_gdfx_free_holding_change_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gdfx_free_holding_change_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

          p_gu3dong1lei4xing2 <- c.downField("股东类型").as[String]

          p_qi1mo4chi2gu3zhi3shu4tong3ji4zong3chi2you3 <- c.downField("期末持股只数统计-总持有").as[Double]

          p_qi1mo4chi2gu3zhi3shu4tong3ji4xin1jin4 <- c.downField("期末持股只数统计-新进").as[Double]

          p_qi1mo4chi2gu3zhi3shu4tong3ji4zeng1jia1 <- c.downField("期末持股只数统计-增加").as[Double]

          p_qi1mo4chi2gu3zhi3shu4tong3ji4bu4bian4 <- c.downField("期末持股只数统计-不变").as[Double]

          p_qi1mo4chi2gu3zhi3shu4tong3ji4jian3shao3 <- c.downField("期末持股只数统计-减少").as[Double]

          p_liu2tong1shi4zhi2tong3ji4 <- c.downField("流通市值统计").as[Double]

          p_chi2you3ge4gu3 <- c.downField("持有个股").as[String]

        } yield {
          stock_gdfx_free_holding_change_emResponse(
            p_xu4hao4,
            p_gu3dong1ming2cheng1,
            p_gu3dong1lei4xing2,
            p_qi1mo4chi2gu3zhi3shu4tong3ji4zong3chi2you3,
            p_qi1mo4chi2gu3zhi3shu4tong3ji4xin1jin4,
            p_qi1mo4chi2gu3zhi3shu4tong3ji4zeng1jia1,
            p_qi1mo4chi2gu3zhi3shu4tong3ji4bu4bian4,
            p_qi1mo4chi2gu3zhi3shu4tong3ji4jian3shao3,
            p_liu2tong1shi4zhi2tong3ji4,
            p_chi2you3ge4gu3
          )
        }
    }

}

object JsonItem_stock_gdfx_free_holding_change_emResponse
    extends Json_stock_gdfx_free_holding_change_emResponse
