package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_yearly_first_weekResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_yearly_first_week 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/Year/firstWeek.html 描述: 指定日期所在年度的年度首周票房数据 限量:
  * 指定日期所在年度的年度首周票房数据, 只能获取最近年度的数据
  */
case class Respmovie_boxoffice_yearly_first_weekResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_lei4xing2`: Double,
  `p_shou3zhou1piao4fang2`: Double,
  `p_zhan4zong3piao4fang2bi3zhong4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_guo2jia1ji2di4qu1`: Double,
  `p_shang4ying4ri4qi1`: String,
  `p_shou3zhou1tian1shu4`: Double
)

case class movie_boxoffice_yearly_first_weekResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_lei4xing2`: Double,
  `p_shou3zhou1piao4fang2`: Double,
  `p_zhan4zong3piao4fang2bi3zhong4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_guo2jia1ji2di4qu1`: Double,
  `p_shang4ying4ri4qi1`: String,
  `p_shou3zhou1tian1shu4`: Double
)

trait Json_movie_boxoffice_yearly_first_weekResponse {

  implicit val a_movie_boxoffice_yearly_first_weekResponse =
    new Decoder[movie_boxoffice_yearly_first_weekResponse] {
      final def apply(c: HCursor): Decoder.Result[movie_boxoffice_yearly_first_weekResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_pai2xu4 <- c.downField("排序").as[Double]

          p_ying3pian4ming2cheng1 <- c.downField("影片名称").as[Double]

          p_lei4xing2 <- c.downField("类型").as[Double]

          p_shou3zhou1piao4fang2 <- c.downField("首周票房").as[Double]

          p_zhan4zong3piao4fang2bi3zhong4 <- c.downField("占总票房比重").as[Double]

          p_chang3jun1ren2ci4 <- c.downField("场均人次").as[Double]

          p_guo2jia1ji2di4qu1 <- c.downField("国家及地区").as[Double]

          p_shang4ying4ri4qi1 <- c.downField("上映日期").as[String]

          p_shou3zhou1tian1shu4 <- c.downField("首周天数").as[Double]

        } yield {
          movie_boxoffice_yearly_first_weekResponse(
            p_pai2xu4,
            p_ying3pian4ming2cheng1,
            p_lei4xing2,
            p_shou3zhou1piao4fang2,
            p_zhan4zong3piao4fang2bi3zhong4,
            p_chang3jun1ren2ci4,
            p_guo2jia1ji2di4qu1,
            p_shang4ying4ri4qi1,
            p_shou3zhou1tian1shu4
          )
        }
    }

}

object JsonItem_movie_boxoffice_yearly_first_weekResponse
    extends Json_movie_boxoffice_yearly_first_weekResponse
