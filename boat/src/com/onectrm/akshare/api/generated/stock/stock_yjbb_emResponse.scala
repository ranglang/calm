package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_yjbb_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_yjbb_em 目标地址: http://data.eastmoney.com/bbsj/202003/yjbb.html 描述:
  * 东方财富-数据中心-年报季报-业绩报表 限量: 单次获取指定 date 的业绩报告数据
  */
case class Respstock_yjbb_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_mei3gu3shou1yi4`: Double,
  `p_ying2ye4shou1ru4ying2ye4shou1ru4`: Double,
  `p_ying2ye4shou1ru4tong2bi3zeng1zhang3`: Double,
  `p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3`: Double,
  `p_jing4li4run4jing4li4run4`: Double,
  `p_jing4li4run4tong2bi3zeng1zhang3`: Double,
  `p_jing4li4run4ji4du4huan2bi3zeng1zhang3`: Double,
  `p_mei3gu3jing4zi1chan3`: Double,
  `p_jing4zi1chan3shou1yi4lu4`: Double,
  `p_mei3gu3jing1ying2xian4jin1liu2liang4`: Double,
  `p_xiao1shou4mao2li4lu4`: Double,
  `p_zui4xin1gong1gao4ri4qi1`: String
)

case class stock_yjbb_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_mei3gu3shou1yi4`: Double,
  `p_ying2ye4shou1ru4ying2ye4shou1ru4`: Double,
  `p_ying2ye4shou1ru4tong2bi3zeng1zhang3`: Double,
  `p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3`: Double,
  `p_jing4li4run4jing4li4run4`: Double,
  `p_jing4li4run4tong2bi3zeng1zhang3`: Double,
  `p_jing4li4run4ji4du4huan2bi3zeng1zhang3`: Double,
  `p_mei3gu3jing4zi1chan3`: Double,
  `p_jing4zi1chan3shou1yi4lu4`: Double,
  `p_mei3gu3jing1ying2xian4jin1liu2liang4`: Double,
  `p_xiao1shou4mao2li4lu4`: Double,
  `p_zui4xin1gong1gao4ri4qi1`: String
)

trait Json_stock_yjbb_emResponse {

  implicit val a_stock_yjbb_emResponse = new Decoder[stock_yjbb_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_yjbb_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_mei3gu3shou1yi4 <- c.downField("每股收益").as[Double]

        p_ying2ye4shou1ru4ying2ye4shou1ru4 <- c.downField("营业收入-营业收入").as[Double]

        p_ying2ye4shou1ru4tong2bi3zeng1zhang3 <- c.downField("营业收入-同比增长").as[Double]

        p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3 <- c.downField("营业收入-季度环比增长").as[Double]

        p_jing4li4run4jing4li4run4 <- c.downField("净利润-净利润").as[Double]

        p_jing4li4run4tong2bi3zeng1zhang3 <- c.downField("净利润-同比增长").as[Double]

        p_jing4li4run4ji4du4huan2bi3zeng1zhang3 <- c.downField("净利润-季度环比增长").as[Double]

        p_mei3gu3jing4zi1chan3 <- c.downField("每股净资产").as[Double]

        p_jing4zi1chan3shou1yi4lu4 <- c.downField("净资产收益率").as[Double]

        p_mei3gu3jing1ying2xian4jin1liu2liang4 <- c.downField("每股经营现金流量").as[Double]

        p_xiao1shou4mao2li4lu4 <- c.downField("销售毛利率").as[Double]

        p_zui4xin1gong1gao4ri4qi1 <- c.downField("最新公告日期").as[String]

      } yield {
        stock_yjbb_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_mei3gu3shou1yi4,
          p_ying2ye4shou1ru4ying2ye4shou1ru4,
          p_ying2ye4shou1ru4tong2bi3zeng1zhang3,
          p_ying2ye4shou1ru4ji4du4huan2bi3zeng1zhang3,
          p_jing4li4run4jing4li4run4,
          p_jing4li4run4tong2bi3zeng1zhang3,
          p_jing4li4run4ji4du4huan2bi3zeng1zhang3,
          p_mei3gu3jing4zi1chan3,
          p_jing4zi1chan3shou1yi4lu4,
          p_mei3gu3jing1ying2xian4jin1liu2liang4,
          p_xiao1shou4mao2li4lu4,
          p_zui4xin1gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_yjbb_emResponse extends Json_stock_yjbb_emResponse
