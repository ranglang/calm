package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.sunrise_monthlyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: sunrise_monthly 目标地址: https://www.timeanddate.com/sun/china/ 描述:
  * 获取中国各大城市-日出和日落时间, 数据区间从19990101-至今, 推荐使用代理访问 限量: 单次返回指定日期所在月份每天的数据, 如果是未来日期则为预测值
  */
case class Respsunrise_monthlyResponse(
  `p_month`: String,
  `p_Sunrise`: String,
  `p_Sunset`: Double,
  `p_Length`: String,
  `p_Difference`: Double,
  `p_Start`: String,
  `p_End`: Double,
  `p_Start1`: String,
  `p_End1`: Double,
  `p_Start2`: String,
  `p_End2`: Double,
  `p_Time`: String,
  `p_Milkm`: Double
)

case class sunrise_monthlyResponse(
  `p_month`: String,
  `p_Sunrise`: String,
  `p_Sunset`: Double,
  `p_Length`: String,
  `p_Difference`: Double,
  `p_Start`: String,
  `p_End`: Double,
  `p_Start1`: String,
  `p_End1`: Double,
  `p_Start2`: String,
  `p_End2`: Double,
  `p_Time`: String,
  `p_Milkm`: Double
)

trait Json_sunrise_monthlyResponse {

  implicit val a_sunrise_monthlyResponse = new Decoder[sunrise_monthlyResponse] {
    final def apply(c: HCursor): Decoder.Result[sunrise_monthlyResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_month <- c.downField("month").as[String]

        p_Sunrise <- c.downField("Sunrise").as[String]

        p_Sunset <- c.downField("Sunset").as[Double]

        p_Length <- c.downField("Length").as[String]

        p_Difference <- c.downField("Difference").as[Double]

        p_Start <- c.downField("Start").as[String]

        p_End <- c.downField("End").as[Double]

        p_Start1 <- c.downField("Start.1").as[String]

        p_End1 <- c.downField("End.1").as[Double]

        p_Start2 <- c.downField("Start.2").as[String]

        p_End2 <- c.downField("End.2").as[Double]

        p_Time <- c.downField("Time").as[String]

        p_Milkm <- c.downField("Mil. km").as[Double]

      } yield {
        sunrise_monthlyResponse(
          p_month,
          p_Sunrise,
          p_Sunset,
          p_Length,
          p_Difference,
          p_Start,
          p_End,
          p_Start1,
          p_End1,
          p_Start2,
          p_End2,
          p_Time,
          p_Milkm
        )
      }
  }

}

object JsonItem_sunrise_monthlyResponse extends Json_sunrise_monthlyResponse
