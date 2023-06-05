package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_sy_profileResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_sy_profile 目标地址: http://data.eastmoney.com/sy/scgk.html 描述:
  * 获取东方财富网-数据中心-特色数据-商誉-A股商誉市场概况 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_em_sy_profileResponse(
  `p_bao4gao4qi1`: Double,
  `p_shang1yu4`: String,
  `p_shang1yu4jian3zhi2`: Double,
  `p_jing4zi1chan3`: Double,
  `p_shang1yu4zhan4jing4zi1chan3bi3li4`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4`: Double,
  `p_jing4li4run4gui1mo2`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4`: Double
)

case class stock_em_sy_profileResponse(
  `p_bao4gao4qi1`: Double,
  `p_shang1yu4`: String,
  `p_shang1yu4jian3zhi2`: Double,
  `p_jing4zi1chan3`: Double,
  `p_shang1yu4zhan4jing4zi1chan3bi3li4`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4`: Double,
  `p_jing4li4run4gui1mo2`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4`: Double
)

trait Json_stock_em_sy_profileResponse {

  implicit val a_stock_em_sy_profileResponse = new Decoder[stock_em_sy_profileResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_sy_profileResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_bao4gao4qi1 <- c.downField("报告期").as[Double]

        p_shang1yu4 <- c.downField("商誉").as[String]

        p_shang1yu4jian3zhi2 <- c.downField("商誉减值").as[Double]

        p_jing4zi1chan3 <- c.downField("净资产").as[Double]

        p_shang1yu4zhan4jing4zi1chan3bi3li4 <- c.downField("商誉占净资产比例").as[Double]

        p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4 <- c.downField("商誉减值占净资产比例").as[Double]

        p_jing4li4run4gui1mo2 <- c.downField("净利润规模").as[Double]

        p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4 <- c.downField("商誉减值占净利润比例").as[Double]

      } yield {
        stock_em_sy_profileResponse(
          p_bao4gao4qi1,
          p_shang1yu4,
          p_shang1yu4jian3zhi2,
          p_jing4zi1chan3,
          p_shang1yu4zhan4jing4zi1chan3bi3li4,
          p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4,
          p_jing4li4run4gui1mo2,
          p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4
        )
      }
  }

}

object JsonItem_stock_em_sy_profileResponse extends Json_stock_em_sy_profileResponse
