package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sector_fund_flow_rankResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sector_fund_flow_rank 目标地址: http://data.eastmoney.com/bkzj/hy.html 描述:
  * 东方财富网-数据中心-资金流向-板块资金流-排名 限量: 单次获取指定板块的指定期限的资金流排名数据
  */
case class Respstock_sector_fund_flow_rankResponse(
  `p_ming2cheng1`: String,
  `p_jin1ri4zhang3die1fu2`: String,
  `p_zhu3li4jing4liu2ru4jing4e2`: Double,
  `p_zhu3li4jing4liu2ru4jing4zhan4bi3`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4e2`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_da4dan1jing4liu2ru4jing4e2`: Double,
  `p_da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_zhong1dan1jing4liu2ru4jing4e2`: Double,
  `p_zhong1dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_xiao3dan1jing4liu2ru4jing4e2`: Double,
  `p_xiao3dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_zhu3li4jing4liu2ru4zui4da4gu3`: Double
)

case class stock_sector_fund_flow_rankResponse(
  `p_ming2cheng1`: String,
  `p_jin1ri4zhang3die1fu2`: String,
  `p_zhu3li4jing4liu2ru4jing4e2`: Double,
  `p_zhu3li4jing4liu2ru4jing4zhan4bi3`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4e2`: Double,
  `p_chao1da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_da4dan1jing4liu2ru4jing4e2`: Double,
  `p_da4dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_zhong1dan1jing4liu2ru4jing4e2`: Double,
  `p_zhong1dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_xiao3dan1jing4liu2ru4jing4e2`: Double,
  `p_xiao3dan1jing4liu2ru4jing4zhan4bi3`: Double,
  `p_zhu3li4jing4liu2ru4zui4da4gu3`: Double
)

trait Json_stock_sector_fund_flow_rankResponse {

  implicit val a_stock_sector_fund_flow_rankResponse =
    new Decoder[stock_sector_fund_flow_rankResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_sector_fund_flow_rankResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ming2cheng1 <- c.downField("名称").as[String]

          p_jin1ri4zhang3die1fu2 <- c.downField("今日涨跌幅").as[String]

          p_zhu3li4jing4liu2ru4jing4e2 <- c.downField("主力净流入-净额").as[Double]

          p_zhu3li4jing4liu2ru4jing4zhan4bi3 <- c.downField("主力净流入-净占比").as[Double]

          p_chao1da4dan1jing4liu2ru4jing4e2 <- c.downField("超大单净流入-净额").as[Double]

          p_chao1da4dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("超大单净流入-净占比").as[Double]

          p_da4dan1jing4liu2ru4jing4e2 <- c.downField("大单净流入-净额").as[Double]

          p_da4dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("大单净流入-净占比").as[Double]

          p_zhong1dan1jing4liu2ru4jing4e2 <- c.downField("中单净流入-净额").as[Double]

          p_zhong1dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("中单净流入-净占比").as[Double]

          p_xiao3dan1jing4liu2ru4jing4e2 <- c.downField("小单净流入-净额").as[Double]

          p_xiao3dan1jing4liu2ru4jing4zhan4bi3 <- c.downField("小单净流入-净占比").as[Double]

          p_zhu3li4jing4liu2ru4zui4da4gu3 <- c.downField("主力净流入最大股").as[Double]

        } yield {
          stock_sector_fund_flow_rankResponse(
            p_ming2cheng1,
            p_jin1ri4zhang3die1fu2,
            p_zhu3li4jing4liu2ru4jing4e2,
            p_zhu3li4jing4liu2ru4jing4zhan4bi3,
            p_chao1da4dan1jing4liu2ru4jing4e2,
            p_chao1da4dan1jing4liu2ru4jing4zhan4bi3,
            p_da4dan1jing4liu2ru4jing4e2,
            p_da4dan1jing4liu2ru4jing4zhan4bi3,
            p_zhong1dan1jing4liu2ru4jing4e2,
            p_zhong1dan1jing4liu2ru4jing4zhan4bi3,
            p_xiao3dan1jing4liu2ru4jing4e2,
            p_xiao3dan1jing4liu2ru4jing4zhan4bi3,
            p_zhu3li4jing4liu2ru4zui4da4gu3
          )
        }
    }

}

object JsonItem_stock_sector_fund_flow_rankResponse extends Json_stock_sector_fund_flow_rankResponse
