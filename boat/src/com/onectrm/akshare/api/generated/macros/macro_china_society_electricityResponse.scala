package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_society_electricityResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_society_electricity 目标地址:
  * http://finance.sina.com.cn/mac/#industry-6-0-31-1 描述: 国家统计局-全社会用电分类情况表 限量: 单次返回所有历史数据
  */
case class Respmacro_china_society_electricityResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_quan2she4hui4yong4dian4liang4`: Double,
  `p_quan2she4hui4yong4dian4liang4tong2bi3`: Double,
  `p_ge4xing2ye4yong4dian4liang4he2ji4`: Double,
  `p_ge4xing2ye4yong4dian4liang4he2ji4tong2bi3`: Double,
  `p_di4yi1chan3ye4yong4dian4liang4`: Double,
  `p_di4yi1chan3ye4yong4dian4liang4tong2bi3`: Double,
  `p_di4er4chan3ye4yong4dian4liang4`: Double,
  `p_di4er4chan3ye4yong4dian4liang4tong2bi3`: Double,
  `p_di4san1chan3ye4yong4dian4liang4`: Double,
  `p_di4san1chan3ye4yong4dian4liang4tong2bi3`: Double,
  `p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4`: Double,
  `p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4tong2bi3`: Double,
  `p_cheng2zhen4ju1min2yong4dian4liang4`: Double,
  `p_cheng2zhen4ju1min2yong4dian4liang4tong2bi3`: Double,
  `p_xiang1cun1ju1min2yong4dian4liang4`: Double,
  `p_xiang1cun1ju1min2yong4dian4liang4tong2bi3`: Double
)

case class macro_china_society_electricityResponse(
  `p_tong3ji4shi2jian1`: String,
  `p_quan2she4hui4yong4dian4liang4`: Double,
  `p_quan2she4hui4yong4dian4liang4tong2bi3`: Double,
  `p_ge4xing2ye4yong4dian4liang4he2ji4`: Double,
  `p_ge4xing2ye4yong4dian4liang4he2ji4tong2bi3`: Double,
  `p_di4yi1chan3ye4yong4dian4liang4`: Double,
  `p_di4yi1chan3ye4yong4dian4liang4tong2bi3`: Double,
  `p_di4er4chan3ye4yong4dian4liang4`: Double,
  `p_di4er4chan3ye4yong4dian4liang4tong2bi3`: Double,
  `p_di4san1chan3ye4yong4dian4liang4`: Double,
  `p_di4san1chan3ye4yong4dian4liang4tong2bi3`: Double,
  `p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4`: Double,
  `p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4tong2bi3`: Double,
  `p_cheng2zhen4ju1min2yong4dian4liang4`: Double,
  `p_cheng2zhen4ju1min2yong4dian4liang4tong2bi3`: Double,
  `p_xiang1cun1ju1min2yong4dian4liang4`: Double,
  `p_xiang1cun1ju1min2yong4dian4liang4tong2bi3`: Double
)

trait Json_macro_china_society_electricityResponse {

  implicit val a_macro_china_society_electricityResponse =
    new Decoder[macro_china_society_electricityResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_society_electricityResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4shi2jian1 <- c.downField("统计时间").as[String]

          p_quan2she4hui4yong4dian4liang4 <- c.downField("全社会用电量").as[Double]

          p_quan2she4hui4yong4dian4liang4tong2bi3 <- c.downField("全社会用电量同比").as[Double]

          p_ge4xing2ye4yong4dian4liang4he2ji4 <- c.downField("各行业用电量合计").as[Double]

          p_ge4xing2ye4yong4dian4liang4he2ji4tong2bi3 <- c.downField("各行业用电量合计同比").as[Double]

          p_di4yi1chan3ye4yong4dian4liang4 <- c.downField("第一产业用电量").as[Double]

          p_di4yi1chan3ye4yong4dian4liang4tong2bi3 <- c.downField("第一产业用电量同比").as[Double]

          p_di4er4chan3ye4yong4dian4liang4 <- c.downField("第二产业用电量").as[Double]

          p_di4er4chan3ye4yong4dian4liang4tong2bi3 <- c.downField("第二产业用电量同比").as[Double]

          p_di4san1chan3ye4yong4dian4liang4 <- c.downField("第三产业用电量").as[Double]

          p_di4san1chan3ye4yong4dian4liang4tong2bi3 <- c.downField("第三产业用电量同比").as[Double]

          p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4 <- c
            .downField("城乡居民生活用电量合计")
            .as[Double]

          p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4tong2bi3 <- c
            .downField("城乡居民生活用电量合计同比")
            .as[Double]

          p_cheng2zhen4ju1min2yong4dian4liang4 <- c.downField("城镇居民用电量").as[Double]

          p_cheng2zhen4ju1min2yong4dian4liang4tong2bi3 <- c.downField("城镇居民用电量同比").as[Double]

          p_xiang1cun1ju1min2yong4dian4liang4 <- c.downField("乡村居民用电量").as[Double]

          p_xiang1cun1ju1min2yong4dian4liang4tong2bi3 <- c.downField("乡村居民用电量同比").as[Double]

        } yield {
          macro_china_society_electricityResponse(
            p_tong3ji4shi2jian1,
            p_quan2she4hui4yong4dian4liang4,
            p_quan2she4hui4yong4dian4liang4tong2bi3,
            p_ge4xing2ye4yong4dian4liang4he2ji4,
            p_ge4xing2ye4yong4dian4liang4he2ji4tong2bi3,
            p_di4yi1chan3ye4yong4dian4liang4,
            p_di4yi1chan3ye4yong4dian4liang4tong2bi3,
            p_di4er4chan3ye4yong4dian4liang4,
            p_di4er4chan3ye4yong4dian4liang4tong2bi3,
            p_di4san1chan3ye4yong4dian4liang4,
            p_di4san1chan3ye4yong4dian4liang4tong2bi3,
            p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4,
            p_cheng2xiang1ju1min2sheng1huo2yong4dian4liang4he2ji4tong2bi3,
            p_cheng2zhen4ju1min2yong4dian4liang4,
            p_cheng2zhen4ju1min2yong4dian4liang4tong2bi3,
            p_xiang1cun1ju1min2yong4dian4liang4,
            p_xiang1cun1ju1min2yong4dian4liang4tong2bi3
          )
        }
    }

}

object JsonItem_macro_china_society_electricityResponse
    extends Json_macro_china_society_electricityResponse
