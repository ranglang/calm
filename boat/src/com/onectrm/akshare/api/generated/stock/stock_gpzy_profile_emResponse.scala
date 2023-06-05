package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gpzy_profile_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gpzy_profile_em 目标地址: http://data.eastmoney.com/gpzy/marketProfile.aspx 描述:
  * 东方财富网-数据中心-特色数据-股权质押-股权质押市场概况 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_gpzy_profile_emResponse(
  `p_jiao1yi4ri4qi1`: String,
  `p_Agu3zhi4ya1zong3bi3li4`: Double,
  `p_zhi4ya1gong1si1shu4liang4`: Double,
  `p_zhi4ya1bi3shu4`: Double,
  `p_zhi4ya1zong3gu3shu4`: Double,
  `p_zhi4ya1zong3shi4zhi2`: Double,
  `p_hu4shen1300zhi3shu4`: Double,
  `p_zhang3die1fu2`: Double
)

case class stock_gpzy_profile_emResponse(
  `p_jiao1yi4ri4qi1`: String,
  `p_Agu3zhi4ya1zong3bi3li4`: Double,
  `p_zhi4ya1gong1si1shu4liang4`: Double,
  `p_zhi4ya1bi3shu4`: Double,
  `p_zhi4ya1zong3gu3shu4`: Double,
  `p_zhi4ya1zong3shi4zhi2`: Double,
  `p_hu4shen1300zhi3shu4`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_stock_gpzy_profile_emResponse {

  implicit val a_stock_gpzy_profile_emResponse = new Decoder[stock_gpzy_profile_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_gpzy_profile_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_Agu3zhi4ya1zong3bi3li4 <- c.downField("A股质押总比例").as[Double]

        p_zhi4ya1gong1si1shu4liang4 <- c.downField("质押公司数量").as[Double]

        p_zhi4ya1bi3shu4 <- c.downField("质押笔数").as[Double]

        p_zhi4ya1zong3gu3shu4 <- c.downField("质押总股数").as[Double]

        p_zhi4ya1zong3shi4zhi2 <- c.downField("质押总市值").as[Double]

        p_hu4shen1300zhi3shu4 <- c.downField("沪深300指数").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        stock_gpzy_profile_emResponse(
          p_jiao1yi4ri4qi1,
          p_Agu3zhi4ya1zong3bi3li4,
          p_zhi4ya1gong1si1shu4liang4,
          p_zhi4ya1bi3shu4,
          p_zhi4ya1zong3gu3shu4,
          p_zhi4ya1zong3shi4zhi2,
          p_hu4shen1300zhi3shu4,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_stock_gpzy_profile_emResponse extends Json_stock_gpzy_profile_emResponse
