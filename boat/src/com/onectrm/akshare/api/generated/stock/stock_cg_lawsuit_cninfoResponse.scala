package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_cg_lawsuit_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_cg_lawsuit_cninfo 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
  * 描述: 巨潮资讯-数据中心-专题统计-公司治理-公司诉讼 限量: 单次指定 symbol 和起始日期的公司诉讼数据
  */
case class Respstock_cg_lawsuit_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_gong1gao4tong3ji4qu1jian1`: String,
  `p_su4song4ci4shu4`: Integer,
  `p_su4song4jin1e2`: Double
)

case class stock_cg_lawsuit_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_gong1gao4tong3ji4qu1jian1`: String,
  `p_su4song4ci4shu4`: Integer,
  `p_su4song4jin1e2`: Double
)

trait Json_stock_cg_lawsuit_cninfoResponse {

  implicit val a_stock_cg_lawsuit_cninfoResponse = new Decoder[stock_cg_lawsuit_cninfoResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_cg_lawsuit_cninfoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4juan4dai4ma3 <- c.downField("证劵代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_gong1gao4tong3ji4qu1jian1 <- c.downField("公告统计区间").as[String]

        p_su4song4ci4shu4 <- c.downField("诉讼次数").as[Integer]

        p_su4song4jin1e2 <- c.downField("诉讼金额").as[Double]

      } yield {
        stock_cg_lawsuit_cninfoResponse(
          p_zheng4juan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_gong1gao4tong3ji4qu1jian1,
          p_su4song4ci4shu4,
          p_su4song4jin1e2
        )
      }
  }

}

object JsonItem_stock_cg_lawsuit_cninfoResponse extends Json_stock_cg_lawsuit_cninfoResponse
