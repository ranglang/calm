package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_bond_publicResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_bond_public 目标地址: http://www.chinamoney.com.cn/chinese/xzjfx/ 描述:
  * 中国外汇交易中心暨全国银行间同业拆借中心-债券信息披露-新债发行; 近期债券发行数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_bond_publicResponse(
  `p_zhai4quan4quan2cheng1`: String,
  `p_zhai4quan4lei4xing2`: String,
  `p_fa1xing2ri4qi1`: String,
  `p_ji4xi1fang1shi4`: String,
  `p_jia4ge2`: Double,
  `p_zhai4quan4qi1xian4`: String,
  `p_ji4hua4fa1xing2liang4`: Double,
  `p_zhai4quan4ping2ji2`: String
)

case class macro_china_bond_publicResponse(
  `p_zhai4quan4quan2cheng1`: String,
  `p_zhai4quan4lei4xing2`: String,
  `p_fa1xing2ri4qi1`: String,
  `p_ji4xi1fang1shi4`: String,
  `p_jia4ge2`: Double,
  `p_zhai4quan4qi1xian4`: String,
  `p_ji4hua4fa1xing2liang4`: Double,
  `p_zhai4quan4ping2ji2`: String
)

trait Json_macro_china_bond_publicResponse {

  implicit val a_macro_china_bond_publicResponse = new Decoder[macro_china_bond_publicResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_bond_publicResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zhai4quan4quan2cheng1 <- c.downField("债券全称").as[String]

        p_zhai4quan4lei4xing2 <- c.downField("债券类型").as[String]

        p_fa1xing2ri4qi1 <- c.downField("发行日期").as[String]

        p_ji4xi1fang1shi4 <- c.downField("计息方式").as[String]

        p_jia4ge2 <- c.downField("价格").as[Double]

        p_zhai4quan4qi1xian4 <- c.downField("债券期限").as[String]

        p_ji4hua4fa1xing2liang4 <- c.downField("计划发行量").as[Double]

        p_zhai4quan4ping2ji2 <- c.downField("债券评级").as[String]

      } yield {
        macro_china_bond_publicResponse(
          p_zhai4quan4quan2cheng1,
          p_zhai4quan4lei4xing2,
          p_fa1xing2ri4qi1,
          p_ji4xi1fang1shi4,
          p_jia4ge2,
          p_zhai4quan4qi1xian4,
          p_ji4hua4fa1xing2liang4,
          p_zhai4quan4ping2ji2
        )
      }
  }

}

object JsonItem_macro_china_bond_publicResponse extends Json_macro_china_bond_publicResponse
