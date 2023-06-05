package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.sport_olympic_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: sport_olympic_hist 目标地址:
  * https://www.kaggle.com/marcogdepinto/let-s-discover-more-about-the-olympic-games 描述: 奥运会-奖牌数据
  * 限量: 单次返回 1896-2016 年度的奥运奖牌数据
  */
case class Respsport_olympic_histResponse(
  `p_id`: Integer,
  `p_name`: String,
  `p_sex`: String,
  `p_age`: Double,
  `p_height`: Double,
  `p_weight`: Double,
  `p_team`: String,
  `p_noc`: String,
  `p_games`: String,
  `p_year`: Integer,
  `p_season`: String,
  `p_city`: String,
  `p_sport`: String,
  `p_event`: String,
  `p_medal`: String
)

case class sport_olympic_histResponse(
  `p_id`: Integer,
  `p_name`: String,
  `p_sex`: String,
  `p_age`: Double,
  `p_height`: Double,
  `p_weight`: Double,
  `p_team`: String,
  `p_noc`: String,
  `p_games`: String,
  `p_year`: Integer,
  `p_season`: String,
  `p_city`: String,
  `p_sport`: String,
  `p_event`: String,
  `p_medal`: String
)

trait Json_sport_olympic_histResponse {

  implicit val a_sport_olympic_histResponse = new Decoder[sport_olympic_histResponse] {
    final def apply(c: HCursor): Decoder.Result[sport_olympic_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_id <- c.downField("id").as[Integer]

        p_name <- c.downField("name").as[String]

        p_sex <- c.downField("sex").as[String]

        p_age <- c.downField("age").as[Double]

        p_height <- c.downField("height").as[Double]

        p_weight <- c.downField("weight").as[Double]

        p_team <- c.downField("team").as[String]

        p_noc <- c.downField("noc").as[String]

        p_games <- c.downField("games").as[String]

        p_year <- c.downField("year").as[Integer]

        p_season <- c.downField("season").as[String]

        p_city <- c.downField("city").as[String]

        p_sport <- c.downField("sport").as[String]

        p_event <- c.downField("event").as[String]

        p_medal <- c.downField("medal").as[String]

      } yield {
        sport_olympic_histResponse(
          p_id,
          p_name,
          p_sex,
          p_age,
          p_height,
          p_weight,
          p_team,
          p_noc,
          p_games,
          p_year,
          p_season,
          p_city,
          p_sport,
          p_event,
          p_medal
        )
      }
  }

}

object JsonItem_sport_olympic_histResponse extends Json_sport_olympic_histResponse
