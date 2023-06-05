package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_monthlyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_monthly 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/Month/oneMonth.html 描述: 获取指定日期所在月份的票房数据,
  * 每月5号更新上月票房，并补充之前两个月票房 限量: 指定日期所在月份的票房数据, 只能获取最近月份的数据
  */
case class Respmovie_boxoffice_monthlyResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_dan1yue4piao4fang2`: Double,
  `p_yue4du4zhan4bi3`: Double,
  `p_ping2jun1piao4jia4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_shang4ying4ri4qi1`: String,
  `p_kou3bei1zhi3shu4`: Double,
  `p_yue4nei4tian1shu4`: Double
)

case class movie_boxoffice_monthlyResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_dan1yue4piao4fang2`: Double,
  `p_yue4du4zhan4bi3`: Double,
  `p_ping2jun1piao4jia4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_shang4ying4ri4qi1`: String,
  `p_kou3bei1zhi3shu4`: Double,
  `p_yue4nei4tian1shu4`: Double
)

trait Json_movie_boxoffice_monthlyResponse {

  implicit val a_movie_boxoffice_monthlyResponse = new Decoder[movie_boxoffice_monthlyResponse] {
    final def apply(c: HCursor): Decoder.Result[movie_boxoffice_monthlyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2xu4 <- c.downField("排序").as[Double]

        p_ying3pian4ming2cheng1 <- c.downField("影片名称").as[Double]

        p_dan1yue4piao4fang2 <- c.downField("单月票房").as[Double]

        p_yue4du4zhan4bi3 <- c.downField("月度占比").as[Double]

        p_ping2jun1piao4jia4 <- c.downField("平均票价").as[Double]

        p_chang3jun1ren2ci4 <- c.downField("场均人次").as[Double]

        p_shang4ying4ri4qi1 <- c.downField("上映日期").as[String]

        p_kou3bei1zhi3shu4 <- c.downField("口碑指数").as[Double]

        p_yue4nei4tian1shu4 <- c.downField("月内天数").as[Double]

      } yield {
        movie_boxoffice_monthlyResponse(
          p_pai2xu4,
          p_ying3pian4ming2cheng1,
          p_dan1yue4piao4fang2,
          p_yue4du4zhan4bi3,
          p_ping2jun1piao4jia4,
          p_chang3jun1ren2ci4,
          p_shang4ying4ri4qi1,
          p_kou3bei1zhi3shu4,
          p_yue4nei4tian1shu4
        )
      }
  }

}

object JsonItem_movie_boxoffice_monthlyResponse extends Json_movie_boxoffice_monthlyResponse
