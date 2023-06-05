package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_report_asset_allocation_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_report_asset_allocation_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics 描述: 巨潮资讯-数据中心-专题统计-基金报表-基金资产配置 限量: 返回所有基金资产配置数据
  */
case class Respfund_report_asset_allocation_cninfoResponse(
  `p_bao4gao4qi1`: String,
  `p_ji1jin1fu4gai4jia1shu4`: String,
  `p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4`: String,
  `p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4`: String,
  `p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4`: String,
  `p_ji1jin1shi4chang3jing4zi1chan3gui1mo2`: String
)

case class fund_report_asset_allocation_cninfoResponse(
  `p_bao4gao4qi1`: String,
  `p_ji1jin1fu4gai4jia1shu4`: String,
  `p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4`: String,
  `p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4`: String,
  `p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4`: String,
  `p_ji1jin1shi4chang3jing4zi1chan3gui1mo2`: String
)

trait Json_fund_report_asset_allocation_cninfoResponse {

  implicit val a_fund_report_asset_allocation_cninfoResponse =
    new Decoder[fund_report_asset_allocation_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[fund_report_asset_allocation_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_bao4gao4qi1 <- c.downField("报告期").as[String]

          p_ji1jin1fu4gai4jia1shu4 <- c.downField("基金覆盖家数").as[String]

          p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4 <- c.downField("股票权益类占净资产比例").as[String]

          p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4 <- c
            .downField("债券固定收益类占净资产比例")
            .as[String]

          p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4 <- c.downField("现金货币类占净资产比例").as[String]

          p_ji1jin1shi4chang3jing4zi1chan3gui1mo2 <- c.downField("基金市场净资产规模").as[String]

        } yield {
          fund_report_asset_allocation_cninfoResponse(
            p_bao4gao4qi1,
            p_ji1jin1fu4gai4jia1shu4,
            p_gu3piao4quan2yi4lei4zhan4jing4zi1chan3bi3li4,
            p_zhai4quan4gu4ding4shou1yi4lei4zhan4jing4zi1chan3bi3li4,
            p_xian4jin1huo4bi4lei4zhan4jing4zi1chan3bi3li4,
            p_ji1jin1shi4chang3jing4zi1chan3gui1mo2
          )
        }
    }

}

object JsonItem_fund_report_asset_allocation_cninfoResponse
    extends Json_fund_report_asset_allocation_cninfoResponse
