package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_new_house_priceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_new_house_price 目标地址: http://data.eastmoney.com/cjsj/newhouse.html
  * 描述: 获取中国新房价指数月度数据, 数据区间从 201101-至今 限量: 单次返回所有历史数据, 目前该指数由上海和北京房价构成
  */
case class Respmacro_china_new_house_priceResponse(
  `p_ri4qi1`: String,
  `p_cheng2shi4`: String,
  `p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3`: Double,
  `p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3`: Double,
  `p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1`: Double,
  `p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3`: Double,
  `p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3`: Double,
  `p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1`: Double,
  `p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3`: Double,
  `p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3`: Double,
  `p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1`: Double
)

case class macro_china_new_house_priceResponse(
  `p_ri4qi1`: String,
  `p_cheng2shi4`: String,
  `p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3`: Double,
  `p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3`: Double,
  `p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1`: Double,
  `p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3`: Double,
  `p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3`: Double,
  `p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1`: Double,
  `p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3`: Double,
  `p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3`: Double,
  `p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1`: Double
)

trait Json_macro_china_new_house_priceResponse {

  implicit val a_macro_china_new_house_priceResponse =
    new Decoder[macro_china_new_house_priceResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_new_house_priceResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_cheng2shi4 <- c.downField("城市").as[String]

          p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3 <- c.downField("新建住宅价格指数-环比").as[Double]

          p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3 <- c.downField("新建住宅价格指数-同比").as[Double]

          p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1 <- c.downField("新建住宅价格指数-定基").as[Double]

          p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3 <- c
            .downField("新建商品住宅价格指数-环比")
            .as[Double]

          p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3 <- c
            .downField("新建商品住宅价格指数-同比")
            .as[Double]

          p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1 <- c
            .downField("新建商品住宅价格指数-定基")
            .as[Double]

          p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3 <- c.downField("二手住宅价格指数-环比").as[Double]

          p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3 <- c.downField("二手住宅价格指数-同比").as[Double]

          p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1 <- c.downField("二手住宅价格指数-定基").as[Double]

        } yield {
          macro_china_new_house_priceResponse(
            p_ri4qi1,
            p_cheng2shi4,
            p_xin1jian4zhu4zhai2jia4ge2zhi3shu4huan2bi3,
            p_xin1jian4zhu4zhai2jia4ge2zhi3shu4tong2bi3,
            p_xin1jian4zhu4zhai2jia4ge2zhi3shu4ding4ji1,
            p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4huan2bi3,
            p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4tong2bi3,
            p_xin1jian4shang1pin3zhu4zhai2jia4ge2zhi3shu4ding4ji1,
            p_er4shou3zhu4zhai2jia4ge2zhi3shu4huan2bi3,
            p_er4shou3zhu4zhai2jia4ge2zhi3shu4tong2bi3,
            p_er4shou3zhu4zhai2jia4ge2zhi3shu4ding4ji1
          )
        }
    }

}

object JsonItem_macro_china_new_house_priceResponse extends Json_macro_china_new_house_priceResponse
