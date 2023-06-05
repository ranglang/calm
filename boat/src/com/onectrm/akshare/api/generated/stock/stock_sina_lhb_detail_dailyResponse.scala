package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sina_lhb_detail_dailyResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sina_lhb_detail_daily 目标地址:
  * http://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/lhb/index.phtml 描述:
  * 新浪财经-龙虎榜-每日详情 限量: 单次返回指定 trade_date 和 symbol 的所有历史数据
  */
case class Respstock_sina_lhb_detail_dailyResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_shou1pan2jia4`: String,
  `p_dui4ying1zhi2`: String,
  `p_cheng2jiao1liang4`: String,
  `p_cheng2jiao1e2`: String
)

case class stock_sina_lhb_detail_dailyResponse(
  `p_xu4hao4`: Long,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_shou1pan2jia4`: String,
  `p_dui4ying1zhi2`: String,
  `p_cheng2jiao1liang4`: String,
  `p_cheng2jiao1e2`: String
)

trait Json_stock_sina_lhb_detail_dailyResponse {

  implicit val a_stock_sina_lhb_detail_dailyResponse =
    new Decoder[stock_sina_lhb_detail_dailyResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_sina_lhb_detail_dailyResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xu4hao4 <- c.downField("序号").as[Long]

          p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

          p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

          p_shou1pan2jia4 <- c.downField("收盘价").as[String]

          p_dui4ying1zhi2 <- c.downField("对应值").as[String]

          p_cheng2jiao1liang4 <- c.downField("成交量").as[String]

          p_cheng2jiao1e2 <- c.downField("成交额").as[String]

        } yield {
          stock_sina_lhb_detail_dailyResponse(
            p_xu4hao4,
            p_gu3piao4dai4ma3,
            p_gu3piao4ming2cheng1,
            p_shou1pan2jia4,
            p_dui4ying1zhi2,
            p_cheng2jiao1liang4,
            p_cheng2jiao1e2
          )
        }
    }

}

object JsonItem_stock_sina_lhb_detail_dailyResponse extends Json_stock_sina_lhb_detail_dailyResponse
