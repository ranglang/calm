package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_industry_category_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_industry_category_cninfo 目标地址: http://webapi.cninfo.com.cn/#/apiDoc 描述:
  * 巨潮资讯-数据-行业分类数据 限量: 单次获取指定 symbol 的行业分类数据
  */
case class Respstock_industry_category_cninfoResponse(
  `p_lei4mu4bian1ma3`: String,
  `p_lei4mu4ming2cheng1`: String,
  `p_zhong1zhi3ri4qi1`: String,
  `p_xing2ye4lei4xing2`: String,
  `p_xing2ye4lei4xing2bian1ma3`: String,
  `p_lei4mu4ming2cheng1ying1wen2`: String,
  `p_fu4lei4bian1ma3`: String,
  `p_fen1ji2`: Long
)

case class stock_industry_category_cninfoResponse(
  `p_lei4mu4bian1ma3`: String,
  `p_lei4mu4ming2cheng1`: String,
  `p_zhong1zhi3ri4qi1`: String,
  `p_xing2ye4lei4xing2`: String,
  `p_xing2ye4lei4xing2bian1ma3`: String,
  `p_lei4mu4ming2cheng1ying1wen2`: String,
  `p_fu4lei4bian1ma3`: String,
  `p_fen1ji2`: Long
)

trait Json_stock_industry_category_cninfoResponse {

  implicit val a_stock_industry_category_cninfoResponse =
    new Decoder[stock_industry_category_cninfoResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_industry_category_cninfoResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_lei4mu4bian1ma3 <- c.downField("类目编码").as[String]

          p_lei4mu4ming2cheng1 <- c.downField("类目名称").as[String]

          p_zhong1zhi3ri4qi1 <- c.downField("终止日期").as[String]

          p_xing2ye4lei4xing2 <- c.downField("行业类型").as[String]

          p_xing2ye4lei4xing2bian1ma3 <- c.downField("行业类型编码").as[String]

          p_lei4mu4ming2cheng1ying1wen2 <- c.downField("类目名称英文").as[String]

          p_fu4lei4bian1ma3 <- c.downField("父类编码").as[String]

          p_fen1ji2 <- c.downField("分级").as[Long]

        } yield {
          stock_industry_category_cninfoResponse(
            p_lei4mu4bian1ma3,
            p_lei4mu4ming2cheng1,
            p_zhong1zhi3ri4qi1,
            p_xing2ye4lei4xing2,
            p_xing2ye4lei4xing2bian1ma3,
            p_lei4mu4ming2cheng1ying1wen2,
            p_fu4lei4bian1ma3,
            p_fen1ji2
          )
        }
    }

}

object JsonItem_stock_industry_category_cninfoResponse
    extends Json_stock_industry_category_cninfoResponse
