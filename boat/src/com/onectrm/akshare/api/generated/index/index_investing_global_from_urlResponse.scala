package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_investing_global_from_urlResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_investing_global_from_url 目标地址:
  * https://www.investing.com/indices/ftse-epra-nareit-eurozone 描述: 世界主要国家的各种指数, 该接口需要通过代理访问;
  * 该接口只需要输入相应指数的 URL 地址 限量: 单次返回某一个国家的具体某一个指数, 建议用 for 循环获取多个国家的多个指数, 注意不要大量获取, 以免给对方服务器造成压力!
  */
case class Respindex_investing_global_from_urlResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: Double
)

case class index_investing_global_from_urlResponse(
  `p_ri4qi1`: String,
  `p_shou1pan2`: Double,
  `p_kai1pan2`: Double,
  `p_gao1`: Double,
  `p_di1`: Double,
  `p_jiao1yi4liang4`: Double
)

trait Json_index_investing_global_from_urlResponse {

  implicit val a_index_investing_global_from_urlResponse =
    new Decoder[index_investing_global_from_urlResponse] {
      final def apply(c: HCursor): Decoder.Result[index_investing_global_from_urlResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_shou1pan2 <- c.downField("收盘").as[Double]

          p_kai1pan2 <- c.downField("开盘").as[Double]

          p_gao1 <- c.downField("高").as[Double]

          p_di1 <- c.downField("低").as[Double]

          p_jiao1yi4liang4 <- c.downField("交易量").as[Double]

        } yield {
          index_investing_global_from_urlResponse(
            p_ri4qi1,
            p_shou1pan2,
            p_kai1pan2,
            p_gao1,
            p_di1,
            p_jiao1yi4liang4
          )
        }
    }

}

object JsonItem_index_investing_global_from_urlResponse
    extends Json_index_investing_global_from_urlResponse
