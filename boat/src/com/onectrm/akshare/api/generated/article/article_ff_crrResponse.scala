package com.onectrm.akshare.api.generated.article;

import com.onectrm.akshare.api.generated.article.article_ff_crrResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: article 接口: article_ff_crr 目标地址:
  * http://mba.tuck.dartmouth.edu/pages/faculty/ken.french/data_library.html 描述: 获取 Current Research
  * Returns 多因子数据 限量: 单次返回所有历史数据
  */
case class Resparticle_ff_crrResponse(
  `p_September2019`: Double,
  `p_Last3Months`: Double,
  `p_Last12Months`: Double
)

case class article_ff_crrResponse(
  `p_September2019`: Double,
  `p_Last3Months`: Double,
  `p_Last12Months`: Double
)

trait Json_article_ff_crrResponse {

  implicit val a_article_ff_crrResponse = new Decoder[article_ff_crrResponse] {
    final def apply(c: HCursor): Decoder.Result[article_ff_crrResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_September2019 <- c.downField("September 2019").as[Double]

        p_Last3Months <- c.downField("Last 3 Months").as[Double]

        p_Last12Months <- c.downField("Last 12 Months").as[Double]

      } yield {
        article_ff_crrResponse(
          p_September2019,
          p_Last3Months,
          p_Last12Months
        )
      }
  }

}

object JsonItem_article_ff_crrResponse extends Json_article_ff_crrResponse
