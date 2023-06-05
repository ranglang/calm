package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_reserve_requirement_ratioResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_reserve_requirement_ratio 目标地址:
  * https://data.eastmoney.com/cjsj/ckzbj.html 描述: 国家统计局-存款准备金率 限量: 单次返回所有历史数据
  */
case class Respmacro_china_reserve_requirement_ratioResponse(
  `p_yue4fen4`: String,
  `p_da4xing2jin1rong2ji1gou4diao4zheng3hou4`: Double,
  `p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4`: Double
)

case class macro_china_reserve_requirement_ratioResponse(
  `p_yue4fen4`: String,
  `p_da4xing2jin1rong2ji1gou4diao4zheng3hou4`: Double,
  `p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4`: Double
)

trait Json_macro_china_reserve_requirement_ratioResponse {

  implicit val a_macro_china_reserve_requirement_ratioResponse =
    new Decoder[macro_china_reserve_requirement_ratioResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_reserve_requirement_ratioResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_yue4fen4 <- c.downField("月份").as[String]

          p_da4xing2jin1rong2ji1gou4diao4zheng3hou4 <- c.downField("大型金融机构-调整后").as[Double]

          p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4 <- c.downField("中小金融机构-调整后").as[Double]

        } yield {
          macro_china_reserve_requirement_ratioResponse(
            p_yue4fen4,
            p_da4xing2jin1rong2ji1gou4diao4zheng3hou4,
            p_zhong1xiao3jin1rong2ji1gou4diao4zheng3hou4
          )
        }
    }

}

object JsonItem_macro_china_reserve_requirement_ratioResponse
    extends Json_macro_china_reserve_requirement_ratioResponse
