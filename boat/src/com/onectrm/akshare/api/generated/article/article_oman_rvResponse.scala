package com.onectrm.akshare.api.generated.article;

import com.onectrm.akshare.api.generated.article.article_oman_rvResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: article 接口: article_oman_rv 目标地址: https://realized.oxford-man.ox.ac.uk/data/visualization
  * 描述: 获取 Oxford-Man 已实现波动率数据 限量: 单次返回某个指数具体指标的所有历史数据
  */
case class Resparticle_oman_rvResponse(
  `p_index`: String,
  `p_data`: Double
)

case class article_oman_rvResponse(
  `p_index`: String,
  `p_data`: Double
)

trait Json_article_oman_rvResponse {

  implicit val a_article_oman_rvResponse = new Decoder[article_oman_rvResponse] {
    final def apply(c: HCursor): Decoder.Result[article_oman_rvResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_index <- c.downField("index").as[String]

        p_data <- c.downField("data").as[Double]

      } yield {
        article_oman_rvResponse(
          p_index,
          p_data
        )
      }
  }

}

object JsonItem_article_oman_rvResponse extends Json_article_oman_rvResponse
