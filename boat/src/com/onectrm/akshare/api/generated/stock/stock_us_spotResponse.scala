package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_us_spotResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_us_spot 目标地址: http://finance.sina.com.cn/stock/usstock/sector.shtml 描述:
  * 新浪财经-美股; 获取的数据有 15 分钟延迟; 建议使用 ak.stock_us_spot_em() 来获取数据 限量: 单次返回美股所有上市公司的实时行情数据
  */
case class Respstock_us_spotResponse(
  `p_xin1lang4mo4ren4`: String
)

case class stock_us_spotResponse(
  `p_xin1lang4mo4ren4`: String
)

trait Json_stock_us_spotResponse {

  implicit val a_stock_us_spotResponse = new Decoder[stock_us_spotResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_us_spotResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xin1lang4mo4ren4 <- c.downField("").as[String]

      } yield {
        stock_us_spotResponse(
          p_xin1lang4mo4ren4
        )
      }
  }

}

object JsonItem_stock_us_spotResponse extends Json_stock_us_spotResponse
