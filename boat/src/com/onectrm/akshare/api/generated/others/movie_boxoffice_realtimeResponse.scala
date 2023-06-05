package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.movie_boxoffice_realtimeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: movie_boxoffice_realtime 目标地址:
  * https://www.endata.com.cn/BoxOffice/BO/RealTime/reTimeBO.html 描述: 当前时刻的实时电影票房数据, 每 5 分钟更新一次数据,
  * 实时票房包含今天未开映场次已售出的票房 限量: 当前时刻的实时票房数据
  */
case class Respmovie_boxoffice_realtimeResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_shi2shi2piao4fang2`: Double,
  `p_piao4fang2zhan4bi3`: Double,
  `p_shang4ying4tian1shu4`: Double,
  `p_lei3ji4piao4fang2`: Double
)

case class movie_boxoffice_realtimeResponse(
  `p_pai2xu4`: Double,
  `p_ying3pian4ming2cheng1`: Double,
  `p_shi2shi2piao4fang2`: Double,
  `p_piao4fang2zhan4bi3`: Double,
  `p_shang4ying4tian1shu4`: Double,
  `p_lei3ji4piao4fang2`: Double
)

trait Json_movie_boxoffice_realtimeResponse {

  implicit val a_movie_boxoffice_realtimeResponse = new Decoder[movie_boxoffice_realtimeResponse] {
    final def apply(c: HCursor): Decoder.Result[movie_boxoffice_realtimeResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2xu4 <- c.downField("排序").as[Double]

        p_ying3pian4ming2cheng1 <- c.downField("影片名称").as[Double]

        p_shi2shi2piao4fang2 <- c.downField("实时票房").as[Double]

        p_piao4fang2zhan4bi3 <- c.downField("票房占比").as[Double]

        p_shang4ying4tian1shu4 <- c.downField("上映天数").as[Double]

        p_lei3ji4piao4fang2 <- c.downField("累计票房").as[Double]

      } yield {
        movie_boxoffice_realtimeResponse(
          p_pai2xu4,
          p_ying3pian4ming2cheng1,
          p_shi2shi2piao4fang2,
          p_piao4fang2zhan4bi3,
          p_shang4ying4tian1shu4,
          p_lei3ji4piao4fang2
        )
      }
  }

}

object JsonItem_movie_boxoffice_realtimeResponse extends Json_movie_boxoffice_realtimeResponse
