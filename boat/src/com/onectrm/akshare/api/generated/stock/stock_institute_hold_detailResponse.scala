package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_institute_hold_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_institute_hold_detail 目标地址:
  * http://vip.stock.finance.sina.com.cn/q/go.php/vComStockHold/kind/jgcg/index.phtml 描述:
  * 获取新浪财经-机构持股-机构持股详情 限量: 单次获取新浪财经-机构持股-机构持股详情所有数据
  */
case class Respstock_institute_hold_detailResponse(
  `p_chi2gu3ji1gou4lei4xing2`: String,
  `p_chi2gu3ji1gou4dai4ma3`: String,
  `p_chi2gu3ji1gou4jian3cheng1`: Double,
  `p_chi2gu3ji1gou4quan2cheng1`: Double,
  `p_chi2gu3shu4`: Double,
  `p_zui4xin1chi2gu3shu4`: Double,
  `p_chi2gu3bi3li4`: Double,
  `p_zui4xin1chi2gu3bi3li4`: Double,
  `p_zhan4liu2tong1gu3bi3li4`: Double,
  `p_zui4xin1zhan4liu2tong1gu3bi3li4`: Double,
  `p_chi2gu3bi3li4zeng1fu2`: Double,
  `p_zhan4liu2tong1gu3bi3li4zeng1fu2`: Double
)

case class stock_institute_hold_detailResponse(
  `p_chi2gu3ji1gou4lei4xing2`: String,
  `p_chi2gu3ji1gou4dai4ma3`: String,
  `p_chi2gu3ji1gou4jian3cheng1`: Double,
  `p_chi2gu3ji1gou4quan2cheng1`: Double,
  `p_chi2gu3shu4`: Double,
  `p_zui4xin1chi2gu3shu4`: Double,
  `p_chi2gu3bi3li4`: Double,
  `p_zui4xin1chi2gu3bi3li4`: Double,
  `p_zhan4liu2tong1gu3bi3li4`: Double,
  `p_zui4xin1zhan4liu2tong1gu3bi3li4`: Double,
  `p_chi2gu3bi3li4zeng1fu2`: Double,
  `p_zhan4liu2tong1gu3bi3li4zeng1fu2`: Double
)

trait Json_stock_institute_hold_detailResponse {

  implicit val a_stock_institute_hold_detailResponse =
    new Decoder[stock_institute_hold_detailResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_institute_hold_detailResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_chi2gu3ji1gou4lei4xing2 <- c.downField("持股机构类型").as[String]

          p_chi2gu3ji1gou4dai4ma3 <- c.downField("持股机构代码").as[String]

          p_chi2gu3ji1gou4jian3cheng1 <- c.downField("持股机构简称").as[Double]

          p_chi2gu3ji1gou4quan2cheng1 <- c.downField("持股机构全称").as[Double]

          p_chi2gu3shu4 <- c.downField("持股数").as[Double]

          p_zui4xin1chi2gu3shu4 <- c.downField("最新持股数").as[Double]

          p_chi2gu3bi3li4 <- c.downField("持股比例").as[Double]

          p_zui4xin1chi2gu3bi3li4 <- c.downField("最新持股比例").as[Double]

          p_zhan4liu2tong1gu3bi3li4 <- c.downField("占流通股比例").as[Double]

          p_zui4xin1zhan4liu2tong1gu3bi3li4 <- c.downField("最新占流通股比例").as[Double]

          p_chi2gu3bi3li4zeng1fu2 <- c.downField("持股比例增幅").as[Double]

          p_zhan4liu2tong1gu3bi3li4zeng1fu2 <- c.downField("占流通股比例增幅").as[Double]

        } yield {
          stock_institute_hold_detailResponse(
            p_chi2gu3ji1gou4lei4xing2,
            p_chi2gu3ji1gou4dai4ma3,
            p_chi2gu3ji1gou4jian3cheng1,
            p_chi2gu3ji1gou4quan2cheng1,
            p_chi2gu3shu4,
            p_zui4xin1chi2gu3shu4,
            p_chi2gu3bi3li4,
            p_zui4xin1chi2gu3bi3li4,
            p_zhan4liu2tong1gu3bi3li4,
            p_zui4xin1zhan4liu2tong1gu3bi3li4,
            p_chi2gu3bi3li4zeng1fu2,
            p_zhan4liu2tong1gu3bi3li4zeng1fu2
          )
        }
    }

}

object JsonItem_stock_institute_hold_detailResponse extends Json_stock_institute_hold_detailResponse
