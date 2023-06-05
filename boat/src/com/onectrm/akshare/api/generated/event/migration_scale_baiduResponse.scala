package com.onectrm.akshare.api.generated.event;

import com.onectrm.akshare.api.generated.event.migration_scale_baiduResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: event 接口: migration_scale_baidu 目标地址: https://qianxi.baidu.com/?from=shoubai#city=0 描述:
  * 获取百度-百度地图慧眼-百度迁徙-迁徙规模 限量: 单次返回当前城市的去年和今年的迁徙规模数据, 查询参数中的 **start_date** 不要随意更改
  */
case class Respmigration_scale_baiduResponse(
  `p_ri4qi1`: String,
  `p_qian1xi3gui1mo2zhi3shu4`: String
)

case class migration_scale_baiduResponse(
  `p_ri4qi1`: String,
  `p_qian1xi3gui1mo2zhi3shu4`: String
)

trait Json_migration_scale_baiduResponse {

  implicit val a_migration_scale_baiduResponse = new Decoder[migration_scale_baiduResponse] {
    final def apply(c: HCursor): Decoder.Result[migration_scale_baiduResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_qian1xi3gui1mo2zhi3shu4 <- c.downField("迁徙规模指数").as[String]

      } yield {
        migration_scale_baiduResponse(
          p_ri4qi1,
          p_qian1xi3gui1mo2zhi3shu4
        )
      }
  }

}

object JsonItem_migration_scale_baiduResponse extends Json_migration_scale_baiduResponse
