package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_zh_a_gdhs_detail_emResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_zh_a_gdhs_detail_em 目标地址:
  * https://data.eastmoney.com/gdhs/detail/000002.html 描述: 东方财富网-数据中心-特色数据-股东户数详情 限量: 单次获取指定 symbol
  * 的所有数据
  */
case class Respstock_zh_a_gdhs_detail_emResponse(
  `p_gu3dong1hu4shu4tong3ji4jie2zhi3ri4`: String,
  `p_qu1jian1zhang3die1fu2`: Double,
  `p_gu3dong1hu4shu4ben3ci4`: Integer,
  `p_gu3dong1hu4shu4shang4ci4`: Integer,
  `p_gu3dong1hu4shu4zeng1jian3`: Integer,
  `p_gu3dong1hu4shu4zeng1jian3bi3li4`: Double,
  `p_hu4jun1chi2gu3shi4zhi2`: Double,
  `p_hu4jun1chi2gu3shu4liang4`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_zong3gu3ben3`: Integer,
  `p_gu3ben3bian4dong4`: Integer,
  `p_gu3ben3bian4dong4yuan2yin1`: String,
  `p_gu3dong1hu4shu4gong1gao4ri4qi1`: String,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String
)

case class stock_zh_a_gdhs_detail_emResponse(
  `p_gu3dong1hu4shu4tong3ji4jie2zhi3ri4`: String,
  `p_qu1jian1zhang3die1fu2`: Double,
  `p_gu3dong1hu4shu4ben3ci4`: Integer,
  `p_gu3dong1hu4shu4shang4ci4`: Integer,
  `p_gu3dong1hu4shu4zeng1jian3`: Integer,
  `p_gu3dong1hu4shu4zeng1jian3bi3li4`: Double,
  `p_hu4jun1chi2gu3shi4zhi2`: Double,
  `p_hu4jun1chi2gu3shu4liang4`: Double,
  `p_zong3shi4zhi2`: Double,
  `p_zong3gu3ben3`: Integer,
  `p_gu3ben3bian4dong4`: Integer,
  `p_gu3ben3bian4dong4yuan2yin1`: String,
  `p_gu3dong1hu4shu4gong1gao4ri4qi1`: String,
  `p_dai4ma3`: String,
  `p_ming2cheng1`: String
)

trait Json_stock_zh_a_gdhs_detail_emResponse {

  implicit val a_stock_zh_a_gdhs_detail_emResponse =
    new Decoder[stock_zh_a_gdhs_detail_emResponse] {
      final def apply(c: HCursor): Decoder.Result[stock_zh_a_gdhs_detail_emResponse] =
        for {
          p_111111111111 <- c.downField("_").as[Option[String]]

          p_gu3dong1hu4shu4tong3ji4jie2zhi3ri4 <- c.downField("股东户数统计截止日").as[String]

          p_qu1jian1zhang3die1fu2 <- c.downField("区间涨跌幅").as[Double]

          p_gu3dong1hu4shu4ben3ci4 <- c.downField("股东户数-本次").as[Integer]

          p_gu3dong1hu4shu4shang4ci4 <- c.downField("股东户数-上次").as[Integer]

          p_gu3dong1hu4shu4zeng1jian3 <- c.downField("股东户数-增减").as[Integer]

          p_gu3dong1hu4shu4zeng1jian3bi3li4 <- c.downField("股东户数-增减比例").as[Double]

          p_hu4jun1chi2gu3shi4zhi2 <- c.downField("户均持股市值").as[Double]

          p_hu4jun1chi2gu3shu4liang4 <- c.downField("户均持股数量").as[Double]

          p_zong3shi4zhi2 <- c.downField("总市值").as[Double]

          p_zong3gu3ben3 <- c.downField("总股本").as[Integer]

          p_gu3ben3bian4dong4 <- c.downField("股本变动").as[Integer]

          p_gu3ben3bian4dong4yuan2yin1 <- c.downField("股本变动原因").as[String]

          p_gu3dong1hu4shu4gong1gao4ri4qi1 <- c.downField("股东户数公告日期").as[String]

          p_dai4ma3 <- c.downField("代码").as[String]

          p_ming2cheng1 <- c.downField("名称").as[String]

        } yield {
          stock_zh_a_gdhs_detail_emResponse(
            p_gu3dong1hu4shu4tong3ji4jie2zhi3ri4,
            p_qu1jian1zhang3die1fu2,
            p_gu3dong1hu4shu4ben3ci4,
            p_gu3dong1hu4shu4shang4ci4,
            p_gu3dong1hu4shu4zeng1jian3,
            p_gu3dong1hu4shu4zeng1jian3bi3li4,
            p_hu4jun1chi2gu3shi4zhi2,
            p_hu4jun1chi2gu3shu4liang4,
            p_zong3shi4zhi2,
            p_zong3gu3ben3,
            p_gu3ben3bian4dong4,
            p_gu3ben3bian4dong4yuan2yin1,
            p_gu3dong1hu4shu4gong1gao4ri4qi1,
            p_dai4ma3,
            p_ming2cheng1
          )
        }
    }

}

object JsonItem_stock_zh_a_gdhs_detail_emResponse extends Json_stock_zh_a_gdhs_detail_emResponse
