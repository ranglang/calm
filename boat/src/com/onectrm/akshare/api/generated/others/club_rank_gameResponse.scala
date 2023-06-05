package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.club_rank_gameResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: club_rank_game 目标地址: http://rank.uuu9.com/ 描述: 中国电竞价值排行榜-俱乐部排名 限量: 返回当前的俱乐部排名数据
  */
case class Respclub_rank_gameResponse(
  `p_pai2ming2`: Integer,
  `p_ju4le4bu4ming2cheng1`: String,
  `p_ren2qi4zhi3shu4`: Integer,
  `p_yu2lun4zhi3shu4`: Integer,
  `p_zhan4ji4zhi3shu4`: Double,
  `p_zong1he2zhi3shu4`: Double,
  `p_pai2ming2bian4dong4`: Double,
  `p_geng4xin1shi2jian1`: String
)

case class club_rank_gameResponse(
  `p_pai2ming2`: Integer,
  `p_ju4le4bu4ming2cheng1`: String,
  `p_ren2qi4zhi3shu4`: Integer,
  `p_yu2lun4zhi3shu4`: Integer,
  `p_zhan4ji4zhi3shu4`: Double,
  `p_zong1he2zhi3shu4`: Double,
  `p_pai2ming2bian4dong4`: Double,
  `p_geng4xin1shi2jian1`: String
)

trait Json_club_rank_gameResponse {

  implicit val a_club_rank_gameResponse = new Decoder[club_rank_gameResponse] {
    final def apply(c: HCursor): Decoder.Result[club_rank_gameResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2ming2 <- c.downField("排名").as[Integer]

        p_ju4le4bu4ming2cheng1 <- c.downField("俱乐部名称").as[String]

        p_ren2qi4zhi3shu4 <- c.downField("人气指数").as[Integer]

        p_yu2lun4zhi3shu4 <- c.downField("舆论指数").as[Integer]

        p_zhan4ji4zhi3shu4 <- c.downField("战绩指数").as[Double]

        p_zong1he2zhi3shu4 <- c.downField("综合指数").as[Double]

        p_pai2ming2bian4dong4 <- c.downField("排名变动").as[Double]

        p_geng4xin1shi2jian1 <- c.downField("更新时间").as[String]

      } yield {
        club_rank_gameResponse(
          p_pai2ming2,
          p_ju4le4bu4ming2cheng1,
          p_ren2qi4zhi3shu4,
          p_yu2lun4zhi3shu4,
          p_zhan4ji4zhi3shu4,
          p_zong1he2zhi3shu4,
          p_pai2ming2bian4dong4,
          p_geng4xin1shi2jian1
        )
      }
  }

}

object JsonItem_club_rank_gameResponse extends Json_club_rank_gameResponse
