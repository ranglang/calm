package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.index_bloomberg_billionaires_histResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: index_bloomberg_billionaires_hist 目标地址:
  * https://stats.areppim.com/stats/links_billionairexlists.htm 描述: 按照年份查询彭博亿万富豪指数; 该接口需要使用代理访问 限量:
  * 单次返回当年所有数据彭博亿万富豪排名数据
  */
case class Respindex_bloomberg_billionaires_histResponse(
  `p_rank`: String,
  `p_name`: String,
  `p_totalnetworth`: String,
  `p_lastchange`: String,
  `p_YTDchange`: String,
  `p_country`: String,
  `p_industry`: String,
  `p_age`: String
)

case class index_bloomberg_billionaires_histResponse(
  `p_rank`: String,
  `p_name`: String,
  `p_totalnetworth`: String,
  `p_lastchange`: String,
  `p_YTDchange`: String,
  `p_country`: String,
  `p_industry`: String,
  `p_age`: String
)

trait Json_index_bloomberg_billionaires_histResponse {

  implicit val a_index_bloomberg_billionaires_histResponse =
    new Decoder[index_bloomberg_billionaires_histResponse] {
      final def apply(c: HCursor): Decoder.Result[index_bloomberg_billionaires_histResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_rank <- c.downField("rank").as[String]

          p_name <- c.downField("name").as[String]

          p_totalnetworth <- c.downField("total_net_worth").as[String]

          p_lastchange <- c.downField("last_change").as[String]

          p_YTDchange <- c.downField("YTD_change").as[String]

          p_country <- c.downField("country").as[String]

          p_industry <- c.downField("industry").as[String]

          p_age <- c.downField("age").as[String]

        } yield {
          index_bloomberg_billionaires_histResponse(
            p_rank,
            p_name,
            p_totalnetworth,
            p_lastchange,
            p_YTDchange,
            p_country,
            p_industry,
            p_age
          )
        }
    }

}

object JsonItem_index_bloomberg_billionaires_histResponse
    extends Json_index_bloomberg_billionaires_histResponse
