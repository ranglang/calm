package com.onectrm.akshare.api.generated.article;

import com.onectrm.akshare.api.generated.article.article_epu_indexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: article 接口: article_epu_index 目标地址: http://www.policyuncertainty.com/index.html 描述:
  * 获取国家或地区的经济政策不确定性(EPU)数据 限量: 单次返回某个具体国家或地区的所有月度经济政策不确定性数据
  */
case class Resparticle_epu_indexResponse(
  `p_mei3ge4guo2jia1huo4di4qu1bu4tong2`: String
)

case class article_epu_indexResponse(
  `p_mei3ge4guo2jia1huo4di4qu1bu4tong2`: String
)

trait Json_article_epu_indexResponse {

  implicit val a_article_epu_indexResponse = new Decoder[article_epu_indexResponse] {
    final def apply(c: HCursor): Decoder.Result[article_epu_indexResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_mei3ge4guo2jia1huo4di4qu1bu4tong2 <- c.downField("").as[String]

      } yield {
        article_epu_indexResponse(
          p_mei3ge4guo2jia1huo4di4qu1bu4tong2
        )
      }
  }

}

object JsonItem_article_epu_indexResponse extends Json_article_epu_indexResponse
