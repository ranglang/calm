package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_daily_energyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_daily_energy 目标地址:
  * https://datacenter.jin10.com/reportType/dc_qihuo_energy_report 描述: 获取中国日度沿海六大电库存数据,
  * 数据区间从20160101-至今, 不再更新, 只能获得历史数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_daily_energyResponse(
  `p_ri4qi1`: String,
  `p_shu4zhi2`: Double
)

case class macro_china_daily_energyResponse(
  `p_ri4qi1`: String,
  `p_shu4zhi2`: Double
)

trait Json_macro_china_daily_energyResponse {

  implicit val a_macro_china_daily_energyResponse = new Decoder[macro_china_daily_energyResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_daily_energyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_shu4zhi2 <- c.downField("数值").as[Double]

      } yield {
        macro_china_daily_energyResponse(
          p_ri4qi1,
          p_shu4zhi2
        )
      }
  }

}

object JsonItem_macro_china_daily_energyResponse extends Json_macro_china_daily_energyResponse
