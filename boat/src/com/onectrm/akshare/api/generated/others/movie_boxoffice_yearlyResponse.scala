package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_yearlyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_yearly 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/Year/index.html 描述: 指定日期所在年度的票房数据 限量: 指定日期所在年度的票房数据,
  * 只能获取最近年度的数据
  */
case class Respmovie_boxoffice_yearlyResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_lei4xing2`: Double,
  `p_zong3piao4fang2`: Double,
  `p_ping2jun1piao4jia4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_guo2jia1ji2di4qu1`: Double,
  `p_shang4ying4ri4qi1`: String
)

case class movie_boxoffice_yearlyResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_lei4xing2`: Double,
  `p_zong3piao4fang2`: Double,
  `p_ping2jun1piao4jia4`: Double,
  `p_chang3jun1ren2ci4`: Double,
  `p_guo2jia1ji2di4qu1`: Double,
  `p_shang4ying4ri4qi1`: String
)

trait Json_movie_boxoffice_yearlyResponse {

  implicit val a_movie_boxoffice_yearlyResponse = new Decoder[movie_boxoffice_yearlyResponse] {
    final def apply(c: HCursor): Decoder.Result[movie_boxoffice_yearlyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2xu4 <- c.downField("排序").as[Double]

        p_ying3pian4ming2cheng1 <- c.downField("影片名称").as[Double]

        p_lei4xing2 <- c.downField("类型").as[Double]

        p_zong3piao4fang2 <- c.downField("总票房").as[Double]

        p_ping2jun1piao4jia4 <- c.downField("平均票价").as[Double]

        p_chang3jun1ren2ci4 <- c.downField("场均人次").as[Double]

        p_guo2jia1ji2di4qu1 <- c.downField("国家及地区").as[Double]

        p_shang4ying4ri4qi1 <- c.downField("上映日期").as[String]

      } yield {
        movie_boxoffice_yearlyResponse(
          p_pai2xu4,
          p_ying3pian4ming2cheng1,
          p_lei4xing2,
          p_zong3piao4fang2,
          p_ping2jun1piao4jia4,
          p_chang3jun1ren2ci4,
          p_guo2jia1ji2di4qu1,
          p_shang4ying4ri4qi1
        )
      }
  }

}

object JsonItem_movie_boxoffice_yearlyResponse extends Json_movie_boxoffice_yearlyResponse
