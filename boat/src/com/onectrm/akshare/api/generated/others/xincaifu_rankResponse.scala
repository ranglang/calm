package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.xincaifu_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: xincaifu_rank 目标地址: http://www.xcf.cn/zhuanti/ztzz/hdzt1/500frb/index.html 描述:
  * 获取新财富 500 富豪榜, 从 2003 年至今 限量: 单次返回指定年份的富豪榜数据
  */
case class Respxincaifu_rankResponse(
  `p_pai2ming2`: Integer,
  `p_cai2fu4`: Double,
  `p_xing4ming2`: String,
  `p_zhu3yao4gong1si1`: String,
  `p_xiang1guan1xing2ye4`: String,
  `p_gong1si1zong3bu4`: String,
  `p_xing4bie2`: String,
  `p_nian2ling2`: String,
  `p_nian2fen4`: Integer
)

case class xincaifu_rankResponse(
  `p_pai2ming2`: Integer,
  `p_cai2fu4`: Double,
  `p_xing4ming2`: String,
  `p_zhu3yao4gong1si1`: String,
  `p_xiang1guan1xing2ye4`: String,
  `p_gong1si1zong3bu4`: String,
  `p_xing4bie2`: String,
  `p_nian2ling2`: String,
  `p_nian2fen4`: Integer
)

trait Json_xincaifu_rankResponse {

  implicit val a_xincaifu_rankResponse = new Decoder[xincaifu_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[xincaifu_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2ming2 <- c.downField("排名").as[Integer]

        p_cai2fu4 <- c.downField("财富").as[Double]

        p_xing4ming2 <- c.downField("姓名").as[String]

        p_zhu3yao4gong1si1 <- c.downField("主要公司").as[String]

        p_xiang1guan1xing2ye4 <- c.downField("相关行业").as[String]

        p_gong1si1zong3bu4 <- c.downField("公司总部").as[String]

        p_xing4bie2 <- c.downField("性别").as[String]

        p_nian2ling2 <- c.downField("年龄").as[String]

        p_nian2fen4 <- c.downField("年份").as[Integer]

      } yield {
        xincaifu_rankResponse(
          p_pai2ming2,
          p_cai2fu4,
          p_xing4ming2,
          p_zhu3yao4gong1si1,
          p_xiang1guan1xing2ye4,
          p_gong1si1zong3bu4,
          p_xing4bie2,
          p_nian2ling2,
          p_nian2fen4
        )
      }
  }

}

object JsonItem_xincaifu_rankResponse extends Json_xincaifu_rankResponse
