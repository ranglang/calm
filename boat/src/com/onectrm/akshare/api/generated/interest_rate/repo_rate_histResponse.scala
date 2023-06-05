package com.onectrm.akshare.api.generated.interest_rate;

import com.onectrm.akshare.api.generated.interest_rate.repo_rate_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: interest_rate 接口: repo_rate_hist 目标地址: http://www.chinamoney.com.cn/chinese/bkfrr/ 描述:
  * 回购定盘利率数据 限量: 单次返回指定日期间(一个月)的所有历史数据
  */
case class Resprepo_rate_histResponse(
  `p_date`: String,
  `p_FR001`: Double,
  `p_FR007`: Double,
  `p_FR014`: Double,
  `p_FDR001`: Double,
  `p_FDR007`: Double,
  `p_FDR014`: Double
)

case class repo_rate_histResponse(
  `p_date`: String,
  `p_FR001`: Double,
  `p_FR007`: Double,
  `p_FR014`: Double,
  `p_FDR001`: Double,
  `p_FDR007`: Double,
  `p_FDR014`: Double
)

trait Json_repo_rate_histResponse {

  implicit val a_repo_rate_histResponse = new Decoder[repo_rate_histResponse] {
    final def apply(c: HCursor): Decoder.Result[repo_rate_histResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_FR001 <- c.downField("FR001").as[Double]

        p_FR007 <- c.downField("FR007").as[Double]

        p_FR014 <- c.downField("FR014").as[Double]

        p_FDR001 <- c.downField("FDR001").as[Double]

        p_FDR007 <- c.downField("FDR007").as[Double]

        p_FDR014 <- c.downField("FDR014").as[Double]

      } yield {
        repo_rate_histResponse(
          p_date,
          p_FR001,
          p_FR007,
          p_FR014,
          p_FDR001,
          p_FDR007,
          p_FDR014
        )
      }
  }

}

object JsonItem_repo_rate_histResponse extends Json_repo_rate_histResponse
