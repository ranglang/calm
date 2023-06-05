package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_gpzy_distribute_statistics_companyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_gpzy_distribute_statistics_company 目标地址:
  * http://data.eastmoney.com/gpzy/distributeStatistics.aspx 描述:
  * 获取东方财富网-数据中心-特色数据-股权质押-质押机构分布统计-证券公司 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_em_gpzy_distribute_statistics_companyResponse(
  `p_zhi4ya1gong1si1gu3piao4dai4ma3`: String,
  `p_zhi4ya1ji1gou4`: Double,
  `p_xing2ye4ming2cheng1`: Double,
  `p_zhi4ya1gong1si1shu4liang4`: Double,
  `p_zhi4ya1bi3shu4`: Double,
  `p_zhi4ya1shu4liang4gu3`: Double,
  `p_wei4da2yu4jing3xian4bi3li4`: Double,
  `p_da2dao4yu4jing3xian4wei4da2ping2cang1xian4bi3li4`: Double,
  `p_da2dao4ping2cang1xian4bi3li4`: Double
)

case class stock_em_gpzy_distribute_statistics_companyResponse(
  `p_zhi4ya1gong1si1gu3piao4dai4ma3`: String,
  `p_zhi4ya1ji1gou4`: Double,
  `p_xing2ye4ming2cheng1`: Double,
  `p_zhi4ya1gong1si1shu4liang4`: Double,
  `p_zhi4ya1bi3shu4`: Double,
  `p_zhi4ya1shu4liang4gu3`: Double,
  `p_wei4da2yu4jing3xian4bi3li4`: Double,
  `p_da2dao4yu4jing3xian4wei4da2ping2cang1xian4bi3li4`: Double,
  `p_da2dao4ping2cang1xian4bi3li4`: Double
)

trait Json_stock_em_gpzy_distribute_statistics_companyResponse {

  implicit val a_stock_em_gpzy_distribute_statistics_companyResponse =
    new Decoder[stock_em_gpzy_distribute_statistics_companyResponse] {
      final def apply(
        c: HCursor
      ): Decoder.Result[stock_em_gpzy_distribute_statistics_companyResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_zhi4ya1gong1si1gu3piao4dai4ma3 <- c.downField("质押公司股票代码").as[String]

          p_zhi4ya1ji1gou4 <- c.downField("质押机构").as[Double]

          p_xing2ye4ming2cheng1 <- c.downField("行业名称").as[Double]

          p_zhi4ya1gong1si1shu4liang4 <- c.downField("质押公司数量").as[Double]

          p_zhi4ya1bi3shu4 <- c.downField("质押笔数").as[Double]

          p_zhi4ya1shu4liang4gu3 <- c.downField("质押数量(股)").as[Double]

          p_wei4da2yu4jing3xian4bi3li4 <- c.downField("未达预警线比例(%)").as[Double]

          p_da2dao4yu4jing3xian4wei4da2ping2cang1xian4bi3li4 <- c
            .downField("达到预警线未达平仓线比例(%)")
            .as[Double]

          p_da2dao4ping2cang1xian4bi3li4 <- c.downField("达到平仓线比例(%)").as[Double]

        } yield {
          stock_em_gpzy_distribute_statistics_companyResponse(
            p_zhi4ya1gong1si1gu3piao4dai4ma3,
            p_zhi4ya1ji1gou4,
            p_xing2ye4ming2cheng1,
            p_zhi4ya1gong1si1shu4liang4,
            p_zhi4ya1bi3shu4,
            p_zhi4ya1shu4liang4gu3,
            p_wei4da2yu4jing3xian4bi3li4,
            p_da2dao4yu4jing3xian4wei4da2ping2cang1xian4bi3li4,
            p_da2dao4ping2cang1xian4bi3li4
          )
        }
    }

}

object JsonItem_stock_em_gpzy_distribute_statistics_companyResponse
    extends Json_stock_em_gpzy_distribute_statistics_companyResponse
