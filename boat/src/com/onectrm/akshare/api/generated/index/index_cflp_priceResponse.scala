package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.index_cflp_priceResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: index_cflp_price 目标地址: http://index.0256.cn/expx.htm 描述: 获取指定 symbol
  * 的中国公路物流运价指数的数据 限量: 只能获取近期的数据; 目前该接口数据源更新有几个交易日的延时
  */
case class Respindex_cflp_priceResponse(
  `p_ri4qi1shi2jian1`: String,
  `p_kai1pan2jia4`: Double,
  `p_dang1qian2jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double
)

case class index_cflp_priceResponse(
  `p_ri4qi1shi2jian1`: String,
  `p_kai1pan2jia4`: Double,
  `p_dang1qian2jia4`: Double,
  `p_zhang3die1`: Double,
  `p_zhang3die1fu2`: Double
)

trait Json_index_cflp_priceResponse {

  implicit val a_index_cflp_priceResponse = new Decoder[index_cflp_priceResponse] {
    final def apply(c: HCursor): Decoder.Result[index_cflp_priceResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1shi2jian1 <- c.downField("日期时间").as[String]

        p_kai1pan2jia4 <- c.downField("开盘价").as[Double]

        p_dang1qian2jia4 <- c.downField("当前价").as[Double]

        p_zhang3die1 <- c.downField("涨跌").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

      } yield {
        index_cflp_priceResponse(
          p_ri4qi1shi2jian1,
          p_kai1pan2jia4,
          p_dang1qian2jia4,
          p_zhang3die1,
          p_zhang3die1fu2
        )
      }
  }

}

object JsonItem_index_cflp_priceResponse extends Json_index_cflp_priceResponse
