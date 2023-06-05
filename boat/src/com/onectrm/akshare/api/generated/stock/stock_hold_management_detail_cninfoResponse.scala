package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hold_management_detail_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hold_management_detail_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics 描述: 巨潮资讯-数据中心-专题统计-股东股本-高管持股变动明细 限量: 单次指定
  * symbol 的高管持股变动明细数据, 返回近一年的数据
  */
case class Respstock_hold_management_detail_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_jie2zhi3ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_gao1guan3xing4ming2`: String,
  `p_dong3jian1gao1xing4ming2`: String,
  `p_dong3jian1gao1zhi2wu4`: String,
  `p_bian4dong4ren2yu3dong3jian1gao1guan1xi4`: String,
  `p_qi1chu1chi2gu3shu4liang4`: Double,
  `p_qi1mo4chi2gu3shu4liang4`: Double,
  `p_bian4dong4shu4liang4`: Double,
  `p_bian4dong4bi3li4`: Integer,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_qi1mo4shi4zhi2`: Double,
  `p_chi2gu3bian4dong4yuan2yin1`: String,
  `p_shu4ju4lai2yuan2`: String
)

case class stock_hold_management_detail_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_jie2zhi3ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String,
  `p_gao1guan3xing4ming2`: String,
  `p_dong3jian1gao1xing4ming2`: String,
  `p_dong3jian1gao1zhi2wu4`: String,
  `p_bian4dong4ren2yu3dong3jian1gao1guan1xi4`: String,
  `p_qi1chu1chi2gu3shu4liang4`: Double,
  `p_qi1mo4chi2gu3shu4liang4`: Double,
  `p_bian4dong4shu4liang4`: Double,
  `p_bian4dong4bi3li4`: Integer,
  `p_cheng2jiao1jun1jia4`: Double,
  `p_qi1mo4shi4zhi2`: Double,
  `p_chi2gu3bian4dong4yuan2yin1`: String,
  `p_shu4ju4lai2yuan2`: String
)

trait Json_stock_hold_management_detail_cninfoResponse {

  implicit val a_stock_hold_management_detail_cninfoResponse =
    new Decoder[stock_hold_management_detail_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_hold_management_detail_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zheng4juan4dai4ma3 <- c.downField("证劵代码").as[String]

          p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

          p_jie2zhi3ri4qi1 <- c.downField("截止日期").as[String]

          p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

          p_gao1guan3xing4ming2 <- c.downField("高管姓名").as[String]

          p_dong3jian1gao1xing4ming2 <- c.downField("董监高姓名").as[String]

          p_dong3jian1gao1zhi2wu4 <- c.downField("董监高职务").as[String]

          p_bian4dong4ren2yu3dong3jian1gao1guan1xi4 <- c.downField("变动人与董监高关系").as[String]

          p_qi1chu1chi2gu3shu4liang4 <- c.downField("期初持股数量").as[Double]

          p_qi1mo4chi2gu3shu4liang4 <- c.downField("期末持股数量").as[Double]

          p_bian4dong4shu4liang4 <- c.downField("变动数量").as[Double]

          p_bian4dong4bi3li4 <- c.downField("变动比例").as[Integer]

          p_cheng2jiao1jun1jia4 <- c.downField("成交均价").as[Double]

          p_qi1mo4shi4zhi2 <- c.downField("期末市值").as[Double]

          p_chi2gu3bian4dong4yuan2yin1 <- c.downField("持股变动原因").as[String]

          p_shu4ju4lai2yuan2 <- c.downField("数据来源").as[String]

        } yield {
          stock_hold_management_detail_cninfoResponse(
            p_zheng4juan4dai4ma3,
            p_zheng4quan4jian3cheng1,
            p_jie2zhi3ri4qi1,
            p_gong1gao4ri4qi1,
            p_gao1guan3xing4ming2,
            p_dong3jian1gao1xing4ming2,
            p_dong3jian1gao1zhi2wu4,
            p_bian4dong4ren2yu3dong3jian1gao1guan1xi4,
            p_qi1chu1chi2gu3shu4liang4,
            p_qi1mo4chi2gu3shu4liang4,
            p_bian4dong4shu4liang4,
            p_bian4dong4bi3li4,
            p_cheng2jiao1jun1jia4,
            p_qi1mo4shi4zhi2,
            p_chi2gu3bian4dong4yuan2yin1,
            p_shu4ju4lai2yuan2
          )
        }
    }

}

object JsonItem_stock_hold_management_detail_cninfoResponse
    extends Json_stock_hold_management_detail_cninfoResponse
