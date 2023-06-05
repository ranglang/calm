package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_new_financial_creditResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_new_financial_credit 目标地址: http://data.eastmoney.com/cjsj/xzxd.html
  * 描述: 中国新增信贷数据数据, 数据区间从 200801 至今, 月度数据 限量: 单次返回所有历史数据
  */
case class Respmacro_china_new_financial_creditResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: Double,
  `p_dang1yue4tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4huan2bi3zeng1zhang3`: Double,
  `p_lei3ji4`: Double,
  `p_lei3ji4tong2bi3zeng1zhang3`: Double
)

case class macro_china_new_financial_creditResponse(
  `p_yue4fen4`: String,
  `p_dang1yue4`: Double,
  `p_dang1yue4tong2bi3zeng1zhang3`: Double,
  `p_dang1yue4huan2bi3zeng1zhang3`: Double,
  `p_lei3ji4`: Double,
  `p_lei3ji4tong2bi3zeng1zhang3`: Double
)

trait Json_macro_china_new_financial_creditResponse {

  implicit val a_macro_china_new_financial_creditResponse =
    new Decoder[macro_china_new_financial_creditResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_new_financial_creditResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_yue4fen4 <- c.downField("月份").as[String]

          p_dang1yue4 <- c.downField("当月").as[Double]

          p_dang1yue4tong2bi3zeng1zhang3 <- c.downField("当月-同比增长").as[Double]

          p_dang1yue4huan2bi3zeng1zhang3 <- c.downField("当月-环比增长").as[Double]

          p_lei3ji4 <- c.downField("累计").as[Double]

          p_lei3ji4tong2bi3zeng1zhang3 <- c.downField("累计-同比增长").as[Double]

        } yield {
          macro_china_new_financial_creditResponse(
            p_yue4fen4,
            p_dang1yue4,
            p_dang1yue4tong2bi3zeng1zhang3,
            p_dang1yue4huan2bi3zeng1zhang3,
            p_lei3ji4,
            p_lei3ji4tong2bi3zeng1zhang3
          )
        }
    }

}

object JsonItem_macro_china_new_financial_creditResponse
    extends Json_macro_china_new_financial_creditResponse
