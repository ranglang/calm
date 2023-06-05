package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lrb_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lrb_em 目标地址: http://data.eastmoney.com/bbsj/202003/lrb.html 描述:
  * 东方财富-数据中心-年报季报-业绩快报-利润表 限量: 单次获取指定 date 的利润表数据
  */
case class Respstock_lrb_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jing4li4run4`: Double,
  `p_jing4li4run4tong2bi3`: Double,
  `p_ying2ye4zong3shou1ru4`: Double,
  `p_ying2ye4zong3shou1ru4tong2bi3`: Double,
  `p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1`: Double,
  `p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4`: Double,
  `p_ying2ye4zong3zhi1chu1guan3li3fei4yong4`: Double,
  `p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4`: Double,
  `p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1`: Double,
  `p_ying2ye4li4run4`: Double,
  `p_li4run4zong3e2`: Double,
  `p_gong1gao4ri4qi1`: String
)

case class stock_lrb_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_jing4li4run4`: Double,
  `p_jing4li4run4tong2bi3`: Double,
  `p_ying2ye4zong3shou1ru4`: Double,
  `p_ying2ye4zong3shou1ru4tong2bi3`: Double,
  `p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1`: Double,
  `p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4`: Double,
  `p_ying2ye4zong3zhi1chu1guan3li3fei4yong4`: Double,
  `p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4`: Double,
  `p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1`: Double,
  `p_ying2ye4li4run4`: Double,
  `p_li4run4zong3e2`: Double,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_lrb_emResponse {

  implicit val a_stock_lrb_emResponse = new Decoder[stock_lrb_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lrb_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_jing4li4run4 <- c.downField("净利润").as[Double]

        p_jing4li4run4tong2bi3 <- c.downField("净利润同比").as[Double]

        p_ying2ye4zong3shou1ru4 <- c.downField("营业总收入").as[Double]

        p_ying2ye4zong3shou1ru4tong2bi3 <- c.downField("营业总收入同比").as[Double]

        p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1 <- c.downField("营业总支出-营业支出").as[Double]

        p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4 <- c.downField("营业总支出-销售费用").as[Double]

        p_ying2ye4zong3zhi1chu1guan3li3fei4yong4 <- c.downField("营业总支出-管理费用").as[Double]

        p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4 <- c.downField("营业总支出-财务费用").as[Double]

        p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1 <- c.downField("营业总支出-营业总支出").as[Double]

        p_ying2ye4li4run4 <- c.downField("营业利润").as[Double]

        p_li4run4zong3e2 <- c.downField("利润总额").as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_lrb_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_jing4li4run4,
          p_jing4li4run4tong2bi3,
          p_ying2ye4zong3shou1ru4,
          p_ying2ye4zong3shou1ru4tong2bi3,
          p_ying2ye4zong3zhi1chu1ying2ye4zhi1chu1,
          p_ying2ye4zong3zhi1chu1xiao1shou4fei4yong4,
          p_ying2ye4zong3zhi1chu1guan3li3fei4yong4,
          p_ying2ye4zong3zhi1chu1cai2wu4fei4yong4,
          p_ying2ye4zong3zhi1chu1ying2ye4zong3zhi1chu1,
          p_ying2ye4li4run4,
          p_li4run4zong3e2,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_lrb_emResponse extends Json_stock_lrb_emResponse
