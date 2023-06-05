package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_em_sy_jz_listResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_em_sy_jz_list 目标地址: http://data.eastmoney.com/sy/jzlist.html 描述:
  * 获取东方财富网-数据中心-特色数据-商誉-个股商誉减值明细 限量: 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_em_sy_jz_listResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: Double,
  `p_shang1yu4yuan2`: Double,
  `p_shang1yu4jian3zhi2yuan2`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4`: Double,
  `p_jing4li4run4yuan2`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4`: Double,
  `p_gong1gao4ri4qi1`: String
)

case class stock_em_sy_jz_listResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: Double,
  `p_shang1yu4yuan2`: Double,
  `p_shang1yu4jian3zhi2yuan2`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4`: Double,
  `p_jing4li4run4yuan2`: Double,
  `p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4`: Double,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_em_sy_jz_listResponse {

  implicit val a_stock_em_sy_jz_listResponse = new Decoder[stock_em_sy_jz_listResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_em_sy_jz_listResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[Double]

        p_shang1yu4yuan2 <- c.downField("商誉(元)").as[Double]

        p_shang1yu4jian3zhi2yuan2 <- c.downField("商誉减值(元)").as[Double]

        p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4 <- c.downField("商誉减值占净资产比例(%)").as[Double]

        p_jing4li4run4yuan2 <- c.downField("净利润(元)").as[Double]

        p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4 <- c.downField("商誉减值占净利润比例(%)").as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_em_sy_jz_listResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_shang1yu4yuan2,
          p_shang1yu4jian3zhi2yuan2,
          p_shang1yu4jian3zhi2zhan4jing4zi1chan3bi3li4,
          p_jing4li4run4yuan2,
          p_shang1yu4jian3zhi2zhan4jing4li4run4bi3li4,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_em_sy_jz_listResponse extends Json_stock_em_sy_jz_listResponse
