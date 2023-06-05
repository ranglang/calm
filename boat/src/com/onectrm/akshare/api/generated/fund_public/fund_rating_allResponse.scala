package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_rating_allResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_rating_all 目标地址: http://fund.eastmoney.com/data/fundrating.html 描述:
  * 获取天天基金网-基金评级-基金评级总汇 限量: 单次返回所有基金评级数据
  */
case class Respfund_rating_allResponse(
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_ji1jin1gong1si1`: String,
  `p_5xing1ping2ji2jia1shu4`: Double,
  `p_shang4hai3zheng4quan4`: Double,
  `p_zhao1shang1zheng4quan4`: Double,
  `p_ji4an1jin1xin4`: Double,
  `p_shou3xu4fei4`: String,
  `p_lei4xing2`: String
)

case class fund_rating_allResponse(
  `p_dai4ma3`: String,
  `p_jian3cheng1`: String,
  `p_ji1jin1jing1li3`: String,
  `p_ji1jin1gong1si1`: String,
  `p_5xing1ping2ji2jia1shu4`: Double,
  `p_shang4hai3zheng4quan4`: Double,
  `p_zhao1shang1zheng4quan4`: Double,
  `p_ji4an1jin1xin4`: Double,
  `p_shou3xu4fei4`: String,
  `p_lei4xing2`: String
)

trait Json_fund_rating_allResponse {

  implicit val a_fund_rating_allResponse = new Decoder[fund_rating_allResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_rating_allResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_jian3cheng1 <- c.downField("简称").as[String]

        p_ji1jin1jing1li3 <- c.downField("基金经理").as[String]

        p_ji1jin1gong1si1 <- c.downField("基金公司").as[String]

        p_5xing1ping2ji2jia1shu4 <- c.downField("5星评级家数").as[Double]

        p_shang4hai3zheng4quan4 <- c.downField("上海证券").as[Double]

        p_zhao1shang1zheng4quan4 <- c.downField("招商证券").as[Double]

        p_ji4an1jin1xin4 <- c.downField("济安金信").as[Double]

        p_shou3xu4fei4 <- c.downField("手续费").as[String]

        p_lei4xing2 <- c.downField("类型").as[String]

      } yield {
        fund_rating_allResponse(
          p_dai4ma3,
          p_jian3cheng1,
          p_ji1jin1jing1li3,
          p_ji1jin1gong1si1,
          p_5xing1ping2ji2jia1shu4,
          p_shang4hai3zheng4quan4,
          p_zhao1shang1zheng4quan4,
          p_ji4an1jin1xin4,
          p_shou3xu4fei4,
          p_lei4xing2
        )
      }
  }

}

object JsonItem_fund_rating_allResponse extends Json_fund_rating_allResponse
