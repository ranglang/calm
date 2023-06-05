package com.onectrm.akshare.api.generated.fx;

import com.onectrm.akshare.api.generated.fx.currency_boc_sinaResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fx 接口: currency_boc_sina 目标地址:
  * http://biz.finance.sina.com.cn/forex/forex.php?startdate=2012-01-01&amp;enddate=2021-06-14&amp;money_code=EUR&amp;type=0
  * 描述: 新浪财经-中行人民币牌价历史数据 限量: 单次返回指定日期的所有历史数据
  */
case class Respcurrency_boc_sinaResponse(
  `p_ri4qi1`: String,
  `p_zhong1xing2hui4mai3jia4`: Double,
  `p_zhong1xing2chao1mai3jia4`: Double,
  `p_zhong1xing2chao1mai4jia4hui4mai4jia4`: Double,
  `p_yang1xing2zhong1jian1jia4`: Double
)

case class currency_boc_sinaResponse(
  `p_ri4qi1`: String,
  `p_zhong1xing2hui4mai3jia4`: Double,
  `p_zhong1xing2chao1mai3jia4`: Double,
  `p_zhong1xing2chao1mai4jia4hui4mai4jia4`: Double,
  `p_yang1xing2zhong1jian1jia4`: Double
)

trait Json_currency_boc_sinaResponse {

  implicit val a_currency_boc_sinaResponse = new Decoder[currency_boc_sinaResponse] {
    final def apply(c: HCursor): Decoder.Result[currency_boc_sinaResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_zhong1xing2hui4mai3jia4 <- c.downField("中行汇买价").as[Double]

        p_zhong1xing2chao1mai3jia4 <- c.downField("中行钞买价").as[Double]

        p_zhong1xing2chao1mai4jia4hui4mai4jia4 <- c.downField("中行钞卖价/汇卖价").as[Double]

        p_yang1xing2zhong1jian1jia4 <- c.downField("央行中间价").as[Double]

      } yield {
        currency_boc_sinaResponse(
          p_ri4qi1,
          p_zhong1xing2hui4mai3jia4,
          p_zhong1xing2chao1mai3jia4,
          p_zhong1xing2chao1mai4jia4hui4mai4jia4,
          p_yang1xing2zhong1jian1jia4
        )
      }
  }

}

object JsonItem_currency_boc_sinaResponse extends Json_currency_boc_sinaResponse
