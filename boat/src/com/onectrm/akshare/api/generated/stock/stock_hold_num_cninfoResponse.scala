package com.onectrm.akshare.api.generated.stock;

import com.onectrm.akshare.api.generated.stock.stock_hold_num_cninfoResponse
import java.time.LocalDate;
import java.time.LocalDateTime;
import io.circe.{Decoder, Encoder, HCursor, Json}
import io.circe._
import io.circe.parser._
import io.circe.syntax.EncoderOps

/** 分类1: stock 接口: stock_hold_num_cninfo 目标地址: http://webapi.cninfo.com.cn/#/thematicStatistics 描述:
  * 巨潮资讯-数据中心-专题统计-股东股本-股东人数及持股集中度 限量: 单次指定 date 的股东人数及持股集中度数据, 从 20170331 开始
  */
case class Respstock_hold_num_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_ben3qi1gu3dong1ren2shu4`: Integer,
  `p_shang4qi1gu3dong1ren2shu4`: Double,
  `p_gu3dong1ren2shu4zeng1fu2`: Double,
  `p_ben3qi1ren2jun1chi2gu3shu4liang4`: Integer,
  `p_shang4qi1ren2jun1chi2gu3shu4liang4`: Double,
  `p_ren2jun1chi2gu3shu4liang4zeng1fu2`: Double
)

case class stock_hold_num_cninfoResponse(
  `p_zheng4juan4dai4ma3`: String,
  `p_zheng4quan4jian3cheng1`: String,
  `p_bian4dong4ri4qi1`: String,
  `p_ben3qi1gu3dong1ren2shu4`: Integer,
  `p_shang4qi1gu3dong1ren2shu4`: Double,
  `p_gu3dong1ren2shu4zeng1fu2`: Double,
  `p_ben3qi1ren2jun1chi2gu3shu4liang4`: Integer,
  `p_shang4qi1ren2jun1chi2gu3shu4liang4`: Double,
  `p_ren2jun1chi2gu3shu4liang4zeng1fu2`: Double
)

trait Json_stock_hold_num_cninfoResponse {

  implicit val a_stock_hold_num_cninfoResponse = new Decoder[stock_hold_num_cninfoResponse] {
    final def apply(c: HCursor): Decoder.Result[stock_hold_num_cninfoResponse] =
      for {
        p_111111111111 <- c.downField("_").as[Option[String]]

        p_zheng4juan4dai4ma3 <- c.downField("证劵代码").as[String]

        p_zheng4quan4jian3cheng1 <- c.downField("证券简称").as[String]

        p_bian4dong4ri4qi1 <- c.downField("变动日期").as[String]

        p_ben3qi1gu3dong1ren2shu4 <- c.downField("本期股东人数").as[Integer]

        p_shang4qi1gu3dong1ren2shu4 <- c.downField("上期股东人数").as[Double]

        p_gu3dong1ren2shu4zeng1fu2 <- c.downField("股东人数增幅").as[Double]

        p_ben3qi1ren2jun1chi2gu3shu4liang4 <- c.downField("本期人均持股数量").as[Integer]

        p_shang4qi1ren2jun1chi2gu3shu4liang4 <- c.downField("上期人均持股数量").as[Double]

        p_ren2jun1chi2gu3shu4liang4zeng1fu2 <- c.downField("人均持股数量增幅").as[Double]

      } yield {
        stock_hold_num_cninfoResponse(
          p_zheng4juan4dai4ma3,
          p_zheng4quan4jian3cheng1,
          p_bian4dong4ri4qi1,
          p_ben3qi1gu3dong1ren2shu4,
          p_shang4qi1gu3dong1ren2shu4,
          p_gu3dong1ren2shu4zeng1fu2,
          p_ben3qi1ren2jun1chi2gu3shu4liang4,
          p_shang4qi1ren2jun1chi2gu3shu4liang4,
          p_ren2jun1chi2gu3shu4liang4zeng1fu2
        )
      }
  }

}

object JsonItem_stock_hold_num_cninfoResponse extends Json_stock_hold_num_cninfoResponse
