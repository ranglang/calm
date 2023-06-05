package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hold_control_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hold_control_cninfo 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics
  * 描述: 巨潮资讯-数据中心-专题统计-股东股本-实际控制人持股变动 限量: 单次指定 symbol 的实际控制人持股变动数据, 从 2010 开始
  */
case class Respstock_hold_control_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_shi2ji4kong4zhi4ren2ming2cheng1`: String,
  `p_kong4gu3shu4liang4`: Double,
  `p_kong4gu3bi3li4`: Double,
  `p_zhi2jie1kong4zhi4ren2ming2cheng1`: String,
  `p_kong4zhi4lei4xing2`: String
)

case class stock_hold_control_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_shi2ji4kong4zhi4ren2ming2cheng1`: String,
  `p_kong4gu3shu4liang4`: Double,
  `p_kong4gu3bi3li4`: Double,
  `p_zhi2jie1kong4zhi4ren2ming2cheng1`: String,
  `p_kong4zhi4lei4xing2`: String
)

trait Json_stock_hold_control_cninfoResponse {

  implicit val a_stock_hold_control_cninfoResponse =
    new Decoder[stock_hold_control_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_hold_control_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zheng4juan4dai4ma3 <- c.downField("证劵代码").as[String]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_bian4dong4ri4qi1 <- c.downField("变动日期").as[String]

          p_shi2ji4kong4zhi4ren2ming2cheng1 <- c.downField("实际控制人名称").as[String]

          p_kong4gu3shu4liang4 <- c.downField("控股数量").as[Double]

          p_kong4gu3bi3li4 <- c.downField("控股比例").as[Double]

          p_zhi2jie1kong4zhi4ren2ming2cheng1 <- c.downField("直接控制人名称").as[String]

          p_kong4zhi4lei4xing2 <- c.downField("控制类型").as[String]

        } yield {
          stock_hold_control_cninfoResponse(
            p_zheng4juan4dai4ma3,
            p_zheng4quan4jian3cheng1,
            p_bian4dong4ri4qi1,
            p_shi2ji4kong4zhi4ren2ming2cheng1,
            p_kong4gu3shu4liang4,
            p_kong4gu3bi3li4,
            p_zhi2jie1kong4zhi4ren2ming2cheng1,
            p_kong4zhi4lei4xing2
          )
        }
    }

}

object JsonItem_stock_hold_control_cninfoResponse extends Json_stock_hold_control_cninfoResponse
