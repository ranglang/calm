package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gpzy_industry_data_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gpzy_industry_data_em 目标地址:
  * http://data.eastmoney.com/gpzy/industryData.aspx 描述: 东方财富网-数据中心-特色数据-股权质押-上市公司质押比例-行业数据 限量:
  * 单次返回所有历史数据
  */
case class Respstock_gpzy_industry_data_emResponse(
  `p_xing2ye4`: String,
  `p_ping2jun1zhi4ya1bi3li4`: Double,
  `p_gong1si1jia1shu4`: Double,
  `p_zhi4ya1zong3bi3shu4`: Double,
  `p_zhi4ya1zong3gu3ben3`: Double,
  `p_zui4xin1zhi4ya1shi4zhi2`: Double,
  `p_tong3ji4shi2jian1`: String
)

case class stock_gpzy_industry_data_emResponse(
  `p_xing2ye4`: String,
  `p_ping2jun1zhi4ya1bi3li4`: Double,
  `p_gong1si1jia1shu4`: Double,
  `p_zhi4ya1zong3bi3shu4`: Double,
  `p_zhi4ya1zong3gu3ben3`: Double,
  `p_zui4xin1zhi4ya1shi4zhi2`: Double,
  `p_tong3ji4shi2jian1`: String
)

trait Json_stock_gpzy_industry_data_emResponse {

  implicit val a_stock_gpzy_industry_data_emResponse =
    new Decoder[stock_gpzy_industry_data_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gpzy_industry_data_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xing2ye4 <- c.downField("行业").as[String]

          p_ping2jun1zhi4ya1bi3li4 <- c.downField("平均质押比例").as[Double]

          p_gong1si1jia1shu4 <- c.downField("公司家数").as[Double]

          p_zhi4ya1zong3bi3shu4 <- c.downField("质押总笔数").as[Double]

          p_zhi4ya1zong3gu3ben3 <- c.downField("质押总股本").as[Double]

          p_zui4xin1zhi4ya1shi4zhi2 <- c.downField("最新质押市值").as[Double]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

        } yield {
          stock_gpzy_industry_data_emResponse(
            p_xing2ye4,
            p_ping2jun1zhi4ya1bi3li4,
            p_gong1si1jia1shu4,
            p_zhi4ya1zong3bi3shu4,
            p_zhi4ya1zong3gu3ben3,
            p_zui4xin1zhi4ya1shi4zhi2,
            p_tong3ji4shi2jian1
          )
        }
    }

}

object JsonItem_stock_gpzy_industry_data_emResponse extends Json_stock_gpzy_industry_data_emResponse
