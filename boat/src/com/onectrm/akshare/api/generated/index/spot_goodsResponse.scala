package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.spot_goodsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: spot_goods 目标地址:
  * http://finance.sina.com.cn/futuremarket/spotprice.shtml#titlePos_0 描述: 新浪财经-商品现货价格指数 限量: 返回指定
  * symbol 的数据
  */
case class Respspot_goodsResponse(
  `p_date`: String,
  `p_wci`: Double
)

case class spot_goodsResponse(
  `p_date`: String,
  `p_wci`: Double
)

trait Json_spot_goodsResponse {

  implicit val a_spot_goodsResponse = new Decoder[spot_goodsResponse] {
    final def apply(c: HCursor): Decoder.Result[spot_goodsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_date <- c.downField("date").as[String]

        p_wci <- c.downField("wci").as[Double]

      } yield {
        spot_goodsResponse(
          p_date,
          p_wci
        )
      }
  }

}

object JsonItem_spot_goodsResponse extends Json_spot_goodsResponse
