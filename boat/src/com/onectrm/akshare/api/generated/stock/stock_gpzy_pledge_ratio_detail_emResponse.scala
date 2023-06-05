package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_gpzy_pledge_ratio_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_gpzy_pledge_ratio_detail_em 目标地址:
  * http://data.eastmoney.com/gpzy/pledgeDetail.aspx 描述: 东方财富网-数据中心-特色数据-股权质押-重要股东股权质押明细 限量:
  * 单次所有历史数据, 由于数据量比较大需要等待一定时间
  */
case class Respstock_gpzy_pledge_ratio_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_gu3dong1ming2cheng1`: String,
  `p_zhi4ya1gu3fen4shu4liang4`: Double,
  `p_zhan4suo3chi2gu3fen4bi3li4`: Double,
  `p_zhan4zong3gu3ben3bi3li4`: Double,
  `p_zhi4ya1ji1gou4`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhi4ya1ri4shou1pan2jia4`: Double,
  `p_yu4gu1ping2cang1xian4`: Double,
  `p_gong1gao4ri4qi1`: String,
  `p_zhi4ya1kai1shi3ri4qi1`: String
)

case class stock_gpzy_pledge_ratio_detail_emResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_gu3dong1ming2cheng1`: String,
  `p_zhi4ya1gu3fen4shu4liang4`: Double,
  `p_zhan4suo3chi2gu3fen4bi3li4`: Double,
  `p_zhan4zong3gu3ben3bi3li4`: Double,
  `p_zhi4ya1ji1gou4`: String,
  `p_zui4xin1jia4`: Double,
  `p_zhi4ya1ri4shou1pan2jia4`: Double,
  `p_yu4gu1ping2cang1xian4`: Double,
  `p_gong1gao4ri4qi1`: String,
  `p_zhi4ya1kai1shi3ri4qi1`: String
)

trait Json_stock_gpzy_pledge_ratio_detail_emResponse {

  implicit val a_stock_gpzy_pledge_ratio_detail_emResponse =
    new Decoder[stock_gpzy_pledge_ratio_detail_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_gpzy_pledge_ratio_detail_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Integer]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

          p_gu3dong1ming2cheng1 <- c.downField("股东名称").as[String]

          p_zhi4ya1gu3fen4shu4liang4 <- c.downField("质押股份数量").as[Double]

          p_zhan4suo3chi2gu3fen4bi3li4 <- c.downField("占所持股份比例").as[Double]

          p_zhan4zong3gu3ben3bi3li4 <- c.downField("占总股本比例").as[Double]

          p_zhi4ya1ji1gou4 <- c.downField("质押机构").as[String]

          p_zui4xin1jia4 <- c.downField("最新价").as[Double]

          p_zhi4ya1ri4shou1pan2jia4 <- c.downField("质押日收盘价").as[Double]

          p_yu4gu1ping2cang1xian4 <- c.downField("预估平仓线").as[Double]

          p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

          p_zhi4ya1kai1shi3ri4qi1 <- c.downField("质押开始日期").as[String]

        } yield {
          stock_gpzy_pledge_ratio_detail_emResponse(
            p_xu4hao4,
            p_gu3piao4dai4ma3,
            p_gu3piao4jian3cheng1,
            p_gu3dong1ming2cheng1,
            p_zhi4ya1gu3fen4shu4liang4,
            p_zhan4suo3chi2gu3fen4bi3li4,
            p_zhan4zong3gu3ben3bi3li4,
            p_zhi4ya1ji1gou4,
            p_zui4xin1jia4,
            p_zhi4ya1ri4shou1pan2jia4,
            p_yu4gu1ping2cang1xian4,
            p_gong1gao4ri4qi1,
            p_zhi4ya1kai1shi3ri4qi1
          )
        }
    }

}

object JsonItem_stock_gpzy_pledge_ratio_detail_emResponse
    extends Json_stock_gpzy_pledge_ratio_detail_emResponse
