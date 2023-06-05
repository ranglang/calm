package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_weeklyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_weekly 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/Week/oneWeek.html 描述: 指定日期所在完整周的票房数据,
  * 影片周票房数据初始更新周期为每周二，下周二补充数据 限量: 指定日期所在完整周的票房数据
  */
case class Respmovie_boxoffice_weeklyResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_pai2ming2bian4hua4`: Double,
  `p_dan1zhou1piao4fang2`: Double,
  `p_huan2bi3bian4hua4`: Double,
  `p_lei3ji4piao4fang2`: Double,
  `p_ping2jun1piao4jia4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_kou3bei1zhi3shu4`: Double,
  `p_shang4ying4tian1shu4`: Double
)

case class movie_boxoffice_weeklyResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_pai2ming2bian4hua4`: Double,
  `p_dan1zhou1piao4fang2`: Double,
  `p_huan2bi3bian4hua4`: Double,
  `p_lei3ji4piao4fang2`: Double,
  `p_ping2jun1piao4jia4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_kou3bei1zhi3shu4`: Double,
  `p_shang4ying4tian1shu4`: Double
)

trait Json_movie_boxoffice_weeklyResponse {

  implicit val a_movie_boxoffice_weeklyResponse = new Decoder[movie_boxoffice_weeklyResponse] {
    final def apply(c: HCursor): Decoder.Result[movie_boxoffice_weeklyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2xu4 <- c.downField("排序").as[Double]

        p_ying3pian4ming2cheng1 <- c.downField("影片名称").as[Double]

        p_pai2ming2bian4hua4 <- c.downField("排名变化").as[Double]

        p_dan1zhou1piao4fang2 <- c.downField("单周票房").as[Double]

        p_huan2bi3bian4hua4 <- c.downField("环比变化").as[Double]

        p_lei3ji4piao4fang2 <- c.downField("累计票房").as[Double]

        p_ping2jun1piao4jia4 <- c.downField("平均票价").as[Double]

        p_chang3jun1ren2ci4 <- c.downField("场均人次").as[Double]

        p_kou3bei1zhi3shu4 <- c.downField("口碑指数").as[Double]

        p_shang4ying4tian1shu4 <- c.downField("上映天数").as[Double]

      } yield {
        movie_boxoffice_weeklyResponse(
          p_pai2xu4,
          p_ying3pian4ming2cheng1,
          p_pai2ming2bian4hua4,
          p_dan1zhou1piao4fang2,
          p_huan2bi3bian4hua4,
          p_lei3ji4piao4fang2,
          p_ping2jun1piao4jia4,
          p_chang3jun1ren2ci4,
          p_kou3bei1zhi3shu4,
          p_shang4ying4tian1shu4
        )
      }
  }

}

object JsonItem_movie_boxoffice_weeklyResponse extends Json_movie_boxoffice_weeklyResponse
