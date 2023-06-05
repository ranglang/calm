package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gdfx_holding_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gdfx_holding_detail_em 目标地址:
  * https://data.eastmoney.com/gdfx/HoldingAnalyse.html 描述: 东方财富网-数据中心-股东分析-股东持股明细-十大股东 限量: 单次返回指定
  * date 的所有数据
  */
case class Respstock_gdfx_holding_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_gu3dong1pai2ming2`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_bao4gao4qi1`: String,
  `p_qi1mo4chi2gu3shu4liang4`: Double,
  `p_qi1mo4chi2gu3chi2gu3zhan4liu2tong1gu3bi3`: Double,
  `p_qi1mo4chi2gu3shu4liang4bian4hua4`: Double,
  `p_qi1mo4chi2gu3shu4liang4bian4hua4bi3li4`: Double,
  `p_qi1mo4chi2gu3chi2gu3bian4dong4`: Double,
  `p_qi1mo4chi2gu3liu2tong1shi4zhi2`: Double,
  `p_gong1gao4ri4`: String
)

case class stock_gdfx_holding_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_gu3dong1pai2ming2`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_bao4gao4qi1`: String,
  `p_qi1mo4chi2gu3shu4liang4`: Double,
  `p_qi1mo4chi2gu3chi2gu3zhan4liu2tong1gu3bi3`: Double,
  `p_qi1mo4chi2gu3shu4liang4bian4hua4`: Double,
  `p_qi1mo4chi2gu3shu4liang4bian4hua4bi3li4`: Double,
  `p_qi1mo4chi2gu3chi2gu3bian4dong4`: Double,
  `p_qi1mo4chi2gu3liu2tong1shi4zhi2`: Double,
  `p_gong1gao4ri4`: String
)

trait Json_stock_gdfx_holding_detail_emResponse {

  implicit val a_stock_gdfx_holding_detail_emResponse =
    new Decoder[stock_gdfx_holding_detail_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gdfx_holding_detail_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

          p_gu3dong1lei4xing2 <- c.downField("股东类型").as[String]

          p_gu3dong1pai2ming2 <- c.downField("股东排名").as[String]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_bao4gao4qi1 <- c.downField("报告期").as[String]

          p_qi1mo4chi2gu3shu4liang4 <- c.downField("期末持股-数量").as[Double]

          p_qi1mo4chi2gu3chi2gu3zhan4liu2tong1gu3bi3 <- c.downField("期末持股-持股占流通股比").as[Double]

          p_qi1mo4chi2gu3shu4liang4bian4hua4 <- c.downField("期末持股-数量变化").as[Double]

          p_qi1mo4chi2gu3shu4liang4bian4hua4bi3li4 <- c.downField("期末持股-数量变化比例").as[Double]

          p_qi1mo4chi2gu3chi2gu3bian4dong4 <- c.downField("期末持股-持股变动").as[Double]

          p_qi1mo4chi2gu3liu2tong1shi4zhi2 <- c.downField("期末持股-流通市值").as[Double]

          p_gong1gao4ri4 <- c.downField("公告日").as[String]

        } yield {
          stock_gdfx_holding_detail_emResponse(
            p_xu4hao4,
            p_gu3dong1ming2cheng1,
            p_gu3dong1lei4xing2,
            p_gu3dong1pai2ming2,
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_bao4gao4qi1,
            p_qi1mo4chi2gu3shu4liang4,
            p_qi1mo4chi2gu3chi2gu3zhan4liu2tong1gu3bi3,
            p_qi1mo4chi2gu3shu4liang4bian4hua4,
            p_qi1mo4chi2gu3shu4liang4bian4hua4bi3li4,
            p_qi1mo4chi2gu3chi2gu3bian4dong4,
            p_qi1mo4chi2gu3liu2tong1shi4zhi2,
            p_gong1gao4ri4
          )
        }
    }

}

object JsonItem_stock_gdfx_holding_detail_emResponse
    extends Json_stock_gdfx_holding_detail_emResponse
