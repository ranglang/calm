package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_restricted_sharesResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_restricted_shares 目标地址:
  * https://vip.stock.finance.sina.com.cn/q/go.php/vInvestConsult/kind/xsjj/index.phtml?symbol=sh600000
  * 描述: 获取新浪财经-发行分配-限售解禁 限量: 单次获取限售解禁数据
  */
case class Respstock_restricted_sharesResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_jie3jin4ri4qi1`: String,
  `p_jie3jin4shu4liang4wan4gu3`: Double,
  `p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2`: Double,
  `p_shang4shi4pi1ci4`: Double,
  `p_gong1gao4ri4qi1`: String
)

case class stock_restricted_sharesResponse(
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String,
  `p_jie3jin4ri4qi1`: String,
  `p_jie3jin4shu4liang4wan4gu3`: Double,
  `p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2`: Double,
  `p_shang4shi4pi1ci4`: Double,
  `p_gong1gao4ri4qi1`: String
)

trait Json_stock_restricted_sharesResponse {

  implicit val a_stock_restricted_sharesResponse = new Decoder[stock_restricted_sharesResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_restricted_sharesResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_dai4ma3 <- c.downField("代码").as[String]

        p_ming2cheng1 <- c.downField("名称").as[String]

        p_jie3jin4ri4qi1 <- c.downField("解禁日期").as[String]

        p_jie3jin4shu4liang4wan4gu3 <- c.downField("解禁数量(万股)").as[Double]

        p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2 <- c.downField("解禁股流通市值(亿元)").as[Double]

        p_shang4shi4pi1ci4 <- c.downField("上市批次").as[Double]

        p_gong1gao4ri4qi1 <- c.downField("公告日期").as[String]

      } yield {
        stock_restricted_sharesResponse(
          p_dai4ma3,
          p_ming2cheng1,
          p_jie3jin4ri4qi1,
          p_jie3jin4shu4liang4wan4gu3,
          p_jie3jin4gu3liu2tong1shi4zhi2yi4yuan2,
          p_shang4shi4pi1ci4,
          p_gong1gao4ri4qi1
        )
      }
  }

}

object JsonItem_stock_restricted_sharesResponse extends Json_stock_restricted_sharesResponse
