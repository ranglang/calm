package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_em_hk_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_em_hk_rank 目标地址: http://overseas.1234567.com.cn/FundList 描述:
  * 获取东方财富网-数据中心-基金排行-香港基金排行 限量: 单次返回当前时刻所有数据
  */
case class Respfund_em_hk_rankResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_bi4zhong3`: String,
  `p_ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
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
  `p_ke3gou4mai3`: Double,
  `p_xiang1gang3ji1jin1dai4ma3`: String
)

case class fund_em_hk_rankResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_bi4zhong3`: String,
  `p_ri4qi1`: String,
  `p_dan1wei4jing4zhi2`: Double,
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
  `p_ke3gou4mai3`: Double,
  `p_xiang1gang3ji1jin1dai4ma3`: String
)

trait Json_fund_em_hk_rankResponse {

  implicit val a_fund_em_hk_rankResponse = new Decoder[fund_em_hk_rankResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_em_hk_rankResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_bi4zhong3 <- c.downField("币种").as[String]

        p_ri4qi1 <- c.downField("日期").as[String]

        p_dan1wei4jing4zhi2 <- c.downField("单位净值").as[Double]

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

        p_ke3gou4mai3 <- c.downField("可购买").as[Double]

        p_xiang1gang3ji1jin1dai4ma3 <- c.downField("香港基金代码").as[String]

      } yield {
        fund_em_hk_rankResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_bi4zhong3,
          p_ri4qi1,
          p_dan1wei4jing4zhi2,
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
          p_ke3gou4mai3,
          p_xiang1gang3ji1jin1dai4ma3
        )
      }
  }

}

object JsonItem_fund_em_hk_rankResponse extends Json_fund_em_hk_rankResponse
