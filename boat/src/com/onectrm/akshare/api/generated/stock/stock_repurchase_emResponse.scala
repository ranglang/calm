package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_repurchase_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_repurchase_em 目标地址: https://data.eastmoney.com/gphg/hglist.html 描述:
  * 东方财富网-数据中心-股票回购-股票回购数据 限量: 单次返回所有历史数据
  */
case class Respstock_repurchase_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_ji4hua4hui2gou4jia4ge2qu1jian1`: Double,
  `p_ji4hua4hui2gou4shu4liang4qu1jian1xia4xian4`: Double,
  `p_ji4hua4hui2gou4shu4liang4qu1jian1ping2jun1`: Double,
  `p_ji4hua4hui2gou4shu4liang4qu1jian1shang4xian4`: Double,
  `p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4xia4xian4`: Double,
  `p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4ping2jun1`: Double,
  `p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4shang4xian4`: Double,
  `p_ji4hua4hui2gou4jin1e2qu1jian1`: Double,
  `p_hui2gou4qi3shi3shi2jian1`: String,
  `p_shi2shi1jin4du4`: String,
  `p_yi3hui2gou4gu3fen4jia4ge2qu1jian1xia4xian4`: Double,
  `p_yi3hui2gou4gu3fen4jia4ge2qu1jian1ping2jun1`: Double,
  `p_yi3hui2gou4gu3fen4jia4ge2qu1jian1shang4xian4`: Double,
  `p_yi3hui2gou4gu3fen4shu4liang4`: Double,
  `p_yi3hui2gou4jin1e2`: Double,
  `p_zui4xin1gong1gao4ri4qi1`: String
)

case class stock_repurchase_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_ji4hua4hui2gou4jia4ge2qu1jian1`: Double,
  `p_ji4hua4hui2gou4shu4liang4qu1jian1xia4xian4`: Double,
  `p_ji4hua4hui2gou4shu4liang4qu1jian1ping2jun1`: Double,
  `p_ji4hua4hui2gou4shu4liang4qu1jian1shang4xian4`: Double,
  `p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4xia4xian4`: Double,
  `p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4ping2jun1`: Double,
  `p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4shang4xian4`: Double,
  `p_ji4hua4hui2gou4jin1e2qu1jian1`: Double,
  `p_hui2gou4qi3shi3shi2jian1`: String,
  `p_shi2shi1jin4du4`: String,
  `p_yi3hui2gou4gu3fen4jia4ge2qu1jian1xia4xian4`: Double,
  `p_yi3hui2gou4gu3fen4jia4ge2qu1jian1ping2jun1`: Double,
  `p_yi3hui2gou4gu3fen4jia4ge2qu1jian1shang4xian4`: Double,
  `p_yi3hui2gou4gu3fen4shu4liang4`: Double,
  `p_yi3hui2gou4jin1e2`: Double,
  `p_zui4xin1gong1gao4ri4qi1`: String
)

trait Json_stock_repurchase_emResponse {

  implicit val a_stock_repurchase_emResponse = new Decoder[stock_repurchase_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_repurchase_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_ji4hua4hui2gou4jia4ge2qu1jian1 <- c.downField("计划回购价格区间").as[Double]

        p_ji4hua4hui2gou4shu4liang4qu1jian1xia4xian4 <- c.downField("计划回购数量区间-下限").as[Double]

        p_ji4hua4hui2gou4shu4liang4qu1jian1ping2jun1 <- c.downField("计划回购数量区间-平均").as[Double]

        p_ji4hua4hui2gou4shu4liang4qu1jian1shang4xian4 <- c.downField("计划回购数量区间-上限").as[Double]

        p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4xia4xian4 <- c
          .downField("占公告前一日总股本比例-下限")
          .as[Double]

        p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4ping2jun1 <- c
          .downField("占公告前一日总股本比例-平均")
          .as[Double]

        p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4shang4xian4 <- c
          .downField("占公告前一日总股本比例-上限")
          .as[Double]

        p_ji4hua4hui2gou4jin1e2qu1jian1 <- c.downField("计划回购金额区间").as[Double]

        p_hui2gou4qi3shi3shi2jian1 <- c.downField("回购起始时间").as[String]

        p_shi2shi1jin4du4 <- c.downField("实施进度").as[String]

        p_yi3hui2gou4gu3fen4jia4ge2qu1jian1xia4xian4 <- c.downField("已回购股份价格区间-下限").as[Double]

        p_yi3hui2gou4gu3fen4jia4ge2qu1jian1ping2jun1 <- c.downField("已回购股份价格区间-平均").as[Double]

        p_yi3hui2gou4gu3fen4jia4ge2qu1jian1shang4xian4 <- c.downField("已回购股份价格区间-上限").as[Double]

        p_yi3hui2gou4gu3fen4shu4liang4 <- c.downField("已回购股份数量").as[Double]

        p_yi3hui2gou4jin1e2 <- c.downField("已回购金额").as[Double]

        p_zui4xin1gong1gao4ri4qi1 <- c.downField("最新公告日期").as[String]

      } yield {
        stock_repurchase_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_zui4xin1jia4,
          p_ji4hua4hui2gou4jia4ge2qu1jian1,
          p_ji4hua4hui2gou4shu4liang4qu1jian1xia4xian4,
          p_ji4hua4hui2gou4shu4liang4qu1jian1ping2jun1,
          p_ji4hua4hui2gou4shu4liang4qu1jian1shang4xian4,
          p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4xia4xian4,
          p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4ping2jun1,
          p_zhan4gong1gao4qian2yi1ri4zong3gu3ben3bi3li4shang4xian4,
          p_ji4hua4hui2gou4jin1e2qu1jian1,
          p_hui2gou4qi3shi3shi2jian1,
          p_shi2shi1jin4du4,
          p_yi3hui2gou4gu3fen4jia4ge2qu1jian1xia4xian4,
          p_yi3hui2gou4gu3fen4jia4ge2qu1jian1ping2jun1,
          p_yi3hui2gou4gu3fen4jia4ge2qu1jian1shang4xian4,
          p_yi3hui2gou4gu3fen4shu4liang4,
          p_yi3hui2gou4jin1e2,
          p_zui4xin1gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_repurchase_emResponse extends Json_stock_repurchase_emResponse
