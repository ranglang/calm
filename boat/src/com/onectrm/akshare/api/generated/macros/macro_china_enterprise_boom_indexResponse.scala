package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_enterprise_boom_indexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_enterprise_boom_index 目标地址:
  * http://data.eastmoney.com/cjsj/qyjqzs.html 描述: 获取中国企业景气及企业家信心指数数据, 数据区间从 2005 一季度-至今 限量:
  * 单次返回所有历史数据
  */
case class Respmacro_china_enterprise_boom_indexResponse(
  `p_ji4du4`: String,
  `p_qi3ye4jing3qi4zhi3shu4zhi3shu4`: Double,
  `p_qi3ye4jing3qi4zhi3shu4tong2bi3`: Double,
  `p_qi3ye4jing3qi4zhi3shu4huan2bi3`: Double,
  `p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4`: Double,
  `p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3`: Double,
  `p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3`: Double
)

case class macro_china_enterprise_boom_indexResponse(
  `p_ji4du4`: String,
  `p_qi3ye4jing3qi4zhi3shu4zhi3shu4`: Double,
  `p_qi3ye4jing3qi4zhi3shu4tong2bi3`: Double,
  `p_qi3ye4jing3qi4zhi3shu4huan2bi3`: Double,
  `p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4`: Double,
  `p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3`: Double,
  `p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3`: Double
)

trait Json_macro_china_enterprise_boom_indexResponse {

  implicit val a_macro_china_enterprise_boom_indexResponse =
    new Decoder[macro_china_enterprise_boom_indexResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_enterprise_boom_indexResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ji4du4 <- c.downField("季度").as[String]

          p_qi3ye4jing3qi4zhi3shu4zhi3shu4 <- c.downField("企业景气指数-指数").as[Double]

          p_qi3ye4jing3qi4zhi3shu4tong2bi3 <- c.downField("企业景气指数-同比").as[Double]

          p_qi3ye4jing3qi4zhi3shu4huan2bi3 <- c.downField("企业景气指数-环比").as[Double]

          p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4 <- c.downField("企业家信心指数-指数").as[Double]

          p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3 <- c.downField("企业家信心指数-同比").as[Double]

          p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3 <- c.downField("企业家信心指数-环比").as[Double]

        } yield {
          macro_china_enterprise_boom_indexResponse(
            p_ji4du4,
            p_qi3ye4jing3qi4zhi3shu4zhi3shu4,
            p_qi3ye4jing3qi4zhi3shu4tong2bi3,
            p_qi3ye4jing3qi4zhi3shu4huan2bi3,
            p_qi3ye4jia1xin4xin1zhi3shu4zhi3shu4,
            p_qi3ye4jia1xin4xin1zhi3shu4tong2bi3,
            p_qi3ye4jia1xin4xin1zhi3shu4huan2bi3
          )
        }
    }

}

object JsonItem_macro_china_enterprise_boom_indexResponse
    extends Json_macro_china_enterprise_boom_indexResponse
