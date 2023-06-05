package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_rank_cxfl_thsResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_rank_cxfl_ths 目标地址: http://data.10jqka.com.cn/rank/cxfl/ 描述:
  * 同花顺-数据中心-技术选股-持续放量 限量: 单次返回所有数据
  */
case class Respstock_rank_cxfl_thsResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_cheng2jiao1liang4`: String,
  `p_ji1zhun3ri4cheng2jiao1liang4`: String,
  `p_fang4liang4tian1shu4`: Integer,
  `p_jie1duan4zhang3die1fu2`: Double,
  `p_suo3shu3xing2ye4`: String
)

case class stock_rank_cxfl_thsResponse(
  `p_xu4hao4`: Integer,
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4jian3cheng1`: String,
  `p_zhang3die1fu2`: Double,
  `p_zui4xin1jia4`: Double,
  `p_cheng2jiao1liang4`: String,
  `p_ji1zhun3ri4cheng2jiao1liang4`: String,
  `p_fang4liang4tian1shu4`: Integer,
  `p_jie1duan4zhang3die1fu2`: Double,
  `p_suo3shu3xing2ye4`: String
)

trait Json_stock_rank_cxfl_thsResponse {

  implicit val a_stock_rank_cxfl_thsResponse = new Decoder[stock_rank_cxfl_thsResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_rank_cxfl_thsResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4jian3cheng1 <- c.downField("股票简称").as[String]

        p_zhang3die1fu2 <- c.downField("涨跌幅").as[Double]

        p_zui4xin1jia4 <- c.downField("最新价").as[Double]

        p_cheng2jiao1liang4 <- c.downField("成交量").as[String]

        p_ji1zhun3ri4cheng2jiao1liang4 <- c.downField("基准日成交量").as[String]

        p_fang4liang4tian1shu4 <- c.downField("放量天数").as[Integer]

        p_jie1duan4zhang3die1fu2 <- c.downField("阶段涨跌幅").as[Double]

        p_suo3shu3xing2ye4 <- c.downField("所属行业").as[String]

      } yield {
        stock_rank_cxfl_thsResponse(
          p_xu4hao4,
          p_gu3piao4dai4ma3,
          p_gu3piao4jian3cheng1,
          p_zhang3die1fu2,
          p_zui4xin1jia4,
          p_cheng2jiao1liang4,
          p_ji1zhun3ri4cheng2jiao1liang4,
          p_fang4liang4tian1shu4,
          p_jie1duan4zhang3die1fu2,
          p_suo3shu3xing2ye4
        )
      }
  }

}

object JsonItem_stock_rank_cxfl_thsResponse extends Json_stock_rank_cxfl_thsResponse
