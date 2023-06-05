package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_report_industry_allocation_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_report_industry_allocation_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics 描述: 巨潮资讯-数据中心-专题统计-基金报表-基金行业配置 限量: 返回指定 date
  * 的所有数据; date 从 2017 年开始
  */
case class Respfund_report_industry_allocation_cninfoResponse(
  `p_xing2ye4bian1ma3`: String,
  `p_zheng4jian1hui4xing2ye4ming2cheng1`: String,
  `p_bao4gao4qi1`: String,
  `p_ji1jin1fu4gai4jia1shu4`: Integer,
  `p_xing2ye4gui1mo2`: Double,
  `p_zhan4jing4zi1chan3bi3li4`: Double
)

case class fund_report_industry_allocation_cninfoResponse(
  `p_xing2ye4bian1ma3`: String,
  `p_zheng4jian1hui4xing2ye4ming2cheng1`: String,
  `p_bao4gao4qi1`: String,
  `p_ji1jin1fu4gai4jia1shu4`: Integer,
  `p_xing2ye4gui1mo2`: Double,
  `p_zhan4jing4zi1chan3bi3li4`: Double
)

trait Json_fund_report_industry_allocation_cninfoResponse {

  implicit val a_fund_report_industry_allocation_cninfoResponse =
    new Decoder[fund_report_industry_allocation_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[fund_report_industry_allocation_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xing2ye4bian1ma3 <- c.downField("行业编码").as[String]

          p_zheng4jian1hui4xing2ye4ming2cheng1 <- c.downField("证监会行业名称").as[String]

          p_bao4gao4qi1 <- c.downField("报告期").as[String]

          p_ji1jin1fu4gai4jia1shu4 <- c.downField("基金覆盖家数").as[Integer]

          p_xing2ye4gui1mo2 <- c.downField("行业规模").as[Double]

          p_zhan4jing4zi1chan3bi3li4 <- c.downField("占净资产比例").as[Double]

        } yield {
          fund_report_industry_allocation_cninfoResponse(
            p_xing2ye4bian1ma3,
            p_zheng4jian1hui4xing2ye4ming2cheng1,
            p_bao4gao4qi1,
            p_ji1jin1fu4gai4jia1shu4,
            p_xing2ye4gui1mo2,
            p_zhan4jing4zi1chan3bi3li4
          )
        }
    }

}

object JsonItem_fund_report_industry_allocation_cninfoResponse
    extends Json_fund_report_industry_allocation_cninfoResponse
