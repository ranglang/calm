package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_xfzxxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_xfzxx 目标地址: https://data.eastmoney.com/cjsj/xfzxx.html 描述:
  * 东方财富网-消费者信心指数 限量: 单次返回所有历史数据
  */
case class Respmacro_china_xfzxxResponse(
  `p_yue4fen4`: String,
  `p_xiao1fei4zhe3xin4xin1zhi3shu4zhi3shu4zhi2`: Double,
  `p_xiao1fei4zhe3xin4xin1zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3xin4xin1zhi3shu4huan2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3man3yi4zhi3shu4zhi3shu4zhi2`: Double,
  `p_xiao1fei4zhe3man3yi4zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3man3yi4zhi3shu4huan2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3yu4qi1zhi3shu4zhi3shu4zhi2`: Double,
  `p_xiao1fei4zhe3yu4qi1zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3yu4qi1zhi3shu4huan2bi3zeng1zhang3`: Double
)

case class macro_china_xfzxxResponse(
  `p_yue4fen4`: String,
  `p_xiao1fei4zhe3xin4xin1zhi3shu4zhi3shu4zhi2`: Double,
  `p_xiao1fei4zhe3xin4xin1zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3xin4xin1zhi3shu4huan2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3man3yi4zhi3shu4zhi3shu4zhi2`: Double,
  `p_xiao1fei4zhe3man3yi4zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3man3yi4zhi3shu4huan2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3yu4qi1zhi3shu4zhi3shu4zhi2`: Double,
  `p_xiao1fei4zhe3yu4qi1zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_xiao1fei4zhe3yu4qi1zhi3shu4huan2bi3zeng1zhang3`: Double
)

trait Json_macro_china_xfzxxResponse {

  implicit val a_macro_china_xfzxxResponse = new Decoder[macro_china_xfzxxResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_xfzxxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_xiao1fei4zhe3xin4xin1zhi3shu4zhi3shu4zhi2 <- c.downField("消费者信心指数-指数值").as[Double]

        p_xiao1fei4zhe3xin4xin1zhi3shu4tong2bi3zeng1zhang3 <- c.downField("消费者信心指数-同比增长").as[Double]

        p_xiao1fei4zhe3xin4xin1zhi3shu4huan2bi3zeng1zhang3 <- c.downField("消费者信心指数-环比增长").as[Double]

        p_xiao1fei4zhe3man3yi4zhi3shu4zhi3shu4zhi2 <- c.downField("消费者满意指数-指数值").as[Double]

        p_xiao1fei4zhe3man3yi4zhi3shu4tong2bi3zeng1zhang3 <- c.downField("消费者满意指数-同比增长").as[Double]

        p_xiao1fei4zhe3man3yi4zhi3shu4huan2bi3zeng1zhang3 <- c.downField("消费者满意指数-环比增长").as[Double]

        p_xiao1fei4zhe3yu4qi1zhi3shu4zhi3shu4zhi2 <- c.downField("消费者预期指数-指数值").as[Double]

        p_xiao1fei4zhe3yu4qi1zhi3shu4tong2bi3zeng1zhang3 <- c.downField("消费者预期指数-同比增长").as[Double]

        p_xiao1fei4zhe3yu4qi1zhi3shu4huan2bi3zeng1zhang3 <- c.downField("消费者预期指数-环比增长").as[Double]

      } yield {
        macro_china_xfzxxResponse(
          p_yue4fen4,
          p_xiao1fei4zhe3xin4xin1zhi3shu4zhi3shu4zhi2,
          p_xiao1fei4zhe3xin4xin1zhi3shu4tong2bi3zeng1zhang3,
          p_xiao1fei4zhe3xin4xin1zhi3shu4huan2bi3zeng1zhang3,
          p_xiao1fei4zhe3man3yi4zhi3shu4zhi3shu4zhi2,
          p_xiao1fei4zhe3man3yi4zhi3shu4tong2bi3zeng1zhang3,
          p_xiao1fei4zhe3man3yi4zhi3shu4huan2bi3zeng1zhang3,
          p_xiao1fei4zhe3yu4qi1zhi3shu4zhi3shu4zhi2,
          p_xiao1fei4zhe3yu4qi1zhi3shu4tong2bi3zeng1zhang3,
          p_xiao1fei4zhe3yu4qi1zhi3shu4huan2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_xfzxxResponse extends Json_macro_china_xfzxxResponse
