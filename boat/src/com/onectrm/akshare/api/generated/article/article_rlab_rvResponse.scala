package com.onectrm.akshare.api.generated.article;

import com.onectrm.akshare.api.generated.article.article_rlab_rvResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: article 接口: article_rlab_rv 目标地址: https://dachxiu.chicagobooth.edu/ 描述: 获取 Risk-Lab
  * 已实现波动率数据 限量: 单次返回某个指数所有历史数据
  */
case class Resparticle_rlab_rvResponse(
  `p_index`: String,
  `p_data`: Double
)

case class article_rlab_rvResponse(
  `p_index`: String,
  `p_data`: Double
)

trait Json_article_rlab_rvResponse {

  implicit val a_article_rlab_rvResponse = new Decoder[article_rlab_rvResponse] {
    final def apply(c: HCursor): Decoder.Result[article_rlab_rvResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_index <- c.downField("index").as[String]

        p_data <- c.downField("data").as[Double]

      } yield {
        article_rlab_rvResponse(
          p_index,
          p_data
        )
      }
  }

}

object JsonItem_article_rlab_rvResponse extends Json_article_rlab_rvResponse
