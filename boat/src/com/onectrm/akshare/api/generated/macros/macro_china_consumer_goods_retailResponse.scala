package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_consumer_goods_retailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_consumer_goods_retail 目标地址: http://data.eastmoney.com/cjsj/xfp.html
  * 描述: 东方财富-经济数据-社会消费品零售总额 限量: 单次返回所有历史数据
  */
case class Respmacro_china_consumer_goods_retailResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: Double,
  `p_tong2bi3zeng1zhang3`: Double,
  `p_huan2bi3zeng1zhang3`: Double,
  `p_lei3ji4`: Double,
  `p_lei3ji4tong2bi3zeng1zhang3`: Double
)

case class macro_china_consumer_goods_retailResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: Double,
  `p_tong2bi3zeng1zhang3`: Double,
  `p_huan2bi3zeng1zhang3`: Double,
  `p_lei3ji4`: Double,
  `p_lei3ji4tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_consumer_goods_retailResponse {

  implicit val a_macro_china_consumer_goods_retailResponse =
    new Decoder[macro_china_consumer_goods_retailResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_consumer_goods_retailResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_yue4fen4 <- c.downField("月份").as[String]

          p_dang1yue4 <- c.downField("当月").as[Double]

          p_tong2bi3zeng1zhang3 <- c.downField("同比增长").as[Double]

          p_huan2bi3zeng1zhang3 <- c.downField("环比增长").as[Double]

          p_lei3ji4 <- c.downField("累计").as[Double]

          p_lei3ji4tong2bi3zeng1zhang3 <- c.downField("累计-同比增长").as[Double]

        } yield {
          macro_china_consumer_goods_retailResponse(
            p_yue4fen4,
            p_dang1yue4,
            p_tong2bi3zeng1zhang3,
            p_huan2bi3zeng1zhang3,
            p_lei3ji4,
            p_lei3ji4tong2bi3zeng1zhang3
          )
        }
    }

}

object JsonItem_macro_china_consumer_goods_retailResponse
    extends Json_macro_china_consumer_goods_retailResponse
