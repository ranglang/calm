package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_sina_lhb_ggtjResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_sina_lhb_ggtj 目标地址:
  * http://vip.stock.finance.sina.com.cn/q/go.php/vLHBData/kind/ggtj/index.phtml 描述: 新浪财经-龙虎榜-个股上榜统计
  * 限量: 单次返回指定 recent_day 的所有历史数据
  */
case class Respstock_sina_lhb_ggtjResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_shang4bang3ci4shu4`: String,
  `p_lei3ji1gou4mai3e2`: String,
  `p_lei3ji1mai4chu1e2`: String,
  `p_jing4e2`: String,
  `p_mai3ru4xi2wei4shu4`: String,
  `p_mai4chu1xi2wei4shu4`: String
)

case class stock_sina_lhb_ggtjResponse(
  `p_gu3piao4dai4ma3`: String,
  `p_gu3piao4ming2cheng1`: String,
  `p_shang4bang3ci4shu4`: String,
  `p_lei3ji1gou4mai3e2`: String,
  `p_lei3ji1mai4chu1e2`: String,
  `p_jing4e2`: String,
  `p_mai3ru4xi2wei4shu4`: String,
  `p_mai4chu1xi2wei4shu4`: String
)

trait Json_stock_sina_lhb_ggtjResponse {

  implicit val a_stock_sina_lhb_ggtjResponse = new Decoder[stock_sina_lhb_ggtjResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_sina_lhb_ggtjResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gu3piao4dai4ma3 <- c.downField("股票代码").as[String]

        p_gu3piao4ming2cheng1 <- c.downField("股票名称").as[String]

        p_shang4bang3ci4shu4 <- c.downField("上榜次数").as[String]

        p_lei3ji1gou4mai3e2 <- c.downField("累积购买额").as[String]

        p_lei3ji1mai4chu1e2 <- c.downField("累积卖出额").as[String]

        p_jing4e2 <- c.downField("净额").as[String]

        p_mai3ru4xi2wei4shu4 <- c.downField("买入席位数").as[String]

        p_mai4chu1xi2wei4shu4 <- c.downField("卖出席位数").as[String]

      } yield {
        stock_sina_lhb_ggtjResponse(
          p_gu3piao4dai4ma3,
          p_gu3piao4ming2cheng1,
          p_shang4bang3ci4shu4,
          p_lei3ji1gou4mai3e2,
          p_lei3ji1mai4chu1e2,
          p_jing4e2,
          p_mai3ru4xi2wei4shu4,
          p_mai4chu1xi2wei4shu4
        )
      }
  }

}

object JsonItem_stock_sina_lhb_ggtjResponse extends Json_stock_sina_lhb_ggtjResponse
