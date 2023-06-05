package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_new_gh_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_new_gh_cninfo 目标地址: http://webapi.cninfo.com.cn/#/xinguList 描述:
  * 巨潮资讯-数据中心-新股数据-新股过会 限量: 单次获取近一年所有新股过会的数据
  */
case class Respstock_new_gh_cninfoResponse(
  `p_gong1si1ming2cheng1`: String,
  `p_shang4hui4ri4qi1`: String,
  `p_shen3he2lei4xing2`: String,
  `p_shen3yi4nei4rong2`: String,
  `p_shen3he2jie2guo3`: String,
  `p_shen3he2gong1gao4ri4`: String
)

case class stock_new_gh_cninfoResponse(
  `p_gong1si1ming2cheng1`: String,
  `p_shang4hui4ri4qi1`: String,
  `p_shen3he2lei4xing2`: String,
  `p_shen3yi4nei4rong2`: String,
  `p_shen3he2jie2guo3`: String,
  `p_shen3he2gong1gao4ri4`: String
)

trait Json_stock_new_gh_cninfoResponse {

  implicit val a_stock_new_gh_cninfoResponse = new Decoder[stock_new_gh_cninfoResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_new_gh_cninfoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_gong1si1ming2cheng1 <- c.downField("公司名称").as[String]

        p_shang4hui4ri4qi1 <- c.downField("上会日期").as[String]

        p_shen3he2lei4xing2 <- c.downField("审核类型").as[String]

        p_shen3yi4nei4rong2 <- c.downField("审议内容").as[String]

        p_shen3he2jie2guo3 <- c.downField("审核结果").as[String]

        p_shen3he2gong1gao4ri4 <- c.downField("审核公告日").as[String]

      } yield {
        stock_new_gh_cninfoResponse(
          p_gong1si1ming2cheng1,
          p_shang4hui4ri4qi1,
          p_shen3he2lei4xing2,
          p_shen3yi4nei4rong2,
          p_shen3he2jie2guo3,
          p_shen3he2gong1gao4ri4
        )
      }
  }

}

object JsonItem_stock_new_gh_cninfoResponse extends Json_stock_new_gh_cninfoResponse
