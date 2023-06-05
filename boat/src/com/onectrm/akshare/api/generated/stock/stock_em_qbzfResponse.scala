package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_qbzfResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_qbzf 目标地址: http://data.eastmoney.com/other/gkzf.html 描述:
  * 东方财富网-数据中心-新股数据-增发-全部增发 限量: 单次返回所有历史数据
  */
case class Respstock_em_qbzfResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zeng1fa1dai4ma3`: String,
  `p_fa1xing2fang1shi4`: String,
  `p_fa1xing2zong3shu4`: String,
  `p_wang3shang4fa1xing2`: String,
  `p_fa1xing2jia4ge2`: String,
  `p_zui4xin1jia4`: String,
  `p_fa1xing2ri4qi1`: String,
  `p_zeng1fa1shang4shi4ri4qi1`: String,
  `p_suo3ding4qi1`: String
)

case class stock_em_qbzfResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zeng1fa1dai4ma3`: String,
  `p_fa1xing2fang1shi4`: String,
  `p_fa1xing2zong3shu4`: String,
  `p_wang3shang4fa1xing2`: String,
  `p_fa1xing2jia4ge2`: String,
  `p_zui4xin1jia4`: String,
  `p_fa1xing2ri4qi1`: String,
  `p_zeng1fa1shang4shi4ri4qi1`: String,
  `p_suo3ding4qi1`: String
)

trait Json_stock_em_qbzfResponse {

  implicit val a_stock_em_qbzfResponse = new Decoder[stock_em_qbzfResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_qbzfResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_zeng1fa1dai4ma3 <- c.downField("增发代码").as[String]

        p_fa1xing2fang1shi4 <- c.downField("发行方式").as[String]

        p_fa1xing2zong3shu4 <- c.downField("发行总数").as[String]

        p_wang3shang4fa1xing2 <- c.downField("网上发行").as[String]

        p_fa1xing2jia4ge2 <- c.downField("发行价格").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[String]

        p_fa1xing2ri4qi1 <- c.downField("发行日期").as[String]

        p_zeng1fa1shang4shi4ri4qi1 <- c.downField("增发上市日期").as[String]

        p_suo3ding4qi1 <- c.downField("锁定期").as[String]

      } yield {
        stock_em_qbzfResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_zeng1fa1dai4ma3,
          p_fa1xing2fang1shi4,
          p_fa1xing2zong3shu4,
          p_wang3shang4fa1xing2,
          p_fa1xing2jia4ge2,
          p_zui4xin1jia4,
          p_fa1xing2ri4qi1,
          p_zeng1fa1shang4shi4ri4qi1,
          p_suo3ding4qi1
        )
      }
  }

}

object JsonItem_stock_em_qbzfResponse extends Json_stock_em_qbzfResponse
