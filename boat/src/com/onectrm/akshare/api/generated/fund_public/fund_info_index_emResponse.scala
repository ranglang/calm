package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_info_index_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_info_index_em 目标地址: http://fund.eastmoney.com/trade/zs.html 描述:
  * 东方财富网-天天基金网-基金数据-基金基本信息-指数型 限量: 单次返回当前时刻所有历史数据
  */
case class Respfund_info_index_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1ming2cheng1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4qi1`: String,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_jin41zhou1`: Double,
  `p_jin41yue4`: Double,
  `p_jin43yue4`: Double,
  `p_jin46yue4`: Double,
  `p_jin41nian2`: Double,
  `p_jin42nian2`: Double,
  `p_jin43nian2`: Double,
  `p_jin1nian2lai2`: Double,
  `p_cheng2li4lai2`: Double,
  `p_shou3xu4fei4`: Double,
  `p_qi3gou4jin1e2`: String,
  `p_gen1zong1biao1de5`: String,
  `p_gen1zong1fang1shi4`: String
)

case class fund_info_index_emResponse(
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1ming2cheng1`: String,
  `p_dan1wei4jing4zhi2`: Double,
  `p_ri4qi1`: String,
  `p_ri4zeng1zhang3lu4`: Double,
  `p_jin41zhou1`: Double,
  `p_jin41yue4`: Double,
  `p_jin43yue4`: Double,
  `p_jin46yue4`: Double,
  `p_jin41nian2`: Double,
  `p_jin42nian2`: Double,
  `p_jin43nian2`: Double,
  `p_jin1nian2lai2`: Double,
  `p_cheng2li4lai2`: Double,
  `p_shou3xu4fei4`: Double,
  `p_qi3gou4jin1e2`: String,
  `p_gen1zong1biao1de5`: String,
  `p_gen1zong1fang1shi4`: String
)

trait Json_fund_info_index_emResponse {

  implicit val a_fund_info_index_emResponse = new Decoder[fund_info_index_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_info_index_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1ming2cheng1 <- c.downField("基金名称").as[String]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_ri4zeng1zhang3lu4 <- c.downField("日增长率").as[Double]

        p_jin41zhou1 <- c.downField("近1周").as[Double]

        p_jin41yue4 <- c.downField("近1月").as[Double]

        p_jin43yue4 <- c.downField("近3月").as[Double]

        p_jin46yue4 <- c.downField("近6月").as[Double]

        p_jin41nian2 <- c.downField("近1年").as[Double]

        p_jin42nian2 <- c.downField("近2年").as[Double]

        p_jin43nian2 <- c.downField("近3年").as[Double]

        p_jin1nian2lai2 <- c.downField("今年来").as[Double]

        p_cheng2li4lai2 <- c.downField("成立来").as[Double]

        p_shou3xu4fei4 <- c.downField("手续费").as[Double]

        p_qi3gou4jin1e2 <- c.downField("起购金额").as[String]

        p_gen1zong1biao1de5 <- c.downField("跟踪标的").as[String]

        p_gen1zong1fang1shi4 <- c.downField("跟踪方式").as[String]

      } yield {
        fund_info_index_emResponse(
          p_ji1jin1dai4ma3,
          p_ji1jin1ming2cheng1,
          p_dan1wei4jing4zhi2,
          p_ri4qi1,
          p_ri4zeng1zhang3lu4,
          p_jin41zhou1,
          p_jin41yue4,
          p_jin43yue4,
          p_jin46yue4,
          p_jin41nian2,
          p_jin42nian2,
          p_jin43nian2,
          p_jin1nian2lai2,
          p_cheng2li4lai2,
          p_shou3xu4fei4,
          p_qi3gou4jin1e2,
          p_gen1zong1biao1de5,
          p_gen1zong1fang1shi4
        )
      }
  }

}

object JsonItem_fund_info_index_emResponse extends Json_fund_info_index_emResponse
