package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_cpiResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_cpi 目标地址: http://data.eastmoney.com/cjsj/cpi.html 描述: 中国居民消费价格指数,
  * 数据区间从 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_cpiResponse(
  `p_yue4fen4`: String,
  `p_quan2guo2dang1yue4`: Double,
  `p_quan2guo2tong2bi3zeng1zhang3`: Double,
  `p_quan2guo2huan2bi3zeng1zhang3`: Double,
  `p_quan2guo2lei3ji4`: Double,
  `p_cheng2shi4dang1yue4`: Double,
  `p_cheng2shi4tong2bi3zeng1zhang3`: Double,
  `p_cheng2shi4huan2bi3zeng1zhang3`: Double,
  `p_cheng2shi4lei3ji4`: Double,
  `p_nong2cun1dang1yue4`: Double,
  `p_nong2cun1tong2bi3zeng1zhang3`: Double,
  `p_nong2cun1huan2bi3zeng1zhang3`: Double,
  `p_nong2cun1lei3ji4`: Double
)

case class macro_china_cpiResponse(
  `p_yue4fen4`: String,
  `p_quan2guo2dang1yue4`: Double,
  `p_quan2guo2tong2bi3zeng1zhang3`: Double,
  `p_quan2guo2huan2bi3zeng1zhang3`: Double,
  `p_quan2guo2lei3ji4`: Double,
  `p_cheng2shi4dang1yue4`: Double,
  `p_cheng2shi4tong2bi3zeng1zhang3`: Double,
  `p_cheng2shi4huan2bi3zeng1zhang3`: Double,
  `p_cheng2shi4lei3ji4`: Double,
  `p_nong2cun1dang1yue4`: Double,
  `p_nong2cun1tong2bi3zeng1zhang3`: Double,
  `p_nong2cun1huan2bi3zeng1zhang3`: Double,
  `p_nong2cun1lei3ji4`: Double
)

trait Json_macro_china_cpiResponse {

  implicit val a_macro_china_cpiResponse = new Decoder[macro_china_cpiResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_cpiResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_quan2guo2dang1yue4 <- c.downField("全国-当月").as[Double]

        p_quan2guo2tong2bi3zeng1zhang3 <- c.downField("全国-同比增长").as[Double]

        p_quan2guo2huan2bi3zeng1zhang3 <- c.downField("全国-环比增长").as[Double]

        p_quan2guo2lei3ji4 <- c.downField("全国-累计").as[Double]

        p_cheng2shi4dang1yue4 <- c.downField("城市-当月").as[Double]

        p_cheng2shi4tong2bi3zeng1zhang3 <- c.downField("城市-同比增长").as[Double]

        p_cheng2shi4huan2bi3zeng1zhang3 <- c.downField("城市-环比增长").as[Double]

        p_cheng2shi4lei3ji4 <- c.downField("城市-累计").as[Double]

        p_nong2cun1dang1yue4 <- c.downField("农村-当月").as[Double]

        p_nong2cun1tong2bi3zeng1zhang3 <- c.downField("农村-同比增长").as[Double]

        p_nong2cun1huan2bi3zeng1zhang3 <- c.downField("农村-环比增长").as[Double]

        p_nong2cun1lei3ji4 <- c.downField("农村-累计").as[Double]

      } yield {
        macro_china_cpiResponse(
          p_yue4fen4,
          p_quan2guo2dang1yue4,
          p_quan2guo2tong2bi3zeng1zhang3,
          p_quan2guo2huan2bi3zeng1zhang3,
          p_quan2guo2lei3ji4,
          p_cheng2shi4dang1yue4,
          p_cheng2shi4tong2bi3zeng1zhang3,
          p_cheng2shi4huan2bi3zeng1zhang3,
          p_cheng2shi4lei3ji4,
          p_nong2cun1dang1yue4,
          p_nong2cun1tong2bi3zeng1zhang3,
          p_nong2cun1huan2bi3zeng1zhang3,
          p_nong2cun1lei3ji4
        )
      }
  }

}

object JsonItem_macro_china_cpiResponse extends Json_macro_china_cpiResponse
