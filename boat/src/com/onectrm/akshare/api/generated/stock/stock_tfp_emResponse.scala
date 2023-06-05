package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_tfp_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_tfp_em 目标地址: http://data.eastmoney.com/tfpxx/ 描述: 东方财富网-数据中心-特色数据-两市停复牌 限量:
  * 单次获取指定 date 的停复牌数据, 具体更新逻辑跟目标网页统一
  */
case class Respstock_tfp_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_ting2pai2shi2jian1`: String,
  `p_ting2pai2jie2zhi3shi2jian1`: String,
  `p_ting2pai2qi1xian4`: String,
  `p_ting2pai2yuan2yin1`: String,
  `p_suo3shu3shi4chang3`: String,
  `p_yu4ji4fu4pai2shi2jian1`: String
)

case class stock_tfp_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_ting2pai2shi2jian1`: String,
  `p_ting2pai2jie2zhi3shi2jian1`: String,
  `p_ting2pai2qi1xian4`: String,
  `p_ting2pai2yuan2yin1`: String,
  `p_suo3shu3shi4chang3`: String,
  `p_yu4ji4fu4pai2shi2jian1`: String
)

trait Json_stock_tfp_emResponse {

  implicit val a_stock_tfp_emResponse = new Decoder[stock_tfp_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_tfp_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_ting2pai2shi2jian1 <- c.downField("停牌时间").as[String]

        p_ting2pai2jie2zhi3shi2jian1 <- c.downField("停牌截止时间").as[String]

        p_ting2pai2qi1xian4 <- c.downField("停牌期限").as[String]

        p_ting2pai2yuan2yin1 <- c.downField("停牌原因").as[String]

        p_suo3shu3shi4chang3 <- c.downField("所属市场").as[String]

        p_yu4ji4fu4pai2shi2jian1 <- c.downField("预计复牌时间").as[String]

      } yield {
        stock_tfp_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_ting2pai2shi2jian1,
          p_ting2pai2jie2zhi3shi2jian1,
          p_ting2pai2qi1xian4,
          p_ting2pai2yuan2yin1,
          p_suo3shu3shi4chang3,
          p_yu4ji4fu4pai2shi2jian1
        )
      }
  }

}

object JsonItem_stock_tfp_emResponse extends Json_stock_tfp_emResponse
