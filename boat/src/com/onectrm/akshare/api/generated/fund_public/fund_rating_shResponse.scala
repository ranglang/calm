package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_rating_shResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_rating_sh 目标地址: http://fund.eastmoney.com/data/fundrating_3.html 描述:
  * 获取天天基金网-基金评级-上海证券评级 限量: 单次返回指定交易日的所有基金评级数据
  */
case class Respfund_rating_shResponse(
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_ji1jin1gong1si1`: String,
  `p_3nian2qi1ping2ji23nian2ping2ji2`: Double,
  `p_3nian2qi1ping2ji2jiao4shang4qi1`: Double,
  `p_5nian2qi1ping2ji25nian2ping2ji2`: Double,
  `p_5nian2qi1ping2ji2jiao4shang4qi1`: Double,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4qi1`: String,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_jin41nian2zhang3fu2`: Double,
  `p_jin43nian2zhang3fu2`: Double,
  `p_jin45nian2zhang3fu2`: Double,
  `p_shou3xu4fei4`: String,
  `p_lei4xing2`: String
)

case class fund_rating_shResponse(
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_ji1jin1gong1si1`: String,
  `p_3nian2qi1ping2ji23nian2ping2ji2`: Double,
  `p_3nian2qi1ping2ji2jiao4shang4qi1`: Double,
  `p_5nian2qi1ping2ji25nian2ping2ji2`: Double,
  `p_5nian2qi1ping2ji2jiao4shang4qi1`: Double,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4qi1`: String,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_jin41nian2zhang3fu2`: Double,
  `p_jin43nian2zhang3fu2`: Double,
  `p_jin45nian2zhang3fu2`: Double,
  `p_shou3xu4fei4`: String,
  `p_lei4xing2`: String
)

trait Json_fund_rating_shResponse {

  implicit val a_fund_rating_shResponse = new Decoder[fund_rating_shResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_rating_shResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_jian3cheng1 <- c.downField("简称").as[String]

        p_ji1jin1jing1li3 <- c.downField("基金经理").as[String]

        p_ji1jin1gong1si1 <- c.downField("基金公司").as[String]

        p_3nian2qi1ping2ji23nian2ping2ji2 <- c.downField("3年期评级-3年评级").as[Double]

        p_3nian2qi1ping2ji2jiao4shang4qi1 <- c.downField("3年期评级-较上期").as[Double]

        p_5nian2qi1ping2ji25nian2ping2ji2 <- c.downField("5年期评级-5年评级").as[Double]

        p_5nian2qi1ping2ji2jiao4shang4qi1 <- c.downField("5年期评级-较上期").as[Double]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ri4zeng1zhang3lu4 <- c.downField("日增长率").as[Double]

        p_jin41nian2zhang3fu2 <- c.downField("近1年涨幅").as[Double]

        p_jin43nian2zhang3fu2 <- c.downField("近3年涨幅").as[Double]

        p_jin45nian2zhang3fu2 <- c.downField("近5年涨幅").as[Double]

        p_shou3xu4fei4 <- c.downField("手续费").as[String]

        p_lei4xing2 <- c.downField("类型").as[String]

      } yield {
        fund_rating_shResponse(
          p_dai4ma3,
          p_jian3cheng1,
          p_ji1jin1jing1li3,
          p_ji1jin1gong1si1,
          p_3nian2qi1ping2ji23nian2ping2ji2,
          p_3nian2qi1ping2ji2jiao4shang4qi1,
          p_5nian2qi1ping2ji25nian2ping2ji2,
          p_5nian2qi1ping2ji2jiao4shang4qi1,
          p_dan1wei4jing4zhi2,
          p_ri4qi1,
          p_ri4zeng1zhang3lu4,
          p_jin41nian2zhang3fu2,
          p_jin43nian2zhang3fu2,
          p_jin45nian2zhang3fu2,
          p_shou3xu4fei4,
          p_lei4xing2
        )
      }
  }

}

object JsonItem_fund_rating_shResponse extends Json_fund_rating_shResponse
