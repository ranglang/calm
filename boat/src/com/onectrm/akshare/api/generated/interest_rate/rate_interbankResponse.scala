package com.onectrm.akshare.api.generated.interest_rate;

import com.onectrm.akshare.api.generated.interest_rate.rate_interbankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: interest_rate 接口: rate_interbank 目标地址:
  * http://data.eastmoney.com/shibor/shibor.aspx?m=sg&amp;t=88&amp;d=99333&amp;cu=sgd&amp;type=009065&amp;p=79
  * 描述: 东方财富-拆借利率一览-具体市场的具体品种的具体指标的拆借利率数据 限量: 返回所有历史数据
  */
case class Resprate_interbankResponse(
  `p_ri4qi1`: String,
  `p_li4lu4`: Double,
  `p_zhang3die1`: Double
)

case class rate_interbankResponse(
  `p_ri4qi1`: String,
  `p_li4lu4`: Double,
  `p_zhang3die1`: Double
)

trait Json_rate_interbankResponse {

  implicit val a_rate_interbankResponse = new Decoder[rate_interbankResponse] {
    final def apply(c: HCursor): Decoder.Result[rate_interbankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_li4lu4 <- c.downField("利率").as[Double]

        p_zhang3die1 <- c.downField("涨跌").as[Double]

      } yield {
        rate_interbankResponse(
          p_ri4qi1,
          p_li4lu4,
          p_zhang3die1
        )
      }
  }

}

object JsonItem_rate_interbankResponse extends Json_rate_interbankResponse
