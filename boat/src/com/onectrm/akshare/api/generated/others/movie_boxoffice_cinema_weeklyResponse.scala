package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_cinema_weeklyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_cinema_weekly 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/Cinema/week.html 描述: 指定日期的完整周各影院的票房数据 限量:
  * 指定日期的完整周各影院的票房数据, 注意当前日期的数据只能返回上周的数据
  */
case class Respmovie_boxoffice_cinema_weeklyResponse(
  `p_pai2xu4`: Double,
  `p_ying3yuan4ming2cheng1`: Double,
  `p_dang1zhou1piao4fang2`: Double,
  `p_dan1yin2mu4piao4fang2`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_dan1ri4dan1ting1piao4fang2`: Double,
  `p_dan1ri4dan1ting1chang3ci4`: Double
)

case class movie_boxoffice_cinema_weeklyResponse(
  `p_pai2xu4`: Double,
  `p_ying3yuan4ming2cheng1`: Double,
  `p_dang1zhou1piao4fang2`: Double,
  `p_dan1yin2mu4piao4fang2`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_dan1ri4dan1ting1piao4fang2`: Double,
  `p_dan1ri4dan1ting1chang3ci4`: Double
)

trait Json_movie_boxoffice_cinema_weeklyResponse {

  implicit val a_movie_boxoffice_cinema_weeklyResponse =
    new Decoder[movie_boxoffice_cinema_weeklyResponse] {
      final def apply(c: HCursor): Decoder.Result[movie_boxoffice_cinema_weeklyResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_pai2xu4 <- c.downField("排序").as[Double]

          p_ying3yuan4ming2cheng1 <- c.downField("影院名称").as[Double]

          p_dang1zhou1piao4fang2 <- c.downField("当周票房").as[Double]

          p_dan1yin2mu4piao4fang2 <- c.downField("单银幕票房").as[Double]

          p_chang3jun1ren2ci4 <- c.downField("场均人次").as[Double]

          p_dan1ri4dan1ting1piao4fang2 <- c.downField("单日单厅票房").as[Double]

          p_dan1ri4dan1ting1chang3ci4 <- c.downField("单日单厅场次").as[Double]

        } yield {
          movie_boxoffice_cinema_weeklyResponse(
            p_pai2xu4,
            p_ying3yuan4ming2cheng1,
            p_dang1zhou1piao4fang2,
            p_dan1yin2mu4piao4fang2,
            p_chang3jun1ren2ci4,
            p_dan1ri4dan1ting1piao4fang2,
            p_dan1ri4dan1ting1chang3ci4
          )
        }
    }

}

object JsonItem_movie_boxoffice_cinema_weeklyResponse
    extends Json_movie_boxoffice_cinema_weeklyResponse
