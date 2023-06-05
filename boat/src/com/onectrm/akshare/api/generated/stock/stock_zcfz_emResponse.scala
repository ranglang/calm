package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zcfz_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zcfz_em 目标地址: http://data.eastmoney.com/bbsj/202003/zcfz.html 描述:
  * 东方财富-数据中心-年报季报-业绩快报-资产负债表 限量: 单次获取指定 date 的资产负债表数据
  */
case class Respstock_zcfz_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zi1chan3huo4bi4zi1jin1`: Double,
  `p_zi1chan3ying1shou1zhang4kuan3`: Double,
  `p_zi1chan3cun2huo4`: Double,
  `p_zi1chan3zong3zi1chan3`: Double,
  `p_zi1chan3zong3zi1chan3tong2bi3`: Double,
  `p_fu4zhai4ying1fu4zhang4kuan3`: Double,
  `p_fu4zhai4zong3fu4zhai4`: Double,
  `p_fu4zhai4yu4shou1zhang4kuan3`: Double,
  `p_fu4zhai4zong3fu4zhai4tong2bi3`: Double,
  `p_zi1chan3fu4zhai4lu4`: Double,
  `p_gu3dong1quan2yi4he2ji4`: Double,
  `p_gong1gao4ri4qi1`: String
)

case class stock_zcfz_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zi1chan3huo4bi4zi1jin1`: Double,
  `p_zi1chan3ying1shou1zhang4kuan3`: Double,
  `p_zi1chan3cun2huo4`: Double,
  `p_zi1chan3zong3zi1chan3`: Double,
  `p_zi1chan3zong3zi1chan3tong2bi3`: Double,
  `p_fu4zhai4ying1fu4zhang4kuan3`: Double,
  `p_fu4zhai4zong3fu4zhai4`: Double,
  `p_fu4zhai4yu4shou1zhang4kuan3`: Double,
  `p_fu4zhai4zong3fu4zhai4tong2bi3`: Double,
  `p_zi1chan3fu4zhai4lu4`: Double,
  `p_gu3dong1quan2yi4he2ji4`: Double,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_zcfz_emResponse {

  implicit val a_stock_zcfz_emResponse = new Decoder[stock_zcfz_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_zcfz_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_zi1chan3huo4bi4zi1jin1 <- c.downField("资产-货币资金").as[Double]

        p_zi1chan3ying1shou1zhang4kuan3 <- c.downField("资产-应收账款").as[Double]

        p_zi1chan3cun2huo4 <- c.downField("资产-存货").as[Double]

        p_zi1chan3zong3zi1chan3 <- c.downField("资产-总资产").as[Double]

        p_zi1chan3zong3zi1chan3tong2bi3 <- c.downField("资产-总资产同比").as[Double]

        p_fu4zhai4ying1fu4zhang4kuan3 <- c.downField("负债-应付账款").as[Double]

        p_fu4zhai4zong3fu4zhai4 <- c.downField("负债-总负债").as[Double]

        p_fu4zhai4yu4shou1zhang4kuan3 <- c.downField("负债-预收账款").as[Double]

        p_fu4zhai4zong3fu4zhai4tong2bi3 <- c.downField("负债-总负债同比").as[Double]

        p_zi1chan3fu4zhai4lu4 <- c.downField("资产负债率").as[Double]

        p_gu3dong1quan2yi4he2ji4 <- c.downField("股东权益合计").as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_zcfz_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_zi1chan3huo4bi4zi1jin1,
          p_zi1chan3ying1shou1zhang4kuan3,
          p_zi1chan3cun2huo4,
          p_zi1chan3zong3zi1chan3,
          p_zi1chan3zong3zi1chan3tong2bi3,
          p_fu4zhai4ying1fu4zhang4kuan3,
          p_fu4zhai4zong3fu4zhai4,
          p_fu4zhai4yu4shou1zhang4kuan3,
          p_fu4zhai4zong3fu4zhai4tong2bi3,
          p_zi1chan3fu4zhai4lu4,
          p_gu3dong1quan2yi4he2ji4,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_zcfz_emResponse extends Json_stock_zcfz_emResponse
