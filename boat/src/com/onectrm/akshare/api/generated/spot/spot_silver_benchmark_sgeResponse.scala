package com.onectrm.akshare.api.generated.spot;

import com.onectrm.akshare.api.generated.spot.spot_silver_benchmark_sgeResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: spot 接口: spot_silver_benchmark_sge 目标地址: https://www.sge.com.cn/sjzx/shyjzj 描述:
  * 上海黄金交易所-数据资讯-上海银基准价-历史数据 限量: 单次返回所有历史数据
  */
case class Respspot_silver_benchmark_sgeResponse(
  `p_jiao1yi4shi2jian1`: String,
  `p_wan3pan2jia4`: Double,
  `p_zao3pan2jia4`: Double
)

case class spot_silver_benchmark_sgeResponse(
  `p_jiao1yi4shi2jian1`: String,
  `p_wan3pan2jia4`: Double,
  `p_zao3pan2jia4`: Double
)

trait Json_spot_silver_benchmark_sgeResponse {

  implicit val a_spot_silver_benchmark_sgeResponse =
    new Decoder[spot_silver_benchmark_sgeResponse] {
      final def apply(c: HCursor): Decoder.Result[spot_silver_benchmark_sgeResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_jiao1yi4shi2jian1 <- c.downField("交易时间").as[String]

          p_wan3pan2jia4 <- c.downField("晚盘价").as[Double]

          p_zao3pan2jia4 <- c.downField("早盘价").as[Double]

        } yield {
          spot_silver_benchmark_sgeResponse(
            p_jiao1yi4shi2jian1,
            p_wan3pan2jia4,
            p_zao3pan2jia4
          )
        }
    }

}

object JsonItem_spot_silver_benchmark_sgeResponse extends Json_spot_silver_benchmark_sgeResponse
