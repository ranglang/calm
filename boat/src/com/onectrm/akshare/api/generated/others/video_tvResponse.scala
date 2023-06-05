package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.video_tvResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: video_tv 目标地址: https://www.endata.com.cn/Video/index.html 描述: 艺恩-视频放映-电视剧集 限量:
  * 返回前一日的电视剧播映数据
  */
case class Respvideo_tvResponse(
  `p_pai2xu4`: Integer,
  `p_ming2cheng1`: String,
  `p_lei4xing2`: String,
  `p_bo1ying4zhi3shu4`: Double,
  `p_mei2ti3re4du4`: Double,
  `p_yong4hu4re4du4`: Double,
  `p_hao3ping2du4`: Double,
  `p_guan1kan4du4`: Double,
  `p_tong3ji4ri4qi1`: String
)

case class video_tvResponse(
  `p_pai2xu4`: Integer,
  `p_ming2cheng1`: String,
  `p_lei4xing2`: String,
  `p_bo1ying4zhi3shu4`: Double,
  `p_mei2ti3re4du4`: Double,
  `p_yong4hu4re4du4`: Double,
  `p_hao3ping2du4`: Double,
  `p_guan1kan4du4`: Double,
  `p_tong3ji4ri4qi1`: String
)

trait Json_video_tvResponse {

  implicit val a_video_tvResponse = new Decoder[video_tvResponse] {
    final def apply(c: HCursor): Decoder.Result[video_tvResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2xu4 <- c.downField("排序").as[Integer]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_lei4xing2 <- c.downField("类型").as[String]

        p_bo1ying4zhi3shu4 <- c.downField("播映指数").as[Double]

        p_mei2ti3re4du4 <- c.downField("媒体热度").as[Double]

        p_yong4hu4re4du4 <- c.downField("用户热度").as[Double]

        p_hao3ping2du4 <- c.downField("好评度").as[Double]

        p_guan1kan4du4 <- c.downField("观看度").as[Double]

        p_tong3ji4ri4qi1 <- c.downField("统计日期").as[String]

      } yield {
        video_tvResponse(
          p_pai2xu4,
          p_ming2cheng1,
          p_lei4xing2,
          p_bo1ying4zhi3shu4,
          p_mei2ti3re4du4,
          p_yong4hu4re4du4,
          p_hao3ping2du4,
          p_guan1kan4du4,
          p_tong3ji4ri4qi1
        )
      }
  }

}

object JsonItem_video_tvResponse extends Json_video_tvResponse
