package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_lh_yyb_controlResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_lh_yyb_control 目标地址: http://data.10jqka.com.cn/market/longhu/ 描述:
  * 龙虎榜-营业部排行-抱团操作实力 限量: 单次返回所有历史数据
  */
case class Respstock_lh_yyb_controlResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_xie2shou3ying2ye4bu4jia1shu4`: Integer,
  `p_nian2nei4zui4jia1xie2shou3dui4xiang4`: String,
  `p_nian2nei4zui4jia1xie2shou3gu3piao4shu4`: Integer,
  `p_nian2nei4zui4jia1xie2shou3cheng2gong1lu4`: String
)

case class stock_lh_yyb_controlResponse(
  `p_xu4hao4`: Integer,
  `p_ying2ye4bu4ming2cheng1`: String,
  `p_xie2shou3ying2ye4bu4jia1shu4`: Integer,
  `p_nian2nei4zui4jia1xie2shou3dui4xiang4`: String,
  `p_nian2nei4zui4jia1xie2shou3gu3piao4shu4`: Integer,
  `p_nian2nei4zui4jia1xie2shou3cheng2gong1lu4`: String
)

trait Json_stock_lh_yyb_controlResponse {

  implicit val a_stock_lh_yyb_controlResponse = new Decoder[stock_lh_yyb_controlResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_lh_yyb_controlResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_xu4hao4 <- c.downField("序号").as[Integer]

        p_ying2ye4bu4ming2cheng1 <- c.downField("营业部名称").as[String]

        p_xie2shou3ying2ye4bu4jia1shu4 <- c.downField("携手营业部家数").as[Integer]

        p_nian2nei4zui4jia1xie2shou3dui4xiang4 <- c.downField("年内最佳携手对象").as[String]

        p_nian2nei4zui4jia1xie2shou3gu3piao4shu4 <- c.downField("年内最佳携手股票数").as[Integer]

        p_nian2nei4zui4jia1xie2shou3cheng2gong1lu4 <- c.downField("年内最佳携手成功率").as[String]

      } yield {
        stock_lh_yyb_controlResponse(
          p_xu4hao4,
          p_ying2ye4bu4ming2cheng1,
          p_xie2shou3ying2ye4bu4jia1shu4,
          p_nian2nei4zui4jia1xie2shou3dui4xiang4,
          p_nian2nei4zui4jia1xie2shou3gu3piao4shu4,
          p_nian2nei4zui4jia1xie2shou3cheng2gong1lu4
        )
      }
  }

}

object JsonItem_stock_lh_yyb_controlResponse extends Json_stock_lh_yyb_controlResponse
