package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_sy_hy_listResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_sy_hy_list 目标地址: http://data.eastmoney.com/sy/hylist.html 描述:
  * 获取东方财富网-数据中心-特色数据-商誉-行业商誉 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_em_sy_hy_listResponse(
  `p_xing2ye4ming2cheng1`: String,
  `p_gong1si1jia1shu4`: Double,
  `p_shang1yu4gui1mo2yuan2`: Double,
  `p_jing4zi1chan3yuan2`: Double,
  `p_shang1yu4gui1mo2zhan4jing4zi1chan3gui1mo2bi3li4`: Double,
  `p_jing4li4run4gui1mo2yuan2`: Double
)

case class stock_em_sy_hy_listResponse(
  `p_xing2ye4ming2cheng1`: String,
  `p_gong1si1jia1shu4`: Double,
  `p_shang1yu4gui1mo2yuan2`: Double,
  `p_jing4zi1chan3yuan2`: Double,
  `p_shang1yu4gui1mo2zhan4jing4zi1chan3gui1mo2bi3li4`: Double,
  `p_jing4li4run4gui1mo2yuan2`: Double
)

trait Json_stock_em_sy_hy_listResponse {

  implicit val a_stock_em_sy_hy_listResponse = new Decoder[stock_em_sy_hy_listResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_sy_hy_listResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xing2ye4ming2cheng1 <- c.downField("行业名称").as[String]

        p_gong1si1jia1shu4 <- c.downField("公司家数").as[Double]

        p_shang1yu4gui1mo2yuan2 <- c.downField("商誉规模(元)").as[Double]

        p_jing4zi1chan3yuan2 <- c.downField("净资产(元)").as[Double]

        p_shang1yu4gui1mo2zhan4jing4zi1chan3gui1mo2bi3li4 <- c
          .downField("商誉规模占净资产规模比例(%)")
          .as[Double]

        p_jing4li4run4gui1mo2yuan2 <- c.downField("净利润规模(元)").as[Double]

      } yield {
        stock_em_sy_hy_listResponse(
          p_xing2ye4ming2cheng1,
          p_gong1si1jia1shu4,
          p_shang1yu4gui1mo2yuan2,
          p_jing4zi1chan3yuan2,
          p_shang1yu4gui1mo2zhan4jing4zi1chan3gui1mo2bi3li4,
          p_jing4li4run4gui1mo2yuan2
        )
      }
  }

}

object JsonItem_stock_em_sy_hy_listResponse extends Json_stock_em_sy_hy_listResponse
