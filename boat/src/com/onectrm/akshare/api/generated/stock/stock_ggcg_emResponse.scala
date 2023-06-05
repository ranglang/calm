package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_ggcg_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_ggcg_em 目标地址: http://data.eastmoney.com/executive/gdzjc.html 描述:
  * 东方财富网-数据中心-特色数据-高管持股 限量: 单次获取所有高管持股数据数据
  */
case class Respstock_ggcg_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_gu3dong1ming2cheng1`: String,
  `p_chi2gu3bian4dong4xin4xi1zeng1jian3`: Double,
  `p_chi2gu3bian4dong4xin4xi1bian4dong4shu4liang4`: Double,
  `p_chi2gu3bian4dong4xin4xi1zhan4zong3gu3ben3bi3li4`: Double,
  `p_chi2gu3bian4dong4xin4xi1zhan4liu2tong1gu3bi3li4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4chi2gu3zong3shu4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4zhan4zong3gu3ben3bi3li4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4chi2liu2tong1gu3shu4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4zhan4liu2tong1gu3bi3li4`: Double,
  `p_bian4dong4kai1shi3ri4`: String,
  `p_bian4dong4jie2zhi3ri4`: String,
  `p_gong1gao4ri4`: String
)

case class stock_ggcg_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_gu3dong1ming2cheng1`: String,
  `p_chi2gu3bian4dong4xin4xi1zeng1jian3`: Double,
  `p_chi2gu3bian4dong4xin4xi1bian4dong4shu4liang4`: Double,
  `p_chi2gu3bian4dong4xin4xi1zhan4zong3gu3ben3bi3li4`: Double,
  `p_chi2gu3bian4dong4xin4xi1zhan4liu2tong1gu3bi3li4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4chi2gu3zong3shu4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4zhan4zong3gu3ben3bi3li4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4chi2liu2tong1gu3shu4`: Double,
  `p_bian4dong4hou4chi2gu3qing2kuang4zhan4liu2tong1gu3bi3li4`: Double,
  `p_bian4dong4kai1shi3ri4`: String,
  `p_bian4dong4jie2zhi3ri4`: String,
  `p_gong1gao4ri4`: String
)

trait Json_stock_ggcg_emResponse {

  implicit val a_stock_ggcg_emResponse = new Decoder[stock_ggcg_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_ggcg_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

        p_chi2gu3bian4dong4xin4xi1zeng1jian3 <- c.downField("持股变动信息-增减").as[Double]

        p_chi2gu3bian4dong4xin4xi1bian4dong4shu4liang4 <- c.downField("持股变动信息-变动数量").as[Double]

        p_chi2gu3bian4dong4xin4xi1zhan4zong3gu3ben3bi3li4 <- c.downField("持股变动信息-占总股本比例").as[Double]

        p_chi2gu3bian4dong4xin4xi1zhan4liu2tong1gu3bi3li4 <- c.downField("持股变动信息-占流通股比例").as[Double]

        p_bian4dong4hou4chi2gu3qing2kuang4chi2gu3zong3shu4 <- c.downField("变动后持股情况-持股总数").as[Double]

        p_bian4dong4hou4chi2gu3qing2kuang4zhan4zong3gu3ben3bi3li4 <- c
          .downField("变动后持股情况-占总股本比例")
          .as[Double]

        p_bian4dong4hou4chi2gu3qing2kuang4chi2liu2tong1gu3shu4 <- c
          .downField("变动后持股情况-持流通股数")
          .as[Double]

        p_bian4dong4hou4chi2gu3qing2kuang4zhan4liu2tong1gu3bi3li4 <- c
          .downField("变动后持股情况-占流通股比例")
          .as[Double]

        p_bian4dong4kai1shi3ri4 <- c.downField("变动开始日").as[String]

        p_bian4dong4jie2zhi3ri4 <- c.downField("变动截止日").as[String]

        p_gong1gao4ri4 <- c.downField("公告日").as[String]

      } yield {
        stock_ggcg_emResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_gu3dong1ming2cheng1,
          p_chi2gu3bian4dong4xin4xi1zeng1jian3,
          p_chi2gu3bian4dong4xin4xi1bian4dong4shu4liang4,
          p_chi2gu3bian4dong4xin4xi1zhan4zong3gu3ben3bi3li4,
          p_chi2gu3bian4dong4xin4xi1zhan4liu2tong1gu3bi3li4,
          p_bian4dong4hou4chi2gu3qing2kuang4chi2gu3zong3shu4,
          p_bian4dong4hou4chi2gu3qing2kuang4zhan4zong3gu3ben3bi3li4,
          p_bian4dong4hou4chi2gu3qing2kuang4chi2liu2tong1gu3shu4,
          p_bian4dong4hou4chi2gu3qing2kuang4zhan4liu2tong1gu3bi3li4,
          p_bian4dong4kai1shi3ri4,
          p_bian4dong4jie2zhi3ri4,
          p_gong1gao4ri4
        )
      }
  }

}

object JsonItem_stock_ggcg_emResponse extends Json_stock_ggcg_emResponse
