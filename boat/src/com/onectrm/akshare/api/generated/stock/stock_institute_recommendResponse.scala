package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_institute_recommendResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_institute_recommend 目标地址:
  * http://stock.finance.sina.com.cn/stock/go.php/vIR_RatingNewest/index.phtml 描述:
  * 新浪财经-机构推荐池-具体指标的数据 限量: 单次获取新浪财经-机构推荐池-具体指标的所有数据
  */
case class Respstock_institute_recommendResponse(
  `p_gen1ju4te4ding4indicatorer2ding4`: String
)

case class stock_institute_recommendResponse(
  `p_gen1ju4te4ding4indicatorer2ding4`: String
)

trait Json_stock_institute_recommendResponse {

  implicit val a_stock_institute_recommendResponse =
    new Decoder[stock_institute_recommendResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_institute_recommendResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_gen1ju4te4ding4indicatorer2ding4 <- c.downField("").as[String]

        } yield {
          stock_institute_recommendResponse(
            p_gen1ju4te4ding4indicatorer2ding4
          )
        }
    }

}

object JsonItem_stock_institute_recommendResponse extends Json_stock_institute_recommendResponse
