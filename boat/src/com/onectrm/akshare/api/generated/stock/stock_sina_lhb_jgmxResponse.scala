package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sina_lhb_jgmxResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sina_lhb_jgmx 目标地址:
  * http://vip.stock.finance.sina.com.cn/q/go.php/vLHBData/kind/jgzz/index.phtml 描述:
  * 新浪财经-龙虎榜-机构席位成交明细 限量: 单次返回所有历史数据
  */
case class Respstock_sina_lhb_jgmxResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_jiao1yi4ri4qi1`: String,
  `p_ji1gou4xi2wei4mai3ru4e2`: String,
  `p_ji1gou4xi2wei4mai4chu1e2`: String,
  `p_lei4xing2`: String
)

case class stock_sina_lhb_jgmxResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_jiao1yi4ri4qi1`: String,
  `p_ji1gou4xi2wei4mai3ru4e2`: String,
  `p_ji1gou4xi2wei4mai4chu1e2`: String,
  `p_lei4xing2`: String
)

trait Json_stock_sina_lhb_jgmxResponse {

  implicit val a_stock_sina_lhb_jgmxResponse = new Decoder[stock_sina_lhb_jgmxResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_sina_lhb_jgmxResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_jiao1yi4ri4qi1 <- c.downField("交易日期").as[String]

        p_ji1gou4xi2wei4mai3ru4e2 <- c.downField("机构席位买入额").as[String]

        p_ji1gou4xi2wei4mai4chu1e2 <- c.downField("机构席位卖出额").as[String]

        p_lei4xing2 <- c.downField("类型").as[String]

      } yield {
        stock_sina_lhb_jgmxResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4ming2cheng1,
          p_jiao1yi4ri4qi1,
          p_ji1gou4xi2wei4mai3ru4e2,
          p_ji1gou4xi2wei4mai4chu1e2,
          p_lei4xing2
        )
      }
  }

}

object JsonItem_stock_sina_lhb_jgmxResponse extends Json_stock_sina_lhb_jgmxResponse
