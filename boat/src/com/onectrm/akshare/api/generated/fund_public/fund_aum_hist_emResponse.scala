package com.onectrm.akshare.api.generated.fund_public;

import com.onectrm.akshare.api.generated.fund_public.fund_aum_hist_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: fund_public 接口: fund_aum_hist_em 目标地址: http://fund.eastmoney.com/Company/lsgm.html 描述:
  * 天天基金网-基金数据-基金公司历年管理规模排行列表 限量: 单次返回所有基金公司历年管理规模排行列表数据
  */
case class Respfund_aum_hist_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1gong1si1`: String,
  `p_zong3gui1mo2`: Double,
  `p_gu3piao4xing2`: Double,
  `p_hun4he2xing2`: Double,
  `p_zhai4quan4xing2`: Double,
  `p_zhi3shu4xing2`: Double,
  `p_QDII`: Double,
  `p_huo4bi4xing2`: Double
)

case class fund_aum_hist_emResponse(
  `p_xu4hao4`: Integer,
  `p_ji1jin1gong1si1`: String,
  `p_zong3gui1mo2`: Double,
  `p_gu3piao4xing2`: Double,
  `p_hun4he2xing2`: Double,
  `p_zhai4quan4xing2`: Double,
  `p_zhi3shu4xing2`: Double,
  `p_QDII`: Double,
  `p_huo4bi4xing2`: Double
)

trait Json_fund_aum_hist_emResponse {

  implicit val a_fund_aum_hist_emResponse = new Decoder[fund_aum_hist_emResponse] {
    final def apply(c: HCursor): Decoder.Result[fund_aum_hist_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ji1jin1gong1si1 <- c.downField("基金公司").as[String]

        p_zong3gui1mo2 <- c.downField("总规模").as[Double]

        p_gu3piao4xing2 <- c.downField("股票型").as[Double]

        p_hun4he2xing2 <- c.downField("混合型").as[Double]

        p_zhai4quan4xing2 <- c.downField("债券型").as[Double]

        p_zhi3shu4xing2 <- c.downField("指数型").as[Double]

        p_QDII <- c.downField("QDII").as[Double]

        p_huo4bi4xing2 <- c.downField("货币型").as[Double]

      } yield {
        fund_aum_hist_emResponse(
          p_xu4hao4,
          p_ji1jin1gong1si1,
          p_zong3gui1mo2,
          p_gu3piao4xing2,
          p_hun4he2xing2,
          p_zhai4quan4xing2,
          p_zhi3shu4xing2,
          p_QDII,
          p_huo4bi4xing2
        )
      }
  }

}

object JsonItem_fund_aum_hist_emResponse extends Json_fund_aum_hist_emResponse
