package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_institute_holdResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_institute_hold 目标地址:
  * http://vip.stock.finance.sina.com.cn/q/go.php/vComStockHold/kind/jgcg/index.phtml 描述:
  * 获取新浪财经-机构持股-机构持股一览表 限量: 单次获取新浪财经-机构持股-机构持股一览表所有数据
  */
case class Respstock_institute_holdResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_ji1gou4shu4`: Double,
  `p_ji1gou4shu4bian4hua4`: Double,
  `p_chi2gu3bi3li4`: Double,
  `p_chi2gu3bi3li4zeng1fu2`: Double,
  `p_zhan4liu2tong1gu3bi3li4`: Double,
  `p_zhan4liu2tong1gu3bi3li4zeng1fu2`: Double
)

case class stock_institute_holdResponse(
  `p_zheng4quan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_ji1gou4shu4`: Double,
  `p_ji1gou4shu4bian4hua4`: Double,
  `p_chi2gu3bi3li4`: Double,
  `p_chi2gu3bi3li4zeng1fu2`: Double,
  `p_zhan4liu2tong1gu3bi3li4`: Double,
  `p_zhan4liu2tong1gu3bi3li4zeng1fu2`: Double
)

trait Json_stock_institute_holdResponse {

  implicit val a_stock_institute_holdResponse = new Decoder[stock_institute_holdResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_institute_holdResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4quan4dai4ma3 <- c.downField("证券代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_ji1gou4shu4 <- c.downField("机构数").as[Double]

        p_ji1gou4shu4bian4hua4 <- c.downField("机构数变化").as[Double]

        p_chi2gu3bi3li4 <- c.downField("持股比例").as[Double]

        p_chi2gu3bi3li4zeng1fu2 <- c.downField("持股比例增幅").as[Double]

        p_zhan4liu2tong1gu3bi3li4 <- c.downField("占流通股比例").as[Double]

        p_zhan4liu2tong1gu3bi3li4zeng1fu2 <- c.downField("占流通股比例增幅").as[Double]

      } yield {
        stock_institute_holdResponse(
          p_zheng4quan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_ji1gou4shu4,
          p_ji1gou4shu4bian4hua4,
          p_chi2gu3bi3li4,
          p_chi2gu3bi3li4zeng1fu2,
          p_zhan4liu2tong1gu3bi3li4,
          p_zhan4liu2tong1gu3bi3li4zeng1fu2
        )
      }
  }

}

object JsonItem_stock_institute_holdResponse extends Json_stock_institute_holdResponse
