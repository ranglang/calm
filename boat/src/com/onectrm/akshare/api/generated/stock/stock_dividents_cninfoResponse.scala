package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_dividents_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_dividents_cninfo 目标地址:
  * http://webapi.cninfo.com.cn/#/company?companyid=600009 描述: 巨潮资讯-个股-历史分红 限量: 单次获取指定股票的历史分红数据
  */
case class Respstock_dividents_cninfoResponse(
  `p_shi2shi1fang1an4gong1gao4ri4qi1`: String,
  `p_song4gu3bi3li4`: Double,
  `p_zhuan3zeng1bi3li4`: Double,
  `p_pai4xi1bi3li4`: Double,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_chu2quan2ri4`: String,
  `p_pai4xi1ri4`: String,
  `p_gu3fen4dao4zhang4ri4`: String,
  `p_shi2shi1fang1an4fen1hong2shuo1ming2`: String,
  `p_fen1hong2lei4xing2`: String,
  `p_bao4gao4shi2jian1`: String
)

case class stock_dividents_cninfoResponse(
  `p_shi2shi1fang1an4gong1gao4ri4qi1`: String,
  `p_song4gu3bi3li4`: Double,
  `p_zhuan3zeng1bi3li4`: Double,
  `p_pai4xi1bi3li4`: Double,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_chu2quan2ri4`: String,
  `p_pai4xi1ri4`: String,
  `p_gu3fen4dao4zhang4ri4`: String,
  `p_shi2shi1fang1an4fen1hong2shuo1ming2`: String,
  `p_fen1hong2lei4xing2`: String,
  `p_bao4gao4shi2jian1`: String
)

trait Json_stock_dividents_cninfoResponse {

  implicit val a_stock_dividents_cninfoResponse = new Decoder[stock_dividents_cninfoResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_dividents_cninfoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_shi2shi1fang1an4gong1gao4ri4qi1 <- c.downField("实施方案公告日期").as[String]

        p_song4gu3bi3li4 <- c.downField("送股比例").as[Double]

        p_zhuan3zeng1bi3li4 <- c.downField("转增比例").as[Double]

        p_pai4xi1bi3li4 <- c.downField("派息比例").as[Double]

        p_gu3quan2deng1ji4ri4 <- c.downField("股权登记日").as[String]

        p_chu2quan2ri4 <- c.downField("除权日").as[String]

        p_pai4xi1ri4 <- c.downField("派息日").as[String]

        p_gu3fen4dao4zhang4ri4 <- c.downField("股份到账日").as[String]

        p_shi2shi1fang1an4fen1hong2shuo1ming2 <- c.downField("实施方案分红说明").as[String]

        p_fen1hong2lei4xing2 <- c.downField("分红类型").as[String]

        p_bao4gao4shi2jian1 <- c.downField("报告时间").as[String]

      } yield {
        stock_dividents_cninfoResponse(
          p_shi2shi1fang1an4gong1gao4ri4qi1,
          p_song4gu3bi3li4,
          p_zhuan3zeng1bi3li4,
          p_pai4xi1bi3li4,
          p_gu3quan2deng1ji4ri4,
          p_chu2quan2ri4,
          p_pai4xi1ri4,
          p_gu3fen4dao4zhang4ri4,
          p_shi2shi1fang1an4fen1hong2shuo1ming2,
          p_fen1hong2lei4xing2,
          p_bao4gao4shi2jian1
        )
      }
  }

}

object JsonItem_stock_dividents_cninfoResponse extends Json_stock_dividents_cninfoResponse
