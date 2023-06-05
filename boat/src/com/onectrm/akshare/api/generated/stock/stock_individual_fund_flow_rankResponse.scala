package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_individual_fund_flow_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_individual_fund_flow_rank 目标地址: http://data.eastmoney.com/zjlx/detail.html
  * 描述: 获取东方财富网-数据中心-资金流向-排名 限量: 单次获取指定类型的个股资金流排名数据
  */
case class Respstock_individual_fund_flow_rankResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_jin1ri4zhang3die1fu2`: Double,
  `p_jin1ri4zhu3li4jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4zhu3li4jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4chao1da4dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4chao1da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4da4dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4zhong1dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4zhong1dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4xiao3dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4xiao3dan1jing4liu2ru4jing4zhan4bi3`: Double
)

case class stock_individual_fund_flow_rankResponse(
  `p_xu4hao4`: Long,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_jin1ri4zhang3die1fu2`: Double,
  `p_jin1ri4zhu3li4jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4zhu3li4jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4chao1da4dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4chao1da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4da4dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4zhong1dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4zhong1dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_jin1ri4xiao3dan1jing4liu2ru4jing4e2`: Double,
  `p_jin1ri4xiao3dan1jing4liu2ru4jing4zhan4bi3`: Double
)

trait Json_stock_individual_fund_flow_rankResponse {

  implicit val a_stock_individual_fund_flow_rankResponse =
    new Decoder[stock_individual_fund_flow_rankResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_individual_fund_flow_rankResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Long]

          p_dai4ma3 <- c.downField("代码").as[String]

          p_ming2cheng1 <- c.downField("名称").as[String]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

          p_jin1ri4zhang3die1fu2 <- c.downField("今日涨跌幅").as[Double]

          p_jin1ri4zhu3li4jing4liu2ru4jing4e2 <- c.downField("今日主力净流入-净额").as[Double]

          p_jin1ri4zhu3li4jing4liu2ru4jing4zhan4bi3 <- c.downField("今日主力净流入-净占比").as[Double]

          p_jin1ri4chao1da4dan1jing4liu2ru4jing4e2 <- c.downField("今日超大单净流入-净额").as[Double]

          p_jin1ri4chao1da4dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("今日超大单净流入-净占比").as[Double]

          p_jin1ri4da4dan1jing4liu2ru4jing4e2 <- c.downField("今日大单净流入-净额").as[Double]

          p_jin1ri4da4dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("今日大单净流入-净占比").as[Double]

          p_jin1ri4zhong1dan1jing4liu2ru4jing4e2 <- c.downField("今日中单净流入-净额").as[Double]

          p_jin1ri4zhong1dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("今日中单净流入-净占比").as[Double]

          p_jin1ri4xiao3dan1jing4liu2ru4jing4e2 <- c.downField("今日小单净流入-净额").as[Double]

          p_jin1ri4xiao3dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("今日小单净流入-净占比").as[Double]

        } yield {
          stock_individual_fund_flow_rankResponse(
            p_xu4hao4,
            p_dai4ma3,
            p_ming2cheng1,
            p_zui4xin1jia4,
            p_jin1ri4zhang3die1fu2,
            p_jin1ri4zhu3li4jing4liu2ru4jing4e2,
            p_jin1ri4zhu3li4jing4liu2ru4jing4zhan4bi3,
            p_jin1ri4chao1da4dan1jing4liu2ru4jing4e2,
            p_jin1ri4chao1da4dan1jing4liu2ru4jing4zhan4bi3,
            p_jin1ri4da4dan1jing4liu2ru4jing4e2,
            p_jin1ri4da4dan1jing4liu2ru4jing4zhan4bi3,
            p_jin1ri4zhong1dan1jing4liu2ru4jing4e2,
            p_jin1ri4zhong1dan1jing4liu2ru4jing4zhan4bi3,
            p_jin1ri4xiao3dan1jing4liu2ru4jing4e2,
            p_jin1ri4xiao3dan1jing4liu2ru4jing4zhan4bi3
          )
        }
    }

}

object JsonItem_stock_individual_fund_flow_rankResponse
    extends Json_stock_individual_fund_flow_rankResponse
