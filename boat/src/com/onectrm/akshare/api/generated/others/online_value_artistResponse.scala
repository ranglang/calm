package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.online_value_artistResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: online_value_artist 目标地址:
  * https://www.endata.com.cn/Marketing/Artist/business.html 描述: 艺恩-艺人-艺人流量价值 限量: 返回当前的艺人流量价值数据
  */
case class Responline_value_artistResponse(
  `p_pai2ming2`: Integer,
  `p_yi4ren2`: String,
  `p_liu2liang4jia4zhi2`: Double,
  `p_zhuan1ye4re4du4`: Double,
  `p_guan1zhu4re4du4`: Double,
  `p_yu4ce4re4du4`: Double,
  `p_dai4huo4li4`: Double,
  `p_tong3ji4ri4qi1`: String
)

case class online_value_artistResponse(
  `p_pai2ming2`: Integer,
  `p_yi4ren2`: String,
  `p_liu2liang4jia4zhi2`: Double,
  `p_zhuan1ye4re4du4`: Double,
  `p_guan1zhu4re4du4`: Double,
  `p_yu4ce4re4du4`: Double,
  `p_dai4huo4li4`: Double,
  `p_tong3ji4ri4qi1`: String
)

trait Json_online_value_artistResponse {

  implicit val a_online_value_artistResponse = new Decoder[online_value_artistResponse] {
    final def apply(c: HCursor): Decoder.Result[online_value_artistResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2ming2 <- c.downField("排名").as[Integer]

        p_yi4ren2 <- c.downField("艺人").as[String]

        p_liu2liang4jia4zhi2 <- c.downField("流量价值").as[Double]

        p_zhuan1ye4re4du4 <- c.downField("专业热度").as[Double]

        p_guan1zhu4re4du4 <- c.downField("关注热度").as[Double]

        p_yu4ce4re4du4 <- c.downField("预测热度").as[Double]

        p_dai4huo4li4 <- c.downField("带货力").as[Double]

        p_tong3ji4ri4qi1 <- c.downField("统计日期").as[String]

      } yield {
        online_value_artistResponse(
          p_pai2ming2,
          p_yi4ren2,
          p_liu2liang4jia4zhi2,
          p_zhuan1ye4re4du4,
          p_guan1zhu4re4du4,
          p_yu4ce4re4du4,
          p_dai4huo4li4,
          p_tong3ji4ri4qi1
        )
      }
  }

}

object JsonItem_online_value_artistResponse extends Json_online_value_artistResponse
