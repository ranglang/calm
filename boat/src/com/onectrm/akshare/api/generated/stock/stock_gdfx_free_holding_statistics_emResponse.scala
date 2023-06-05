package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gdfx_free_holding_statistics_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gdfx_free_holding_statistics_em 目标地址:
  * https://data.eastmoney.com/gdfx/HoldingAnalyse.html 描述: 东方财富网-数据中心-股东分析-股东持股统计-十大股东 限量: 单次返回指定
  * date 的所有数据
  */
case class Respstock_gdfx_free_holding_statistics_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_tong3ji4ci4shu4`: Integer,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4ping2jun1zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4da4zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4xiao3zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4ping2jun1zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4da4zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4xiao3zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4ping2jun1zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4da4zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4xiao3zhang3fu2`: Double,
  `p_chi2you3ge4gu3`: String
)

case class stock_gdfx_free_holding_statistics_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3dong1ming2cheng1`: String,
  `p_gu3dong1lei4xing2`: String,
  `p_tong3ji4ci4shu4`: Integer,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4ping2jun1zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4da4zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4xiao3zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4ping2jun1zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4da4zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4xiao3zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4ping2jun1zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4da4zhang3fu2`: Double,
  `p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4xiao3zhang3fu2`: Double,
  `p_chi2you3ge4gu3`: String
)

trait Json_stock_gdfx_free_holding_statistics_emResponse {

  implicit val a_stock_gdfx_free_holding_statistics_emResponse =
    new Decoder[stock_gdfx_free_holding_statistics_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gdfx_free_holding_statistics_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

          p_gu3dong1lei4xing2 <- c.downField("股东类型").as[String]

          p_tong3ji4ci4shu4 <- c.downField("统计次数").as[Integer]

          p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4ping2jun1zhang3fu2 <- c
            .downField("公告日后涨幅统计-10个交易日-平均涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4da4zhang3fu2 <- c
            .downField("公告日后涨幅统计-10个交易日-最大涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4xiao3zhang3fu2 <- c
            .downField("公告日后涨幅统计-10个交易日-最小涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4ping2jun1zhang3fu2 <- c
            .downField("公告日后涨幅统计-30个交易日-平均涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4da4zhang3fu2 <- c
            .downField("公告日后涨幅统计-30个交易日-最大涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4xiao3zhang3fu2 <- c
            .downField("公告日后涨幅统计-30个交易日-最小涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4ping2jun1zhang3fu2 <- c
            .downField("公告日后涨幅统计-60个交易日-平均涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4da4zhang3fu2 <- c
            .downField("公告日后涨幅统计-60个交易日-最大涨幅")
            .as[Double]

          p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4xiao3zhang3fu2 <- c
            .downField("公告日后涨幅统计-60个交易日-最小涨幅")
            .as[Double]

          p_chi2you3ge4gu3 <- c.downField("持有个股").as[String]

        } yield {
          stock_gdfx_free_holding_statistics_emResponse(
            p_xu4hao4,
            p_gu3dong1ming2cheng1,
            p_gu3dong1lei4xing2,
            p_tong3ji4ci4shu4,
            p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4ping2jun1zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4da4zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji410ge4jiao1yi4ri4zui4xiao3zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4ping2jun1zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4da4zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji430ge4jiao1yi4ri4zui4xiao3zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4ping2jun1zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4da4zhang3fu2,
            p_gong1gao4ri4hou4zhang3fu2tong3ji460ge4jiao1yi4ri4zui4xiao3zhang3fu2,
            p_chi2you3ge4gu3
          )
        }
    }

}

object JsonItem_stock_gdfx_free_holding_statistics_emResponse
    extends Json_stock_gdfx_free_holding_statistics_emResponse
