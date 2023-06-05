package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.car_cpca_energy_saleResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: car_cpca_energy_sale 目标地址: http://data.cpcaauto.com/FuelMarket 描述:
  * 乘联会-新能源细分市场汽车销量数据 限量: 单次返回本年度和上年度月份的销量数据
  */
case class Respcar_cpca_energy_saleResponse(
  `p_yue4fen4`: String,
  `p_qian2yi1ge4nian2fen4nian2`: Double,
  `p_dang1qian2nian2fen4nian2`: Double
)

case class car_cpca_energy_saleResponse(
  `p_yue4fen4`: String,
  `p_qian2yi1ge4nian2fen4nian2`: Double,
  `p_dang1qian2nian2fen4nian2`: Double
)

trait Json_car_cpca_energy_saleResponse {

  implicit val a_car_cpca_energy_saleResponse = new Decoder[car_cpca_energy_saleResponse] {
    final def apply(c: HCursor): Decoder.Result[car_cpca_energy_saleResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_qian2yi1ge4nian2fen4nian2 <- c.downField("{前一个年份}年").as[Double]

        p_dang1qian2nian2fen4nian2 <- c.downField("{当前年份}年").as[Double]

      } yield {
        car_cpca_energy_saleResponse(
          p_yue4fen4,
          p_qian2yi1ge4nian2fen4nian2,
          p_dang1qian2nian2fen4nian2
        )
      }
  }

}

object JsonItem_car_cpca_energy_saleResponse extends Json_car_cpca_energy_saleResponse
