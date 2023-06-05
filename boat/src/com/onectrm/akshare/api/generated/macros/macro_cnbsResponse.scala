package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_cnbsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_cnbs 目标地址: http://114.115.232.154:8080/ 描述: 中国国家金融与发展实验室-中国宏观杠杆率数据 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_cnbsResponse(
  `p_nian2fen4`: String,
  `p_ju1min2bu4men2`: Double,
  `p_fei1jin1rong2qi3ye4bu4men2`: Double,
  `p_zheng4fu3bu4men2`: Double,
  `p_zhong1yang1zheng4fu3`: Double,
  `p_di4fang1zheng4fu3`: Double,
  `p_shi2ti3jing1ji4bu4men2`: Double,
  `p_jin1rong2bu4men2zi1chan3fang1`: Double,
  `p_jin1rong2bu4men2fu4zhai4fang1`: Double
)

case class macro_cnbsResponse(
  `p_nian2fen4`: String,
  `p_ju1min2bu4men2`: Double,
  `p_fei1jin1rong2qi3ye4bu4men2`: Double,
  `p_zheng4fu3bu4men2`: Double,
  `p_zhong1yang1zheng4fu3`: Double,
  `p_di4fang1zheng4fu3`: Double,
  `p_shi2ti3jing1ji4bu4men2`: Double,
  `p_jin1rong2bu4men2zi1chan3fang1`: Double,
  `p_jin1rong2bu4men2fu4zhai4fang1`: Double
)

trait Json_macro_cnbsResponse {

  implicit val a_macro_cnbsResponse = new Decoder[macro_cnbsResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_cnbsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_nian2fen4 <- c.downField("年份").as[String]

        p_ju1min2bu4men2 <- c.downField("居民部门").as[Double]

        p_fei1jin1rong2qi3ye4bu4men2 <- c.downField("非金融企业部门").as[Double]

        p_zheng4fu3bu4men2 <- c.downField("政府部门").as[Double]

        p_zhong1yang1zheng4fu3 <- c.downField("中央政府").as[Double]

        p_di4fang1zheng4fu3 <- c.downField("地方政府").as[Double]

        p_shi2ti3jing1ji4bu4men2 <- c.downField("实体经济部门").as[Double]

        p_jin1rong2bu4men2zi1chan3fang1 <- c.downField("金融部门资产方").as[Double]

        p_jin1rong2bu4men2fu4zhai4fang1 <- c.downField("金融部门负债方").as[Double]

      } yield {
        macro_cnbsResponse(
          p_nian2fen4,
          p_ju1min2bu4men2,
          p_fei1jin1rong2qi3ye4bu4men2,
          p_zheng4fu3bu4men2,
          p_zhong1yang1zheng4fu3,
          p_di4fang1zheng4fu3,
          p_shi2ti3jing1ji4bu4men2,
          p_jin1rong2bu4men2zi1chan3fang1,
          p_jin1rong2bu4men2fu4zhai4fang1
        )
      }
  }

}

object JsonItem_macro_cnbsResponse extends Json_macro_cnbsResponse
