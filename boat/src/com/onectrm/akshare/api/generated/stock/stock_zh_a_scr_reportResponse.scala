package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_scr_reportResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_scr_report 目标地址:
  * http://stockdata.stock.hexun.com/zrbg/Plate.aspx?date=2010-12-31# 描述: 和讯财经-企业社会责任数据; 年度更新 限量:
  * 单次返回指定 year 和 need_page 的数据
  */
case class Respstock_zh_a_scr_reportResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4ming2cheng1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_zong3de2fen1`: Double,
  `p_deng3ji2`: String,
  `p_gu3dong1ze2ren4`: Double,
  `p_yuan2gong1ze2ren4`: Double,
  `p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4`: Double,
  `p_huan2jing4ze2ren4`: Double,
  `p_she4hui4ze2ren4`: Double
)

case class stock_zh_a_scr_reportResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4ming2cheng1`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_zong3de2fen1`: Double,
  `p_deng3ji2`: String,
  `p_gu3dong1ze2ren4`: Double,
  `p_yuan2gong1ze2ren4`: Double,
  `p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4`: Double,
  `p_huan2jing4ze2ren4`: Double,
  `p_she4hui4ze2ren4`: Double
)

trait Json_stock_zh_a_scr_reportResponse {

  implicit val a_stock_zh_a_scr_reportResponse = new Decoder[stock_zh_a_scr_reportResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zh_a_scr_reportResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_zong3de2fen1 <- c.downField("总得分").as[Double]

        p_deng3ji2 <- c.downField("等级").as[String]

        p_gu3dong1ze2ren4 <- c.downField("股东责任").as[Double]

        p_yuan2gong1ze2ren4 <- c.downField("员工责任").as[Double]

        p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4 <- c
          .downField("供应商、客户和消费者权益责任")
          .as[Double]

        p_huan2jing4ze2ren4 <- c.downField("环境责任").as[Double]

        p_she4hui4ze2ren4 <- c.downField("社会责任").as[Double]

      } yield {
        stock_zh_a_scr_reportResponse(
          p_xu4hao4,
          p_gu3piao4ming2cheng1,
          p_gu3piao4dai4ma3,
          p_zong3de2fen1,
          p_deng3ji2,
          p_gu3dong1ze2ren4,
          p_yuan2gong1ze2ren4,
          p_gong1ying1shang1ke4hu4he2xiao1fei4zhe3quan2yi4ze2ren4,
          p_huan2jing4ze2ren4,
          p_she4hui4ze2ren4
        )
      }
  }

}

object JsonItem_stock_zh_a_scr_reportResponse extends Json_stock_zh_a_scr_reportResponse
