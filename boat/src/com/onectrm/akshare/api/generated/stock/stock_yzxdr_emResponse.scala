package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_yzxdr_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_yzxdr_em 目标地址: http://data.eastmoney.com/yzxdr/ 描述: 东方财富网-数据中心-特色数据-一致行动人
  * 限量: 单次返回所有历史数据
  */
case class Respstock_yzxdr_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_yi1zhi4xing2dong4ren2`: String,
  `p_gu3dong1pai2ming2`: String,
  `p_chi2gu3shu4liang4`: Integer,
  `p_chi2gu3bi3li4`: Double,
  `p_chi2gu3shu4liang4bian4dong4`: String,
  `p_xing2ye4`: String,
  `p_gong1gao4ri4qi1`: String
)

case class stock_yzxdr_emResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_yi1zhi4xing2dong4ren2`: String,
  `p_gu3dong1pai2ming2`: String,
  `p_chi2gu3shu4liang4`: Integer,
  `p_chi2gu3bi3li4`: Double,
  `p_chi2gu3shu4liang4bian4dong4`: String,
  `p_xing2ye4`: String,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_yzxdr_emResponse {

  implicit val a_stock_yzxdr_emResponse = new Decoder[stock_yzxdr_emResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_yzxdr_emResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Long]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_yi1zhi4xing2dong4ren2 <- c.downField("一致行动人").as[String]

        p_gu3dong1pai2ming2 <- c.downField("股东排名").as[String]

        p_chi2gu3shu4liang4 <- c.downField("持股数量").as[Integer]

        p_chi2gu3bi3li4 <- c.downField("持股比例").as[Double]

        p_chi2gu3shu4liang4bian4dong4 <- c.downField("持股数量变动").as[String]

        p_xing2ye4 <- c.downField("行业").as[String]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_yzxdr_emResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_yi1zhi4xing2dong4ren2,
          p_gu3dong1pai2ming2,
          p_chi2gu3shu4liang4,
          p_chi2gu3bi3li4,
          p_chi2gu3shu4liang4bian4dong4,
          p_xing2ye4,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_yzxdr_emResponse extends Json_stock_yzxdr_emResponse
