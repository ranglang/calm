package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_qyspjgResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_qyspjg 目标地址: http://data.eastmoney.com/cjsj/qyspjg.html 描述:
  * 东方财富-经济数据一览-中国-企业商品价格指数, 数据区间从 20050101-至今 限量: 单次返回所有历史数据
  */
case class Respmacro_china_qyspjgResponse(
  `p_yue4fen4`: String,
  `p_zong3zhi3shu4zhi3shu4zhi2`: Double,
  `p_zong3zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_zong3zhi3shu4huan2bi3zeng1zhang3`: Double,
  `p_nong2chan3pin3zhi3shu4zhi2`: Double,
  `p_nong2chan3pin3tong2bi3zeng1zhang3`: Double,
  `p_nong2chan3pin3huan2bi3zeng1zhang3`: Double,
  `p_kuang4chan3pin3zhi3shu4zhi2`: Double,
  `p_kuang4chan3pin3tong2bi3zeng1zhang3`: Double,
  `p_kuang4chan3pin3huan2bi3zeng1zhang3`: Double,
  `p_mei2you2dian4zhi3shu4zhi2`: Double,
  `p_mei2you2dian4tong2bi3zeng1zhang3`: Double,
  `p_mei2you2dian4huan2bi3zeng1zhang3`: Double
)

case class macro_china_qyspjgResponse(
  `p_yue4fen4`: String,
  `p_zong3zhi3shu4zhi3shu4zhi2`: Double,
  `p_zong3zhi3shu4tong2bi3zeng1zhang3`: Double,
  `p_zong3zhi3shu4huan2bi3zeng1zhang3`: Double,
  `p_nong2chan3pin3zhi3shu4zhi2`: Double,
  `p_nong2chan3pin3tong2bi3zeng1zhang3`: Double,
  `p_nong2chan3pin3huan2bi3zeng1zhang3`: Double,
  `p_kuang4chan3pin3zhi3shu4zhi2`: Double,
  `p_kuang4chan3pin3tong2bi3zeng1zhang3`: Double,
  `p_kuang4chan3pin3huan2bi3zeng1zhang3`: Double,
  `p_mei2you2dian4zhi3shu4zhi2`: Double,
  `p_mei2you2dian4tong2bi3zeng1zhang3`: Double,
  `p_mei2you2dian4huan2bi3zeng1zhang3`: Double
)

trait Json_macro_china_qyspjgResponse {

  implicit val a_macro_china_qyspjgResponse = new Decoder[macro_china_qyspjgResponse] {
    final def apply(c: HCursor): Decoder.Result[macro_china_qyspjgResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_yue4fen4 <- c.downField("月份").as[String]

        p_zong3zhi3shu4zhi3shu4zhi2 <- c.downField("总指数-指数值").as[Double]

        p_zong3zhi3shu4tong2bi3zeng1zhang3 <- c.downField("总指数-同比增长").as[Double]

        p_zong3zhi3shu4huan2bi3zeng1zhang3 <- c.downField("总指数-环比增长").as[Double]

        p_nong2chan3pin3zhi3shu4zhi2 <- c.downField("农产品-指数值").as[Double]

        p_nong2chan3pin3tong2bi3zeng1zhang3 <- c.downField("农产品-同比增长").as[Double]

        p_nong2chan3pin3huan2bi3zeng1zhang3 <- c.downField("农产品-环比增长").as[Double]

        p_kuang4chan3pin3zhi3shu4zhi2 <- c.downField("矿产品-指数值").as[Double]

        p_kuang4chan3pin3tong2bi3zeng1zhang3 <- c.downField("矿产品-同比增长").as[Double]

        p_kuang4chan3pin3huan2bi3zeng1zhang3 <- c.downField("矿产品-环比增长").as[Double]

        p_mei2you2dian4zhi3shu4zhi2 <- c.downField("煤油电-指数值").as[Double]

        p_mei2you2dian4tong2bi3zeng1zhang3 <- c.downField("煤油电-同比增长").as[Double]

        p_mei2you2dian4huan2bi3zeng1zhang3 <- c.downField("煤油电-环比增长").as[Double]

      } yield {
        macro_china_qyspjgResponse(
          p_yue4fen4,
          p_zong3zhi3shu4zhi3shu4zhi2,
          p_zong3zhi3shu4tong2bi3zeng1zhang3,
          p_zong3zhi3shu4huan2bi3zeng1zhang3,
          p_nong2chan3pin3zhi3shu4zhi2,
          p_nong2chan3pin3tong2bi3zeng1zhang3,
          p_nong2chan3pin3huan2bi3zeng1zhang3,
          p_kuang4chan3pin3zhi3shu4zhi2,
          p_kuang4chan3pin3tong2bi3zeng1zhang3,
          p_kuang4chan3pin3huan2bi3zeng1zhang3,
          p_mei2you2dian4zhi3shu4zhi2,
          p_mei2you2dian4tong2bi3zeng1zhang3,
          p_mei2you2dian4huan2bi3zeng1zhang3
        )
      }
  }

}

object JsonItem_macro_china_qyspjgResponse extends Json_macro_china_qyspjgResponse
