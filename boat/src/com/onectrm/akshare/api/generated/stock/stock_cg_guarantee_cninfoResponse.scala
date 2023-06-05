package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_cg_guarantee_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_cg_guarantee_cninfo 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
  * 描述: 巨潮资讯-数据中心-专题统计-公司治理-对外担保 限量: 单次指定 symbol 和起始日期的对外担保数据
  */
case class Respstock_cg_guarantee_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_gong1gao4tong3ji4qu1jian1`: String,
  `p_dan1bao3bi3shu4`: Integer,
  `p_dan1bao3jin1e2`: Double,
  `p_gui1shu3yu2mu3gong1si1suo3you3zhe3quan2yi4`: Double,
  `p_dan1bao3jin1rong2zhan4jing4zi1chan3bi3li4`: Double
)

case class stock_cg_guarantee_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_gong1gao4tong3ji4qu1jian1`: String,
  `p_dan1bao3bi3shu4`: Integer,
  `p_dan1bao3jin1e2`: Double,
  `p_gui1shu3yu2mu3gong1si1suo3you3zhe3quan2yi4`: Double,
  `p_dan1bao3jin1rong2zhan4jing4zi1chan3bi3li4`: Double
)

trait Json_stock_cg_guarantee_cninfoResponse {

  implicit val a_stock_cg_guarantee_cninfoResponse =
    new Decoder[stock_cg_guarantee_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_cg_guarantee_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zheng4juan4dai4ma3 <- c.downField("证劵代码").as[String]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_gong1gao4tong3ji4qu1jian1 <- c.downField("公告统计区间").as[String]

          p_dan1bao3bi3shu4 <- c.downField("担保笔数").as[Integer]

          p_dan1bao3jin1e2 <- c.downField("担保金额").as[Double]

          p_gui1shu3yu2mu3gong1si1suo3you3zhe3quan2yi4 <- c.downField("归属于母公司所有者权益").as[Double]

          p_dan1bao3jin1rong2zhan4jing4zi1chan3bi3li4 <- c.downField("担保金融占净资产比例").as[Double]

        } yield {
          stock_cg_guarantee_cninfoResponse(
            p_zheng4juan4dai4ma3,
            p_zheng4quan4jian3cheng1,
            p_gong1gao4tong3ji4qu1jian1,
            p_dan1bao3bi3shu4,
            p_dan1bao3jin1e2,
            p_gui1shu3yu2mu3gong1si1suo3you3zhe3quan2yi4,
            p_dan1bao3jin1rong2zhan4jing4zi1chan3bi3li4
          )
        }
    }

}

object JsonItem_stock_cg_guarantee_cninfoResponse extends Json_stock_cg_guarantee_cninfoResponse
