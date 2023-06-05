package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.sport_olympic_winter_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: sport_olympic_winter_hist 目标地址:
  * https://m.sports.qq.com/g/sv3/winter-oly22/winter-olympic-rank.htm?type=0 描述: 腾讯运动-冬奥会-历届奖牌榜 限量:
  * 单次返回 1924-2018 年度的冬奥会历届奖牌榜数据
  */
case class Respsport_olympic_winter_histResponse(
  `p_xu4hao4`: Integer,
  `p_ju3ban4nian2fen4`: String,
  `p_jie4shu4`: String,
  `p_ju3ban4di4dian3`: String,
  `p_guo2jia1ji2di4qu1`: String,
  `p_jin1pai2shu4`: Integer,
  `p_zong3jiang3pai2shu4`: Integer
)

case class sport_olympic_winter_histResponse(
  `p_xu4hao4`: Integer,
  `p_ju3ban4nian2fen4`: String,
  `p_jie4shu4`: String,
  `p_ju3ban4di4dian3`: String,
  `p_guo2jia1ji2di4qu1`: String,
  `p_jin1pai2shu4`: Integer,
  `p_zong3jiang3pai2shu4`: Integer
)

trait Json_sport_olympic_winter_histResponse {

  implicit val a_sport_olympic_winter_histResponse =
    new Decoder[sport_olympic_winter_histResponse] {
      final def apply(c: HCursor): Decoder.Result[sport_olympic_winter_histResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_ju3ban4nian2fen4 <- c.downField("举办年份").as[String]

          p_jie4shu4 <- c.downField("届数").as[String]

          p_ju3ban4di4dian3 <- c.downField("举办地点").as[String]

          p_guo2jia1ji2di4qu1 <- c.downField("国家及地区").as[String]

          p_jin1pai2shu4 <- c.downField("金牌数").as[Integer]

          p_zong3jiang3pai2shu4 <- c.downField("总奖牌数").as[Integer]

        } yield {
          sport_olympic_winter_histResponse(
            p_xu4hao4,
            p_ju3ban4nian2fen4,
            p_jie4shu4,
            p_ju3ban4di4dian3,
            p_guo2jia1ji2di4qu1,
            p_jin1pai2shu4,
            p_zong3jiang3pai2shu4
          )
        }
    }

}

object JsonItem_sport_olympic_winter_histResponse extends Json_sport_olympic_winter_histResponse
