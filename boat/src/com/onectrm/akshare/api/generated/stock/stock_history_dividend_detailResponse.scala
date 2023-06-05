package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_history_dividend_detailResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_history_dividend_detail 目标地址:
  * https://vip.stock.finance.sina.com.cn/corp/go.php/vISSUE_ShareBonus/stockid/300670.phtml 描述:
  * 新浪财经-发行与分配-分红配股 限量: 单次获取指定股票的新浪财经-发行与分配-分红配股详情
  */
case class Respstock_history_dividend_detailResponse(
  `p_gong1gao4ri4qi1`: String,
  `p_song4gu3`: Integer,
  `p_zhuan3zeng1`: Integer,
  `p_pai4xi1`: Double,
  `p_jin4du4`: String,
  `p_chu2quan2chu2xi1ri4`: String,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_hong2gu3shang4shi4ri4`: String
)

case class stock_history_dividend_detailResponse(
  `p_gong1gao4ri4qi1`: String,
  `p_song4gu3`: Integer,
  `p_zhuan3zeng1`: Integer,
  `p_pai4xi1`: Double,
  `p_jin4du4`: String,
  `p_chu2quan2chu2xi1ri4`: String,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_hong2gu3shang4shi4ri4`: String
)

trait Json_stock_history_dividend_detailResponse {

  implicit val a_stock_history_dividend_detailResponse =
    new Decoder[stock_history_dividend_detailResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_history_dividend_detailResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

          p_song4gu3 <- c.downField("送股").as[Integer]

          p_zhuan3zeng1 <- c.downField("转增").as[Integer]

          p_pai4xi1 <- c.downField("派息").as[Double]

          p_jin4du4 <- c.downField("进度").as[String]

          p_chu2quan2chu2xi1ri4 <- c.downField("除权除息日").as[String]

          p_gu3quan2deng1ji4ri4 <- c.downField("股权登记日").as[String]

          p_hong2gu3shang4shi4ri4 <- c.downField("红股上市日").as[String]

        } yield {
          stock_history_dividend_detailResponse(
            p_gong1gao4ri4qi1,
            p_song4gu3,
            p_zhuan3zeng1,
            p_pai4xi1,
            p_jin4du4,
            p_chu2quan2chu2xi1ri4,
            p_gu3quan2deng1ji4ri4,
            p_hong2gu3shang4shi4ri4
          )
        }
    }

}

object JsonItem_stock_history_dividend_detailResponse
    extends Json_stock_history_dividend_detailResponse
