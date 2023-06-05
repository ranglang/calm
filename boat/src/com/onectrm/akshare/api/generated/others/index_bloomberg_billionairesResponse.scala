package com.onectrm.akshare.api.generated.others;

import com.onectrm.akshare.api.generated.others.index_bloomberg_billionairesResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: others 接口: index_bloomberg_billionaires 目标地址: https://www.bloomberg.com/billionaires/ 描述:
  * 彭博亿万富豪指数, 全球前 500 名; 该接口需要使用代理访问 限量: 单次返回所有数据彭博亿万富豪排名数据
  */
case class Respindex_bloomberg_billionairesResponse(
  `p_rank`: String,
  `p_name`: String,
  `p_totalnetworth`: String,
  `p_lastchange`: String,
  `p_YTDchange`: String,
  `p_country`: String,
  `p_industry`: String
)

case class index_bloomberg_billionairesResponse(
  `p_rank`: String,
  `p_name`: String,
  `p_totalnetworth`: String,
  `p_lastchange`: String,
  `p_YTDchange`: String,
  `p_country`: String,
  `p_industry`: String
)

trait Json_index_bloomberg_billionairesResponse {

  implicit val a_index_bloomberg_billionairesResponse =
    new Decoder[index_bloomberg_billionairesResponse] {
      final def apply(c: HCursor): Decoder.Result[index_bloomberg_billionairesResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_rank <- c.downField("rank").as[String]

          p_name <- c.downField("name").as[String]

          p_totalnetworth <- c.downField("total_net_worth").as[String]

          p_lastchange <- c.downField("last_change").as[String]

          p_YTDchange <- c.downField("YTD_change").as[String]

          p_country <- c.downField("country").as[String]

          p_industry <- c.downField("industry").as[String]

        } yield {
          index_bloomberg_billionairesResponse(
            p_rank,
            p_name,
            p_totalnetworth,
            p_lastchange,
            p_YTDchange,
            p_country,
            p_industry
          )
        }
    }

}

object JsonItem_index_bloomberg_billionairesResponse
    extends Json_index_bloomberg_billionairesResponse
