package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_cg_equity_mortgage_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_cg_equity_mortgage_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics 描述: 巨潮资讯-数据中心-专题统计-公司治理-股权质押 限量: 单次指定 date
  * 的股权质押数据
  */
case class Respstock_cg_equity_mortgage_cninfoResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_chu1zhi4ren2`: String,
  `p_zhi4quan2ren2`: String,
  `p_zhi4ya1shu4liang4`: Double,
  `p_zhan4zong3gu3ben3bi3li4`: Double,
  `p_zhi4ya1jie3chu2shu4liang4`: Double,
  `p_zhi4ya1shi4xiang4`: String,
  `p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4`: Double
)

case class stock_cg_equity_mortgage_cninfoResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_chu1zhi4ren2`: String,
  `p_zhi4quan2ren2`: String,
  `p_zhi4ya1shu4liang4`: Double,
  `p_zhan4zong3gu3ben3bi3li4`: Double,
  `p_zhi4ya1jie3chu2shu4liang4`: Double,
  `p_zhi4ya1shi4xiang4`: String,
  `p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4`: Double
)

trait Json_stock_cg_equity_mortgage_cninfoResponse {

  implicit val a_stock_cg_equity_mortgage_cninfoResponse =
    new Decoder[stock_cg_equity_mortgage_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_cg_equity_mortgage_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

          p_chu1zhi4ren2 <- c.downField("出质人").as[String]

          p_zhi4quan2ren2 <- c.downField("质权人").as[String]

          p_zhi4ya1shu4liang4 <- c.downField("质押数量").as[Double]

          p_zhan4zong3gu3ben3bi3li4 <- c.downField("占总股本比例").as[Double]

          p_zhi4ya1jie3chu2shu4liang4 <- c.downField("质押解除数量").as[Double]

          p_zhi4ya1shi4xiang4 <- c.downField("质押事项").as[String]

          p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4 <- c.downField("累计质押占总股本比例").as[Double]

        } yield {
          stock_cg_equity_mortgage_cninfoResponse(
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_gong1gao4ri4qi1,
            p_chu1zhi4ren2,
            p_zhi4quan2ren2,
            p_zhi4ya1shu4liang4,
            p_zhan4zong3gu3ben3bi3li4,
            p_zhi4ya1jie3chu2shu4liang4,
            p_zhi4ya1shi4xiang4,
            p_lei3ji4zhi4ya1zhan4zong3gu3ben3bi3li4
          )
        }
    }

}

object JsonItem_stock_cg_equity_mortgage_cninfoResponse
    extends Json_stock_cg_equity_mortgage_cninfoResponse
