package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_purchase_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_purchase_em 目标地址:
  * http://fund.eastmoney.com/Fund_sgzt_bzdm.html#fcode,asc_1 描述: 东方财富网站-天天基金网-基金数据-基金申购状态 限量:
  * 单次返回当前时刻所有历史数据
  */
case class Respfund_purchase_emResponse(
  `p_xu4hao4`: Long,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_ji1jin1lei4xing2`: String,
  `p_zui4xin1jing4zhi2wan4fen4shou1yi4`: Double,
  `p_zui4xin1jing4zhi2wan4fen4shou1yi4bao4gao4shi2jian1`: String,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String,
  `p_xia4yi1kai1fang4ri4`: String,
  `p_gou4mai3qi3dian3`: Double,
  `p_ri4lei3ji4xian4ding4jin1e2`: Double,
  `p_shou3xu4fei4`: Double
)

case class fund_purchase_emResponse(
  `p_xu4hao4`: Long,
  `p_ji1jin1dai4ma3`: String,
  `p_ji1jin1jian3cheng1`: String,
  `p_ji1jin1lei4xing2`: String,
  `p_zui4xin1jing4zhi2wan4fen4shou1yi4`: Double,
  `p_zui4xin1jing4zhi2wan4fen4shou1yi4bao4gao4shi2jian1`: String,
  `p_shen1gou4zhuang4tai4`: String,
  `p_shu2hui2zhuang4tai4`: String,
  `p_xia4yi1kai1fang4ri4`: String,
  `p_gou4mai3qi3dian3`: Double,
  `p_ri4lei3ji4xian4ding4jin1e2`: Double,
  `p_shou3xu4fei4`: Double
)

trait Json_fund_purchase_emResponse {

  implicit val a_fund_purchase_emResponse = new Decoder[fund_purchase_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_purchase_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_ji1jin1dai4ma3 <- c.downField("基金代码").as[String]

        p_ji1jin1jian3cheng1 <- c.downField("基金简称").as[String]

        p_ji1jin1lei4xing2 <- c.downField("基金类型").as[String]

        p_zui4xin1jing4zhi2wan4fen4shou1yi4 <- c.downField("最新净值/万份收益").as[Double]

        p_zui4xin1jing4zhi2wan4fen4shou1yi4bao4gao4shi2jian1 <- c
          .downField("最新净值/万份收益-报告时间")
          .as[String]

        p_shen1gou4zhuang4tai4 <- c.downField("申购状态").as[String]

        p_shu2hui2zhuang4tai4 <- c.downField("赎回状态").as[String]

        p_xia4yi1kai1fang4ri4 <- c.downField("下一开放日").as[String]

        p_gou4mai3qi3dian3 <- c.downField("购买起点").as[Double]

        p_ri4lei3ji4xian4ding4jin1e2 <- c.downField("日累计限定金额").as[Double]

        p_shou3xu4fei4 <- c.downField("手续费").as[Double]

      } yield {
        fund_purchase_emResponse(
          p_xu4hao4,
          p_ji1jin1dai4ma3,
          p_ji1jin1jian3cheng1,
          p_ji1jin1lei4xing2,
          p_zui4xin1jing4zhi2wan4fen4shou1yi4,
          p_zui4xin1jing4zhi2wan4fen4shou1yi4bao4gao4shi2jian1,
          p_shen1gou4zhuang4tai4,
          p_shu2hui2zhuang4tai4,
          p_xia4yi1kai1fang4ri4,
          p_gou4mai3qi3dian3,
          p_ri4lei3ji4xian4ding4jin1e2,
          p_shou3xu4fei4
        )
      }
  }

}

object JsonItem_fund_purchase_emResponse extends Json_fund_purchase_emResponse
