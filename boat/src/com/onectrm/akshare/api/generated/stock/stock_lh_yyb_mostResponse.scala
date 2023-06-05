package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lh_yyb_mostResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lh_yyb_most 目标地址: http://data.10jqka.com.cn/market/longhu/ 描述:
  * 龙虎榜-营业部排行-上榜次数最多 限量: 单次返回所有历史数据
  */
case class Respstock_lh_yyb_mostResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_shang4bang3ci4shu4`: Integer,
  `p_he2ji4dong4yong4zi1jin1`: String,
  `p_nian2nei4shang4bang3ci4shu4`: Integer,
  `p_nian2nei4mai3ru4gu3piao4zhi3shu4`: Integer,
  `p_nian2nei43ri4gen1mai3cheng2gong1lu4`: String
)

case class stock_lh_yyb_mostResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_shang4bang3ci4shu4`: Integer,
  `p_he2ji4dong4yong4zi1jin1`: String,
  `p_nian2nei4shang4bang3ci4shu4`: Integer,
  `p_nian2nei4mai3ru4gu3piao4zhi3shu4`: Integer,
  `p_nian2nei43ri4gen1mai3cheng2gong1lu4`: String
)

trait Json_stock_lh_yyb_mostResponse {

  implicit val a_stock_lh_yyb_mostResponse = new Decoder[stock_lh_yyb_mostResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lh_yyb_mostResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ying2ye4bu4ming2cheng1 <- c.downField("营业部名称").as[String]

        p_shang4bang3ci4shu4 <- c.downField("上榜次数").as[Integer]

        p_he2ji4dong4yong4zi1jin1 <- c.downField("合计动用资金").as[String]

        p_nian2nei4shang4bang3ci4shu4 <- c.downField("年内上榜次数").as[Integer]

        p_nian2nei4mai3ru4gu3piao4zhi3shu4 <- c.downField("年内买入股票只数").as[Integer]

        p_nian2nei43ri4gen1mai3cheng2gong1lu4 <- c.downField("年内3日跟买成功率").as[String]

      } yield {
        stock_lh_yyb_mostResponse(
          p_xu4hao4,
          p_ying2ye4bu4ming2cheng1,
          p_shang4bang3ci4shu4,
          p_he2ji4dong4yong4zi1jin1,
          p_nian2nei4shang4bang3ci4shu4,
          p_nian2nei4mai3ru4gu3piao4zhi3shu4,
          p_nian2nei43ri4gen1mai3cheng2gong1lu4
        )
      }
  }

}

object JsonItem_stock_lh_yyb_mostResponse extends Json_stock_lh_yyb_mostResponse
