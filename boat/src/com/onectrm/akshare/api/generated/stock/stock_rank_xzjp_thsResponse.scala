package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_rank_xzjp_thsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_rank_xzjp_ths 目标地址: http://data.10jqka.com.cn/financial/xzjp/ 描述:
  * 同花顺-数据中心-技术选股-险资举牌 限量: 单次返回所有数据
  */
case class Respstock_rank_xzjp_thsResponse(
  `p_xu4hao4`: Integer,
  `p_ju3pai2gong1gao4ri4`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_ju3pai2fang1`: String,
  `p_zeng1chi2shu4liang4`: String,
  `p_jiao1yi4jun1jia4`: Double,
  `p_zeng1chi2shu4liang4zhan4zong3gu3ben3bi3li4`: Double,
  `p_bian4dong4hou4chi2gu3zong3shu4`: String,
  `p_bian4dong4hou4chi2gu3bi3li4`: Double
)

case class stock_rank_xzjp_thsResponse(
  `p_xu4hao4`: Integer,
  `p_ju3pai2gong1gao4ri4`: String,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_xian4jia4`: Double,
  `p_zhang3die1fu2`: Double,
  `p_ju3pai2fang1`: String,
  `p_zeng1chi2shu4liang4`: String,
  `p_jiao1yi4jun1jia4`: Double,
  `p_zeng1chi2shu4liang4zhan4zong3gu3ben3bi3li4`: Double,
  `p_bian4dong4hou4chi2gu3zong3shu4`: String,
  `p_bian4dong4hou4chi2gu3bi3li4`: Double
)

trait Json_stock_rank_xzjp_thsResponse {

  implicit val a_stock_rank_xzjp_thsResponse = new Decoder[stock_rank_xzjp_thsResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_rank_xzjp_thsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ju3pai2gong1gao4ri4 <- c.downField("举牌公告日").as[String]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_xian4jia4 <- c.downField("现价").as[Double]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_ju3pai2fang1 <- c.downField("举牌方").as[String]

        p_zeng1chi2shu4liang4 <- c.downField("增持数量").as[String]

        p_jiao1yi4jun1jia4 <- c.downField("交易均价").as[Double]

        p_zeng1chi2shu4liang4zhan4zong3gu3ben3bi3li4 <- c.downField("增持数量占总股本比例").as[Double]

        p_bian4dong4hou4chi2gu3zong3shu4 <- c.downField("变动后持股总数").as[String]

        p_bian4dong4hou4chi2gu3bi3li4 <- c.downField("变动后持股比例").as[Double]

      } yield {
        stock_rank_xzjp_thsResponse(
          p_xu4hao4,
          p_ju3pai2gong1gao4ri4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_xian4jia4,
          p_zhang3die1fu2,
          p_ju3pai2fang1,
          p_zeng1chi2shu4liang4,
          p_jiao1yi4jun1jia4,
          p_zeng1chi2shu4liang4zhan4zong3gu3ben3bi3li4,
          p_bian4dong4hou4chi2gu3zong3shu4,
          p_bian4dong4hou4chi2gu3bi3li4
        )
      }
  }

}

object JsonItem_stock_rank_xzjp_thsResponse extends Json_stock_rank_xzjp_thsResponse
