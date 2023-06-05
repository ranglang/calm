package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_fhps_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_fhps_em 目标地址: http://data.eastmoney.com/yjfp/ 描述: 东方财富-数据中心-年报季报-分红配送 限量:
  * 单次获取指定日期的分红配送数据
  */
case class Respstock_fhps_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4`: Double,
  `p_song4zhuan3gu3fen4song4zhuan3bi3li4`: Double,
  `p_song4zhuan3gu3fen4zhuan3gu3bi3li4`: Double,
  `p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4`: Double,
  `p_xian4jin1fen1hong2gu3xi1lu4`: Double,
  `p_mei3gu3shou1yi4`: Double,
  `p_mei3gu3jing4zi1chan3`: Double,
  `p_mei3gu3gong1ji1jin1`: Double,
  `p_mei3gu3wei4fen1pei4li4run4`: Double,
  `p_jing4li4run4tong2bi3zeng1zhang3`: Double,
  `p_zong3gu3ben3`: Integer,
  `p_yu4an4gong1gao4ri4`: String,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_chu2quan2chu2xi1ri4`: String,
  `p_fang1an4jin4du4`: String,
  `p_zui4xin1gong1gao4ri4qi1`: String
)

case class stock_fhps_emResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4`: Double,
  `p_song4zhuan3gu3fen4song4zhuan3bi3li4`: Double,
  `p_song4zhuan3gu3fen4zhuan3gu3bi3li4`: Double,
  `p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4`: Double,
  `p_xian4jin1fen1hong2gu3xi1lu4`: Double,
  `p_mei3gu3shou1yi4`: Double,
  `p_mei3gu3jing4zi1chan3`: Double,
  `p_mei3gu3gong1ji1jin1`: Double,
  `p_mei3gu3wei4fen1pei4li4run4`: Double,
  `p_jing4li4run4tong2bi3zeng1zhang3`: Double,
  `p_zong3gu3ben3`: Integer,
  `p_yu4an4gong1gao4ri4`: String,
  `p_gu3quan2deng1ji4ri4`: String,
  `p_chu2quan2chu2xi1ri4`: String,
  `p_fang1an4jin4du4`: String,
  `p_zui4xin1gong1gao4ri4qi1`: String
)

trait Json_stock_fhps_emResponse {

  implicit val a_stock_fhps_emResponse = new Decoder[stock_fhps_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_fhps_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4 <- c.downField("送转股份-送转总比例").as[Double]

        p_song4zhuan3gu3fen4song4zhuan3bi3li4 <- c.downField("送转股份-送转比例").as[Double]

        p_song4zhuan3gu3fen4zhuan3gu3bi3li4 <- c.downField("送转股份-转股比例").as[Double]

        p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4 <- c.downField("现金分红-现金分红比例").as[Double]

        p_xian4jin1fen1hong2gu3xi1lu4 <- c.downField("现金分红-股息率").as[Double]

        p_mei3gu3shou1yi4 <- c.downField("每股收益").as[Double]

        p_mei3gu3jing4zi1chan3 <- c.downField("每股净资产").as[Double]

        p_mei3gu3gong1ji1jin1 <- c.downField("每股公积金").as[Double]

        p_mei3gu3wei4fen1pei4li4run4 <- c.downField("每股未分配利润").as[Double]

        p_jing4li4run4tong2bi3zeng1zhang3 <- c.downField("净利润同比增长").as[Double]

        p_zong3gu3ben3 <- c.downField("总股本").as[Integer]

        p_yu4an4gong1gao4ri4 <- c.downField("预案公告日").as[String]

        p_gu3quan2deng1ji4ri4 <- c.downField("股权登记日").as[String]

        p_chu2quan2chu2xi1ri4 <- c.downField("除权除息日").as[String]

        p_fang1an4jin4du4 <- c.downField("方案进度").as[String]

        p_zui4xin1gong1gao4ri4qi1 <- c.downField("最新公告日期").as[String]

      } yield {
        stock_fhps_emResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_song4zhuan3gu3fen4song4zhuan3zong3bi3li4,
          p_song4zhuan3gu3fen4song4zhuan3bi3li4,
          p_song4zhuan3gu3fen4zhuan3gu3bi3li4,
          p_xian4jin1fen1hong2xian4jin1fen1hong2bi3li4,
          p_xian4jin1fen1hong2gu3xi1lu4,
          p_mei3gu3shou1yi4,
          p_mei3gu3jing4zi1chan3,
          p_mei3gu3gong1ji1jin1,
          p_mei3gu3wei4fen1pei4li4run4,
          p_jing4li4run4tong2bi3zeng1zhang3,
          p_zong3gu3ben3,
          p_yu4an4gong1gao4ri4,
          p_gu3quan2deng1ji4ri4,
          p_chu2quan2chu2xi1ri4,
          p_fang1an4jin4du4,
          p_zui4xin1gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_fhps_emResponse extends Json_stock_fhps_emResponse
