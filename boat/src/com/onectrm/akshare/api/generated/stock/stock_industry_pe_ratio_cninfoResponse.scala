package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_industry_pe_ratio_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_industry_pe_ratio_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/thematicStatistics 描述: 巨潮资讯-数据中心-行业分析-行业市盈率 限量:
  * 单次获取指定行业在指定交易日的所有数据
  */
case class Respstock_industry_pe_ratio_cninfoResponse(
  `p_bian4dong4ri4qi1`: String,
  `p_xing2ye4fen1lei4`: String,
  `p_xing2ye4ceng2ji2`: Integer,
  `p_xing2ye4bian1ma3`: String,
  `p_xing2ye4ming2cheng1`: String,
  `p_gong1si1shu4liang4`: Double,
  `p_na4ru4ji4suan4gong1si1shu4liang4`: Double,
  `p_zong3shi4zhi2jing4tai4`: Double,
  `p_jing4li4run4jing4tai4`: Double,
  `p_jing4tai4shi4ying2lu4jia1quan2ping2jun1`: Double,
  `p_jing4tai4shi4ying2lu4zhong1wei4shu4`: Double,
  `p_jing4tai4shi4ying2lu4suan4shu4ping2jun1`: Double
)

case class stock_industry_pe_ratio_cninfoResponse(
  `p_bian4dong4ri4qi1`: String,
  `p_xing2ye4fen1lei4`: String,
  `p_xing2ye4ceng2ji2`: Integer,
  `p_xing2ye4bian1ma3`: String,
  `p_xing2ye4ming2cheng1`: String,
  `p_gong1si1shu4liang4`: Double,
  `p_na4ru4ji4suan4gong1si1shu4liang4`: Double,
  `p_zong3shi4zhi2jing4tai4`: Double,
  `p_jing4li4run4jing4tai4`: Double,
  `p_jing4tai4shi4ying2lu4jia1quan2ping2jun1`: Double,
  `p_jing4tai4shi4ying2lu4zhong1wei4shu4`: Double,
  `p_jing4tai4shi4ying2lu4suan4shu4ping2jun1`: Double
)

trait Json_stock_industry_pe_ratio_cninfoResponse {

  implicit val a_stock_industry_pe_ratio_cninfoResponse =
    new Decoder[stock_industry_pe_ratio_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_industry_pe_ratio_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_bian4dong4ri4qi1 <- c.downField("变动日期").as[String]

          p_xing2ye4fen1lei4 <- c.downField("行业分类").as[String]

          p_xing2ye4ceng2ji2 <- c.downField("行业层级").as[Integer]

          p_xing2ye4bian1ma3 <- c.downField("行业编码").as[String]

          p_xing2ye4ming2cheng1 <- c.downField("行业名称").as[String]

          p_gong1si1shu4liang4 <- c.downField("公司数量").as[Double]

          p_na4ru4ji4suan4gong1si1shu4liang4 <- c.downField("纳入计算公司数量").as[Double]

          p_zong3shi4zhi2jing4tai4 <- c.downField("总市值-静态").as[Double]

          p_jing4li4run4jing4tai4 <- c.downField("净利润-静态").as[Double]

          p_jing4tai4shi4ying2lu4jia1quan2ping2jun1 <- c.downField("静态市盈率-加权平均").as[Double]

          p_jing4tai4shi4ying2lu4zhong1wei4shu4 <- c.downField("静态市盈率-中位数").as[Double]

          p_jing4tai4shi4ying2lu4suan4shu4ping2jun1 <- c.downField("静态市盈率-算术平均").as[Double]

        } yield {
          stock_industry_pe_ratio_cninfoResponse(
            p_bian4dong4ri4qi1,
            p_xing2ye4fen1lei4,
            p_xing2ye4ceng2ji2,
            p_xing2ye4bian1ma3,
            p_xing2ye4ming2cheng1,
            p_gong1si1shu4liang4,
            p_na4ru4ji4suan4gong1si1shu4liang4,
            p_zong3shi4zhi2jing4tai4,
            p_jing4li4run4jing4tai4,
            p_jing4tai4shi4ying2lu4jia1quan2ping2jun1,
            p_jing4tai4shi4ying2lu4zhong1wei4shu4,
            p_jing4tai4shi4ying2lu4suan4shu4ping2jun1
          )
        }
    }

}

object JsonItem_stock_industry_pe_ratio_cninfoResponse
    extends Json_stock_industry_pe_ratio_cninfoResponse
