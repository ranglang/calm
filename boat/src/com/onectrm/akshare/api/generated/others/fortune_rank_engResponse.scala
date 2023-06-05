package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.fortune_rank_engResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: fortune_rank_eng 目标地址: https://fortune.com/global500/ 描述: 获取指定年份财富世界 500
  * 强公司排行榜-英文版本, 从 1995 年开始, 数据和格式较中文版本完整 限量: 单次返回某一个年份的所有历史数据, 早期数据可能不足 500 家公司
  */
case class Respfortune_rank_engResponse(
  `p_rank`: String,
  `p_yi3dang1nian2de5shu4ju4wei2zhun3shu1chu1de5zi4duan4bu4yi1`: Double
)

case class fortune_rank_engResponse(
  `p_rank`: String,
  `p_yi3dang1nian2de5shu4ju4wei2zhun3shu1chu1de5zi4duan4bu4yi1`: Double
)

trait Json_fortune_rank_engResponse {

  implicit val a_fortune_rank_engResponse = new Decoder[fortune_rank_engResponse] {
    final def apply(c: HCursor): Decoder.Result[fortune_rank_engResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_rank <- c.downField("rank").as[String]

        p_yi3dang1nian2de5shu4ju4wei2zhun3shu1chu1de5zi4duan4bu4yi1 <- c.downField("").as[Double]

      } yield {
        fortune_rank_engResponse(
          p_rank,
          p_yi3dang1nian2de5shu4ju4wei2zhun3shu1chu1de5zi4duan4bu4yi1
        )
      }
  }

}

object JsonItem_fortune_rank_engResponse extends Json_fortune_rank_engResponse
