package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_pgResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_pg 目标地址: http://data.eastmoney.com/xg/pg/ 描述: 东方财富网-数据中心-新股数据-配股 限量:
  * 单次返回所有历史数据
  */
case class Respstock_em_pgResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_pei4shou4dai4ma3`: String,
  `p_pei4gu3shu4liang4`: String,
  `p_pei4gu3bi3li4`: String,
  `p_pei4gu3jia4`: String,
  `p_zui4xin1jia4`: String,
  `p_pei4gu3qian2zong3gu3ben3`: String,
  `p_pei4gu3hou4zong3gu3ben3`: String,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_jiao3kuan3qi3shi3ri4qi1`: String,
  `p_jiao3kuan3jie2zhi3ri4qi1`: String,
  `p_shang4shi4ri4`: String
)

case class stock_em_pgResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_pei4shou4dai4ma3`: String,
  `p_pei4gu3shu4liang4`: String,
  `p_pei4gu3bi3li4`: String,
  `p_pei4gu3jia4`: String,
  `p_zui4xin1jia4`: String,
  `p_pei4gu3qian2zong3gu3ben3`: String,
  `p_pei4gu3hou4zong3gu3ben3`: String,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_jiao3kuan3qi3shi3ri4qi1`: String,
  `p_jiao3kuan3jie2zhi3ri4qi1`: String,
  `p_shang4shi4ri4`: String
)

trait Json_stock_em_pgResponse {

  implicit val a_stock_em_pgResponse = new Decoder[stock_em_pgResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_pgResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_pei4shou4dai4ma3 <- c.downField("配售代码").as[String]

        p_pei4gu3shu4liang4 <- c.downField("配股数量").as[String]

        p_pei4gu3bi3li4 <- c.downField("配股比例").as[String]

        p_pei4gu3jia4 <- c.downField("配股价").as[String]

        p_zui4xin1jia4 <- c.downField("最新价").as[String]

        p_pei4gu3qian2zong3gu3ben3 <- c.downField("配股前总股本").as[String]

        p_pei4gu3hou4zong3gu3ben3 <- c.downField("配股后总股本").as[String]

        p_gu3quan2deng1ji4ri4 <- c.downField("股权登记日").as[String]

        p_jiao3kuan3qi3shi3ri4qi1 <- c.downField("缴款起始日期").as[String]

        p_jiao3kuan3jie2zhi3ri4qi1 <- c.downField("缴款截止日期").as[String]

        p_shang4shi4ri4 <- c.downField("上市日").as[String]

      } yield {
        stock_em_pgResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_pei4shou4dai4ma3,
          p_pei4gu3shu4liang4,
          p_pei4gu3bi3li4,
          p_pei4gu3jia4,
          p_zui4xin1jia4,
          p_pei4gu3qian2zong3gu3ben3,
          p_pei4gu3hou4zong3gu3ben3,
          p_gu3quan2deng1ji4ri4,
          p_jiao3kuan3qi3shi3ri4qi1,
          p_jiao3kuan3jie2zhi3ri4qi1,
          p_shang4shi4ri4
        )
      }
  }

}

object JsonItem_stock_em_pgResponse extends Json_stock_em_pgResponse
