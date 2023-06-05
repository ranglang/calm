package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_szse_sector_summaryResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_szse_sector_summary 目标地址:
  * http://docs.static.szse.cn/www/market/periodical/month/W020220511355248518608.html 描述:
  * 深圳证券交易所-统计资料-股票行业成交 限量: 单次返回指定 date 和 symbol 的统计资料-股票行业成交数据
  */
case class Respstock_szse_sector_summaryResponse(
  `p_xiang4mu4ming2cheng1`: String,
  `p_xiang4mu4ming2cheng1ying1wen2`: String,
  `p_jiao1yi4tian1shu4`: Integer,
  `p_cheng2jiao1jin1e2ren2min2bi4yuan2`: Integer,
  `p_cheng2jiao1jin1e2zhan4zong3ji4`: Double,
  `p_cheng2jiao1gu3shu4gu3shu4`: Integer,
  `p_cheng2jiao1gu3shu4zhan4zong3ji4`: Double,
  `p_cheng2jiao1bi3shu4bi3`: Integer,
  `p_cheng2jiao1bi3shu4zhan4zong3ji4`: Double
)

case class stock_szse_sector_summaryResponse(
  `p_xiang4mu4ming2cheng1`: String,
  `p_xiang4mu4ming2cheng1ying1wen2`: String,
  `p_jiao1yi4tian1shu4`: Integer,
  `p_cheng2jiao1jin1e2ren2min2bi4yuan2`: Integer,
  `p_cheng2jiao1jin1e2zhan4zong3ji4`: Double,
  `p_cheng2jiao1gu3shu4gu3shu4`: Integer,
  `p_cheng2jiao1gu3shu4zhan4zong3ji4`: Double,
  `p_cheng2jiao1bi3shu4bi3`: Integer,
  `p_cheng2jiao1bi3shu4zhan4zong3ji4`: Double
)

trait Json_stock_szse_sector_summaryResponse {

  implicit val a_stock_szse_sector_summaryResponse =
    new Decoder[stock_szse_sector_summaryResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_szse_sector_summaryResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_xiang4mu4ming2cheng1 <- c.downField("项目名称").as[String]

          p_xiang4mu4ming2cheng1ying1wen2 <- c.downField("项目名称-英文").as[String]

          p_jiao1yi4tian1shu4 <- c.downField("交易天数").as[Integer]

          p_cheng2jiao1jin1e2ren2min2bi4yuan2 <- c.downField("成交金额-人民币元").as[Integer]

          p_cheng2jiao1jin1e2zhan4zong3ji4 <- c.downField("成交金额-占总计").as[Double]

          p_cheng2jiao1gu3shu4gu3shu4 <- c.downField("成交股数-股数").as[Integer]

          p_cheng2jiao1gu3shu4zhan4zong3ji4 <- c.downField("成交股数-占总计").as[Double]

          p_cheng2jiao1bi3shu4bi3 <- c.downField("成交笔数-笔").as[Integer]

          p_cheng2jiao1bi3shu4zhan4zong3ji4 <- c.downField("成交笔数-占总计").as[Double]

        } yield {
          stock_szse_sector_summaryResponse(
            p_xiang4mu4ming2cheng1,
            p_xiang4mu4ming2cheng1ying1wen2,
            p_jiao1yi4tian1shu4,
            p_cheng2jiao1jin1e2ren2min2bi4yuan2,
            p_cheng2jiao1jin1e2zhan4zong3ji4,
            p_cheng2jiao1gu3shu4gu3shu4,
            p_cheng2jiao1gu3shu4zhan4zong3ji4,
            p_cheng2jiao1bi3shu4bi3,
            p_cheng2jiao1bi3shu4zhan4zong3ji4
          )
        }
    }

}

object JsonItem_stock_szse_sector_summaryResponse extends Json_stock_szse_sector_summaryResponse
