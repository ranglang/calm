package com.onectrm.akshare.api.generated.macros;

import com.onectrm.akshare.api.generated.macros.macro_china_retail_price_indexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: macro 接口: macro_china_retail_price_index 目标地址:
  * http://finance.sina.com.cn/mac/#price-12-0-31-1 描述: 国家统计局-商品零售价格指数 限量: 单次返回所有历史数据
  */
case class Respmacro_china_retail_price_indexResponse(
  `p_tong3ji4yue4fen4`: String,
  `p_ju1min2xiao1fei4xiang4mu4`: String,
  `p_ling2shou4shang1pin3jia4ge2zhi3shu4`: Double
)

case class macro_china_retail_price_indexResponse(
  `p_tong3ji4yue4fen4`: String,
  `p_ju1min2xiao1fei4xiang4mu4`: String,
  `p_ling2shou4shang1pin3jia4ge2zhi3shu4`: Double
)

trait Json_macro_china_retail_price_indexResponse {

  implicit val a_macro_china_retail_price_indexResponse =
    new Decoder[macro_china_retail_price_indexResponse] {
      final def apply(c: HCursor): Decoder.Result[macro_china_retail_price_indexResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_tong3ji4yue4fen4 <- c.downField("统计月份").as[String]

          p_ju1min2xiao1fei4xiang4mu4 <- c.downField("居民消费项目").as[String]

          p_ling2shou4shang1pin3jia4ge2zhi3shu4 <- c.downField("零售商品价格指数").as[Double]

        } yield {
          macro_china_retail_price_indexResponse(
            p_tong3ji4yue4fen4,
            p_ju1min2xiao1fei4xiang4mu4,
            p_ling2shou4shang1pin3jia4ge2zhi3shu4
          )
        }
    }

}

object JsonItem_macro_china_retail_price_indexResponse
    extends Json_macro_china_retail_price_indexResponse
