package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.hurun_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: hurun_rank 目标地址: https://www.hurun.net/zh-CN/Rank/HsRankDetails?num=QWDD234E 描述:
  * 胡润百富榜单；富豪榜系列，创业系列，500强系列，特色系列 限量: 单次返回指定 indicator 和 year 的榜单数据
  */
case class Resphurun_rankResponse(
  `p_pai2ming2`: Integer,
  `p_cai2fu4`: Double,
  `p_xing4ming2`: String,
  `p_qi3ye4`: String,
  `p_xing2ye4`: String
)

case class hurun_rankResponse(
  `p_pai2ming2`: Integer,
  `p_cai2fu4`: Double,
  `p_xing4ming2`: String,
  `p_qi3ye4`: String,
  `p_xing2ye4`: String
)

trait Json_hurun_rankResponse {

  implicit val a_hurun_rankResponse = new Decoder[hurun_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[hurun_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2ming2 <- c.downField("排名").as[Integer]

        p_cai2fu4 <- c.downField("财富").as[Double]

        p_xing4ming2 <- c.downField("姓名").as[String]

        p_qi3ye4 <- c.downField("企业").as[String]

        p_xing2ye4 <- c.downField("行业").as[String]

      } yield {
        hurun_rankResponse(
          p_pai2ming2,
          p_cai2fu4,
          p_xing4ming2,
          p_qi3ye4,
          p_xing2ye4
        )
      }
  }

}

object JsonItem_hurun_rankResponse extends Json_hurun_rankResponse
