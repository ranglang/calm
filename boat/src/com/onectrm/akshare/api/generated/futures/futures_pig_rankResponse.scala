package com.onectrm.akshare.api.generated.futures;

import com.onectrm.akshare.api.generated.futures.futures_pig_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: futures 接口: futures_pig_rank 目标地址: https://zhujia.zhuwang.cc/lists.shtml 描述: 养猪数据中心-生猪价格排行
  * 限量: 单次返回指定 symbol 的所有当日数据
  */
case class Respfutures_pig_rankResponse(
  `p_pai2ming2`: Integer,
  `p_pin3zhong3`: String,
  `p_sheng3fen4`: String,
  `p_jia4ge2gong1jin1`: Double,
  `p_jia4ge2yuan2`: Double
)

case class futures_pig_rankResponse(
  `p_pai2ming2`: Integer,
  `p_pin3zhong3`: String,
  `p_sheng3fen4`: String,
  `p_jia4ge2gong1jin1`: Double,
  `p_jia4ge2yuan2`: Double
)

trait Json_futures_pig_rankResponse {

  implicit val a_futures_pig_rankResponse = new Decoder[futures_pig_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[futures_pig_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_pai2ming2 <- c.downField("排名").as[Integer]

        p_pin3zhong3 <- c.downField("品种").as[String]

        p_sheng3fen4 <- c.downField("省份").as[String]

        p_jia4ge2gong1jin1 <- c.downField("价格-公斤").as[Double]

        p_jia4ge2yuan2 <- c.downField("价格-元").as[Double]

      } yield {
        futures_pig_rankResponse(
          p_pai2ming2,
          p_pin3zhong3,
          p_sheng3fen4,
          p_jia4ge2gong1jin1,
          p_jia4ge2yuan2
        )
      }
  }

}

object JsonItem_futures_pig_rankResponse extends Json_futures_pig_rankResponse
