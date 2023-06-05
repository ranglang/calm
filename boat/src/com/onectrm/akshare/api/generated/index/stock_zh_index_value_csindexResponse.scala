package com.onectrm.akshare.api.generated.index;

import com.onectrm.akshare.api.generated.index.stock_zh_index_value_csindexResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: index 接口: stock_zh_index_value_csindex 目标地址:
  * https://www.csindex.com.cn/zh-CN/indices/index-detail/H30374#/indices/family/detail?indexCode=H30374
  * 描述: 中证指数-指数估值数据 限量: 该接口返回指定的指数的估值数据, 该接口只能返回近期的数据
  */
case class Respstock_zh_index_value_csindexResponse(
  `p_ri4qi1`: String,
  `p_zhi3shu4dai4ma3`: String,
  `p_zhi3shu4zhong1wen2quan2cheng1`: String,
  `p_zhi3shu4zhong1wen2jian3cheng1`: String,
  `p_zhi3shu4ying1wen2quan2cheng1`: String,
  `p_zhi3shu4ying1wen2jian3cheng1`: String,
  `p_shi4ying2lu41`: Double,
  `p_shi4ying2lu42`: Double,
  `p_gu3xi1lu41`: Double,
  `p_gu3xi1lu42`: Double
)

case class stock_zh_index_value_csindexResponse(
  `p_ri4qi1`: String,
  `p_zhi3shu4dai4ma3`: String,
  `p_zhi3shu4zhong1wen2quan2cheng1`: String,
  `p_zhi3shu4zhong1wen2jian3cheng1`: String,
  `p_zhi3shu4ying1wen2quan2cheng1`: String,
  `p_zhi3shu4ying1wen2jian3cheng1`: String,
  `p_shi4ying2lu41`: Double,
  `p_shi4ying2lu42`: Double,
  `p_gu3xi1lu41`: Double,
  `p_gu3xi1lu42`: Double
)

trait Json_stock_zh_index_value_csindexResponse {

  implicit val a_stock_zh_index_value_csindexResponse =
    new Decoder[stock_zh_index_value_csindexResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_zh_index_value_csindexResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_ri4qi1 <- c.downField("日期").as[String]

          p_zhi3shu4dai4ma3 <- c.downField("指数代码").as[String]

          p_zhi3shu4zhong1wen2quan2cheng1 <- c.downField("指数中文全称").as[String]

          p_zhi3shu4zhong1wen2jian3cheng1 <- c.downField("指数中文简称").as[String]

          p_zhi3shu4ying1wen2quan2cheng1 <- c.downField("指数英文全称").as[String]

          p_zhi3shu4ying1wen2jian3cheng1 <- c.downField("指数英文简称").as[String]

          p_shi4ying2lu41 <- c.downField("市盈率1").as[Double]

          p_shi4ying2lu42 <- c.downField("市盈率2").as[Double]

          p_gu3xi1lu41 <- c.downField("股息率1").as[Double]

          p_gu3xi1lu42 <- c.downField("股息率2").as[Double]

        } yield {
          stock_zh_index_value_csindexResponse(
            p_ri4qi1,
            p_zhi3shu4dai4ma3,
            p_zhi3shu4zhong1wen2quan2cheng1,
            p_zhi3shu4zhong1wen2jian3cheng1,
            p_zhi3shu4ying1wen2quan2cheng1,
            p_zhi3shu4ying1wen2jian3cheng1,
            p_shi4ying2lu41,
            p_shi4ying2lu42,
            p_gu3xi1lu41,
            p_gu3xi1lu42
          )
        }
    }

}

object JsonItem_stock_zh_index_value_csindexResponse
    extends Json_stock_zh_index_value_csindexResponse
