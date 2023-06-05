package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.migration_area_baiduResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: migration_area_baidu 目标地址: https://qianxi.baidu.com/?from=shoubai#city=0 描述:
  * 获取百度-百度地图慧眼-百度迁徙-迁入/迁出地数据接口 限量: 单次返回前 50 个城市, 由于百度接口限制, 目前只能返回前 50 个城市
  */
case class Respmigration_area_baiduResponse(
  `p_cityname`: String,
  `p_provincename`: String,
  `p_value`: String
)

case class migration_area_baiduResponse(
  `p_cityname`: String,
  `p_provincename`: String,
  `p_value`: String
)

trait Json_migration_area_baiduResponse {

  implicit val a_migration_area_baiduResponse = new Decoder[migration_area_baiduResponse] {
    final def apply(c: HCursor): Decoder.Result[migration_area_baiduResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_cityname <- c.downField("city_name").as[String]

        p_provincename <- c.downField("province_name").as[String]

        p_value <- c.downField("value").as[String]

      } yield {
        migration_area_baiduResponse(
          p_cityname,
          p_provincename,
          p_value
        )
      }
  }

}

object JsonItem_migration_area_baiduResponse extends Json_migration_area_baiduResponse
