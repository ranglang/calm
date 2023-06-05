package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_usa_crude_innerResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_usa_crude_inner 目标地址:
  * https://cdn.jin10.com/dc/reports/dc_usa_michigan_consumer_sentiment_all.js?v=1578576228 描述:
  * 获取美国原油产量报告, 数据区间从19830107-至今, 每周三公布(美国节假日除外), 美国能源信息署(EIA) 限量: 单次返回所有历史数据
  */
case class Respmacro_usa_crude_innerResponse(
  `p_ri4qi1`: String,
  `p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4`: Double,
  `p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4`: Double,
  `p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4`: Double,
  `p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4`: Double,
  `p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4`: Double,
  `p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4`: Double
)

case class macro_usa_crude_innerResponse(
  `p_ri4qi1`: String,
  `p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4`: Double,
  `p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4`: Double,
  `p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4`: Double,
  `p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4`: Double,
  `p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4`: Double,
  `p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4`: Double
)

trait Json_macro_usa_crude_innerResponse {

  implicit val a_macro_usa_crude_innerResponse = new Decoder[macro_usa_crude_innerResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_usa_crude_innerResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4 <- c.downField("美国国内原油总量_产量").as[Double]

        p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4 <- c.downField("美国国内原油总量_变化").as[Double]

        p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4 <- c
          .downField("美国本土48州原油产量_产量")
          .as[Double]

        p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4 <- c
          .downField("美国本土48州原油产量_变化")
          .as[Double]

        p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4 <- c
          .downField("美国阿拉斯加州原油产量_产量")
          .as[Double]

        p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4 <- c
          .downField("美国阿拉斯加州原油产量_变化")
          .as[Double]

      } yield {
        macro_usa_crude_innerResponse(
          p_ri4qi1,
          p_mei3guo2guo2nei4yuan2you2zong3liang4chan3liang4,
          p_mei3guo2guo2nei4yuan2you2zong3liang4bian4hua4,
          p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4chan3liang4,
          p_mei3guo2ben3tu348zhou1yuan2you2chan3liang4bian4hua4,
          p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4chan3liang4,
          p_mei3guo2a1la1si1jia1zhou1yuan2you2chan3liang4bian4hua4
        )
      }
  }

}

object JsonItem_macro_usa_crude_innerResponse extends Json_macro_usa_crude_innerResponse
