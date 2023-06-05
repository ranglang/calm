package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_cinema_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_cinema_daily 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/Cinema/day.html 描述: 指定日期的每日各影院的票房数据 限量: 指定日期各影院的票房数据,
  * 注意当前日期的数据需要第二日才可以获取
  */
case class Respmovie_boxoffice_cinema_dailyResponse(
  `p_pai2xu4`: Double,
  `p_ying3yuan4ming2cheng1`: Double,
  `p_dan1ri4piao4fang2`: Double,
  `p_dan1ri4chang3ci4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_chang3jun1piao4jia4`: Double,
  `p_shang4zuo4lu4`: Double
)

case class movie_boxoffice_cinema_dailyResponse(
  `p_pai2xu4`: Double,
  `p_ying3yuan4ming2cheng1`: Double,
  `p_dan1ri4piao4fang2`: Double,
  `p_dan1ri4chang3ci4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_chang3jun1piao4jia4`: Double,
  `p_shang4zuo4lu4`: Double
)

trait Json_movie_boxoffice_cinema_dailyResponse {

  implicit val a_movie_boxoffice_cinema_dailyResponse =
    new Decoder[movie_boxoffice_cinema_dailyResponse] {
      final def apply(c: HCursor): Decoder.Result[movie_boxoffice_cinema_dailyResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_pai2xu4 <- c.downField("排序").as[Double]

          p_ying3yuan4ming2cheng1 <- c.downField("影院名称").as[Double]

          p_dan1ri4piao4fang2 <- c.downField("单日票房").as[Double]

          p_dan1ri4chang3ci4 <- c.downField("单日场次").as[Double]

          p_chang3jun1ren2ci4 <- c.downField("场均人次").as[Double]

          p_chang3jun1piao4jia4 <- c.downField("场均票价").as[Double]

          p_shang4zuo4lu4 <- c.downField("上座率").as[Double]

        } yield {
          movie_boxoffice_cinema_dailyResponse(
            p_pai2xu4,
            p_ying3yuan4ming2cheng1,
            p_dan1ri4piao4fang2,
            p_dan1ri4chang3ci4,
            p_chang3jun1ren2ci4,
            p_chang3jun1piao4jia4,
            p_shang4zuo4lu4
          )
        }
    }

}

object JsonItem_movie_boxoffice_cinema_dailyResponse
    extends Json_movie_boxoffice_cinema_dailyResponse
