package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_jgdy_tj_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_jgdy_tj_em 目标地址: http://data.eastmoney.com/jgdy/tj.html 描述:
  * 东方财富网-数据中心-特色数据-机构调研-机构调研统计 限量: 单次返回所有历史数据
  */
case class Respstock_jgdy_tj_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_jie1dai4ji1gou4shu4liang4`: Integer,
  `p_jie1dai4fang1shi4`: String,
  `p_jie1dai4ren2yuan2`: String,
  `p_jie1dai4di4dian3`: String,
  `p_jie1dai4ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String
)

case class stock_jgdy_tj_emResponse(
  `p_xu4hao4`: Integer,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_jie1dai4ji1gou4shu4liang4`: Integer,
  `p_jie1dai4fang1shi4`: String,
  `p_jie1dai4ren2yuan2`: String,
  `p_jie1dai4di4dian3`: String,
  `p_jie1dai4ri4qi1`: String,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_jgdy_tj_emResponse {

  implicit val a_stock_jgdy_tj_emResponse = new Decoder[stock_jgdy_tj_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_jgdy_tj_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_jie1dai4ji1gou4shu4liang4 <- c.downField("接待机构数量").as[Integer]

        p_jie1dai4fang1shi4 <- c.downField("接待方式").as[String]

        p_jie1dai4ren2yuan2 <- c.downField("接待人员").as[String]

        p_jie1dai4di4dian3 <- c.downField("接待地点").as[String]

        p_jie1dai4ri4qi1 <- c.downField("接待日期").as[String]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_jgdy_tj_emResponse(
          p_xu4hao4,
          p_dai4ma3,
          p_ming2cheng1,
          p_zui4xin1jia4,
          p_zhang3die1fu2,
          p_jie1dai4ji1gou4shu4liang4,
          p_jie1dai4fang1shi4,
          p_jie1dai4ren2yuan2,
          p_jie1dai4di4dian3,
          p_jie1dai4ri4qi1,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_jgdy_tj_emResponse extends Json_stock_jgdy_tj_emResponse
