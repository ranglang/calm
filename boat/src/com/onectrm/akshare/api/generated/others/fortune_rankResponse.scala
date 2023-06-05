package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.fortune_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: fortune_rank 目标地址: http://www.fortunechina.com/fortune500/node_65.htm 描述:
  * 获取指定年份财富世界 500 强公司排行榜 限量: 单次返回某一个年份的所有历史数据
  */
case class Respfortune_rankResponse(
  `p_gong1si1ming2cheng1`: String,
  `p_ying2ye4shou1ru4`: Double,
  `p_li4run4`: Double,
  `p_guo2jia1`: Double
)

case class fortune_rankResponse(
  `p_gong1si1ming2cheng1`: String,
  `p_ying2ye4shou1ru4`: Double,
  `p_li4run4`: Double,
  `p_guo2jia1`: Double
)

trait Json_fortune_rankResponse {

  implicit val a_fortune_rankResponse = new Decoder[fortune_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[fortune_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gong1si1ming2cheng1 <- c.downField("公司名称").as[String]

        p_ying2ye4shou1ru4 <- c.downField("营业收入").as[Double]

        p_li4run4 <- c.downField("利润").as[Double]

        p_guo2jia1 <- c.downField("国家").as[Double]

      } yield {
        fortune_rankResponse(
          p_gong1si1ming2cheng1,
          p_ying2ye4shou1ru4,
          p_li4run4,
          p_guo2jia1
        )
      }
  }

}

object JsonItem_fortune_rankResponse extends Json_fortune_rankResponse
